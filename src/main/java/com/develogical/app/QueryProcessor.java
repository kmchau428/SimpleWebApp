package com.develogical.app;

import java.util.Arrays;

public class QueryProcessor {

    public String process(String query) throws InterruptedException {
        if (query.toLowerCase().contains("shakespeare")) {
            return "William Shakespeare (26 April 1564 - 23 April 1616) was an " +
                    "English poet, playwright, and actor, widely regarded as the greatest " +
                    "writer in the English language and the world's pre-eminent dramatist.";
        }
        //Some comment
        else if (query.toLowerCase().contains("steve jobs")) {
            return "Apple Inc. founder!";
        }
        
        else if (query.toLowerCase().contains("your name")) {
            return "team 1";
        }
        else if (query.toLowerCase().contains("plus")) {
           String[] array = query.split(" ");
           int intOne = Integer.valueOf(array[2]);
           int intTwo = Integer.valueOf(array[4]);
           
           return String.valueOf(intOne + intTwo);
        }
        else if (query.toLowerCase().contains("largest")) {
            String[] array = query.split("largest:");
            array[1].replaceAll(" ", "");
            String[] strArray = array[1].split(", ");
            Arrays.sort(strArray);
           
            return strArray[0].trim();
                       
         }
        else {
        	Thread.sleep(10000);
        }
        
        
        
        return "";
    }
}
