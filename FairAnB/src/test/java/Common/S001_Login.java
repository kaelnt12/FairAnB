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
		
	}

	@Test
	public void S001_Login_TC001_Login_With_Valid_Username_Valid_Password() {
		log.info("Step 01: Click Login Drop");
		dashboard.moveMouseToLoginDrop();
		
		log.info("Step 02: Input valid username");
		dashboard.inputUserName(validUsername);
		
		log.info("Step 03: Input valid password");
		dashboard.inputPassword(validPassword);
		
		log.info("Step 04: Click Login button");
		dashboard.clickLoginButton();
		
		log.info("VP 01. Is My Account button Displayed");
		verifyTrue(dashboard.isMyAccountButtonDisplayed());
	}

	@AfterClass(alwaysRun = true)
	public void tearsDown() {
//		closeBrowser();
	}
	DashboardPage dashboard;
	String validUsername;
	String validPassword;
}
