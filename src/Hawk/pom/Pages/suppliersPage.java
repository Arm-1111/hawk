package pom.Pages;
import pom.locators.suppliers_locators;
import static com.codeborne.selenide.Condition.visible;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class suppliersPage {

    public static void openSupplierspage() {
        suppliers_locators.supplier.click();
        suppliers_locators.supplier.shouldBe(visible);
        suppliers_locators.supplier_group.shouldBe(visible);
        suppliers_locators.search_input.shouldBe(visible);
        suppliers_locators.view_btn.shouldBe(visible);
        suppliers_locators.add_supplier_btn.shouldBe(visible);
        suppliers_locators.export_btn.shouldBe(visible);

    }
    public static void supplierPage(){
        suppliers_locators.supplier.click();
        suppliers_locators.supplierDrop.click();
        suppliers_locators.supplierDropInput.sendKeys("A&A");
        suppliers_locators.supplierValue.click();
        suppliers_locators.view_btn.click();
        assertThat(suppliers_locators.searchResult.isDisplayed(),is(Boolean.TRUE));
    }
}
