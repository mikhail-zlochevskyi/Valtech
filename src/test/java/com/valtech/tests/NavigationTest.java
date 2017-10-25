package com.valtech.tests;

import com.codeborne.selenide.Condition;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import com.valtech.MainTest;
import com.valtech.pages.AboutPage;
import com.valtech.pages.ServicesPage;
import com.valtech.pages.WorkPage;

import static com.codeborne.selenide.Selenide.open;

public class NavigationTest extends MainTest{

    private AboutPage aboutPage = new AboutPage();
    private ServicesPage servicesPage = new ServicesPage();
    private WorkPage workPage = new WorkPage();

    private final String WORK_PAGE_HEADER_NAME = "Work";
    private final String ABOUT_PAGE_HEADER_NAME = "About";
    private final String SERVICES_PAGE_HEADER_NAME = "Services";

    @BeforeClass
    public void setUp(){
        open(baseUrl);
    }

    @Test
    public void checkNavigationTo(){
        SoftAssert softAssert = new SoftAssert();

        aboutPage.aboutSection.click();
        aboutPage.aboutSection.click();
        aboutPage.pageHeader.shouldBe(Condition.exist);
        softAssert.assertEquals(aboutPage.pageHeader.getText(), ABOUT_PAGE_HEADER_NAME, "Wrong header on About page!");

        servicesPage.servicesSection.click();
        servicesPage.servicesSection.click();
        servicesPage.pageHeader.shouldBe(Condition.exist);
        softAssert.assertEquals(servicesPage.pageHeader.getText(), SERVICES_PAGE_HEADER_NAME, "Wrong header on Service page!");

        workPage.workSection.click();
        workPage.workSection.click();
        workPage.pageHeader.shouldBe(Condition.exist);
        softAssert.assertEquals(workPage.pageHeader.getText(), WORK_PAGE_HEADER_NAME, "Wrong header on Work page!");

        softAssert.assertAll();

    }
}
