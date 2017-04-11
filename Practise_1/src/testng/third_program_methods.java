package testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class third_program_methods {
  @Test
  public void f() {
	  System.out.println(" @Test f");
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println(" @Before Test");
  }
  @Test
  public void e() {
	  System.out.println(" @Test e");
  }
  

  @AfterMethod
  public void afterMethod() {
	  System.out.println(" @After Test");
  }

}
