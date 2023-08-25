package pom.Pages;

import hawkBase.hawkBase;
import pom.locators.security_locators;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class securityPage {
    public static void securityUsersPage() {
        security_locators.securityTab.hover();
        security_locators.usersTab.click();
        hawkBase.waitForLoad();
        assertThat(security_locators.usersSearchInput.isDisplayed(), is(Boolean.TRUE));
        assertThat(security_locators.usersSearchButton.isDisplayed(), is(Boolean.TRUE));
        assertThat(security_locators.addUserButton.isDisplayed(), is(Boolean.TRUE));
    }

    public static void securityRolesPage() {
        security_locators.securityTab.hover();
        hawkBase.waitForLoad();
        security_locators.rolesTab.click();
        hawkBase.waitForLoad();
        assertThat(security_locators.usersSearchInput.isDisplayed(), is(Boolean.TRUE));
        assertThat(security_locators.usersSearchButton.isDisplayed(), is(Boolean.TRUE));
        assertThat(security_locators.addNewRoleButton.isDisplayed(), is(Boolean.TRUE));


    }
}
