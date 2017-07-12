package Common;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import common.AbstractTest;
import common.Constant;

public class S001_Login extends AbstractTest {

	@BeforeClass(alwaysRun = true)
	@Parameters({ "browser" })
	public void setUp(String browser) {
		driver = openBrowser(browser, Constant.URL);
	}

	@Test
	public void f() {
	}

	@AfterClass(alwaysRun = true)
	public void tearsDown() {
		closeBrowser();
	}
	public static WebDriver driver;
}
