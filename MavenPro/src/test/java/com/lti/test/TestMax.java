package com.lti.test;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.lti.code.Max;

public class TestMax {
	private Max max;
	
	@Before
	public void init() {
		max = new Max();
	}
	
	@Test
	public void testMax() {
		assertEquals(6, max.maximum(4, 6));
	}
}
