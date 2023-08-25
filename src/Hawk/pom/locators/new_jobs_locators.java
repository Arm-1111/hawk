package pom.locators;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class new_jobs_locators {
    public static SelenideElement newjobs = $(By.xpath("//*[contains(text(), 'New Jobs')]"));
    public static SelenideElement save_btn = $(By.xpath("//*[@id='content']/div[5]/div/a[1]"));
    public static SelenideElement save_next_btn = $(By.xpath("//*[@id='content']/div[5]/div/a[2]"));
    public static SelenideElement back_btn = $(By.xpath("//*[@id='content']/div[5]/div/a[3]"));
    public static SelenideElement contact_pop_btn = $(By.xpath("//*[@id='content']/div[5]/div/a[4]"));
    public static SelenideElement newJobs_hawk_entity =$(By.xpath("//*[@id=\"filterinnerListBoxddlHawkEntity\"]/input"));
    public static SelenideElement hawk_entity =$(By.xpath("//span[contains(text(), 'CAN')]"));

    public static SelenideElement success_message = $(By.xpath("//*[@id=\"successAlert\"]"));
    public static SelenideElement hawk_division = $(By.xpath("//*[@id=\"filterinnerListBoxddlHawkDivision\"]/input"));

    public static SelenideElement hawk_divison_text = $(By.xpath("//span[contains(text(), 'AK')]"));
    public static SelenideElement hawkDivison = $(By.xpath("//*[@id=\"ddlHawkDivision\"]"));
    public static SelenideElement budgets_instruction =$(By.xpath("//*[@id=\"tabsTab5\"]"));
    public static SelenideElement budgetBasis =$(By.id("dropdownlistWrapperddlBudgetBasis"));
    public static SelenideElement budgetBasisInput =$(By.xpath("//*[@id=\"filterinnerListBoxddlBudgetBasis\"]/input"));
    public static SelenideElement budgetBasisValue =$(By.xpath("//span[contains(text(), 'SP')]"));
    public static SelenideElement budgetSpendInput =$(By.id("niBudgetSpend"));
    public static SelenideElement jobSpendInput =$(By.xpath("//*[@id=\"niSpendProjectBudget\"]"));
    public static SelenideElement remaining =$(By.id("niSpendRemaining"));
    public static SelenideElement deleteJob =$(By.xpath("//*[@id=\"row0gridJobsDashboard\"]/div[1]/div/button[3]"));
    public static SelenideElement buttonConfurm =$(By.id("btnConfirm"));



}
