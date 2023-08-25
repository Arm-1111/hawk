package pom.Pages;

import hawkBase.hawkBase;
import pom.locators.timesheet_locators;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class timesheetPage {
    public static void openTimesheetEntryMenuPage() {
        timesheet_locators.timesheet_tab.hover();
        timesheet_locators.timesheet_entry_menu.click();
        hawkBase.waitForLoad();
        assertThat(timesheet_locators.timesheets_trough.isDisplayed(), is(Boolean.TRUE));
        assertThat(timesheet_locators.coordinator.isDisplayed(), is(Boolean.TRUE));
        assertThat(timesheet_locators.job.isDisplayed(), is(Boolean.TRUE));
        assertThat(timesheet_locators.client.isDisplayed(), is(Boolean.TRUE));
        assertThat(timesheet_locators.search_input.isDisplayed(), is(Boolean.TRUE));
        assertThat(timesheet_locators.division.isDisplayed(), is(Boolean.TRUE));
        assertThat(timesheet_locators.process_selected_items_btn.isDisplayed(), is(Boolean.TRUE));
        assertThat(timesheet_locators.timesheet_history_btn.isDisplayed(), is(Boolean.TRUE));
        assertThat(timesheet_locators.view_btn.isDisplayed(), is(Boolean.TRUE));
        assertThat(timesheet_locators.export_btn.isDisplayed(), is(Boolean.TRUE));

    }

    public static void openTimesheetHistoryPage() {
        timesheet_locators.timesheet_tab.hover();
        timesheet_locators.timesheet_history.click();
        assertThat(timesheet_locators.date_from.isDisplayed(), is(Boolean.TRUE));
        assertThat(timesheet_locators.date_to.isDisplayed(), is(Boolean.TRUE));
        assertThat(timesheet_locators.clients.isDisplayed(), is(Boolean.TRUE));
        assertThat(timesheet_locators.contact_type.isDisplayed(), is(Boolean.TRUE));
        assertThat(timesheet_locators.hawk_entity.isDisplayed(), is(Boolean.TRUE));
        assertThat(timesheet_locators.divisions.isDisplayed(), is(Boolean.TRUE));
        assertThat(timesheet_locators.billed.isDisplayed(), is(Boolean.TRUE));
        assertThat(timesheet_locators.resource.isDisplayed(), is(Boolean.TRUE));
        assertThat(timesheet_locators.job_status.isDisplayed(), is(Boolean.TRUE));
        assertThat(timesheet_locators.search_input.isDisplayed(), is(Boolean.TRUE));
        assertThat(timesheet_locators.view_btn.isDisplayed(), is(Boolean.TRUE));
        assertThat(timesheet_locators.export_btn.isDisplayed(), is(Boolean.TRUE));
    }

    public static void openExpenceOnlyTimesheetMenuPage() {
        timesheet_locators.timesheet_tab.hover();
        timesheet_locators.expenceonlymenu_tab.click();
        hawkBase.waitForLoad();
        assertThat(timesheet_locators.coordinators.isDisplayed(), is(Boolean.TRUE));
        assertThat(timesheet_locators.job.isDisplayed(), is(Boolean.TRUE));
        assertThat(timesheet_locators.client.isDisplayed(), is(Boolean.TRUE));
        assertThat(timesheet_locators.search_input.isDisplayed(), is(Boolean.TRUE));
        assertThat(timesheet_locators.division.isDisplayed(), is(Boolean.TRUE));
        assertThat(timesheet_locators.new_expence_only_timesheet_btn.isDisplayed(), is(Boolean.TRUE));
        assertThat(timesheet_locators.view_btn.isDisplayed(), is(Boolean.TRUE));
        assertThat(timesheet_locators.export_btn.isDisplayed(), is(Boolean.TRUE));

    }
    public static void openConsolidatedTEformEntryMenu(){
        timesheet_locators.timesheet_tab.hover();
        hawkBase.waitForLoad();
        timesheet_locators.consalidated.click();
        hawkBase.waitForLoad();
        assertThat(timesheet_locators.coordinator.isDisplayed(),is(Boolean.TRUE));
        assertThat(timesheet_locators.jobNumber.isDisplayed(),is(Boolean.TRUE));
        assertThat(timesheet_locators.clientDrop.isDisplayed(),is(Boolean.TRUE));
        assertThat(timesheet_locators.search_input.isDisplayed(),is(Boolean.TRUE));
        assertThat(timesheet_locators.division.isDisplayed(),is(Boolean.TRUE));
        assertThat(timesheet_locators.consolidatedAddTEBtn.isDisplayed(),is(Boolean.TRUE));
        assertThat(timesheet_locators.view_btn.isDisplayed(),is(Boolean.TRUE));
        assertThat(timesheet_locators.export_btn.isDisplayed(),is(Boolean.TRUE));
    }

}
