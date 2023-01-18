package Practice_maven;

import org.testng.annotations.Test;

public class SampleTest_1 {
	
	
	@Test(groups="smoke")
	public void simple1()
	{
		System.out.println("---TestScipt--1--");
		
		
	}
	
	@Test(groups="regression")
	
	public void simple2()
	{
		System.out.println("---TestScipt--2--");
		
		
	}

}
