package pom.Pages;
import pom.locators.contacts_locators;
import pom.locators.ccr_locators;
import hawkBase.hawkBase;
import static com.codeborne.selenide.Condition.visible;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class ccrPage {

    public static void openCCRpage(){
        ccr_locators.ccr.shouldBe(visible);
        ccr_locators.ccr.click();
        ccr_locators.start_date.shouldBe(visible);
        ccr_locators.end_date.shouldBe(visible);
        ccr_locators.hawk_rep.shouldBe(visible);
        ccr_locators.hawk_other.shouldBe(visible);
        ccr_locators.client.shouldBe(visible);
        ccr_locators.ccr_client_contract.shouldBe(visible);
        ccr_locators.search_input.shouldBe(visible);
        ccr_locators.view_btn.shouldBe(visible);
        ccr_locators.add_ccr_btn.shouldBe(visible);
        ccr_locators.export_btn.shouldBe(visible);

    }
    public static void ccrPage(){
        ccr_locators.ccr.click();
        ccr_locators.client.click();
        ccr_locators.hawk_rep.click();
        ccr_locators.view_btn.click();
        hawkBase.waitForLoad();

        assertThat(contacts_locators.searchResult.isDisplayed(),is(Boolean.FALSE));
    }
}
