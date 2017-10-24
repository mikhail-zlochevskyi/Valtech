package test.com.valtech.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class ServicesPage {

    public SelenideElement servicesSection = $("#navigationMenuWrapper a[href=\"/services/\"]");
    public SelenideElement pageHeader = $("header > h1");
}
