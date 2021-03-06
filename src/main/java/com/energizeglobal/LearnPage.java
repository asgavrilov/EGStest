package com.energizeglobal;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.WebDriverRunner;
import com.codeborne.selenide.testng.SoftAsserts;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;


public class LearnPage {
    JavascriptExecutor jse;

    //step0 elements
    private static final By CONTINUE0 = By.cssSelector("input#continue0");
    //step1 elements
    private static final By COUNTRY_SELECT = By.cssSelector("select[id='countrySelect']");
    private static final By CONTINUE1 = By.cssSelector("input[id='continue_first']");
    //step2 elements
    private static final By STEP2_SELECT = By.cssSelector("select#step2");
    private static final By STEP2_OPTION = By.cssSelector("option[value='120']");
    private static final By CONTINUE2 = By.cssSelector("input#continue2");
    //step3 elements
    private static final By STEP3_SELECT = By.cssSelector("select#step3");
    private static final By STEP3_OPTION = By.cssSelector("option[value='3']");
    private static final By CONTINUE3 = By.cssSelector("input[id='continue3']");
    //step4 elements
    private static final By SEARCH_INPUT = By.cssSelector("input#step4");
    private static final By SEARCH_BUTTON = By.cssSelector("input#Search");
    private static final By CONTINUE4 = By.cssSelector("input#continue.continue");
    private static final By RADIO_BOX = By.cssSelector("input[value='Java SE 8 Programming ']");
    private static final String KEY = "Java";
    //step5 elements
    private static final By LIVE_VIRTUAL_TRAINING_CHECKBOX = By.cssSelector("input#step5c");
    private static final By CONTINUE5 = By.cssSelector("input#continue5");
    //step6 elements
    private static final By SELECT6 = By.cssSelector("select#country");
    private static int Timeout = 30000;


    public LearnPage step0() {

        switchTo().window(WebDriverRunner.getWebDriver().getWindowHandle());
        $(CONTINUE0).isDisplayed();
        $(CONTINUE0).waitUntil(Condition.exist, Timeout);
        $(CONTINUE0).click();

        return page(LearnPage.class);
    }


    public LearnPage step1() {
        switchTo().window(WebDriverRunner.getWebDriver().getWindowHandle());
        $(CONTINUE1).waitUntil(Condition.enabled, Timeout);
        $(COUNTRY_SELECT).selectOption("Russia");
        $(CONTINUE1).click();

        return page(LearnPage.class);
    }

    public LearnPage step2() {

        $(CONTINUE2).waitUntil(Condition.visible, Timeout);
        $(STEP2_SELECT).selectOption("2 - 4 months from now");


        return page(LearnPage.class);
    }

    public LearnPage step3() {
        switchTo().window(WebDriverRunner.getWebDriver().getWindowHandle());
        $(CONTINUE3).waitUntil(Condition.enabled, Timeout);
        $(STEP3_SELECT).selectOption(2);
        $(CONTINUE3).click();

        return page(LearnPage.class);
    }

    public LearnPage step4() {
        switchTo().window(WebDriverRunner.getWebDriver().getWindowHandle());
        $(SEARCH_INPUT).sendKeys(KEY);
        $(SEARCH_BUTTON).click();
        $(RADIO_BOX).waitUntil(Condition.enabled, Timeout);
        $(RADIO_BOX).click();
        $(CONTINUE4).click();

        return page(LearnPage.class);
    }

    public LearnPage step5() {
        switchTo().window(WebDriverRunner.getWebDriver().getWindowHandle());
        $(LIVE_VIRTUAL_TRAINING_CHECKBOX).waitUntil(Condition.enabled, Timeout);
        $(LIVE_VIRTUAL_TRAINING_CHECKBOX).click();
        $(CONTINUE5).click();

        return page(LearnPage.class);
    }

    public LearnPage step6() {
        switchTo().window(WebDriverRunner.getWebDriver().getWindowHandle());
        $(SELECT6).waitUntil(Condition.enabled, Timeout);
        $(SELECT6).getText().equals("Russia");
        return page(LearnPage.class);
    }

}
