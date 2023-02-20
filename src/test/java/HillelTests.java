import com.codeborne.selenide.Condition;
import org.testng.annotations.Test;
import static com.codeborne.selenide.Condition.enabled;
import static com.codeborne.selenide.Selenide.$;

public class HillelTests extends BaseTest{
   @Test
    public void checkRegistrationFormTitle() {
        new MainPage().open()
                .clickSignUpBtn()
                .checkRegistrationFormTitle("Registration");
    }
    @Test
    public void checkRegistrationFormClose() {
        new MainPage().open()
                .clickSignUpBtn()
                .clickCrossBtn();
        $("app-home > section > div > div > div.col-12.col-lg-4 > div > button").shouldBe(Condition.visible);
    }
    @Test
    public void checkSignUpForm() {
        new MainPage().open()
                .clickSignUpBtn()
                .setName("Qwerty")
                .setLastName("Test")
                .setEmail("testmobilapp5@gmail.com")
                .setPassword("At7TdLDhe0LoLCg")
                .setReEnterPassword("At7TdLDhe0LoLCg");
        $("div.modal-footer > button").shouldBe(enabled).click();
    }
    @Test
    /**
     * Реєстрація вже зареєстрованого користувача
     */
    public void checkSignUpFormRegisteredUser() {
        new MainPage().open()
                .clickSignUpBtn()
                .setName("Qwerty")
                .setLastName("Test")
                .setEmail("testmobilapp5@gmail.com")
                .setPassword("At7TdLDhe0LoLCg")
                .setReEnterPassword("At7TdLDhe0LoLCg")
                .clickRegisterBtn()
                .checkErrorField("User already exists");
         }
    @Test
    public void checkGuestLogIn() {
       new MainPage().open()
               .clickGuestLogInBtn()
               .checkMyProfile("My profile");
    }
}

