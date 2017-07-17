package interfaces;

public class HomeShopPage {
	public static final String POPULAR_LISTINGS_PRODUCT_NAME = "//div[@class='product_item']//p[@class='pr-name' and contains(.,'%s')]";
	public static final String POPULAR_LISTINGS_PRODUCT_BUYNOW = "//div[@class='product_item']//p[@class='pr-name' and contains(.,'%s')]/parent::div/following-sibling::div/a[@title='Buy Now']";
	public static final String POPULAR_LISTINGS_PRODUCT_CONTACTSELLER = "//div[@class='product_item']//p[@class='pr-name' and contains(.,'%s')]/parent::div/following-sibling::div/a[@title='Contact Seller']";
	public static final String POPULAR_LISTINGS_PRODUCT_ADDTOWATCHLIST = "//div[@class='product_item']//p[@class='pr-name' and contains(.,'%s')]/parent::div/following-sibling::div/a[@title='Add to Watchlist']";
	public static final String FRESHLY_DISCOUNTED_PRODUCT_NAME = "";
	public static final String PRODUCT_FOR_SALE_PRODUCT_NAME = "";
	public static final String PRODUCT_FOR_BID_PRODUCT_NAME = "";
	public static final String PRODUCT_CLOSED_SOON_FOR_BID_PRODUCT_NAME = "";
	public static final String PRODUCT_CATEGORIES = "";
	public static final String BUY_NOW_BTN = "//h3[contains(.,'%s')]/parent::div/following-sibling::div//a[@title='Buy Now']";
	public static final String CONTACT_SELLER_BTN = "//h3[contains(.,'%s')]/parent::div/following-sibling::div//a[@title='Contact Seller']";
	public static final String ADD_TO_WATCHLIST_BTN = "//h3[contains(.,'%s')]/parent::div/following-sibling::div//a[@title='Add to Watchlist']";
}
