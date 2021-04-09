package practise;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Testing {
	@Test(groups="smoke")
	public void method1() {
	System.out.println("hi");
	}
	@Test(groups= {"sanity","smoke"})
	public void method2() {
	System.out.println("hello");
	}
	@Test(groups="sugar",dependsOnMethods= {"method2"})
	public void method3() {
	System.out.println("helloooo");
	}
	
	
	
	
	
	
	
	@BeforeMethod
	public void method4() {
	System.out.println("BeforeMethod");
	}
	@BeforeSuite
	public void method5() {
	System.out.println("BeforeSuite");
	}
	@AfterSuite
	public void method6() {
		System.out.println("AfterSuite");
	}
	@AfterMethod
	public void method7() {
	System.out.println("AfterMethod");
	}
	@BeforeClass
	public void method8() {
	System.out.println("BeforeClass");
	}
	@AfterClass
	public void method9() {
	System.out.println("AfterClass");
	}
}

