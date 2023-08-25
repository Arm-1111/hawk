package pom.locators;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class resources_locators {
    public static SelenideElement resource = $(By.xpath("//span[contains(text(), 'Resource')]"));
    public static SelenideElement resourceClass = $(By.id("dropdownlistWrapperddlResourceClass"));
    public static SelenideElement resourceHawkEntity = $(By.id("dropdownlistWrapperddlHawkEntity"));
    public static SelenideElement partner_company = $(By.id("dropdownlistWrapperddlPartnerCompany"));
    public static SelenideElement country = $(By.id("dropdownlistWrapperddlCountry"));
    public static SelenideElement search_input = $(By.id("txtSearchKey"));
    public static SelenideElement view_btn = $(By.id("btnView"));
    public static SelenideElement export_btn = $(By.id("btnExportToExcel"));
    public static SelenideElement add_resource = $(By.id("btnAddResource"));
    public static SelenideElement resourceClientDropInput = $(By.xpath("//*[@id=\"filterinnerListBoxddlResourceClass\"]/input"));
    public static SelenideElement resourceDropClientValue = $(By.xpath("//span[contains(text(), 'CO')]"));
    public static SelenideElement resourceDropHawkInput = $(By.xpath("//*[@id=\"filterinnerListBoxddlHawkEntity\"]/input"));
    public static SelenideElement resourceDropHawkValue = $(By.xpath("//span[contains(text(), 'ALA')]"));
    public static SelenideElement searchResult =$(By.id("row0gridResources"));
}
