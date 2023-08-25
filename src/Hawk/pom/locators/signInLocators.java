package pom.locators;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;


public  class signInLocators {

    public SelenideElement userName = $(By.id("Username"));
    public SelenideElement password = $(By.name("password"));
    public SelenideElement signInbtn = $(By.xpath("//button[contains(text(),'SIGN IN')]"));
    public SelenideElement logOut = $(By.xpath("//*[@id=\"logout\"]/a"));

    public static SelenideElement confurmBtn = $(By.xpath("//*[@id=\"btnConfirm\"]"));

}

