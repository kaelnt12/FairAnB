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
	}
	
	/**
	 * Click Billing & shipping information 
	 */
	public void clickBillingShippingInformationLink() {
		waitForElement(driver, interfaces.MyAccountPage.BILLING_SHIPPING_INFORMATION_LINK, timeWaits);
		click(driver, interfaces.MyAccountPage.BILLING_SHIPPING_INFORMATION_LINK);
	}
	
	/**
	 * Click Log Out Button
	 */
	public void clickLogOutButton() {
		waitForElement(driver, interfaces.MyAccountPage.LOG_OUT_LINK, timeWaits);
		click(driver, interfaces.MyAccountPage.LOG_OUT_LINK);
	}
	
	/**
	 * Get Dynamic My Account Information
	 * @param value
	 * @return
	 */
	public String getDynamicMyAccountInformation(String value) {
		waitForElement(driver, interfaces.MyAccountPage.MY_ACCOUNT_INFORMATION, timeWaits);
		String returnValue = null;
		String accountInfo[] = getAttributeValue(driver, interfaces.MyAccountPage.MY_ACCOUNT_INFORMATION, "innerText").split("/n");
		for(int i = 0; i < accountInfo.length; i++) {
			if(accountInfo[i].toLowerCase().contains(value.toLowerCase())) {
				String sentenceInfo[] = accountInfo[i].split(": ");
				returnValue = sentenceInfo[1];
			}
		}
		return returnValue;
	}
	
	
	protected WebDriver driver;
	int timeWaits = Constant.TimeWait;
}
