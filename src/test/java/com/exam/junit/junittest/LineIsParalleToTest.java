package com.exam.junit.junittest;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

@RunWith(value = Parameterized.class)
public class LineIsParalleToTest {
  
  @Parameters
  public static Object[][] data(){
      return new Object[][]{
          {3,1,1,3,1,1,3,3,false},{22,13,4,10,22,13,4,10,true},{33,22,8,41,33,22,8,41,true}
      };
  }
  
  private static final double DELTA = 1e-15;
  
  @Parameter
  public double x0;
  
  @Parameter(1)
  public double y0;

  @Parameter(2)
  public double x1;
  
  @Parameter(3)
  public double y1;
  
  @Parameter(4)
  public double xx0;
  
  @Parameter(5)
  public double yy0;

  @Parameter(6)
  public double xx1;
  
  @Parameter(7)
  public double yy1;
  
  @Parameter(8)
  public boolean expect;
  
  
  @Before
  public void setUp() throws Exception {}

  @Test
  public void testIsParalleTo() {
    Line instance = new Line(x0,y0,x1,y1);
    Line instance2 = new Line(xx0,yy0,xx1,yy1);
    runtestIsParalleTo(expect,instance,instance2);
  }
  
  private void runtestIsParalleTo(boolean expected, Line inst1 ,Line inst2) {
    System.out.println("===== testIsParalleTo =====");
    assertEquals("Equal",expected,inst1.isParalleTo(inst2));
    
}

}
