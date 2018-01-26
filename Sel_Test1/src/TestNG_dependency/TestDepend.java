package TestNG_dependency;

import org.testng.annotations.Test;

public class TestDepend {
	@Test
	public void method1() {
		System.out.println("This is method 1");
	}

	@Test(dependsOnMethods = { "method1" })
	public void method2() {
		System.out.println("This is method 2");
	}
}
