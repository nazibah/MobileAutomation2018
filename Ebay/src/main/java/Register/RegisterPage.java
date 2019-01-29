package Register;
import common.Base;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RegisterPage extends Base {
    @FindBy(id = "com.ebay.mobile:id/button_register")
    WebElement RegisterOption;
    @FindBy(id = "firstname")
    WebElement FirstName;
    @FindBy(id = "lastname")
    WebElement LastName;
    @FindBy(id = "email")
    WebElement Email;
    @FindBy(id = "PASSWORD")
    WebElement Password;
    @FindBy(id = "ppaFormSbtBtn")
    WebElement RegisterButton;
    @FindBy(id = "firstname_w")
    WebElement FirstNameErrorMessage;
    @FindBy(id = "lastname_w")
    WebElement LastNameErrorMessage;
    @FindBy(id = "email_w")
    WebElement EmailErrorMessage;
    @FindBy(id = "PASSWORD_w")
    WebElement PasswordErrorMessage;

    public String invalidFirstNameSignUp() {
        RegisterOption.click();
        LastName.sendKeys("Far");
        FirstName.sendKeys("");
        Email.sendKeys("n95@g.com");
        Password.sendKeys("n");
        RegisterButton.click();
        String text = FirstNameErrorMessage.getText();
        return text;
    }
    public String withoutInfo(){
        RegisterOption.click();
        LastName.sendKeys("");
        FirstName.sendKeys("");
        Email.sendKeys("");
        Password.sendKeys("");
        RegisterButton.click();
        String text = FirstNameErrorMessage.getText();
        return text;
    }
    public String invalidLastNameSignUp() {
        RegisterOption.click();
        LastName.sendKeys("");
        FirstName.sendKeys("");
        Email.sendKeys("n95@g.com");
        Password.sendKeys("n");
        RegisterButton.click();
        String text = LastNameErrorMessage.getText();
        return text;
    }
    public String invalidEmailSignUp() {
        RegisterOption.click();
        FirstName.sendKeys("Naz");
        LastName.sendKeys("Far");
        Email.sendKeys("@g.c");
        Password.sendKeys("n");
        RegisterButton.click();
        String text = EmailErrorMessage.getText();
        return text;
    }
    public String noEmailSignUp() {
        RegisterOption.click();
        FirstName.sendKeys("Naz");
        LastName.sendKeys("Far");
        Email.sendKeys("");
        Password.sendKeys("n");
        RegisterButton.click();
        String text = EmailErrorMessage.getText();
        return text;
    }
    public String existingEmailSignUp() {
        RegisterOption.click();
        FirstName.sendKeys("Naz");
        LastName.sendKeys("Far");
        Email.sendKeys("nazibah95@gmail.com");
        Password.sendKeys("n");
        RegisterButton.click();
        String text = EmailErrorMessage.getText();
        return text;
    }
    public String invalidPasswordSignUp() {
        RegisterOption.click();
        FirstName.sendKeys("Naz");
        LastName.sendKeys("Far");
        Password.sendKeys("hhh");
        Email.sendKeys("n95@g.com");
        RegisterButton.click();
        String text = PasswordErrorMessage.getText();
        return text;
    }
    public String invalidPasswordNoNumberSignUp() {
        RegisterOption.click();
        FirstName.sendKeys("Naz");
        LastName.sendKeys("Far");
        Password.sendKeys("shhhhhhhhh");
        Email.sendKeys("n95@g.com");
        RegisterButton.click();
        String text = PasswordErrorMessage.getText();
        return text;
    }
    public String invalidPasswordNoLetterSignUp() {
        RegisterOption.click();
        FirstName.sendKeys("Naz");
        LastName.sendKeys("Far");
        Password.sendKeys("666666666");
        Email.sendKeys("n95@g.com");
        RegisterButton.click();
        String text = PasswordErrorMessage.getText();
        return text;
    }
    public String invalidPasswordNotEnoughCharactersSignUp() {
        RegisterOption.click();
        FirstName.sendKeys("Naz");
        LastName.sendKeys("Far");
        Password.sendKeys("c5");
        Email.sendKeys("n95@g.com");
        RegisterButton.click();
        String text = PasswordErrorMessage.getText();
        return text;
    }
    public String invalidPasswordNotEnoughCharactersAndLettersSignUp() {
        RegisterOption.click();
        FirstName.sendKeys("Naz");
        LastName.sendKeys("Far");
        Password.sendKeys("c");
        Email.sendKeys("n95@g.com");
        RegisterButton.click();
        String text = PasswordErrorMessage.getText();
        return text;
    }
    public String invalidPasswordNotEnoughCharactersAndNumberSignUp() {
        RegisterOption.click();
        FirstName.sendKeys("Naz");
        LastName.sendKeys("Far");
        Password.sendKeys("c");
        Email.sendKeys("n95@g.com");
        RegisterButton.click();
        String text = PasswordErrorMessage.getText();
        return text;
    }
    public String noPasswordSignUp() {
        RegisterOption.click();
        FirstName.sendKeys("Naz");
        LastName.sendKeys("Far");
        Password.sendKeys("");
        Email.sendKeys("n95@g.com");
        RegisterButton.click();
        String text = PasswordErrorMessage.getText();
        return text;
    }
}