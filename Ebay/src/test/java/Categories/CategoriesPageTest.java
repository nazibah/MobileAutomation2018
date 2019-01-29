package Categories;

import MainP.MainPage;
import common.Base;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CategoriesPageTest extends Base {
    CategoriesPage categoriesPage;

    @BeforeMethod
    public void setUp() {
        categoriesPage = PageFactory.initElements(ad, CategoriesPage.class);
    }
    @Test
    public void categoriesTest(){
        String actual = categoriesPage.categories();
        String expected = "Antiques";
        System.out.println(actual);
        Assert.assertEquals(actual, expected);
    }
    @Test
    public void categoriesAntiquitiesTest(){
        String actual = categoriesPage.categoriesAntiquities();
        String expected = "Antiques";
        System.out.println(actual);
        Assert.assertEquals(actual, expected);
    }
    @Test
    public void categoriesTheAmericasTest(){
        String actual = categoriesPage.categoriesTheAmericas();
        String expected = "The Americas";
        System.out.println(actual);
        Assert.assertEquals(actual, expected);
    }
    @Test
    public void categoriesFilterTest(){
        String actual = categoriesPage.categoriesFilter();
        String expected = "filter";
        System.out.println(actual);
        Assert.assertEquals(actual, expected);
    }

}
