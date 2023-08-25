package pom.locators;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class suppliers_locators {
    public static SelenideElement supplier = $(By.xpath("//span[contains(text(), 'Suppliers')]"));
    public static SelenideElement supplierDrop = $(By.xpath("//*[@id=\"ddlSuppliers\"]"));
    public static SelenideElement supplierDropInput =$(By.xpath("//*[@id=\"filterinnerListBoxddlSuppliers\"]/input"));
    public static SelenideElement supplierValue = $(By.xpath("//span[contains(text(), 'A&A')]"));
    public static SelenideElement supplier_group = $(By.xpath("//div[@id='ddlSupplierGroups']"));
    public static SelenideElement search_input = $(By.id("txtSearchKey"));
    public static SelenideElement view_btn = $(By.id("btnView"));
    public static SelenideElement add_supplier_btn = $(By.xpath("//*[@id='content']/div[6]/div[4]/div[2]/div/a[2]/i"));
    public static SelenideElement export_btn = $(By.id("btnExportToExcel"));
    public static SelenideElement searchResult = $(By.id("row0gridSuppliers"));
}
