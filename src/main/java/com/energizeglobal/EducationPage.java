package com.energizeglobal;

import com.codeborne.selenide.Condition;
import com.codeborne.selenide.WebDriverRunner;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.Set;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.WebDriverRunner.getWebDriver;

public class EducationPage {

    private static final By REQUEST_TRAINING = By.cssSelector("div[class='headerRequest']");
    private static final By NAV_TOOLS = By.cssSelector("div.row.nav-tools");
    private static final int TIMEOUT = 30000;


    public EducationPage removeAgreement() {


        JavascriptExecutor jse;
        jse = (JavascriptExecutor) getWebDriver();
        sleep(8000);
        jse.executeScript("document.querySelector('.truste_box_overlay').remove();");
        jse.executeScript("document.querySelector('.truste_overlay').remove();");


        return page(EducationPage.class);
    }

    public LearnPage requestTraining() {

        WebDriver webDriver = WebDriverRunner.getWebDriver();
        $(NAV_TOOLS).waitUntil(Condition.visible, TIMEOUT);


// нажимаем на ссылку, которая открывает документ в новом окне

        $(REQUEST_TRAINING).click();

        switchTo().window(1);

        return page(LearnPage.class);
    }
}
