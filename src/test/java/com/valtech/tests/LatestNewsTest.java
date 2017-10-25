package com.valtech.tests;

import com.valtech.MainTest;
import org.testng.annotations.BeforeClass;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.valtech.pages.MainPage;

import static com.codeborne.selenide.Selenide.open;

/**
 * Created by mikhail_z on 6/1/17.
 */
public class LatestNewsTest extends MainTest {

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
