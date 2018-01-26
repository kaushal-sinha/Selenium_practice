package TestNG_Demo;

import org.testng.annotations.*;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNG_Anno {
	@BeforeMethod
	public void beforeMethod() {
	System.out.println("Before Any Method");
	}
	@AfterMethod
	public void afterMethod() {
	System.out.println("After Any Method");
	}
	@BeforeClass
	public void beforeClass() {
	System.out.println("Before Any Class");
	}
	@AfterClass
	public void afterClass() {
	System.out.println("After Any Class");
	}
	@BeforeSuite
	public void beforeSuite() {
	System.out.println("Before Any Suite");
	}
	@AfterSuite
	public void afterSuite() {
	System.out.println("After Any Suite");
	}
	@BeforeTest
	public void beforeTest() {
	System.out.println("Before Any Test");
	}
	@AfterTest
	public void afterTest() {
	System.out.println("After Any Test");
	}
	@BeforeGroups("Regression")
	public void beforeGroups() {
	System.out.println("Before Any REGression Groups");
	}
	@AfterGroups("Smoke Test")
	public void afterGroups() {
	System.out.println("After Any Smoke Test Groups");
	}
	@Test
	public void first() {
		System.out.println("1 Test");
	}
	@Test
	public void second() {
		System.out.println("2 Test");
	}
	@Test
	public void third() {
		System.out.println("3 Test");
	}
	@Test(groups="Regression")
	public void firstGroup() {
		System.out.println("1 TestGroup - Regression");
	}
	@Test(groups="Smoke Test")
	public void secondGroup() {
		System.out.println("2 TestGroup - Smoke Test");
	}
	@Test(groups="Regression")
	public void thirdGroup() {
		System.out.println("3 TestGroup - Regression");
	}

}
