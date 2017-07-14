package interfaces;

public class HomeShopPage {
	public static final String POPULAR_LISTINGS_PRODUCT_NAME = "//div[@class='product_item']//p[@class='pr-name' and contains(.,'%s')]";
	public static final String POPULAR_LISTINGS_PRODUCT_BUYNOW = "//div[@class='product_item']//p[@class='pr-name' and contains(.,'%s')]/parent::div/following-sibling::div/a[@title='Buy Now']";
	public static final String POPULAR_LISTINGS_PRODUCT_CONTACTSELLER = "//div[@class='product_item']//p[@class='pr-name' and contains(.,'%s')]/parent::div/following-sibling::div/a[@title='Contact Seller']";
	public static final String FRESHLY_DISCOUNTED_PRODUCT_NAME = "//a[@id = 'signinDrop']";
	public static final String PRODUCT_FOR_SALE_PRODUCT_NAME = "//a[@id = 'signinDrop']";
	public static final String PRODUCT_FOR_BID_PRODUCT_NAME = "//a[@id = 'signinDrop']";
	public static final String PRODUCT_CLOSED_SOON_FOR_BID_PRODUCT_NAME = "//a[@id = 'signinDrop']";
	public static final String PRODUCT_CATEGORIES = "//a[@id = 'signinDrop']";
}
