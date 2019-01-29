package Home;

import common.Base;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomePageTest extends Base {
    HomePage homePage;

    @BeforeMethod
    public void setUp() {
        homePage = PageFactory.initElements(ad, HomePage.class);}

    @Test
    public void searchBarTest(){
        homePage.searchBar();
    }
    @Test
    public void signInTest(){
        homePage.signIn();
    }
    @Test
    public void homeTest(){
        homePage.home();
    }
    @Test
    public void notificationTest(){
        homePage.notification();
    }
    @Test
    public void messagesTest(){
        homePage.messages();
    }
    @Test
    public void myEbayTest(){
        homePage.myEbay();
    }
    @Test
    public void watchingTest(){
        homePage.watching();
    }
    @Test
    public void purchasesTest(){
        homePage.purchases();
    }
    @Test
    public void bidsOffersTest(){
        homePage.bidsOffers();
    }
}