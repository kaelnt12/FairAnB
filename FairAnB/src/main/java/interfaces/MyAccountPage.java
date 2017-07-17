package interfaces;

public class MyAccountPage {

	public static final String MY_ACCOUNT_INFORMATION_LINK = "//div[@id = 'main-content']//li/a[contains(.,'My Account')]";
	public static final String BILLING_SHIPPING_INFORMATION_LINK = "//li/a[contains(.,'Billing & shipping information')]";
	public static final String LOG_OUT_LINK = "//li/a[contains(.,'Logout')]";
	public static final String MY_ACCOUNT_INFORMATION_CONTENT = "//form[contains(@id,'editAccountInformation')]/address";
	public static final String BILLING_SHIPPING_INFORMATION_CONTENT = "//form[contains(@id,'editBillingAddress')]/address";

}
