import com.codeborne.selenide.Configuration;
import org.testng.annotations.BeforeSuite;
import static com.codeborne.selenide.Configuration.baseUrl;

public class BaseTest {
@BeforeSuite
    public void setUp () {
    Configuration.browser = "chrome";
    baseUrl = "https://qauto2.forstudy.space";
    Configuration.timeout = Long.parseLong("5000");
    Configuration.savePageSource = false;
    Configuration.headless = false;
    }

}
