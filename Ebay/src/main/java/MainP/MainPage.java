package MainP;

import common.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage extends Base {
    @FindBy(id = "com.ebay.mobile:id/button_all_trending")
    WebElement AllTrending;
    @FindBy(id = "com.ebay.mobile:id/trend_topic_title")
    WebElement FirstTrendTopic;
    @FindBy(id = "com.ebay.mobile:id/button_all_deals")
    WebElement FeaturedDeals;
    @FindBy(id = "com.ebay.mobile:id/item_title")
    WebElement ShowFeaturedDeals;
    @FindBy(id = "com.ebay.mobile:id/capsule_selling")
    WebElement Selling;
    @FindBy(id = "com.ebay.mobile:id/cashTitle")
    WebElement CashItIn;
    @FindBy(id = "com.ebay.mobile:id/capsule_deals")
    WebElement Deals;
    @FindBy(id = "com.ebay.mobile:id/more_button")
    WebElement MoreDeals;
    @FindBy(id = "com.ebay.mobile:id/capsule_categories")
    WebElement Categories;
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.support.v7.widget.RecyclerView/android.widget.FrameLayout[1]/android.widget.TextView")
    WebElement MoreCategories;
    @FindBy(id = "com.ebay.mobile:id/capsule_following")
    WebElement Following;
    @FindBy(id = "com.ebay.mobile:id/searches_icon_circle")
    WebElement Circle;

    public String trending(){
        scrollAndClickByName("Trending on eBay");
        String text = FirstTrendTopic.getText();
        return text;
    }
    public String featuredDeals(){
        FeaturedDeals.click();
        String text = ShowFeaturedDeals.getText();
        return text;
    }
    public String selling(){
        Selling.click();
        String text = CashItIn.getText();
        return text;
    }
    public String deals(){
        Deals.click();
        String text = MoreDeals.getText();
        return text;
    }
    public String categories(){
        Categories.click();
        String text = MoreCategories.getText();
        return text;
    }
    public String following(){
        Following.click();
        String text = Circle.getText();
        return text;
    }
    public void featuredSalesEvents() {
        scrollAndClickByName("Featured Sales & Events");
    }
}
