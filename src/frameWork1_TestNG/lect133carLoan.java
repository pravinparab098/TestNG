package frameWork1_TestNG;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class lect133carLoan {

	/*
	 * you can include and exclude the test cases depends on requirements
	 */

	@BeforeClass
	public void beforeclass()
	{
		System.out.println("I will execute before method in class from Personal Loan");
	}
	
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("I will execute Before All Methods from Car Loan");
	}
	
	@Test (groups = {"Smoke"})

	public void webLoginCarLoan() {
		System.out.println("Web LogIn Car");
	}

	@AfterClass
	public void afterclass()
	{
		System.out.println("I will execute after method in class from Personal Loan");
	}
	
	@Test (timeOut = 4000)

	public void MobileLoginCarLoan() {
		System.out.println("Mobile LogIn Car");
	}

	@AfterMethod
	public void afterMethod()
	{
		System.out.println("I will execute After All Methods from Car Loan");
	}
	
	@Test (dependsOnMethods= {"webLoginCarLoan" , "MobileSignOutCarLoan"})

	public void MobileSignInCarLoan() {
		System.out.println("Mobile SignIn Car");
	}

	@Test

	public void MobileSignOutCarLoan() {
		System.out.println("Mobile SignOut Car");
	}

	@Test (groups = {"Smoke"})

	public void APICarLoan() {
		System.out.println("API LogIn Car");
	}

}
