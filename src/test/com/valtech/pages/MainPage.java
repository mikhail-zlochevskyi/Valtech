package test.com.valtech.pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;


public class MainPage {

    //better to use here @Getter from lombok plugin, to hide data
    public SelenideElement latestNewsSection = $("#container > div:nth-child(2) > div:nth-child(3)");

}
