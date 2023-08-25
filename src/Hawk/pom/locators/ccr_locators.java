package pom.locators;

import static com.codeborne.selenide.Selenide.$;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

public class ccr_locators {
    public static SelenideElement ccr = $(By.xpath("//span[contains(text(), 'CCR')]"));

    public static SelenideElement client = $(By.id("dropdownlistContentddlClient"));

    public static SelenideElement start_date = $(By.id("inputdtiDateFrom"));

    public static SelenideElement end_date = $(By.id("inputdtiDateTo"));

    public static SelenideElement hawk_rep = $(By.id("dropdownlistContentddlHawkRepPrimaryUser"));

    public static SelenideElement hawk_other = $(By.id("dropdownlistContentddlCCRHawkOther"));

    public static SelenideElement ccr_client_contract = $(By.id("dropdownlistContentddlClientContact"));

    public static SelenideElement view_btn = $(By.id("btnView"));

    public static SelenideElement add_ccr_btn = $(By.xpath("//*[@id='content']/div[6]/div[4]/div[2]/div/a[2]/b"));

    public static SelenideElement export_btn = $(By.id("btnExportToExcel"));
    public static SelenideElement search_input = $(By.id("txtSearchKey"));


}
