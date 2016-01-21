package com.develogical.app;

import java.util.ArrayList;
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
           int intOne = Integer.valueOf(array[3]);
           int intTwo = Integer.valueOf(array[5]);
           
           return String.valueOf(intOne + intTwo);
        }
        else if (query.toLowerCase().contains("largest")) {
            String[] array = query.split("largest:");
            array[1].replaceAll(" ", "");
            String[] strArray = array[1].split(",");
            
            int max = Integer.MIN_VALUE;
            for (String s : strArray) {
            	s = s.trim();
            	if (Integer.valueOf(s) > max)
            		max = Integer.valueOf(s);
            }
           
            return String.valueOf(max);
                       
         }
        else if (query.toLowerCase().contains("multiplied by")) {
            String[] array = query.split(" ");
            int intOne = Integer.valueOf(array[3]);
            int intTwo = Integer.valueOf(array[6]);
            
            return String.valueOf(intOne * intTwo);
         }
        
        else if (query.toLowerCase().contains("square")) {
         
        	  String[] array = query.split("cube:");
              array[1].replaceAll(" ", "");
              String[] strArray = array[1].split(",");
              
              for (String s : strArray) {
              	s = s.trim();
              	if (Integer.valueOf(s)  == 0 || Integer.valueOf(s)  == 1)
              		return s;
              }
              
              return "";
              
              
         }
        
        else if (query.toLowerCase().contains("primes")) {
            
      	  String[] array = query.split("primes:");
      	  ArrayList<Integer> list = new ArrayList<Integer>();
      	  
            array[1].replaceAll(" ", "");
            String[] strArray = array[1].split(",");
            
            ArrayList<String> ans = new ArrayList<String>();
            for (String s : strArray) {
            	s = s.trim();
            	boolean isPrime = true;
            	int i = Integer.valueOf(s);
            	
            	if (i <= 1)
            		continue;
            	
            	if (i == 2)
            		ans.add(s);
            	
            	if (isPrime(i)) {
            		ans.add(s);
            	}
            	
            }
           
            return  String.join(",", ans);
            
       }
        
        else {
        	Thread.sleep(10000);
        }
        
        
        
        return "Sean Connery";
    }
    
    public boolean isPrime(int n) {
    	for (int i = 2; i < n; i++) {
    		if (n%i == 0) {
    			return false;
    		}
    	}
    	
    	return true;
    }
    
    
}
