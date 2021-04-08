package cucumber.TestNGFramework;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
	@Test(groups = { "functest", "checkintest" })
	  public void testMethod1() {
		System.out.println("testMethod1");
	  }
	 
	  @Test(groups = {"functest", "checkintest"} )
	  public void testMethod2() {
		  System.out.println("testMethod2");
	  }
	 
	  @Test(groups = { "functest" })
	  public void testMethod3() {
		  System.out.println("testMethod3");
	  }
	  
	  @Parameters({ "first-name" })
	  @Test
	  public void testSingleString(String firstName) {
	    System.out.println("Invoked testString " + firstName);
	    assert "Cedric".equals(firstName);
	  }


}
