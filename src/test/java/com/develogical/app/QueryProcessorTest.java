package com.develogical.app;

import static org.junit.Assert.*;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.is;

public class QueryProcessorTest {

    QueryProcessor queryProcessor = new QueryProcessor();

    
	@Test
	public void tets() throws InterruptedException {

		
		assertEquals("64", queryProcessor.process("b5aeaf80: which of the following numbers is both a square and a cube: 64, 5, 5, 5") );
	}
	
	
}
