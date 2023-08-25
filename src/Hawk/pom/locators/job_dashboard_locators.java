package pom.locators;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class job_dashboard_locators {
    public static SelenideElement job_dashboard = $(By.xpath("//*[contains(text(), 'Jobs Dashboard')]"));
    public static SelenideElement client = $(By.id("dropdownlistWrapperddlClient"));
    public static SelenideElement contract_type = $(By.xpath("//*[@id='ddlContractType']"));
    public static SelenideElement entity = $(By.id("dropdownlistWrapperddlHawkEntity"));
    public static SelenideElement division = $(By.id("dropdownlistWrapperddlHawkDivision"));
    public static SelenideElement supplier = $(By.xpath("//*[@id='ddlSupplier']"));
    public static SelenideElement coordinator = $(By.xpath("//*[@id='ddlCoordinator']"));
    public static SelenideElement job_status = $(By.id("dropdownlistWrapperddlJobStatus"));
    public static SelenideElement danger = $(By.id("dropdownlistContentddlDanger"));
    public static SelenideElement search_input = $(By.id("txtSearchKey"));
    public static SelenideElement view_btn = $(By.id("btnView"));
    public static SelenideElement export_btn = $(By.id("btnExportToExcel"));
    public static SelenideElement inspection_btn = $(By.id("btnInspections"));
    public static SelenideElement client_drop_search = $(By.xpath("//*[@id=\"filterinnerListBoxddlClient\"]/input"));
    public static SelenideElement coordinator_search = $(By.xpath("//*[@id=\"filterinnerListBoxddlCoordinator\"]/input"));
    public static SelenideElement clientDrop_value =$(By.xpath("//span[contains(text(), 'A1')]"));


    public static SelenideElement coordinatorDrop = $(By.xpath("//span[contains(text(), 'ANDY')]"));

    public static SelenideElement clientNameColumn =$(By.xpath("//*[@id=\"row0gridJobsDashboard\"]/div[5]/div"));
    public static SelenideElement clientCoordinatorColumn =$(By.cssSelector("#row0gridJobsDashboard > div:nth-child(7) > div"));

    public static SelenideElement editJobButton =$(By.xpath("//*[@id=\"row0gridJobsDashboard\"]/div[1]/div/button[1]"));
    public static SelenideElement actualBilledInpit =$(By.id("niSpendActualBilled"));
    public static SelenideElement coordinatorAll=$(By.xpath("//*[@id=\"listitem0innerListBoxddlCoordinator\"]/span"));}

