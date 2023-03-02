package frameWork1_TestNG;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class lect132XMLfile {

	/*
	 * HOW TO RUN TESTS WITH TestNG - You need to have @Test annotation followed by
	 * name
	 */

	@BeforeClass
	public void beforeclass() {
		System.out.println("I will execute before method in class from Personal Loan");
	}

	@AfterSuite
	public void afterSuite() {
		System.out.println("I will execuet at last");
	}

	@AfterTest

	public void lastExecute() {
		System.out.println("After Test will Execute after all from Personal Loan folder");
	}

	@Test(groups = { "Smoke" })

	public void FirstPrograme() {
		System.out.println("First Programe");
	}

	/*
	 * MULTIPLE TEST CASES CAN BE RUN IN A ONE TEST CASE
	 */

	// TESTNG FLOW IS TestSuite - TestFolder(shell) - TestCases

	// @Parameters({"URL"})
	@Test(dataProvider = "getData")

	public void SecondPrograme(String username , String password) {
		System.out.println("Second Programe");
		System.out.println(username);
		System.out.println(password);
	}

	@DataProvider
	public Object[][] getData() {
		// 1st Combination = username - password - good credit history
		// 2nd combination = no credit history
		// 3rd combination = fraudelent credit history

		Object[][] data = new Object[3][2];
		// 1st Combination
		data[0][0] = "firstsetusename";
		data[0][1] = "password";

		// 2nd combination
		data[1][0] = "secondusername";
		data[1][1] = "secondpassword";

		// 3rd combination
		data[2][0] = "thirdusername";
		data[2][1] = "thirdpassword";
		
		return data;
		
	}
}
