package pom.Pages;

import hawkBase.hawkBase;
import pom.locators.invoicing_locators;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class invoicingPage {
    public static void invoiceProcessingMenu() {
        invoicing_locators.invoice_tab.hover();
        assertThat(invoicing_locators.invoice_tab.isDisplayed(), is(Boolean.TRUE));
        invoicing_locators.invoice_processing_menu.click();
       hawkBase.waitForLoad();
        assertThat(invoicing_locators.billing_frequency.isDisplayed(), is(Boolean.TRUE));
        assertThat(invoicing_locators.contract_type.isDisplayed(), is(Boolean.TRUE));
        assertThat(invoicing_locators.client.isDisplayed(), is(Boolean.TRUE));
        assertThat(invoicing_locators.hawk_division.isDisplayed(), is(Boolean.TRUE));
        assertThat(invoicing_locators.hawk_entity.isDisplayed(), is(Boolean.TRUE));
        assertThat(invoicing_locators.all_dates_check.isDisplayed(), is(Boolean.TRUE));
        assertThat(invoicing_locators.custom_range_check.isDisplayed(), is(Boolean.TRUE));
        assertThat(invoicing_locators.start_date.isDisplayed(), is(Boolean.TRUE));
        assertThat(invoicing_locators.custom_range_check.isDisplayed(), is(Boolean.TRUE));
        assertThat(invoicing_locators.end_date.isDisplayed(), is(Boolean.TRUE));
        assertThat(invoicing_locators.view_btn.isDisplayed(), is(Boolean.TRUE));
        assertThat(invoicing_locators.export_btn.isDisplayed(), is(Boolean.TRUE));
        assertThat(invoicing_locators.process_btn.isDisplayed(), is(Boolean.TRUE));
        assertThat(invoicing_locators.coordinator.isDisplayed(), is(Boolean.TRUE));
        assertThat(invoicing_locators.search_input.isDisplayed(), is(Boolean.TRUE));
    }

    public static void creditNoteProcessingMenu() {
        invoicing_locators.invoice_tab.hover();
        assertThat(invoicing_locators.invoice_tab.isDisplayed(), is(Boolean.TRUE));
        invoicing_locators.credit_note_processing_menu.click();
       hawkBase.waitForLoad();
        assertThat(invoicing_locators.billing_frequency.isDisplayed(), is(Boolean.TRUE));
        assertThat(invoicing_locators.contract_type.isDisplayed(), is(Boolean.TRUE));
        assertThat(invoicing_locators.client_credit_note.isDisplayed(), is(Boolean.TRUE));
        assertThat(invoicing_locators.hawk_division.isDisplayed(), is(Boolean.TRUE));
        assertThat(invoicing_locators.hawk_entity.isDisplayed(), is(Boolean.TRUE));
        assertThat(invoicing_locators.coordinator.isDisplayed(), is(Boolean.TRUE));
        assertThat(invoicing_locators.all_dates_check.isDisplayed(), is(Boolean.TRUE));
        assertThat(invoicing_locators.custom_range_check.isDisplayed(), is(Boolean.TRUE));
        assertThat(invoicing_locators.start_date.isDisplayed(), is(Boolean.TRUE));
        assertThat(invoicing_locators.end_date.isDisplayed(), is(Boolean.TRUE));
        assertThat(invoicing_locators.search_input.isDisplayed(), is(Boolean.TRUE));
        assertThat(invoicing_locators.view_btn.isDisplayed(), is(Boolean.TRUE));
        assertThat(invoicing_locators.export_btn.isDisplayed(), is(Boolean.TRUE));

    }

    public static void invoiceHistory() {
        invoicing_locators.invoice_tab.hover();
        assertThat(invoicing_locators.invoice_tab.isDisplayed(), is(Boolean.TRUE));
        invoicing_locators.invoice_history.click();
       hawkBase.waitForLoad();
        assertThat(invoicing_locators.InvoiceBillingFrequency.isDisplayed(), is(Boolean.TRUE));
        assertThat(invoicing_locators.InvoiceContractType.isDisplayed(), is(Boolean.TRUE));
        assertThat(invoicing_locators.InvoiceAllDatesRadioButton.isDisplayed(), is(Boolean.TRUE));
        assertThat(invoicing_locators.InvoiceCustomRangeRadioButton.isDisplayed(), is(Boolean.TRUE));
        assertThat(invoicing_locators.InvoiceStartDate.isDisplayed(), is(Boolean.TRUE));
        assertThat(invoicing_locators.InvoiceEndDate.isDisplayed(), is(Boolean.TRUE));
        assertThat(invoicing_locators.InvoiceClient.isDisplayed(), is(Boolean.TRUE));
        assertThat(invoicing_locators.InvoiceHawkDivision.isDisplayed(), is(Boolean.TRUE));
        assertThat(invoicing_locators.InvoiceHawkDivision.isDisplayed(), is(Boolean.TRUE));
        assertThat(invoicing_locators.InvoiceHawkEntity.isDisplayed(), is(Boolean.TRUE));
        assertThat(invoicing_locators.InvoiceSearch.isDisplayed(), is(Boolean.TRUE));
        assertThat(invoicing_locators.InvoiceViewButton.isDisplayed(), is(Boolean.TRUE));
        assertThat(invoicing_locators.InvoiceExportButton.isDisplayed(), is(Boolean.TRUE));


    }
    public static void  draftInvoices(){
        invoicing_locators.invoice_tab.hover();
        assertThat(invoicing_locators.invoice_tab.isDisplayed(),is(Boolean.TRUE));
        invoicing_locators.draft_invoices.click();
        hawkBase.waitForLoad();
        assertThat(invoicing_locators.DraftBillingFrequency.isDisplayed(),is(Boolean.TRUE));
        assertThat(invoicing_locators.DraftContracrType.isDisplayed(),is(Boolean.TRUE));
        assertThat(invoicing_locators.DraftAllDatesRadioButton.isDisplayed(),is(Boolean.TRUE));
        assertThat(invoicing_locators.DraftCustomRangeRadioButton.isDisplayed(),is(Boolean.TRUE));
        assertThat(invoicing_locators.DraftStartDate.isDisplayed(),is(Boolean.TRUE));
        assertThat(invoicing_locators.DraftEndDate.isDisplayed(),is(Boolean.TRUE));
        assertThat(invoicing_locators.DraftClient.isDisplayed(),is(Boolean.TRUE));
        assertThat(invoicing_locators.DraftHawkDivison.isDisplayed(),is(Boolean.TRUE));
        assertThat(invoicing_locators.DraftHawkEntity.isDisplayed(),is(Boolean.TRUE));
        assertThat(invoicing_locators.DraftSearch.isDisplayed(),is(Boolean.TRUE));
        assertThat(invoicing_locators.DraftViewButton.isDisplayed(),is(Boolean.TRUE));
        assertThat(invoicing_locators.DraftExportButton.isDisplayed(),is(Boolean.TRUE));
    }
}
