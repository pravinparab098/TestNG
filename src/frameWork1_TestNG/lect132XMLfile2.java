package frameWork1_TestNG;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class lect132XMLfile2 {

	
	@Test (enabled = false)
	
	public void PersonalLoan()
	{
		System.out.println("Loan");
	}
	
	@BeforeTest
	
	public void prerequiste()
	{
		System.out.println("Before Test execute before all from Personal Loan folder");
	}
	
}
