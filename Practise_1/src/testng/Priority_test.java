package testng;

import org.testng.annotations.Test;

public class Priority_test {
  
  @Test(priority=1,description="validating priority concept")
  public void def() {
	  System.out.println("I'm def");
  }
  //@Test(priority=3,enabled=false)
  public void ghi() {
	  System.out.println("I'm ghi");
  }
  @Test(priority=2)
  public void abc() {
	  System.out.println("I'm abc");
  }
}
