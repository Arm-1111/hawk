package pom.Pages;
import pom.locators.sage50_locators;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
public class sage50Page {
    public static void sage50ConnectionPage(){
        sage50_locators.sage50Tab.click();
        assertThat(sage50_locators.sage50Tab.isDisplayed(),is(Boolean.TRUE));
        assertThat(sage50_locators.SageStatus.isDisplayed(),is(Boolean.TRUE));
        assertThat(sage50_locators.SageEntity.isDisplayed(),is(Boolean.TRUE));
        assertThat(sage50_locators.SageClient.isDisplayed(),is(Boolean.TRUE));
        assertThat(sage50_locators.SageAllDatesRadioButton.isDisplayed(),is(Boolean.TRUE));
        assertThat(sage50_locators.SageCustomRangeRadioButton.isDisplayed(),is(Boolean.TRUE));
        assertThat(sage50_locators.SageInvoiceStartDate.isDisplayed(),is(Boolean.TRUE));
        assertThat(sage50_locators.SageInvoiceEndDate.isDisplayed(),is(Boolean.TRUE));
        assertThat(sage50_locators.SageSearch.isDisplayed(),is(Boolean.TRUE));
        assertThat(sage50_locators.SageViewButton.isDisplayed(),is(Boolean.TRUE));
        assertThat(sage50_locators.SageProcessSelectedButton.isDisplayed(),is(Boolean.TRUE));
        assertThat(sage50_locators.SageCancelSelectedButton.isDisplayed(),is(Boolean.TRUE));
        assertThat(sage50_locators.SageSelecktAllCheckBox.isDisplayed(),is(Boolean.TRUE));

    }
}
