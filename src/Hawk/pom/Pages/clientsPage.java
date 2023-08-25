package pom.Pages;
import pom.locators.clients_locators;
import pom.locators.contractors_locators;
import hawkBase.hawkBase;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class clientsPage {
    public static void openClientsPage() {
        hawkBase.waitForLoad();
        assertThat(clients_locators.clients.isDisplayed(),is(Boolean.TRUE));
        clients_locators.clients.click();
        hawkBase.waitForLoad();
        assertThat(clients_locators.client_drop.isDisplayed(), is(Boolean.TRUE));
        assertThat(clients_locators.hawk_entity.isDisplayed(),is(Boolean.TRUE));
        assertThat(clients_locators.search_input.isDisplayed(),is(Boolean.TRUE));
        assertThat(clients_locators.view_btn.isDisplayed(),is(Boolean.TRUE));
    }
    public static void ClientsPage(){
        clients_locators.clients.click();
        clients_locators.client_drop.click();
        clients_locators.clientVal.sendKeys("A1");
        clients_locators.value.click();
        contractors_locators.view_btn.click();
        hawkBase.waitForLoad();
        assertThat(clients_locators.searchResult.isDisplayed(),is(Boolean.TRUE));
    }
}
