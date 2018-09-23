package com.energizeglobal;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;
import static com.codeborne.selenide.Selenide.page;

public class MainPage extends BasePage<MainPage> {

    private static final By MENU_BUTTON = By.xpath("//*[@id='u02menulink']");
    private static final By LVL1_MENU = By.cssSelector("div[id='u02mmenu']");
    private static final By TRAINING_ITEM = By.xpath("//*[@id=\"u02mmenu\"]/div/ul/li[9]/a");
    private static final By LVL2_MENU = By.cssSelector("div[data-lbl='training']");
    private static final By ST_ITEM = By.xpath("//*[@id=\"u02mmenu\"]/div/ul/li[9]/div/ul/li[6]/a");
    private static final By LVL3_MENU = By.cssSelector("div[data-lbl='training']");
    private static final By JAVA_ITEM = By.xpath("//div[@data-lbl='software-training']/ul/li/a[@data-lbl='java']");
    private static final String URL = "http://oracle.com";


    public MainPage goToMainPage() {
        open(URL);
        return this;
    }

    public EducationPage navigateToJavaItem() {

        $(MENU_BUTTON).contextClick().$(TRAINING_ITEM).contextClick().$(ST_ITEM).contextClick().$(JAVA_ITEM).click();


        return page(EducationPage.class);
    }

}
