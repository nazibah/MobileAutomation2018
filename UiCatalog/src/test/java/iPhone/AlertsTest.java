package iPhone;
import AlertsPage.Alerts;
import UiCatalogPage.UiCatalog;
import common.Base;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class AlertsTest extends Base {

    public Alerts alerts(){
        UiCatalog uiCatalog = PageFactory.initElements(ad, UiCatalog.class);
        uiCatalog.getAlerts();
        return PageFactory.initElements(ad, Alerts.class);
    }
    @Test
    public void testActionSheetSimple() throws InterruptedException {
        alerts().showActionSheetSimple();
        sleep(2);
    }
    @Test
    public void testActionSheetOkCancel() throws InterruptedException {
        alerts().showActionSheetOkCancel();
        sleep(2);
    }
    @Test
    public void testActionSheetCustom() throws InterruptedException {
        alerts().showActionSheetCustom();
        sleep(2);
    }
    @Test
    public void showActionSheetCustomButton1() throws InterruptedException {
        alerts().showActionSheetCustom();
        sleep(2);
    }
    @Test
    public void showActionSheetCustomButton2() throws InterruptedException {
        alerts().showActionSheetCustom();
        sleep(2);
    }

    @Test
    public void testAlertSimple() throws InterruptedException {
        alerts().showAlertSimple();
        sleep(2);
    }
    @Test
    public void testAlertOkCancel() throws InterruptedException {
        alerts().showAlertOkCancel();
        sleep(2);
    }
    @Test
    public void testAlertCustom() throws InterruptedException {
        alerts().showAlertCustom();
        sleep(2);
    }
    @Test
    public void testAlertCustomButton1() throws InterruptedException {
        alerts().showAlertCustomButton1();
        sleep(2);
    }
    @Test
    public void testAlertCustomButton2() throws InterruptedException {
        alerts().showAlertCustomButton2();
        sleep(2);
    }
    @Test
    public void testAlertCustomButtonCancel() throws InterruptedException {
        alerts().showAlertCustomButtonCancel();
        sleep(2);
    }
    @Test
    public void testSecureInput() throws InterruptedException {
        alerts().showSecureTextInput();
        sleep(2);
    }

}
