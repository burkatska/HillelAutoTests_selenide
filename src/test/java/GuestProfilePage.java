import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import java.lang.reflect.Array;

import static com.codeborne.selenide.Selenide.$;

public class GuestProfilePage {

    private SelenideElement MyProfile = $("#userNavDropdown");
    private SelenideElement MyProfileBtn = $("#userNavDropdown");
    private SelenideElement MyProfileMenu = $("app-user-nav > div > nav");

    public GuestProfilePage checkMyProfile(String profileText) {
        MyProfile.shouldHave(Condition.text(profileText));
        return this;
    }

    public GuestProfilePage clickMyProfileBtn() {
        MyProfileBtn.shouldBe(Condition.visible).click();
        return this;
    }

    public GuestProfilePage checkMyProfileMenu() {
        MyProfileMenu.shouldHave(Condition.text("GarageFuel expensesInstructions Logout" ));
        return this;
    }
}
