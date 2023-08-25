package pom.Pages;

import hawkBase.hawkBase;
import pom.locators.job_dashboard_locators;
import pom.locators.new_jobs_locators;
import java.util.Objects;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;
import static org.hamcrest.Matchers.is;

public class newJobPage {
    public static void openNewjobsPage() {
        hawkBase.waitForLoad();
        assertThat(new_jobs_locators.newjobs.isDisplayed(),is(Boolean.TRUE));
        new_jobs_locators.newjobs.click();
        assertThat(new_jobs_locators.save_btn.isDisplayed(),is(Boolean.TRUE));
        assertThat(new_jobs_locators.save_next_btn.isDisplayed(),is(Boolean.TRUE));
        assertThat(new_jobs_locators.back_btn.isDisplayed(),is(Boolean.TRUE));
        assertThat(new_jobs_locators.contact_pop_btn.isDisplayed(),is(Boolean.TRUE));
    }

    public static void NewJobsPage() {
        new_jobs_locators.newjobs.click();
        job_dashboard_locators.client.click();
        job_dashboard_locators.client_drop_search.sendKeys("A1");
        job_dashboard_locators.clientDrop_value.click();
        job_dashboard_locators.entity.click();
        new_jobs_locators.newJobs_hawk_entity.sendKeys("CAN");
        new_jobs_locators.hawk_entity.click();
        new_jobs_locators.hawkDivison.click();
        new_jobs_locators.hawk_division.sendKeys("AK OH");
        new_jobs_locators.hawk_divison_text.click();
        new_jobs_locators.save_btn.click();
        hawkBase.waitForLoad();
//        assertThat(new_jobs_locators.success_message.isDisplayed(), is(Boolean.TRUE));
        job_dashboard_locators.job_dashboard.click();
        new_jobs_locators.deleteJob.click();
        new_jobs_locators.buttonConfurm.click();
        hawkBase.waitForLoad();
    }

    public static void newJobCreate() {
        String sum="15000";
        new_jobs_locators.newjobs.click();
        job_dashboard_locators.client.click();
        job_dashboard_locators.client_drop_search.sendKeys("A1");
        job_dashboard_locators.clientDrop_value.click();
        job_dashboard_locators.entity.click();
        new_jobs_locators.newJobs_hawk_entity.sendKeys("CAN");
        new_jobs_locators.hawk_entity.click();
        new_jobs_locators.hawkDivison.click();
        new_jobs_locators.hawk_division.sendKeys("AK OH");
        new_jobs_locators.hawk_divison_text.click();
        new_jobs_locators.save_btn.click();

       hawkBase.waitForLoad();
        assertThat(new_jobs_locators.success_message.isDisplayed(), is(Boolean.TRUE));
        new_jobs_locators.budgets_instruction.click();
        new_jobs_locators.budgetBasis.click();
        new_jobs_locators.budgetBasisInput.sendKeys("SP");
        new_jobs_locators.budgetBasisValue.click();
        new_jobs_locators.budgetSpendInput.sendKeys(sum);
        new_jobs_locators.save_btn.click();
       hawkBase.waitForLoad();
        var spend = new_jobs_locators.jobSpendInput.getAttribute("value");
        var jobSpend = Objects.requireNonNull(new_jobs_locators.budgetSpendInput.getValue());
        var remainig =new_jobs_locators.remaining.getAttribute("value");
        hawkBase.waitForLoad();
        assertThat(jobSpend, equalTo(spend));
        assertThat(jobSpend,equalTo(remainig));
        job_dashboard_locators.job_dashboard.click();
        new_jobs_locators.deleteJob.click();
        new_jobs_locators.buttonConfurm.click();
       hawkBase.waitForLoad();

    }



}

