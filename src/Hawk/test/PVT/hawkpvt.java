package test.PVT;

import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.logevents.SelenideLogger;
import hawkBase.hawkBase;
import io.qameta.allure.selenide.AllureSelenide;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import pom.Pages.*;
import pom.locators.signInLocators;

import java.util.concurrent.TimeUnit;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.open;

public class hawkpvt {
    static signInLocators signinLocators = new signInLocators();
    jobDashboardPage jobDashboard = new jobDashboardPage();
    newJobPage newjob = new newJobPage();

    contractsPage cotracts = new contractsPage();
    clientsPage client = new clientsPage();

    contactsPage contacts = new contactsPage();
    ccrPage ccr = new ccrPage();
    suppliersPage supplier = new suppliersPage();
    resourcesPage resource = new resourcesPage();
    timesheetPage time = new timesheetPage();
    invoicingPage invoice = new invoicingPage();
    sage50Page sage = new sage50Page();
    reportingPage report = new reportingPage();
    securityPage security = new securityPage();
    administrationPage admin = new administrationPage();

    @BeforeAll
    public static void setUpAll() {
        Configuration.browserSize = "1920x1250";
        SelenideLogger.addListener("allure", new AllureSelenide());
        System.setProperty("webdriver.http.factory", "jdk-http-client");

    }


