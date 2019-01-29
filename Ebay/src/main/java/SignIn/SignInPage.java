package SignIn;

import common.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SignInPage extends Base {
    @FindBy(id = "com.ebay.mobile:id/button_register")
    WebElement RegisterOption;
    @FindBy(partialLinkText = "Business account")
    WebElement BusinessAccount;



    public void businessAccount(){
        RegisterOption.click();
        BusinessAccount.click();
    }
}
