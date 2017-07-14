package Common;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import common.AbstractTest;
import common.Constant;
import page.DashboardPage;

public class S001_Login extends AbstractTest {

	@BeforeClass(alwaysRun = true)
	@Parameters({ "browser" })
	public void setUp(String browser) {
		driver = openBrowser(browser, Constant.URL);
		dashboard = new DashboardPage(driver);
		
		validUsername = "automation01";
		validPassword = "12345678";
		invalidUsername = "invalid";
		invalidPassword = "invalid";
		
	}

	@Test
	public void S001_Login_TC001_Verify_Login_Function() {
		log.info("Step 01: Click Login Drop");
		dashboard.clickLoginDrop();
		
		log.info("Step 04: Click Login button");
		dashboard.clickLoginButton();
		
		log.info("VP 01. Is My Account button Displayed");
		verifyTrue(dashboard.isLoginFailedMessageDisplayed());
		
		log.info("Step 01: Click Login Drop");
		dashboard.clickLoginDrop();
		
		log.info("Step 02: Input invalid username");
		dashboard.inputUserName(invalidUsername);
		
		log.info("Step 03: Input invalid password");
		dashboard.inputPassword(invalidPassword);
		
		log.info("Step 04: Click Login button");
		dashboard.clickLoginButton();
		
		log.info("VP 01. Is My Account button Displayed");
		verifyTrue(dashboard.isLoginFailedMessageDisplayed());
		
		log.info("Step 01: Click Login Drop");
		dashboard.clickLoginDrop();
		
		log.info("Step 02: Input valid username");
		dashboard.inputUserName(validUsername);
		
		log.info("Step 03: Input valid password");
		dashboard.inputPassword(validPassword);
		
		log.info("Step 04: Click Login button");
		dashboard.clickLoginButton();
		
		log.info("VP 01. Is My Account button Displayed");
		verifyTrue(dashboard.isMyAccountButtonDisplayed());
	}
	
	@Test
	public void S001_Login_TC002_Login_With__Username_Valid_Password() {
		
	}
	

	@AfterClass(alwaysRun = true)
	public void tearsDown() {
		closeBrowser();
	}
	DashboardPage dashboard;
	String validUsername, validPassword, invalidUsername, invalidPassword;
}
