package com.develogical.app;

import static org.junit.Assert.*;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.is;

public class QueryProcessorTest {

    QueryProcessor queryProcessor = new QueryProcessor();

    
	@Test
	public void tets() throws InterruptedException {

		
		assertEquals("7", queryProcessor.process("ed52a100: what is 6 plus 1") );
	}
	
	
}
