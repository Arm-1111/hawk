package pom.Pages;

import pom.locators.resources_locators;

import static com.codeborne.selenide.Condition.visible;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
public class resourcesPage {
    public static void openResourcePage() {
        resources_locators.resource.click();
        resources_locators.resource.shouldBe(visible);
        resources_locators.resourceClass.shouldBe(visible);
        resources_locators.resourceHawkEntity.shouldBe(visible);
        resources_locators.partner_company.shouldBe(visible);
        resources_locators.partner_company.shouldBe(visible);
        resources_locators.country.shouldBe(visible);
        resources_locators.search_input.shouldBe(visible);
        resources_locators.view_btn.shouldBe(visible);
        resources_locators.add_resource.shouldBe(visible);
        resources_locators.export_btn.shouldBe(visible);
    }

    public static void resorcesRegression() {
        resources_locators.resource.click();
        resources_locators.resourceClass.click();
        resources_locators.resourceClientDropInput.sendKeys("CO");
        resources_locators.resourceDropClientValue.click();
        resources_locators.resourceHawkEntity.click();
        resources_locators.resourceDropHawkInput.sendKeys("ALA");
        resources_locators.resourceDropHawkValue.click();
        resources_locators.view_btn.click();
        assertThat(resources_locators.searchResult.isDisplayed(), is(Boolean.TRUE));


    }
}
