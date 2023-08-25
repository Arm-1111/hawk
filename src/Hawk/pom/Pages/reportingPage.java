package pom.Pages;

import hawkBase.hawkBase;
import pom.locators.reporting_locators;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class reportingPage {
    public static void biliableManhoursByDivision() {
        reporting_locators.reportTap.hover();
        reporting_locators.biliableManhoursByDivision.click();
        hawkBase.waitForLoad();
        assertThat(reporting_locators.biliableManhoursByDivisionYear.isDisplayed(), is(Boolean.TRUE));
        assertThat(reporting_locators.biliableManhoursByDivisionHawkEntity.isDisplayed(), is(Boolean.TRUE));
        assertThat(reporting_locators.biliableManhoursByDivisionViewButon.isDisplayed(), is(Boolean.TRUE));
        assertThat(reporting_locators.biliableManhoursByDivisionExportButton.isDisplayed(), is(Boolean.TRUE));
    }

    public static void grossMargin() {
        reporting_locators.reportTap.hover();
        hawkBase.waitForLoad();
        reporting_locators.grossMargin.click();
        hawkBase.waitForLoad();
        assertThat(reporting_locators.grossMarginClient.isDisplayed(), is(Boolean.TRUE));
        assertThat(reporting_locators.grossMarginDivision.isDisplayed(), is(Boolean.TRUE));
        assertThat(reporting_locators.grossMarginJobStatus.isDisplayed(), is(Boolean.TRUE));
        assertThat(reporting_locators.grossMarginSearch.isDisplayed(), is(Boolean.TRUE));
        assertThat(reporting_locators.grossMarginViewButton.isDisplayed(), is(Boolean.TRUE));
        assertThat(reporting_locators.grossMarginExportButton.isDisplayed(), is(Boolean.TRUE));
    }

    public static void reportingInvoice() {
        reporting_locators.reportTap.hover();
        hawkBase.waitForLoad();
        hawkBase.waitForLoad();
        reporting_locators.invoice.click();
        hawkBase.waitForLoad();
        hawkBase.waitForLoad();
        assertThat(reporting_locators.invoiceStartDate.isDisplayed(), is(Boolean.TRUE));
        assertThat(reporting_locators.invoiceEndDate.isDisplayed(), is(Boolean.TRUE));
        assertThat(reporting_locators.invoiceEntity.isDisplayed(), is(Boolean.TRUE));
        assertThat(reporting_locators.invoiceDivision.isDisplayed(), is(Boolean.TRUE));
        assertThat(reporting_locators.invoiceClient.isDisplayed(), is(Boolean.TRUE));
        assertThat(reporting_locators.invoiceContractType.isDisplayed(), is(Boolean.TRUE));
        assertThat(reporting_locators.invoiceCoordinator.isDisplayed(), is(Boolean.TRUE));
        assertThat(reporting_locators.invoiceSearch.isDisplayed(), is(Boolean.TRUE));
        assertThat(reporting_locators.invoiceViewButton.isDisplayed(), is(Boolean.TRUE));
        assertThat(reporting_locators.invoiceExportButton.isDisplayed(), is(Boolean.TRUE));
    }

    public static void manhoursByClientJob() {
        reporting_locators.reportTap.hover();
        hawkBase.waitForLoad();
        reporting_locators.manhoursbyClientJob.click();
        hawkBase.waitForLoad();
        assertThat(reporting_locators.manhoursbyClientJobStartDate.isDisplayed(), is(Boolean.TRUE));
        assertThat(reporting_locators.manhoursbyClientJobEndDate.isDisplayed(), is(Boolean.TRUE));
        assertThat(reporting_locators.manhoursbyClientJobHawkEntity.isDisplayed(), is(Boolean.TRUE));
        assertThat(reporting_locators.manhoursbyClientJobDivision.isDisplayed(), is(Boolean.TRUE));
        assertThat(reporting_locators.manhoursbyClientJobResourceType.isDisplayed(), is(Boolean.TRUE));
        assertThat(reporting_locators.manhoursbyClientJobResourceClass.isDisplayed(), is(Boolean.TRUE));
        assertThat(reporting_locators.manhoursbyClientJobClient.isDisplayed(), is(Boolean.TRUE));
        assertThat(reporting_locators.manhoursbyClientJob_Job.isDisplayed(), is(Boolean.TRUE));
        assertThat(reporting_locators.manhoursbyClientJobSearch.isDisplayed(), is(Boolean.TRUE));
        assertThat(reporting_locators.manhoursbyClientJobResource.isDisplayed(), is(Boolean.TRUE));
        assertThat(reporting_locators.manhoursbyClientJobViewButton.isDisplayed(), is(Boolean.TRUE));
        assertThat(reporting_locators.manhoursbyClientJobExportButton.isDisplayed(), is(Boolean.TRUE));

    }

    public static void mileage() {
        reporting_locators.reportTap.hover();
        reporting_locators.miliage.click();
        hawkBase.waitForLoad();
        assertThat(reporting_locators.mileageYear.isDisplayed(), is(Boolean.TRUE));
        assertThat(reporting_locators.mileageEntity.isDisplayed(), is(Boolean.TRUE));
        assertThat(reporting_locators.mileageDivision.isDisplayed(), is(Boolean.TRUE));
        assertThat(reporting_locators.mileageClient.isDisplayed(), is(Boolean.TRUE));
        assertThat(reporting_locators.mileageViewButton.isDisplayed(), is(Boolean.TRUE));
        assertThat(reporting_locators.mileageExportButton.isDisplayed(), is(Boolean.TRUE));

    }

    public static void newHireReport() {
        reporting_locators.reportTap.hover();
        reporting_locators.newhireReport.click();
        hawkBase.waitForLoad();
        assertThat(reporting_locators.newHireReportStaerDate.isDisplayed(), is(Boolean.TRUE));
        assertThat(reporting_locators.newHireReportEndDate.isDisplayed(), is(Boolean.TRUE));
        assertThat(reporting_locators.newHireReportSearch.isDisplayed(), is(Boolean.TRUE));
        assertThat(reporting_locators.newHireReportViewButton.isDisplayed(), is(Boolean.TRUE));
        assertThat(reporting_locators.newHireReportExportButton.isDisplayed(), is(Boolean.TRUE));
    }

    public static void payroll() {
        reporting_locators.reportTap.hover();
        reporting_locators.payroll.click();
        hawkBase.waitForLoad();
        assertThat(reporting_locators.payrollPeriod.isDisplayed(), is(Boolean.TRUE));
        assertThat(reporting_locators.payrollResourceType.isDisplayed(), is(Boolean.TRUE));
        assertThat(reporting_locators.payrollEntity.isDisplayed(), is(Boolean.TRUE));
        assertThat(reporting_locators.payrollDivision.isDisplayed(), is(Boolean.TRUE));
        assertThat(reporting_locators.payrollResource.isDisplayed(), is(Boolean.TRUE));
        assertThat(reporting_locators.payrollDetail_summary.isDisplayed(), is(Boolean.TRUE));
        assertThat(reporting_locators.payrollViewButton.isDisplayed(), is(Boolean.TRUE));
        assertThat(reporting_locators.payrollExportExel.isDisplayed(), is(Boolean.TRUE));
        assertThat(reporting_locators.payrollExportPDF.isDisplayed(), is(Boolean.TRUE));
    }

    public static void performanceEvents() {
        reporting_locators.reportTap.hover();
        reporting_locators.performaceEvents.click();
        hawkBase.waitForLoad();
        assertThat(reporting_locators.performanceStartDate.isDisplayed(), is(Boolean.TRUE));
        assertThat(reporting_locators.performanceEndDate.isDisplayed(), is(Boolean.TRUE));
        assertThat(reporting_locators.performanceClient.isDisplayed(), is(Boolean.TRUE));
        assertThat(reporting_locators.performanceNCR.isDisplayed(), is(Boolean.TRUE));
        assertThat(reporting_locators.performanceEntity.isDisplayed(), is(Boolean.TRUE));
        assertThat(reporting_locators.performanceDivision.isDisplayed(), is(Boolean.TRUE));
        assertThat(reporting_locators.performanceType.isDisplayed(), is(Boolean.TRUE));
        assertThat(reporting_locators.performanceCategory.isDisplayed(), is(Boolean.TRUE));
        assertThat(reporting_locators.performanceSearch.isDisplayed(), is(Boolean.TRUE));
        assertThat(reporting_locators.performanceViewButton.isDisplayed(), is(Boolean.TRUE));
        assertThat(reporting_locators.performanceExportButton.isDisplayed(), is(Boolean.TRUE));

    }

    public static void revenueAccural() {
        reporting_locators.reportTap.hover();
        reporting_locators.revenueAccuralReport.click();
        hawkBase.waitForLoad();
        assertThat(reporting_locators.revenueStartDate.isDisplayed(), is(Boolean.TRUE));
        assertThat(reporting_locators.revenueEndDate.isDisplayed(), is(Boolean.TRUE));
        assertThat(reporting_locators.revenueDivision.isDisplayed(), is(Boolean.TRUE));
        assertThat(reporting_locators.revenueCoordinator.isDisplayed(), is(Boolean.TRUE));
        assertThat(reporting_locators.revenueClient.isDisplayed(), is(Boolean.TRUE));
        assertThat(reporting_locators.revenuePrimaryWork.isDisplayed(), is(Boolean.TRUE));
        assertThat(reporting_locators.revenueHawkEntity.isDisplayed(), is(Boolean.TRUE));
        assertThat(reporting_locators.revenueSearch.isDisplayed(), is(Boolean.TRUE));
        assertThat(reporting_locators.revenueViewButton.isDisplayed(), is(Boolean.TRUE));
        assertThat(reporting_locators.revenueExportButton.isDisplayed(), is(Boolean.TRUE));

    }

    public static void revenueApportionmnet() {
        reporting_locators.reportTap.hover();
        reporting_locators.revenueApportionmentRepport.click();
        hawkBase.waitForLoad();
        assertThat(reporting_locators.apportionmnetStartDate.isDisplayed(), is(Boolean.TRUE));
        assertThat(reporting_locators.apportionmnetEndDate.isDisplayed(), is(Boolean.TRUE));
        assertThat(reporting_locators.apportionmnetHawkEntity.isDisplayed(), is(Boolean.TRUE));
        assertThat(reporting_locators.apportionmnetCoordinator.isDisplayed(), is(Boolean.TRUE));
        assertThat(reporting_locators.apportionmnetClient.isDisplayed(), is(Boolean.TRUE));
        assertThat(reporting_locators.apportionmnetPrimaryWork.isDisplayed(), is(Boolean.TRUE));
        assertThat(reporting_locators.apportionmnetSearch.isDisplayed(), is(Boolean.TRUE));
        assertThat(reporting_locators.apportionmnetViewButton.isDisplayed(), is(Boolean.TRUE));
        assertThat(reporting_locators.apportionmnetExportButton.isDisplayed(), is(Boolean.TRUE));

    }

    public static void terminatingEmployee() {
        reporting_locators.reportTap.hover();
        reporting_locators.terminatingEmployeeReport.click();
        hawkBase.waitForLoad();
        assertThat(reporting_locators.terminatingStartDate.isDisplayed(), is(Boolean.TRUE));
        assertThat(reporting_locators.terminatingEndDate.isDisplayed(), is(Boolean.TRUE));
        assertThat(reporting_locators.terminatingSerach.isDisplayed(), is(Boolean.TRUE));
        assertThat(reporting_locators.terminatingViewButton.isDisplayed(), is(Boolean.TRUE));
        assertThat(reporting_locators.terminatingExportButton.isDisplayed(), is(Boolean.TRUE));

    }

    public static void utilizationReport() {
        reporting_locators.reportTap.hover();
        reporting_locators.utilization.click();
        hawkBase.waitForLoad();
        assertThat(reporting_locators.utilizationStartDate.isDisplayed(), is(Boolean.TRUE));
        assertThat(reporting_locators.utilizationEndDate.isDisplayed(), is(Boolean.TRUE));
        assertThat(reporting_locators.utilizationHawkEntity.isDisplayed(), is(Boolean.TRUE));
        assertThat(reporting_locators.utilizationDivision.isDisplayed(), is(Boolean.TRUE));
        assertThat(reporting_locators.utilizationResourceType.isDisplayed(), is(Boolean.TRUE));
        assertThat(reporting_locators.utilizationResourceClass.isDisplayed(), is(Boolean.TRUE));
        assertThat(reporting_locators.utilizationSerach.isDisplayed(), is(Boolean.TRUE));
        assertThat(reporting_locators.utilizationResource.isDisplayed(), is(Boolean.TRUE));
        assertThat(reporting_locators.utilizationExportButton.isDisplayed(), is(Boolean.TRUE));
        assertThat(reporting_locators.utilizationViewButton.isDisplayed(), is(Boolean.TRUE));
    }

    public static void taxonomyReport() {
        reporting_locators.reportTap.hover();
        reporting_locators.taxonomyReport.click();
        hawkBase.waitForLoad();
        assertThat(reporting_locators.taxonomyClient.isDisplayed(), is(Boolean.TRUE));
        assertThat(reporting_locators.taxonomyEntity.isDisplayed(), is(Boolean.TRUE));
        assertThat(reporting_locators.taxonomyDivision.isDisplayed(), is(Boolean.TRUE));
        assertThat(reporting_locators.taxonomy.isDisplayed(), is(Boolean.TRUE));
        assertThat(reporting_locators.taxonomyPrimaryGroup.isDisplayed(), is(Boolean.TRUE));
        assertThat(reporting_locators.taxonomySubGroup.isDisplayed(), is(Boolean.TRUE));
        assertThat(reporting_locators.taxonomy3rdLevel.isDisplayed(), is(Boolean.TRUE));
        assertThat(reporting_locators.taxonomySerach.isDisplayed(), is(Boolean.TRUE));
        assertThat(reporting_locators.taxonomyViewButton.isDisplayed(), is(Boolean.TRUE));
        assertThat(reporting_locators.taxonomyExportButton.isDisplayed(), is(Boolean.TRUE));
    }
}
