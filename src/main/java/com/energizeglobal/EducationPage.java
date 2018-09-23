package com.energizeglobal;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;

public class EducationPage {

    private static final By REQUEST_TRAINING = By.cssSelector("div[class='headerRequest']");
    private static final By NAV_TOOLS = By.cssSelector("div.row.nav-tools");
    private static final int TIMEOUT = 30000;

    public LearnPage requestTraining() {

        $(NAV_TOOLS).waitUntil(Condition.visible, TIMEOUT);
        $(REQUEST_TRAINING).click();

        return page(LearnPage.class);
    }
}
