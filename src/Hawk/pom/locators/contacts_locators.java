package pom.locators;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class contacts_locators {
    public static SelenideElement contacts_tab = $(By.xpath("//span[contains(text(), 'Contacts')]"));
    public static SelenideElement client = $(By.xpath("//*[@id='dropdownlistWrapperddlClientSupplier']"));
    public static SelenideElement hawk_entity = $(By.id("dropdownlistWrapperddlHawkEntity"));
    public static SelenideElement holliday_cards = $(By.id( "dropdownlistWrapperddlHollidayCards"));
    public static SelenideElement status_drop = $(By.id("dropdownlistWrapperddlStatus"));
    public static SelenideElement holliday_brunch = $(By.id("dropdownlistWrapperddlHollidayBrunch"));
    public static SelenideElement interests = $(By.id("dropdownlistWrapperddlInterest"));
    public static SelenideElement calendars = $(By.id("dropdownlistContentddlCalendars"));
    public static SelenideElement search_input = $(By.id("txtSearchKey"));
    public static SelenideElement view_btn = $(By.id("btnView"));
    public static SelenideElement export_btn = $(By.xpath("//*[@id='content']/div[5]/div[5]/div/div"));
    public static SelenideElement contactsClient = $(By.xpath("//*[@id=\"filterinnerListBoxddlClientSupplier\"]/input"));
    public static SelenideElement contactsClient_input =$(By.xpath("//span[contains(text(), 'ANAD')]"));
    public static SelenideElement contactsStatusSearch = $(By.xpath("//*[@id=\"filterinnerListBoxddlStatus\"]/input"));
    public static SelenideElement contactsStatusCart =$(By.xpath("//span[contains(text(), 'ACTIVE')]"));
    public static SelenideElement searchResult = $(By.xpath("//*[@id=\"row0gridContactDashboard\"]"));

}
