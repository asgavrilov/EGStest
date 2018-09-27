package com.energizeglobal;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

public class MainPage extends BasePage<MainPage> {

    private static final By MENU_BUTTON = By.xpath("//*[@id='u02menulink']");
    private static final By LVL1_MENU = By.cssSelector("div[id='u02mmenu']");
    private static final By TRAINING_ITEM = By.xpath("//*[@id=\"u02mmenu\"]/div/ul/li[9]/a");
    private static final By LVL2_MENU = By.cssSelector("div[data-lbl='training']");
    private static final By ST_ITEM = By.xpath("//*[@id=\"u02mmenu\"]/div/ul/li[9]/div/ul/li[6]/a");
    private static final By LVL3_MENU = By.cssSelector("div[data-lbl='training']");
    private static final By JAVA_ITEM = By.xpath("//div[@data-lbl='software-training']/ul/li/a[@data-lbl='java']");
    private static final String URL = "http://oracle.com";
    private static final int TIMEOUT = 30000;
   // private SelenideElement AgreementButton = $$(".pdynamicbutton .call").get(1);

    public MainPage goToMainPage() {
        open(URL);
        return this;
    }

    public  MainPage clickAgreement() {
        JavascriptExecutor jse;
        jse = (JavascriptExecutor)getWebDriver();
        jse.executeScript("document.querySelector('.truste_box_overlay').remove();");
        jse.executeScript("document.querySelector('.truste_overlay').remove();");

        //AgreementButton.waitUntil(Condition.appear, TIMEOUT);
        //AgreementButton.click();

        return page(MainPage.class);
    }

    public EducationPage navigateToJavaItem() {

        $(MENU_BUTTON).contextClick().$(TRAINING_ITEM).contextClick().$(ST_ITEM).contextClick().$(JAVA_ITEM).click();


        return page(EducationPage.class);
    }

}
