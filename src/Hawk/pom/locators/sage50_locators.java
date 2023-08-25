package pom.locators;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class sage50_locators {
    public static SelenideElement sage50Tab = $(By.xpath("//span[contains(text(), 'SAGE50 Connect')]"));
    public static SelenideElement SageStatus = $(By.id("dropdownlistContentddlSageStatus"));
    public static SelenideElement SageEntity = $(By.id("dropdownlistWrapperddlHawkEntity"));
    public static SelenideElement SageClient = $(By.xpath("//*[@id=\"ddlClient\"]"));
    public static SelenideElement SageAllDatesRadioButton = $(By.id("rbAllDate"));
    public static SelenideElement SageCustomRangeRadioButton = $(By.id("rbDateFromTo"));
    public static SelenideElement SageInvoiceStartDate = $(By.xpath("//*[@id=\"dtiDateFrom\"]"));
    public static SelenideElement SageInvoiceEndDate = $(By.xpath("//*[@id=\"dtiDateTo\"]"));
    public static SelenideElement SageViewButton = $(By.id("btnView"));
    public static SelenideElement SageSearch = $(By.id("txtSearchKey"));
    public static SelenideElement SageSelecktAllCheckBox = $(By.xpath("//*[@id=\"SelectAll\"]"));
    public static SelenideElement SageProcessSelectedButton = $(By.id("btnProcess"));
    public static SelenideElement SageCancelSelectedButton = $(By.id("btnCancel"));
}
