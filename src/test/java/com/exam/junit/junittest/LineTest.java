package com.exam.junit.junittest;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;
public class LineTest {
	Line instance ;
	Line instance2;
	private static final double DELTA = 1e-15;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testLegalLine() {
		instance = new Line(2.0,3.0,1.0,20.0);
	
		assertEquals("Legal",2.0, instance.getX0(),0.01);
		assertEquals("Legal",3.0, instance.getY0(),0.01);
		assertEquals("Legal",1.0, instance.getX1(),0.01);
		assertEquals("Legal",20.0, instance.getY1(),0.01);
	}
	@Test
	public void testNotLegalLine() {
		instance = new Line(2.0,3.0,1.0,20.0);
	
		assertNotEquals("iLegal",5.0, instance.getX0(),0.01);
		assertNotEquals("iLegal",33.0, instance.getY0(),0.01);
		assertNotEquals("iLegal",12.0, instance.getX1(),0.01);
		assertNotEquals("iLegal",203.0, instance.getY1(),0.01);
	}
	
	@Test(expected = ArithmeticException.class)
	public void testCalSlopeException() {
		runtestCalSlopeException(2.0,3.0,2.0,20.0);
		runtestCalSlopeException(22.0,3.0,22.0,20.0);
		runtestCalSlopeException(99.0,3.9,99.0,210.0);
	}

	private void runtestCalSlopeException(double d, double e, double f, double g) {
		System.out.println("===== testCalSlopeException =====");
		instance = new Line(d,e,f,g);
		instance.calSlope();
		
	}

	@Test
	public void testCalSlope() {
		instance = new Line(50.0,30.0,30.0,20.0);
		runtestCalSlope(0.500,instance);
		instance = new Line(150.0,130.0,320.0,120.0);
		runtestCalSlope(-0.058,instance);
		instance = new Line(222.0,333.0,111.0,222.0);
		runtestCalSlope(1.000,instance);
	}

	private void runtestCalSlope(double expected, Line inst2) {
		System.out.println("===== testCalSlope =====");
		assertEquals("Equal" ,expected, inst2.calSlope(),0.001);
		
		
	}

	@Test
	public void testCalDistance() {
		instance = new Line(50.000,30.0,30.0,20.0);
		runtestCalDistance(22.360,instance);
		instance = new Line(150.0,320.0,30.0,20.0);
		runtestCalDistance(323.109,instance);
		instance = new Line(66.0,55.0,99.0,3.0);
		runtestCalDistance(61.587,instance);
	}

	private void runtestCalDistance(double expected, Line inst2) {
		System.out.println("===== testCalDistance =====");
		assertEquals("Equal" ,expected, inst2.calDistance(),0.001);
		
	}

	@Test
	public void testIsParalleTo() {
		instance = new Line(50.000,30.0,30.0,20.0);
		instance2 = new Line(50.000,30.0,30.0,20.0);
		runtestIsParalleTo(true,instance,instance2);
		instance = new Line(150.000,30.0,30.0,120.0);
		instance2 = new Line(150.000,30.0,30.0,120.0);
		runtestIsParalleTo(true,instance,instance2);
		instance = new Line(520.000,30.0,30.0,20.0);
		instance2 = new Line(520.000,30.0,30.0,20.0);
		runtestIsParalleTo(true,instance,instance2);
	}

	private void runtestIsParalleTo(boolean expected, Line inst1 ,Line inst2) {
		System.out.println("===== testIsParalleTo =====");
		assertEquals("Equal",expected,inst1.isParalleTo(inst2));
		
	}

}
