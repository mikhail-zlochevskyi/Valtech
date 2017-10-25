package com.valtech;

import com.codeborne.selenide.WebDriverRunner;
import io.github.bonigarcia.wdm.FirefoxDriverManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.sleep;


public class MainTest {

    Logger log = Logger.getLogger(MainTest.class);

    public WebDriver driver;
    public static final String baseUrl = "https://www.valtech.com/";

    @BeforeSuite
    public void setUpDriver(){
        FirefoxDriverManager.getInstance().setup("0.14.0");
        log.info("webdriver path: " + System.getProperty("webdriver.gecko.driver"));

        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        WebDriverRunner.setWebDriver(driver);


        open(baseUrl);
    }

    @AfterSuite
    public void cleanUp(){
        sleep(5000);
        driver.quit();
    }
}