    @BeforeEach
    public void setUp() {
        open("http://web-01/HawkTalon/");
        hawkBase.waitForLoad();
        signinLocators.userName.shouldBe(visible);
        signinLocators.userName.sendKeys("davit");
        signinLocators.password.shouldBe(visible);
        hawkBase.waitForLoad();
        signinLocators.password.sendKeys("davit");
//        signinLocators.signInbtn.shouldBe(visible);
        try {
            TimeUnit.MILLISECONDS.sleep(6000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        signinLocators.signInbtn.getText();
        signinLocators.signInbtn.click();
        try {
            TimeUnit.MILLISECONDS.sleep(6000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
//        hawkBase.waitForLoad();

    }


    @AfterEach
    public void logOut() {
        signinLocators.logOut.click();
        signInLocators.confurmBtn.click();
        hawkBase.waitForLoad();

    }

    @Test
    public void jobDashboard_pageIsLoaded() {
        jobDashboard.openJobDashboardPage();
    }

    @Test
    public void newjob_pageIsLoaded() {
        newjob.openNewjobsPage();
    }

    @Test
    public void contracts_pageIsLoaded() {
        cotracts.openContractorsPage();
    }

    @Test
    public void clients_pageIsLoaded() {
        client.openClientsPage();
    }

    @Test
    public void contacts_pageIsLoaded() {
        contacts.openContactsPage();
    }

    @Test
    public void ccr_pageIsLoaded() {
        ccr.openCCRpage();
    }

    @Test
    public void suppliers_pageIsLoaded() {
        supplier.openSupplierspage();
    }

    @Test
    public void resource_pageIsLoaded() {
        resource.openResourcePage();
    }

    @Test
    public void timesheetEntryMenuPageIsLoaded() {
        time.openTimesheetEntryMenuPage();
    }

    @Test
    public void timesheetHistoryPageIsLoaded() {
        time.openTimesheetHistoryPage();
    }

    @Test
    public void timesheetExpenceOnlyPageIsLoaded() {
        time.openExpenceOnlyTimesheetMenuPage();
    }

  /*  @Test
    public void consalidatedTEformEnrtyMenyIsLoaded() {
        time.openConsolidatedTEformEntryMenu();
    }*/

    @Test
    public void invoiceProcessingMenuPageIsLoaded() {
        invoice.invoiceProcessingMenu();
    }

    @Test
    public void creditNotePorecessingMenuPageIsLoaded() {
        invoice.creditNoteProcessingMenu();
    }

    @Test
    public void invoiceHistoryPageIsLoaded() {
        invoice.invoiceHistory();
    }

    @Test
    public void invoiceDraftPageIsLoaded() {
        invoice.draftInvoices();
    }

    @Test
    public void sage50PageIsLoaded() {
        sage.sage50ConnectionPage();
    }

    @Test
    public void biliableManhoursByDivisionPageIsLoaded() {
        report.biliableManhoursByDivision();
    }

    @Test
    public void grossMarginPageIsLoaded() {
        report.grossMargin();
    }

    @Test
    public void reportsInvoicePageIsLoaded() {
        report.reportingInvoice();
    }

    @Test
    public void manhoursByClientJobPageIsLoaded() {
        report.manhoursByClientJob();
    }

    @Test
    public void mileagePageIsLoaded() {
        report.mileage();
    }

    @Test
    public void newHireReportPageIsLoaded() {
        report.newHireReport();
    }

    @Test
    public void payrollReportPageIsLoaded() {
        report.payroll();
    }

    @Test
    public void performanceEventsReportPageIsLoaded() {
        report.performanceEvents();
    }

    @Test
    public void revenueAccrualReportPageIsLoaded() {
        report.revenueAccural();
    }

    @Test
    public void revenueApportionmnetReportPageIsLoaded() {
        report.revenueApportionmnet();
    }

    @Test
    public void terminatingEmployeeReportPageIsLoaded() {
        report.terminatingEmployee();
    }

    @Test
    public void utilizationReportPageIsLoaded() {
        report.utilizationReport();
    }

    @Test
    public void taxnonmyReportPageIsLoaded() {
        report.taxonomyReport();
    }

    @Test
    public void userManagementPageIsLoaded() {
        security.securityUsersPage();
    }

    @Test
    public void roleManagmentPageIsLoaded() {
        security.securityRolesPage();
    }

    @Test
    public void accoladesCategoryIsLoaded() {
        admin.openAccoladesCateogry();
    }

    @Test
    public void billingFrequencyPageIsLoaded() {
        admin.openBillingFrequency();
    }

    @Test
    public void budgetBasisPageIsLoaded() {
        admin.openBudegetBasis();
    }

    @Test
    public void contractRolePageIsLoaded() {
        admin.openContractRole();
    }

    @Test
    public void complaintCategoryPageIsLoaded() {
        admin.openComplaintCategory();
    }

    @Test
    public void cretificationPageIsLoaded() {
        admin.openCretification();
    }

    @Test
    public void clientContactInterestPageIsLoaded() {
        admin.openClientContactInterest();
    }

    @Test
    public void clientTypePageIsLoaded() {
        admin.openClientType();
    }

    @Test
    public void contactTypePageIsLoaded() {
        admin.openContactType();
    }

    @Test
    public void contractTypePageIsLoaded() {
        admin.openContractType();
    }

    @Test
    public void countryPageIsLoaded() {
        admin.openContry();
    }

    @Test
    public void distributionMethodPageIsLoaded() {
        admin.openDistributionMethod();
    }

    @Test
    public void divisionPageIsLoaded() {
        admin.openDivision();
    }

    @Test
    public void engagementFrequencyPageIsLoaded() {
        admin.openEngagementFrequency();
    }

    @Test
    public void exchangeRatePageIsLoaded() {
        admin.openExchangeRate();
    }

    @Test
    public void hawkEntityPageIsLoaded() {
        admin.openHawkaEntity();
    }

    @Test
    public void inspectionTypePageIsLoaded() {
        admin.openInspectionType();
    }

    @Test
    public void IRSPageIsLoaded() {
        admin.openIRS();
    }

    @Test
    public void jobRolePageIsLoaded() {
        admin.openJobRole();
    }

    @Test
    public void meetingTypePageIsLoaded() {
        admin.openMeetingType();
    }

    @Test
    public void partnerCompanyPageIsLoaded() {
        admin.openPartnerCompany();
    }

    @Test
    public void paymentTermsPageIsLoaded() {
        admin.openPaymentTerms();
    }

    @Test
    public void rcaReviewPageIsLoaded() {
        admin.openRCAreview();
    }

    @Test
    public void rcaStatusPageIsLoaded() {
        admin.openRCAstatus();
    }

    @Test
    public void relationshipEmergencyContacPageIsLoaded() {
        admin.openRelationshipEmergencyContact();
    }

    @Test
    public void requiredAttachmentPageIsLoaded() {
        admin.openRequierdAttachment();
    }

    @Test
    public void resourceClassPageIsLoaded() {
        admin.openResourceClass();
    }

    @Test
    public void resourceTypePageIsLodaed() {
        admin.openResourceType();
    }

    @Test
    public void safetyRequirementPageIsLoaded() {
        admin.openSafetyRequirement();
    }

    @Test
    public void statePageIsLoaded() {
        admin.openState();
    }

    @Test
    public void taxonomyPageIsLoaded() {
        admin.openTaxonomy();
    }

}
