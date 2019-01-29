package MainP;
import common.Base;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class MainPageTest extends Base {
    MainPage mainPage;

    @BeforeMethod
    public void setUp() {
        mainPage = PageFactory.initElements(ad, MainPage.class);
    }
    @Test
    public void trendingTest(){
        String actual = mainPage.trending();
        String expected = "Mariano Rivera";
        System.out.println(actual);
        Assert.assertEquals(actual, expected);
    }
    @Test
    public void featuredDealsTest(){
        String actual = mainPage.featuredDeals();
        String expected = "Mariano Rivera";
        System.out.println(actual);
        Assert.assertEquals(actual, expected);
    }
    @Test
    public void sellingTest(){
        String actual = mainPage.selling();
        String expected = "CASH IT IN";
        System.out.println(actual);
        Assert.assertEquals(actual, expected);
    }
    @Test
    public void dealsTest(){
        String actual = mainPage.deals();
        String expected = "MORE";
        System.out.println(actual);
        Assert.assertEquals(actual, expected);
    }
    @Test
    public void categoriesTest(){
        String actual = mainPage.categories();
        String expected = "Antiques";
        System.out.println(actual);
        Assert.assertEquals(actual, expected);
    }
    @Test
    public void followingTest(){
        String actual = mainPage.following();
        String expected = "";
        System.out.println(actual);
        Assert.assertEquals(actual, expected);
    }

    @Test
    public void featuredSalesEventsTest(){
        mainPage.featuredSalesEvents();
    }
}