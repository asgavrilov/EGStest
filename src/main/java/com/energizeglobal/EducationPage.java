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

    //private WebElement iframe = WebDriverRunner.getWebDriver().findElement(By.xpath("//iframe[starts-with(@id, 'pop-frame')]"));

    public EducationPage removeAgreement() {


        JavascriptExecutor jse;
        jse = (JavascriptExecutor) getWebDriver();
//        $(iframe).waitUntil(Condition.appear, TIMEOUT);
//        switchTo().frame(iframe);
        //$(By.xpath("//div[@class='pdynamicbutton']/a[@role='button']")).click();

        sleep(8000);
        jse.executeScript("document.querySelector('.truste_box_overlay').remove();");
        jse.executeScript("document.querySelector('.truste_overlay').remove();");


        return page(EducationPage.class);
    }

    public LearnPage requestTraining() {

        WebDriver webDriver = WebDriverRunner.getWebDriver();
//        Set<String> oldWindowsSet = webDriver.getWindowHandles();
        $(NAV_TOOLS).waitUntil(Condition.visible, TIMEOUT);


// нажимаем на ссылку, которая открывает документ в новом окне

        $(REQUEST_TRAINING).click();

// здесь нужно будет дождаться открытия нового окна

// получаем новый набор дескрипторов, включающий уже и новое окно
//        Set<String> newWindowsSet = webDriver.getWindowHandles();

// получаем дескриптор нового окна
//        newWindowsSet.removeAll(oldWindowsSet);
////        String newWindowHandle = newWindowsSet.iterator().next();
        switchTo().window("Demand Capture");

        return page(LearnPage.class);
    }
}
