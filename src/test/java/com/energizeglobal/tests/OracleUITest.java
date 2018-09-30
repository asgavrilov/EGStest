package com.energizeglobal.tests;

import com.codeborne.selenide.Configuration;
import com.energizeglobal.EducationPage;
import com.energizeglobal.LearnPage;
import com.energizeglobal.MainPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static io.github.bonigarcia.wdm.WebDriverManager.chromedriver;

public class OracleUITest {

    private WebDriver driver;


    @BeforeTest
    public void beforeTest() {
        Configuration.timeout = 30000;
        Configuration.browser = "chrome";
        WebDriverManager.chromedriver().setup();

    }

    @Test
    public void OracleTest() {

        MainPage mainPage = new MainPage();
        mainPage.goToMainPage();
        mainPage.clickAgreement();
        mainPage.navigateToJavaItem();

        EducationPage educationPage = new EducationPage();
        educationPage.removeAgreement();
        educationPage.requestTraining();

        LearnPage learnPage = new LearnPage();

        learnPage.step0();
        learnPage.step1();
        learnPage.step2();
        learnPage.step3();
        learnPage.step4();
        learnPage.step5();
        learnPage.step6();


    }
}
