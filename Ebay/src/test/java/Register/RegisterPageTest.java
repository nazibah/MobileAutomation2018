package Register;

import common.Base;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RegisterPageTest extends Base {
    RegisterPage registerPage;

    @BeforeMethod
    public void setUp() {
        registerPage = PageFactory.initElements(ad, RegisterPage.class);}

    @Test
    public void invalidFirstNameSignUpTest() {
        String actual = registerPage.invalidFirstNameSignUp();
        String expected = "Please enter your first name.";
        System.out.println(actual);
        Assert.assertEquals(actual, expected);
    }
    @Test
    public void withoutInfoTest() {
        String actual = registerPage.withoutInfo();
        String expected = "Please enter your first name.";
        System.out.println(actual);
        Assert.assertEquals(actual, expected);
    }
    @Test
    public void invalidLastNameSignUpTest() {
        String actual = registerPage.invalidLastNameSignUp();
        String expected = "Please enter your last name.";
        System.out.println(actual);
        Assert.assertEquals(actual, expected);
    }
    @Test
    public void invalidEmailSignUpTest(){
        String actual = registerPage.invalidEmailSignUp();
        String expected = "Something's wrong with your email address. Please try again.";
        System.out.println(actual);
        Assert.assertEquals(actual, expected);
    }
    @Test
    public void existingEmailSignUpTest(){
        String actual = registerPage.existingEmailSignUp();
        String expected = "Please enter a different email address.";
        System.out.println(actual);
        Assert.assertEquals(actual, expected);
    }
    @Test
    public void noEmailSignUpTest(){
        String actual = registerPage.noEmailSignUp();
        String expected = "Please enter your email address.";
        System.out.println(actual);
        Assert.assertEquals(actual, expected);
    }
    @Test
    public void invalidPasswordSignUpTest(){
        String actual = registerPage.invalidPasswordSignUp();
        String expected = "Please make your password stronger.";
        System.out.println(actual);
        Assert.assertEquals(actual, expected);
    }
    @Test
    public void invalidPasswordNoNumberSignUpTest(){
        String actual = registerPage.invalidPasswordNoNumberSignUp();
        String expected = "Please add a number or symbol.";
        System.out.println(actual);
        Assert.assertEquals(actual, expected);
    }
    @Test
    public void invalidPasswordNoLetterSignUpTest(){
        String actual = registerPage.invalidPasswordNoLetterSignUp();
        String expected = "Please add at least 1 letter.";
        System.out.println(actual);
        Assert.assertEquals(actual, expected);
    }
    @Test
    public void invalidPasswordNotEnoughCharactersSignUpTest(){
        String actual = registerPage.invalidPasswordNotEnoughCharactersSignUp();
        String expected = "Please enter a longer password.";
        System.out.println(actual);
        Assert.assertEquals(actual, expected);
    }
    @Test
    public void invalidPasswordNotEnoughCharactersAndNumberSignUpTest(){
        String actual = registerPage.invalidPasswordNotEnoughCharactersAndLettersSignUp();
        String expected = "Please make your password stronger.";
        System.out.println(actual);
        Assert.assertEquals(actual, expected);
    }
    @Test
    public void invalidPasswordNotEnoughCharactersAndLettersSignUpTest(){
        String actual = registerPage.invalidPasswordNotEnoughCharactersAndNumberSignUp();
        String expected = "Please make your password stronger.";
        System.out.println(actual);
        Assert.assertEquals(actual, expected);
    }
    @Test
    public void noPasswordSignUpTest(){
        String actual = registerPage.noPasswordSignUp();
        String expected = "Please enter a password.";
        System.out.println(actual);
        Assert.assertEquals(actual, expected);
    }
}
