package Basic;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ChromologicalOrder {
@BeforeSuite
public void beforeSuite() {
	System.out.println("Before Suite");
}
@BeforeTest
public void beforeTest() {
	System.out.println("Before Test");
}
@BeforeClass
public void beforeClass() {
	System.out.println("Before Class");
}
@BeforeMethod
public void beforeMethod() {
	System.out.println("Before Method");
}
@Test
public void TestCase() {
	System.out.println("Test Case");
}
@AfterMethod
public void AfterMethod() {
	System.out.println("After Method");
}
@AfterClass
public void AfterClass() {
	System.out.println("After Class");

}
@AfterTest
public void AferTest() {
	System.out.println("After Test");

}
@AfterSuite
public void AfterSuite() {
	System.out.println("After Suite");

}
}
