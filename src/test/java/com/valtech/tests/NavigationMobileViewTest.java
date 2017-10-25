package com.valtech.tests;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.WebDriverRunner;
import com.valtech.MainTest;
import com.valtech.pages.AboutPage;
import com.valtech.pages.MainPage;
import com.valtech.pages.ServicesPage;
import com.valtech.pages.WorkPage;
import org.openqa.selenium.Dimension;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import static com.codeborne.selenide.Selenide.open;
import static com.valtech.MainTest.baseUrl;

public class NavigationMobileViewTest extends MainTest {

    private AboutPage aboutPage = new AboutPage();
    private ServicesPage servicesPage = new ServicesPage();
    private WorkPage workPage = new WorkPage();
    private MainPage mainPage = new MainPage();

    private final String WORK_PAGE_HEADER_NAME = "Work";//better to move to dataProvider entity
    private final String ABOUT_PAGE_HEADER_NAME = "About";
    private final String SERVICES_PAGE_HEADER_NAME = "Services";

    private final Dimension fullscreenMode = new Dimension(1920, 1080);//better to move to dataProvider entity
    private final Dimension mobileviewMode = new Dimension(1280, 1024);

    @BeforeClass
    public void setUp(){
        open(baseUrl);
        WebDriverRunner.getWebDriver().manage().window().setSize(mobileviewMode);
    }


    @Test
    public void checkMobileNavigation(){
        SoftAssert softAssert = new SoftAssert();

        mainPage.menuSection.shouldBe(Condition.exist).click();
        aboutPage.aboutSection.click();
        aboutPage.pageHeader.shouldBe(Condition.exist);
        softAssert.assertEquals(aboutPage.pageHeader.getText(), ABOUT_PAGE_HEADER_NAME, "Wrong header on About page!");

        mainPage.menuSection.shouldBe(Condition.exist).click();
        servicesPage.servicesSection.click();
        servicesPage.pageHeader.shouldBe(Condition.exist);
        softAssert.assertEquals(servicesPage.pageHeader.getText(), SERVICES_PAGE_HEADER_NAME, "Wrong header on Service page!");

        mainPage.menuSection.shouldBe(Condition.exist).click();
        workPage.workSection.click();
        workPage.pageHeader.shouldBe(Condition.exist);
        softAssert.assertEquals(workPage.pageHeader.getText(), WORK_PAGE_HEADER_NAME, "Wrong header on Work page!");

        softAssert.assertAll();
    }

    @AfterClass
    public void cleanUp(){
        WebDriverRunner.getWebDriver().manage().window().setSize(fullscreenMode);
    }
}
