package test.com.valtech.tests;

import org.testng.annotations.BeforeClass;
import test.com.valtech.MainTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import test.com.valtech.pages.MainPage;

import static com.codeborne.selenide.Selenide.open;

/**
 * Created by mikhail_z on 6/1/17.
 */
public class LatestNewsTest extends MainTest{

    private MainPage mainPage = new MainPage();

    @BeforeClass
    public void setUp(){
        open(baseUrl);
    }

    @Test
    public void checkLatestNewsSection(){
        Assert.assertTrue(mainPage.latestNewsSection.isDisplayed(), "latestNewsSection is not displayed!");
    }

}
