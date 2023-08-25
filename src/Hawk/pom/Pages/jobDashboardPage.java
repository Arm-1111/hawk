package pom.Pages;

import hawkBase.hawkBase;
import pom.locators.job_dashboard_locators;
import pom.locators.new_jobs_locators;
import static com.codeborne.selenide.Condition.visible;

public class jobDashboardPage {
    public static void openJobDashboardPage() {
        /* Test*/
        job_dashboard_locators.job_dashboard.click();
        job_dashboard_locators.client.shouldBe(visible);
        job_dashboard_locators.contract_type.shouldBe(visible);
        job_dashboard_locators.entity.shouldBe(visible);
        job_dashboard_locators.division.shouldBe(visible);
        job_dashboard_locators.supplier.shouldBe(visible);
        job_dashboard_locators.coordinator.shouldBe(visible);
        job_dashboard_locators.job_status.shouldBe(visible);
        job_dashboard_locators.danger.shouldBe(visible);
        job_dashboard_locators.search_input.shouldBe(visible);
        job_dashboard_locators.view_btn.shouldBe(visible);
        job_dashboard_locators.export_btn.shouldBe(visible);
        job_dashboard_locators.inspection_btn.shouldBe(visible);
    }

    public static void JobDashboardPage() {
        job_dashboard_locators.client.click();
        job_dashboard_locators.client_drop_search.sendKeys("A1");
        job_dashboard_locators.clientDrop_value.click();
        job_dashboard_locators.coordinator.click();
        job_dashboard_locators.coordinator_search.sendKeys("ANDY");
        job_dashboard_locators.coordinatorDrop.click();
        hawkBase.waitForLoad();
//        String name1 = job_dashboard_locators.clientNameColumn.getText();
//        String value1 = job_dashboard_locators.clientNameColumn.getText();
//        assertThat(name1, equalTo(value1));
        job_dashboard_locators.view_btn.click();
        hawkBase.waitForLoad();
    }
    public static void checkCreatedJob(){
        hawkBase.waitForLoad();
        job_dashboard_locators.coordinator.click();
        job_dashboard_locators.coordinator_search.sendKeys("All");
        job_dashboard_locators.coordinatorAll.click();
        job_dashboard_locators.view_btn.click();
        hawkBase.waitForLoad();
        job_dashboard_locators.editJobButton.click();
        new_jobs_locators.budgets_instruction.click();
        hawkBase.waitForLoad();
//        String jonspend =(new_jobs_locators.jobSpendInput.getAttribute("value")).replaceAll("[$ ,]","");
//        float a =Float.parseFloat(jonspend);
//        hawkBase.waitForLoad();
//        String acctualBiled = (job_dashboard_locators.actualBilledInpit.getAttribute("value")).replaceAll("[$ ,]","");
//        float b = Float.parseFloat(acctualBiled);
//        hawkBase.waitForLoad();
//        String remainig = (new_jobs_locators.remaining.getAttribute("value")).replaceAll("[$ ,]","");
//        float c =Float.parseFloat(remainig);
//        hawkBase.waitForLoad();
//        assertThat(a-b,equalTo(c));
    }

}
