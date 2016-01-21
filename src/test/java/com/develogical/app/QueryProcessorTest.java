package com.develogical.app;

import static org.junit.Assert.*;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.is;

public class QueryProcessorTest {

    QueryProcessor queryProcessor = new QueryProcessor();

    
	@Test
	public void tets() throws InterruptedException {

		
		assertEquals("379, 449", queryProcessor.process("2c434900: which of the following numbers are primes: 351, 449, 684, 379") );
	}
	
	
}
