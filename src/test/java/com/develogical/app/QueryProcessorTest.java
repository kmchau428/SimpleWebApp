package com.develogical.app;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.containsString;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class QueryProcessorTest {

    QueryProcessor queryProcessor = new QueryProcessor();

    @Test
    public void knowsAboutShakespeare() throws Exception {
        assertThat(queryProcessor.process("Shakespeare"), containsString("playwright"));
    }

    @Test
    public void isNotCaseSensitive() throws Exception {
        assertThat(queryProcessor.process("shakespeare"), containsString("playwright"));
    }
    
    @Test
    public void knowsAboutSteve() throws Exception {
        assertThat(queryProcessor.process("Steve Jobs"), containsString("Apple"));
    }

    @Test
    public void isNotCaseSensitiveSteve() throws Exception {
        assertThat(queryProcessor.process("steve jobs"), containsString("Apple"));
    }
}
