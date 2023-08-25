package pom.locators;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class invoicing_locators {
    public static SelenideElement invoice_tab = $(By.xpath("//span[contains(text(), 'Invoicing')]"));

    public static SelenideElement invoice_processing_menu = $(By.xpath("//a[contains(text(), 'Invoice Processing Menu')]"));
    public static SelenideElement billing_frequency = $(By.id("dropdownlistWrapperddlBillingFrequencies"));
    public static SelenideElement contract_type = $(By.id("dropdownlistWrapperddlContractTypes"));
    public static SelenideElement client = $(By.id("ddlClients"));
    public static SelenideElement hawk_division = $(By.id("dropdownlistWrapperddlHawkDivisions"));
    public static SelenideElement coordinator = $(By.id("dropdownlistWrapperddlCoordinator"));
    public static SelenideElement all_dates_check = $(By.id("rbAllDate"));
    public static SelenideElement custom_range_check = $(By.id("rbDateFromTo"));
    public static SelenideElement start_date = $(By.id("inputdtiDateFrom"));
    public static SelenideElement end_date = $(By.id("inputdtiDateTo"));
    public static SelenideElement view_btn = $(By.id("btnView"));
    public static SelenideElement export_btn = $(By.id("btnExportToExcel"));
    public static SelenideElement process_btn = $(By.id("btnProcess"));
    public static SelenideElement hawk_entity = $(By.id("dropdownlistWrapperddlHawkEntities"));
    public static SelenideElement search_input = $(By.id("txtSearchKey"));
    public static SelenideElement credit_note_processing_menu = $(By.xpath("//a[contains(text(), 'Credit Note Processing Menu')]"));
    public static SelenideElement client_credit_note = $(By.xpath("//*[@id=\"ddlClients\"]"));
    public static SelenideElement invoice_history = $(By.xpath("//a[contains(text(), 'Invoice History')]"));
    public static SelenideElement draft_invoices = $(By.xpath("//a[contains(text(), 'Draft Invoices')]"));
    public static SelenideElement InvoiceBillingFrequency = $(By.id("dropdownlistWrapperddlBillingFrequencies"));
    public static SelenideElement InvoiceContractType = $(By.id("dropdownlistWrapperddlContractTypes"));
    public static SelenideElement InvoiceAllDatesRadioButton = $(By.id("rbAllDate"));
    public static SelenideElement InvoiceCustomRangeRadioButton = $(By.id("rbDateFromTo"));
    public static SelenideElement InvoiceStartDate = $(By.xpath("//*[@id=\"dtiDateFrom\"]"));
    public static SelenideElement InvoiceEndDate = $(By.xpath("//*[@id=\"dtiDateTo\"]"));
    public static SelenideElement InvoiceClient = $(By.id("dropdownlistWrapperddlClients"));
    public static SelenideElement InvoiceHawkDivision = $(By.id("dropdownlistWrapperddlHawkDivisions"));
    public static SelenideElement InvoiceHawkEntity = $(By.xpath("//*[@id=\"ddlHawkEntities\"]"));

    public static SelenideElement InvoiceSearch = $(By.id("txtSearchKey"));

    public static SelenideElement InvoiceViewButton = $(By.id("btnView"));
    public static SelenideElement InvoiceExportButton = $(By.id("btnExportToExcel"));
    public static SelenideElement DraftBillingFrequency = $(By.xpath("//*[@id=\"ddlBillingFrequencies\"]"));
    public static SelenideElement DraftContracrType = $(By.id("dropdownlistWrapperddlContractTypes"));
    public static SelenideElement DraftAllDatesRadioButton = $(By.id("rbAllDate"));
    public static SelenideElement DraftCustomRangeRadioButton = $(By.id("rbDateFromTo"));
    public static SelenideElement DraftStartDate = $(By.xpath("//*[@id=\"dtiDateFrom\"]"));
    public static SelenideElement DraftEndDate = $(By.xpath("//*[@id=\"dtiDateTo\"]"));
    public static SelenideElement DraftClient = $(By.id("dropdownlistWrapperddlClients"));
    public static SelenideElement DraftHawkDivison = $(By.id("dropdownlistWrapperddlHawkDivisions"));
    public static SelenideElement DraftHawkEntity = $(By.xpath("//*[@id=\"ddlHawkEntities\"]"));
    public static SelenideElement DraftSearch = $(By.id("txtSearchKey"));
    public static SelenideElement DraftViewButton = $(By.id("btnView"));
    public static SelenideElement DraftExportButton = $(By.id("btnExportToExcel"));

}

