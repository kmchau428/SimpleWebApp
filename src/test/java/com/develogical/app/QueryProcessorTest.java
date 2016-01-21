package com.develogical.app;

import static org.junit.Assert.*;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.is;

public class QueryProcessorTest {

    QueryProcessor queryProcessor = new QueryProcessor();

    
	@Test
	public void tets() throws InterruptedException {
		String[] array = "ff3cd6e0: which of the following numbers is the largest: 288, 26".split(" ");
		
		assertEquals("288", queryProcessor.process("ff3cd6e0: which of the following numbers is the largest: 288, 26") );
	}
}
