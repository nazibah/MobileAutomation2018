package SignIn;

import Register.RegisterPage;
import common.Base;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SignInPageTest extends Base {
    SignInPage signInPage;

    @BeforeMethod
    public void setUp() {
        signInPage = PageFactory.initElements(ad, SignInPage.class);}

    @Test
    public void businessAccountTest(){
        signInPage.businessAccount();
    }
}
