package Home;

import common.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends Base {
    @FindBy(xpath = "//android.widget.ImageButton[@content-desc=\"Main navigation, open\"]")
    WebElement searchBar;
    @FindBy(id = "com.ebay.mobile:id/textview_sign_out_status")
    WebElement signIn;
    @FindBy(id = "com.ebay.mobile:id/search_box")
    WebElement Home;
    @FindBy(id = "com.ebay.mobile:id/capsule_deals")
    WebElement Notifications;
    @FindBy(xpath = "//android.widget.LinearLayout[@content-desc=\"Sign in or Register\"]/android.widget.TextView")
    WebElement Messages;
    @FindBy(id = "com.ebay.mobile:id/button_register")
    WebElement MyEbay;
    @FindBy (id = "com.ebay.mobile:id/textview_deals")
    WebElement Watching;
    @FindBy(xpath = "//android.widget.LinearLayout[@content-desc=\"Sign in or Register\"]/android.widget.TextView")
    WebElement Purchases;
    @FindBy (id = "com.ebay.mobile:id/button_register")
    WebElement BidsOffers;

    public void searchBar(){
        searchBar.click();
    }
    public void signIn(){
        searchBar.click();
        signIn.click();
    }
    public void home(){
        searchBar();
        Home.click();
    }
    public void notification(){
        searchBar();
        Notifications.click();
    }
    public void messages(){
        searchBar();
        Messages.click();
    }
    public void myEbay(){
        searchBar();
        MyEbay.click();
    }
    public void watching(){
        searchBar();
        Watching.click();
    }
    public void purchases(){
        searchBar();
        Purchases.click();
    }
    public void bidsOffers(){
        searchBar();
        BidsOffers.click();
    }
}