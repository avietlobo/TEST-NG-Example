package cucumber.TestNGFramework;

import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

@Ignore
public class IgnoringTests {

	@Test
	public void testMethod1() {
		System.out.println("testMethod1");
	}

	@Test
	public void testMethod2() {
		System.out.println("testMethod2");
	}

}
