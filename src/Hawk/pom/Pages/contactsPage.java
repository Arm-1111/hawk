package pom.Pages;


import hawkBase.hawkBase;
import pom.locators.contacts_locators;
import static com.codeborne.selenide.Condition.visible;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class contactsPage {
    public static void openContactsPage() {
        contacts_locators.contacts_tab.shouldBe(visible);
        contacts_locators.contacts_tab.click();
        contacts_locators.client.shouldBe(visible);
        contacts_locators.hawk_entity.shouldBe(visible);
        contacts_locators.holliday_cards.shouldBe(visible);
        contacts_locators.status_drop.shouldBe(visible);
        contacts_locators.holliday_brunch.shouldBe(visible);
        contacts_locators.interests.shouldBe(visible);
        contacts_locators.calendars.shouldBe(visible);
        contacts_locators.search_input.shouldBe(visible);
        contacts_locators.view_btn.shouldBe(visible);
        contacts_locators.export_btn.shouldBe(visible);


    }

    public static void contactsPage() {
        contacts_locators.contacts_tab.click();
        contacts_locators.client.click();
        contacts_locators.contactsClient.sendKeys("ANAD");
        contacts_locators.contactsClient_input.click();
        contacts_locators.status_drop.click();
        contacts_locators.contactsStatusSearch.sendKeys("AC");
        contacts_locators.contactsStatusCart.click();
        contacts_locators.view_btn.click();
        hawkBase.waitForLoad();
        assertThat(contacts_locators.searchResult.isDisplayed(), is(Boolean.TRUE));
    }


}

