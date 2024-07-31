package test;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class SampleDemo {

	@BeforeClass
	public void samplebeforclass() {
		System.out.println("I will run before any class method");
	}
	@Test
	public void Demo()
	{
		System.out.println("Hello");
		Assert.assertTrue(false);
	}
	@Test
	public void SecondTest()
	{
		System.out.println("Seconftest");
	}

}
