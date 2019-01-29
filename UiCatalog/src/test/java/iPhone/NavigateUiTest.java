package iPhone;

import navigate.NavigateUi;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import java.util.List;

public class NavigateUiTest extends NavigateUi {
    NavigateUi navigateUi;
    @BeforeMethod
    public void setUP(){
        navigateUi = PageFactory.initElements(ad, NavigateUi.class);
    }
    @Test
    public void webElementName() throws Exception {
        List actual = navigateUi.getNavigateUi1();
        List expected = navigateUi.getNavigateUi2();
        Assert.assertEquals(actual,expected);
    }
}