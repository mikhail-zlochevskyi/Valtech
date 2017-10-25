package com.valtech.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class AboutPage {

    public SelenideElement aboutSection = $("#navigationMenuWrapper a[href=\"/about/\"]");
    public SelenideElement pageHeader = $("div.page-header");

}
