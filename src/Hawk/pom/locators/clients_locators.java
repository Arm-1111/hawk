package pom.locators;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class clients_locators {
    public static SelenideElement clients = $(By.xpath("//span[contains(text(), 'Clients')]"));
    public static SelenideElement client_drop = $(By.id("dropdownlistWrapperddlClient"));
    public static SelenideElement hawk_entity = $(By.id("dropdownlistWrapperddlHawkEntity"));

    public static SelenideElement search_input = $(By.id("txtSearchKey"));
    public static SelenideElement view_btn = $(By.id("btnView"));
    public static SelenideElement clientVal = $(By.xpath("//*[@id=\"filterinnerListBoxddlClient\"]/input"));
    public static SelenideElement value = $(By.xpath("//span[contains(text(), 'A1')]"));
    public static SelenideElement searchResult = $(By.id("row0gridClients"));



}
