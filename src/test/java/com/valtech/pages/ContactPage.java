package com.valtech.pages;

import com.codeborne.selenide.ElementsCollection;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class ContactPage {

    public SelenideElement contactSection = $("#contacticon");
    public ElementsCollection cityIcons = $$("i.office__map__icon"); //cities icon
}
