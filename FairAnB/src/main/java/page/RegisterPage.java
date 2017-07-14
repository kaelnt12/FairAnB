package page;

import org.openqa.selenium.WebDriver;

import common.Constant;

public class RegisterPage extends AbstractPage{

	public RegisterPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}
	
	/**
	 * Input First Name
	 * @param value
	 */
	public void inputFirstName(String value) {
		waitForElement(driver, interfaces.RegisterPage.FIRST_NAME_TEXTBOX, timeWaits);
		type(driver, interfaces.RegisterPage.FIRST_NAME_TEXTBOX, value);
	}
	
	/**
	 * Input Last Name
	 * @param value
	 */
	public void inputLastName(String value) {
		waitForElement(driver, interfaces.RegisterPage.LAST_NAME_TEXTBOX, timeWaits);
		type(driver, interfaces.RegisterPage.LAST_NAME_TEXTBOX, value);
	}
	
	/**
	 * Select Genre
	 * @param value
	 */
	public void selectGenre(String value) {
		waitForElement(driver, interfaces.RegisterPage.GENRE_DROPDOWN, timeWaits);
		selectItemCombobox(driver, interfaces.RegisterPage.GENRE_DROPDOWN, value);
	}
	
	/**
	 * Select Country
	 * @param value
	 */
	public void selectCountry(String value) {
		waitForElement(driver, interfaces.RegisterPage.COUNTRY_DROPDOWN, timeWaits);
		selectItemCombobox(driver, interfaces.RegisterPage.COUNTRY_DROPDOWN, value);
	}
	
	/**
	 * Input State
	 * @param value
	 */
	public void selectState(String value) {
		waitForElement(driver, interfaces.RegisterPage.STATE_TEXTBOX, timeWaits);
		selectItemCombobox(driver, interfaces.RegisterPage.STATE_TEXTBOX, value);
	}
	
	/**
	 * Input Email Address
	 * @param value
	 */
	public void inputEmailAddress(String value) {
		waitForElement(driver, interfaces.RegisterPage.EMAIL_TEXTBOX, timeWaits);
		type(driver, interfaces.RegisterPage.EMAIL_TEXTBOX, value);
	}
	
	/**
	 * Input Username
	 * @param value
	 */
	public void inputUsername(String value) {
		waitForElement(driver, interfaces.RegisterPage.USERNAME_TEXTBOX, timeWaits);
		type(driver, interfaces.RegisterPage.USERNAME_TEXTBOX, value);
	}
	
	/**
	 * Input Password
	 * @param value
	 */
	public void inputPassword(String value) {
		waitForElement(driver, interfaces.RegisterPage.PASSWORD_TEXTBOX, timeWaits);
		type(driver, interfaces.RegisterPage.PASSWORD_TEXTBOX, value);
	}
	
	/**
	 * Input Repeat Password
	 * @param value
	 */
	public void inputRepeatPassword(String value) {
		waitForElement(driver, interfaces.RegisterPage.REPEAT_PASSWORD_TEXTBOX, timeWaits);
		type(driver, interfaces.RegisterPage.REPEAT_PASSWORD_TEXTBOX, value);
	}
	
	/**
	 * Click Submit Register Button
	 */
	public void clickSubmitRegisterButton() {
		waitForElement(driver, interfaces.RegisterPage.SUBMIT_REGISTER_BUTTON, timeWaits);
		click(driver, interfaces.RegisterPage.SUBMIT_REGISTER_BUTTON);
	}
	
	
	protected WebDriver driver; 
	int timeWaits = Constant.TimeWait;
}
