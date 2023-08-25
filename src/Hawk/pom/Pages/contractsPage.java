package pom.Pages;

import hawkBase.hawkBase;
import pom.locators.contractors_locators;
import static com.codeborne.selenide.Condition.visible;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class contractsPage {
    public static void openContractorsPage() {
        contractors_locators.contracts_tab.shouldBe(visible);
        contractors_locators.contracts_tab.click();
        contractors_locators.contract_status.shouldBe(visible);
        contractors_locators.effective.shouldBe(visible);
        contractors_locators.client.shouldBe(visible);
        contractors_locators.contract_type.shouldBe(visible);
        contractors_locators.hawk_entity.shouldBe(visible);
        contractors_locators.search_input.shouldBe(visible);
        contractors_locators.view_btn.shouldBe(visible);
        contractors_locators.add_contract_btn.shouldBe(visible);
        contractors_locators.export_btn.shouldBe(visible);


    }
    public static void ContractsPage(){
        hawkBase.waitForLoad();
        contractors_locators.contracts_tab.click();
        contractors_locators.contract_status.click();
        contractors_locators.status.sendKeys("AC");
        contractors_locators.status_value.click();
        contractors_locators.client.click();
        contractors_locators.contract_client.sendKeys("A1");
        contractors_locators.contract_client_value.click();
        contractors_locators.view_btn.click();
        hawkBase.waitForLoad();
        assertThat(contractors_locators.searchResult.isDisplayed(),is(Boolean.TRUE));
    }
}
