package com.valtech.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class WorkPage {

    public SelenideElement workSection = $("#navigationMenuWrapper a[href=\"/work/\"]");
    public SelenideElement pageHeader = $("header > h1");
}
