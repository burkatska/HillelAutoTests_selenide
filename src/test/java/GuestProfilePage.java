import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Selenide.$;

public class GuestProfilePage {

    private SelenideElement MyProfile = $("#userNavDropdown");

    public GuestProfilePage checkMyProfile(String profileText) {
        MyProfile.shouldHave(Condition.text(profileText));
        return this;
    }
}
