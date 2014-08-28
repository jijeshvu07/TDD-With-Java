package com.aj.tdddemo.test;



import static org.junit.Assert.*;

import org.junit.Test;

import com.aj.tdddemo.java.StringHelper;

public class TddTest {
	StringHelper helper=new StringHelper();

	@Test
	public void testStringWith2Chars() {
		assertEquals("DC",helper.processString ("CD"));
		
	}
	@Test
	public void testStringWith1Chars() {
		assertEquals("A",helper.processString ("A"));
		
	}
	@Test
	public void testStringWithNull() {
		assertEquals("",helper.processString (""));
		
	}
	
}
