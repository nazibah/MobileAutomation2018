package AlertsPage;
import common.Base;
import org.openqa.selenium.By;

public class Alerts extends Base {
    public void showActionSheetSimple(){
        clickByXpath("(//XCUIElementTypeStaticText[@name=\"Show Simple\"])[1]");
        String actual = ad.findElement(By.xpath("(//XCUIElementTypeStaticText[@name=\"Show Simple\"])[1]")).getText();
        String expected = "Show Simple";
        System.out.println(actual);
    }

    public void showActionSheetOkCancel(){
        clickByXpath("(//XCUIElementTypeStaticText[@name=\"Show OK-Cancel\"])[1]");
        String actual = ad.findElement(By.xpath("(//XCUIElementTypeStaticText[@name=\"Show OK-Cancel\"])[1]")).getText();
        String expected = "Show OK-Cancel";
        System.out.println(actual);
    }
    public void showActionSheetCustom() {
        clickByXpath("//XCUIElementTypeStaticText[@name=\"Show Customized\"]");
        String actual = ad.findElement(By.xpath("//XCUIElementTypeStaticText[@name=\"Show Customized\"]")).getText();
        String expected = "Show Customized";
        System.out.println(actual);
    }
    public void showActionSheetCustomButton1() {
        clickByXpath("//XCUIElementTypeButton[@name=\"Button1\"]");
        String actual = ad.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Button1\"]")).getText();
        String expected = "Button1";
        System.out.println(actual);
    }
    public void showActionSheetCustomButton2() {
        clickByXpath("//XCUIElementTypeButton[@name=\"Button2\"]");
        String actual = ad.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Button2\"]")).getText();
        String expected = "Button2";
        System.out.println(actual);
    }

    public void showAlertSimple(){
        clickByXpath("(//XCUIElementTypeStaticText[@name=\"Show Simple\"])[2]");
        String actual = ad.findElement(By.xpath("(//XCUIElementTypeStaticText[@name=\"Show Simple\"])[2]")).getText();
        String expected = "Show Simple";
        System.out.println(actual);
    }
    public void showAlertOkCancel(){
        clickByXpath("(//XCUIElementTypeStaticText[@name=\"Show OK-Cancel\"])[2]");
        String actual = ad.findElement(By.xpath("(//XCUIElementTypeStaticText[@name=\"Show OK-Cancel\"])[2]")).getText();
        String expected = "Show OK-Cancel";
        System.out.println(actual);
    }
    public void showAlertCustom(){
        clickByXpath("//XCUIElementTypeStaticText[@name=\"Show Custom\"]");
        String actual = ad.findElement(By.xpath("//XCUIElementTypeStaticText[@name=\"Show Custom\"]")).getText();
        String expected = "Show Custom";
        System.out.println(actual);
    }
    public void showAlertCustomButton1(){
        clickByXpath("//XCUIElementTypeButton[@name=\"Button1\"]");
        String actual = ad.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Button1\"]")).getText();
        String expected = "Button1";
        System.out.println(actual);
    }
    public void showAlertCustomButton2(){
        clickByXpath("//XCUIElementTypeButton[@name=\"Button2\"]");
        String actual = ad.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Button2\"]")).getText();
        String expected = "Button2";
        System.out.println(actual);
    }
    public void showAlertCustomButtonCancel(){
        clickByXpath("//XCUIElementTypeButton[@name=\"Cancel\"]");
        String actual = ad.findElement(By.xpath("//XCUIElementTypeButton[@name=\"Cancel\"]")).getText();
        String expected = "Cancel";
        System.out.println(actual);
    }


    public void showSecureTextInput(){
        clickByXpath("//XCUIElementTypeStaticText[@name=\"Secure Text Input\"]");
        String actual = ad.findElement(By.xpath("//XCUIElementTypeStaticText[@name=\"Secure Text Input\"]")).getText();
        String expected = "Secure Text Input";
        System.out.println(actual);
    }
}
