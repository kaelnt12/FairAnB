package page;

import org.openqa.selenium.WebDriver;

import common.Constant;

public class DashboardPage extends AbstractPage{

	public DashboardPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}
	
	/**
	 * Input User Name
	 */
	public void inputUserName(String value) {
		waitForElement(driver, interfaces.DashboardPage.USERNAME_TEXTBOX, timeWaits);
		type(driver, interfaces.DashboardPage.USERNAME_TEXTBOX, value);
		sleep(1);
	}
	
	/**
	 * Input Password
	 * @param value
	 */
	public void inputPassword(String value) {
		waitForElement(driver, interfaces.DashboardPage.PASSWORD_TEXTBOX, timeWaits);
		type(driver, interfaces.DashboardPage.PASSWORD_TEXTBOX, value);
		sleep(1);
	}
	
	/**
	 * Click Login Button
	 */
	public void clickLoginButton() {
		waitForElement(driver, interfaces.DashboardPage.LOGIN_BUTTON, timeWaits);
		click(driver, interfaces.DashboardPage.LOGIN_BUTTON);
		sleep(2);
	}
	
	/**
	 * Click Login Button
	 */
	public void moveMouseToLoginDrop() {
		waitForElement(driver, interfaces.DashboardPage.LOGIN_DROP, timeWaits);
		click(driver, interfaces.DashboardPage.LOGIN_DROP);
		
	}
	
	/**
	 * Is My Account Button Displayed
	 * @return
	 */
	public boolean isMyAccountButtonDisplayed() {
		waitForElement(driver, interfaces.DashboardPage.MY_ACCOUNT, timeWaits);
		return isControlDisplayed(driver, interfaces.DashboardPage.MY_ACCOUNT);
	}
	
	int timeWaits = Constant.TimeWait;
	WebDriver driver;
}
