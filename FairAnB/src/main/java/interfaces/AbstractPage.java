package interfaces;

public class AbstractPage {
	public static final String LOGIN_DROP = "//a[@id = 'signinDrop']";
	public static final String USERNAME_TEXTBOX = "//input[@id='signin_userName']";
	public static final String PASSWORD_TEXTBOX = "//input[@id='signin_password']";
	public static final String LOGIN_BUTTON = "//button[@id='login-button']";
	public static final String MY_ACCOUNT = "//a[@title = 'My Account']";
	public static final String LOGIN_FAILED_MESSAGE = "//div[contains(.,'Login Failed. Username or Password is incorrect.')]";
	public static final String REGISTER_LINK = "//a[@class='registration-link']";
	public static final String DYNAMIC_PAGE_HEADER = "//span[contains(.,'%s')]";
	

}
