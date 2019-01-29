package Categories;

import common.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CategoriesPage extends Base {
    @FindBy(id = "com.ebay.mobile:id/capsule_categories")
    WebElement Categories;
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.support.v7.widget.RecyclerView/android.widget.FrameLayout[1]/android.widget.TextView")
    WebElement MoreCategories;
    @FindBy(xpath = "//android.widget.FrameLayout[@content-desc=\"Collapsed Antiquities Button\"]/android.widget.TextView")
    WebElement Antiquities;
    @FindBy(xpath = "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.LinearLayout/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.support.v7.widget.RecyclerView/android.widget.FrameLayout[2]/android.widget.TextView")
    WebElement TheAmericas;
    @FindBy(id = "com.ebay.mobile:id/button_header_more")
    WebElement Filter;

    public String categories(){
        Categories.click();
        String text = MoreCategories.getText();
        return text;
    }
    public String categoriesAntiquities(){
        categories();
        String text = Antiquities.getText();
        return text;
    }
    public String categoriesTheAmericas(){
        categoriesAntiquities();
        String text = TheAmericas.getText();
        return text;
    }
    public String categoriesFilter(){
        categoriesTheAmericas();
        String text = Filter.getText();
        return text;
    }
}
