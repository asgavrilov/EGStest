package com.energizeglobal;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;

public class LearnPage {

    //step0 elements
    //private static final By CONTINUE0 = By.xpath("//*[@id=\"page\"]/form//input[@id=\"continue0\"]");
    private static final By CONTINUE0 = By.cssSelector("input#continue0");
    //step1 elements
    private static final By COUNTRY_SELECT = By.cssSelector("select[id='countrySelect']");
    private static final By CONTINUE1 = By.cssSelector("input[id='continue_first']");
    //step2 elements
    private static final By STEP2_SELECT = By.cssSelector("select[id='step2']");
    private static final By STEP2_OPTION = By.cssSelector("option[value='120']");
    private static final By CONTINUE2 = By.cssSelector("input[id='continue2']");
    //step3 elements
    private static final By STEP3_SELECT = By.cssSelector("select[name='step3']");
    private static final By STEP3_OPTION = By.cssSelector("option[value='3']");
    private static final By CONTINUE3 = By.cssSelector("input[id='continue3']");
    //step4 elements
    private static final By SEARCH_INPUT = By.cssSelector("input[id='step4']");
    private static final By SEARCH_BUTTON = By.cssSelector("input[id='Search']");
    private static final By CONTINUE4 = By.cssSelector("input#continue.continue");
    private static final By RADIO_BOX = By.cssSelector("input[value='Java SE 8 Programming ']");
    private static final String KEY = "Java";
    //step5 elements
    private static final By LIVE_VIRTUAL_TRAINING_CHECKBOX = By.cssSelector("input[id='step5c']");
    private static final By CONTINUE5 = By.cssSelector("input[id='continue5']");
    //step6 elements
    private static final By SELECT6 = By.cssSelector("select[name='country']");
    private static int Timeout = 30000;

    public LearnPage step0() {

        $(CONTINUE0).waitUntil(Condition.exist, Timeout);
        $(CONTINUE0).click();

        return page(LearnPage.class);
    }


    public LearnPage step1() {

        $(CONTINUE1).waitUntil(Condition.enabled, Timeout);
        $(COUNTRY_SELECT).selectOption(898938296);
        $(CONTINUE1).click();

        return page(LearnPage.class);
    }

    public LearnPage step2() {

        $(CONTINUE2).waitUntil(Condition.enabled, Timeout);
        $(STEP2_SELECT).selectOption(String.valueOf(STEP2_OPTION));
        $(CONTINUE2).click();

        return page(LearnPage.class);
    }

    public LearnPage step3() {

        $(CONTINUE3).waitUntil(Condition.enabled, Timeout);
        $(STEP2_SELECT).selectOption(String.valueOf(STEP3_OPTION));
        $(CONTINUE2).click();

        return page(LearnPage.class);
    }

    public LearnPage step4() {

        $(CONTINUE4).waitUntil(Condition.enabled, Timeout);
        $(SEARCH_INPUT).sendKeys(KEY);
        $(SEARCH_BUTTON).click();
        $(RADIO_BOX).waitUntil(Condition.enabled, Timeout);
        $(RADIO_BOX).click();
        $(CONTINUE4).click();

        return page(LearnPage.class);
    }

    public LearnPage step5() {

        $(LIVE_VIRTUAL_TRAINING_CHECKBOX).waitUntil(Condition.enabled, Timeout);
        $(LIVE_VIRTUAL_TRAINING_CHECKBOX).click();
        $(CONTINUE5).click();

        return page(LearnPage.class);
    }

    public LearnPage step6() {

        $(SELECT6).waitUntil(Condition.enabled, Timeout);
        $(SELECT6).shouldHave(Condition.attribute("Russia"));


        return page(LearnPage.class);
    }

}
