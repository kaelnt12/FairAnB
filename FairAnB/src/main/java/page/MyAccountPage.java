package page;

import org.openqa.selenium.WebDriver;

import common.Constant;

public class MyAccountPage extends AbstractPage{

	public MyAccountPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}
	
	/**
	 * Click My Account Information Link
	 */
	public void clickMyAccountInformationLink() {
		waitForElement(driver, interfaces.MyAccountPage.MY_ACCOUNT_INFORMATION_LINK, timeWaits);
		click(driver, interfaces.MyAccountPage.MY_ACCOUNT_INFORMATION_LINK);
		sleep(2);
	}
	
	/**
	 * Click Billing & shipping information 
	 */
	public void clickBillingShippingInformationLink() {
		waitForElement(driver, interfaces.MyAccountPage.BILLING_SHIPPING_INFORMATION_LINK, timeWaits);
		click(driver, interfaces.MyAccountPage.BILLING_SHIPPING_INFORMATION_LINK);
		sleep(2);
	}
	
	/**
	 * Click Log Out Button
	 */
	public void clickLogOutButton() {
		waitForElement(driver, interfaces.MyAccountPage.LOG_OUT_LINK, timeWaits);
		click(driver, interfaces.MyAccountPage.LOG_OUT_LINK);
		sleep(2);
	}
	
	/**
	 * Get Dynamic My Account Information
	 * @param value
	 * @return
	 */
	public String getDynamicMyAccountInformation(String value) {
		waitForElement(driver, interfaces.MyAccountPage.MY_ACCOUNT_INFORMATION_CONTENT, timeWaits);
		String returnValue = null;
		String accountInfo[] = getAttributeValue(driver, interfaces.MyAccountPage.MY_ACCOUNT_INFORMATION_CONTENT, "innerText").split("\n");
		for(int i = 0; i < accountInfo.length - 1; i++) {
			if(accountInfo[i].toLowerCase().contains(value.toLowerCase())) {
				returnValue =accountInfo[i].toLowerCase()
						.replace(value.toLowerCase(), "")
						.replace(": ", "")
						.replace(" ", "");
			}
		}
		return returnValue;
	}
	
	/**
	 * Get Customer First Name In Billing & Shipping Information
	 * @return
	 */
	public String getCustomerFirstNameInBillingShippingInformation() {
		waitForElement(driver, interfaces.MyAccountPage.BILLING_SHIPPING_INFORMATION_CONTENT, timeWaits);
		String billingInfo[] = getAttributeValue(driver, interfaces.MyAccountPage.BILLING_SHIPPING_INFORMATION_CONTENT, "innerText").split("\n");
		String customerName[] = billingInfo[0].split(" ");
		return customerName[0];
	}
	
	/**
	 * Get Customer Last Name In Billing & Shipping Information
	 * @return
	 */
	public String getCustomerLastNameInBillingShippingInformation() {
		waitForElement(driver, interfaces.MyAccountPage.BILLING_SHIPPING_INFORMATION_CONTENT, timeWaits);
		String billingInfo[] = getAttributeValue(driver, interfaces.MyAccountPage.BILLING_SHIPPING_INFORMATION_CONTENT, "innerText").split("\n");
		System.out.println(billingInfo[0]);
		String customerName[] = billingInfo[0].split(" ");
		return customerName[1];
	}
	
	/**
	 * Get Customer State/Province In Billing Shipping Information
	 * @return
	 */
	public String getCustomerStateProvinceInBillingShippingInformation() {
		waitForElement(driver, interfaces.MyAccountPage.BILLING_SHIPPING_INFORMATION_CONTENT, timeWaits);
		String billingInfo[] = getAttributeValue(driver, interfaces.MyAccountPage.BILLING_SHIPPING_INFORMATION_CONTENT, "innerText").split("\n");
		String stateProvince[] = billingInfo[1].split(", ");
		return stateProvince[0];
	}
	
	/**
	 * Get Customer Country In Billing Shipping Information
	 * @return
	 */
	public String getCustomerCountryInBillingShippingInformation() {
		waitForElement(driver, interfaces.MyAccountPage.BILLING_SHIPPING_INFORMATION_CONTENT, timeWaits);
		String billingInfo[] = getAttributeValue(driver, interfaces.MyAccountPage.BILLING_SHIPPING_INFORMATION_CONTENT, "innerText").split("\n");
		String country[] = billingInfo[1].split(", ");
		return country[1];
	}
	
	protected WebDriver driver;
	int timeWaits = Constant.TimeWait;
}
