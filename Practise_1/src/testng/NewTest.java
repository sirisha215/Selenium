package testng;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class NewTest {
  @Test
  public void h() {
	  System.out.println(" @Test h");
  }
  @BeforeClass
  public void beforeClass() {
	  System.out.println("@BeforeClass");
  }
  @Test
  public void g() {
	  System.out.println(" @Test g");
  }
  @AfterClass
  public void afterClass() {
	  System.out.println("@AfterClass");
  }

}
