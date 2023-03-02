package frameWork1_TestNG;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class lect133homeLoan {

	/*
	 * MODULARIZE THE TEST CASES BASED ON THE FUNCTIONALITY AND TRIGGER THEM
	 * ACCORDINGLY
	 */

	@BeforeSuite
	public void beforeSuite()
	{
		System.out.println("I will execute before all");
	}
	
	@Test (groups = {"Smoke"})

	public void webLoginHomeLoan() {
		System.out.println("Web LogIn Home");
	}

	@Test

	public void MobileLoginHomeLoan() {
		System.out.println("Mobile LogIn Home");
	}

	@Test

	public void LoginAPIHomeLoan() {
		System.out.println("API LogIn Home");
	}

}
