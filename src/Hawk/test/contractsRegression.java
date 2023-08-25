package test;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import hawkBase.hawkBase;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pom.Pages.contractsPage;
import pom.locators.signInLocators;

import java.util.concurrent.TimeUnit;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.open;

public class contractsRegression {
    static signInLocators signinLocators = new signInLocators();
    contractsPage cotracts = new contractsPage();

    @BeforeAll
    public static void setUpAll() {
        Configuration.browserSize = "1920x1250";
        SelenideLogger.addListener("allure", new AllureSelenide());

    }


    @BeforeEach
    public void setUp() {
        open("http://web-01/HawkTalon/");
        signinLocators.userName.shouldBe(visible);
        signinLocators.userName.sendKeys("davit");
        signinLocators.password.shouldBe(visible);
        try {
            TimeUnit.MILLISECONDS.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        signinLocators.password.sendKeys("davit");
        signinLocators.signInbtn.shouldBe(visible);
        hawkBase.waitForLoad();
        hawkBase.waitForLoad();
        signinLocators.signInbtn.click();

    }
    @AfterEach
    public void logOut() {
        signinLocators.logOut.click();
        signinLocators.confurmBtn.click();
        try {
            TimeUnit.MILLISECONDS.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
    @Test
    public void testContractsPage(){
       cotracts.ContractsPage();

    }

}
