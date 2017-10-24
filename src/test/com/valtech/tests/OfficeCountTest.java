package test.com.valtech.tests;

import com.codeborne.selenide.Condition;
import org.apache.log4j.Logger;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import test.com.valtech.MainTest;
import test.com.valtech.pages.AboutPage;
import test.com.valtech.pages.ContactPage;
import test.com.valtech.pages.ServicesPage;
import test.com.valtech.pages.WorkPage;

import static com.codeborne.selenide.Selenide.open;

public class OfficeCountTest extends MainTest {

    private ContactPage contactPage = new ContactPage();

    Logger log = Logger.getLogger(OfficeCountTest.class);

    @BeforeClass
    public void setUp(){
        open(baseUrl);
    }

    @Test
    public void outputCountOffices(){
        contactPage.contactSection.click();
        contactPage.cityIcons.get(0).should(Condition.appear);//wait till icon will be present on page (by default - 4 sec)
        log.info("Total count of offices are - " + contactPage.cityIcons.size());
    }
}
