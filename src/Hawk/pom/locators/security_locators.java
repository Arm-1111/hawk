package pom.locators;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.$;

public class security_locators {
    public static SelenideElement securityTab = $(By.xpath("//span[contains(text(), 'Security')]"));
    public static SelenideElement usersTab = $(By.xpath("//a[contains(text(), 'Users')]"));
    public static SelenideElement rolesTab = $(By.xpath("//a[contains(text(), 'Roles')]"));
    public static SelenideElement usersSearchInput =$(By.id("txtSearchKey"));
    public static SelenideElement usersSearchButton =$(By.id("btnView"));
    public static SelenideElement addUserButton =$(By.id("btnNewUser"));
    public static SelenideElement addNewRoleButton =$(By.xpath("//a[contains(text(), 'Add Role')]"));
}
