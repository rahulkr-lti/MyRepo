package com.lti.test;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.lti.code.Min;

public class TestMin {
	
private Min min;
	
	@Before
	public void init() {
		min = new Min();
	}
	
	@Test
	public void testMin() {
		assertEquals(4, min.minimum(4, 6));
	}

	@Test
	public void testMax() {
		assertEquals(6, min.maximum(4, 6));
	}
}
