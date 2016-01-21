package com.develogical.app;

import static org.junit.Assert.*;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.is;

public class QueryProcessorTest {

    QueryProcessor queryProcessor = new QueryProcessor();

    
	@Test
	public void tets() throws InterruptedException {

		
		assertEquals("-4", queryProcessor.process("q=6bb3e7c0: what is 13 minus 17") );
	}
	
	
}
