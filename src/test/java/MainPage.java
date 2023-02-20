import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Configuration.baseUrl;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.page;

public class MainPage {

    public SelenideElement SignUpBtn = $(" app-home > section > div > div > div.col-12.col-lg-4 > div > button");
    public SelenideElement RegistrationFormTitle = $("div.modal-header");
    public SelenideElement CrossBtn = $(" div.modal-header > button > span");
    private SelenideElement NameField = $("#signupName");
    private SelenideElement LastNameField =$("#signupLastName");
    private SelenideElement EmailField = $("#signupEmail");
    private SelenideElement PasswordField = $("#signupPassword");
    private SelenideElement ReEnterPasswordField = $("#signupRepeatPassword");
    private SelenideElement RegisterBtn = $("div.modal-footer > button");
    private SelenideElement ErrorField = $("app-signup-form > form > p");
    private SelenideElement GuestLogInBtn = $("button.header-link.-guest");


    public MainPage open() {
        Selenide.open(baseUrl,"","guest","welcome2qauto");
        return this;
    }

    public MainPage clickSignUpBtn() {
        SignUpBtn.shouldBe(visible).click();
        return this;
    }

    public MainPage checkRegistrationFormTitle(String expectedText) {
        RegistrationFormTitle.shouldHave(text(expectedText));
        return this;
    }

    public MainPage clickCrossBtn() {
        CrossBtn.shouldBe(visible).click();
        return this;
    }

    public MainPage setName(String name) {
        NameField.sendKeys(name);
        return this;

    }

    public MainPage setLastName(String lastName) {
        LastNameField.sendKeys(lastName);
        return this;
    }

    public MainPage setEmail(String email) {
        EmailField.sendKeys(email);
        return this;
    }

    public MainPage setPassword(String password) {
        PasswordField.sendKeys(password);
        return this;
    }

    public MainPage setReEnterPassword(String password) {
        ReEnterPasswordField.setValue(password);
        return this;
    }

    public MainPage clickRegisterBtn() {
        RegisterBtn.shouldBe(visible).click();
        return this;
    }
    public MainPage checkErrorField(String errorText) {
        ErrorField.shouldHave(text(errorText));
        return this;
    }
    public GuestProfilePage clickGuestLogInBtn() {
        GuestLogInBtn.shouldBe(visible).click();
        return new GuestProfilePage();
    }

}
