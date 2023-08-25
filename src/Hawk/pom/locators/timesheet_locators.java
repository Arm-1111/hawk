package pom.locators;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class timesheet_locators {

    public static  SelenideElement timesheet_tab = $(By.xpath("//span[contains(text(), 'Timesheet')]"));
    public static SelenideElement timesheet_entry_menu =$(By.xpath("//a[contains(text(), 'Timesheet Entry Menu')]"));
    public static SelenideElement timesheets_trough = $(By.id("dropdownlistContentddlTimesheetWeeks"));
    public static  SelenideElement coordinator = $(By.id("dropdownlistContentddlCoordinator"));


    public static SelenideElement job = $(By.id("dropdownlistContentddlJobNbr"));
    public static SelenideElement client = $(By.id("dropdownlistContentddlClient"));

    public static SelenideElement search_input = $(By.id("txtSearchKey"));
    public static SelenideElement division = $(By.id("dropdownlistContentddlHawkDivision"));
    public static SelenideElement process_selected_items_btn = $(By.id("btnProcessSelectedItems"));
    public static SelenideElement timesheet_history_btn =$(By.id("btnTimesheetHistory"));
    public static SelenideElement view_btn = $(By.id("btnView"));
    public static SelenideElement export_btn = $(By.id("btnExportToExcel"));
    public static SelenideElement timesheet_history = $(By.xpath("//a[contains(text(), 'Timesheet History')]"));
    public static SelenideElement date_from =$(By.id("inputdtiDateFrom"));
    public static SelenideElement date_to = $(By.id("inputdtiDateTo"));
    public static SelenideElement contact_type = $(By.id("dropdownlistContentddlContractTypes"));
    public static SelenideElement hawk_entity = $(By.id("dropdownlistContentddlHawkEntities"));
    public static SelenideElement billed = $(By.id("dropdownlistContentddlBilled"));
    public static SelenideElement resource = $(By.id("dropdownlistContentddlResourcesForTimesheetHist"));
    public static SelenideElement job_status =$(By.id("dropdownlistContentddlHistoryJobStatuses"));
    public static SelenideElement clients = $(By.id("dropdownlistContentddlClients"));
    public static SelenideElement divisions = $(By.id("dropdownlistContentddlHawkDivisions"));
    public static SelenideElement expenceonlymenu_tab = $(By.xpath("//a[contains(text(), 'Expense Only Timesheet Menu')]"));
    public static SelenideElement new_expence_only_timesheet_btn = $(By.id("btnNewExpanseOnlyTimesheet"));
    public static  SelenideElement coordinators = $(By.xpath("//*[@id=\"dropdownlistWrapperddlCoordinator\"]"));
    public static  SelenideElement consalidated =$(By.xpath("//a[contains(text(), 'Consolidated T&E Form Entry Menu')]"));
    public static  SelenideElement jobNumber = $(By.id("ddlJobNbr"));
    public static  SelenideElement clientDrop =$(By.id("dropdownlistWrapperddlClient"));
    public static  SelenideElement consolidatedAddTEBtn=$(By.id("btnNewConsolidatedForm"));





}
