package page;

import org.openqa.selenium.WebDriver;

import common.Constant;

public class RegisterPage extends AbstractPage {

	public RegisterPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}

	/**
	 * Input First Name
	 * 
	 * @param value
	 */
	public void inputFirstName(String value) {
		waitForElement(driver, interfaces.RegisterPage.FIRST_NAME_TEXTBOX, timeWaits);
		type(driver, interfaces.RegisterPage.FIRST_NAME_TEXTBOX, value);
		sleep(1);
	}

	/**
	 * Input Last Name
	 * 
	 * @param value
	 */
	public void inputLastName(String value) {
		waitForElement(driver, interfaces.RegisterPage.LAST_NAME_TEXTBOX, timeWaits);
		type(driver, interfaces.RegisterPage.LAST_NAME_TEXTBOX, value);
		sleep(1);
	}

	/**
	 * Select Genre
	 * 
	 * @param value
	 */
	public void selectGenre(String value) {
		waitForElement(driver, interfaces.RegisterPage.GENRE_DROPDOWN, timeWaits);
		selectItemCombobox(driver, interfaces.RegisterPage.GENRE_DROPDOWN, value);
		sleep(1);
	}

	/**
	 * Select Country
	 * 
	 * @param value
	 */
	public void selectCountry(String value) {
		waitForElement(driver, interfaces.RegisterPage.COUNTRY_DROPDOWN, timeWaits);
		selectItemCombobox(driver, interfaces.RegisterPage.COUNTRY_DROPDOWN, value);
		sleep(1);
	}

	/**
	 * Input State 8080
	 * 
	 * @param value
	 */
	public void inputState(String value) {
		try {
			waitForElement(driver, interfaces.RegisterPage.PROVINCE_TEXTBOX, timeWaits);
			type(driver, interfaces.RegisterPage.PROVINCE_TEXTBOX, value);
			sleep(1);
		} catch (Exception e) {
			waitForElement(driver, interfaces.RegisterPage.STATE_TEXTBOX, timeWaits);
			selectItemCombobox(driver, interfaces.RegisterPage.STATE_TEXTBOX, value);
			sleep(1);
		}
	}

	/**
	 * Input Email Address
	 * 
	 * @param value
	 */
	public void inputEmailAddress(String value) {
		waitForElement(driver, interfaces.RegisterPage.EMAIL_TEXTBOX, timeWaits);
		type(driver, interfaces.RegisterPage.EMAIL_TEXTBOX, value);
		sleep(1);
	}

	/**
	 * Input Username
	 * 
	 * @param value
	 */
	public void inputUsername(String value) {
		waitForElement(driver, interfaces.RegisterPage.USERNAME_TEXTBOX, timeWaits);
		type(driver, interfaces.RegisterPage.USERNAME_TEXTBOX, value);
		sleep(1);
	}

	/**
	 * Input Password
	 * 
	 * @param value
	 */
	public void inputPassword(String value) {
		waitForElement(driver, interfaces.RegisterPage.PASSWORD_TEXTBOX, timeWaits);
		type(driver, interfaces.RegisterPage.PASSWORD_TEXTBOX, value);
		sleep(1);
	}

	/**
	 * Input Repeat Password
	 * 
	 * @param value
	 */
	public void inputRepeatPassword(String value) {
		waitForElement(driver, interfaces.RegisterPage.REPEAT_PASSWORD_TEXTBOX, timeWaits);
		type(driver, interfaces.RegisterPage.REPEAT_PASSWORD_TEXTBOX, value);
		sleep(1);
	}

	/**
	 * Click Submit Register Button
	 */
	public void clickSubmitRegisterButton() {
		waitForElement(driver, interfaces.RegisterPage.SUBMIT_REGISTER_BUTTON, timeWaits);
		click(driver, interfaces.RegisterPage.SUBMIT_REGISTER_BUTTON);
		sleep(5);
	}

	protected WebDriver driver;
	int timeWaits = Constant.TimeWait;
}
