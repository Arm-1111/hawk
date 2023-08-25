package pom.locators;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class contractors_locators {
    public static SelenideElement contracts_tab = $(By.xpath("//*[contains(text(), 'Contracts')]"));
    public static SelenideElement contract_status = $(By.id("dropdownlistWrapperddlStatus"));
    public static SelenideElement effective = $(By.id("dropdownlistWrapperddlEffective"));
    public static SelenideElement client = $(By.id("dropdownlistWrapperddlClient"));
    public static SelenideElement contract_type = $(By.xpath("//*[@id='ddlContractType']"));
    public static SelenideElement hawk_entity = $(By.id("dropdownlistWrapperddlHawkEntity"));
    public static SelenideElement search_input = $(By.id("txtSearchKey"));
    public static SelenideElement view_btn = $(By.id("btnView"));
    public static SelenideElement export_btn = $(By.id("btnExportToExcel"));
    public static SelenideElement add_contract_btn = $(By.id("btnAddContract"));

    public static SelenideElement status= $(By.xpath("//*[@id=\"filterinnerListBoxddlStatus\"]/input"));
    public static SelenideElement status_value = $(By.xpath("//span[contains(text(), 'AC')]"));
    public static SelenideElement contract_client = $(By.xpath("//*[@id=\"filterinnerListBoxddlClient\"]/input"));

    public static SelenideElement contract_client_value =$(By.xpath("//span[contains(text(), 'A1')]"));

    public static SelenideElement searchResult = $(By.id("row0gridContracts"));




}
