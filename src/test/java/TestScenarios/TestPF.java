package TestScenarios;

import Objects.FacebookPF;
import Objects.Search;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

public class TestPF {
    WebDriver driver;
    Search pagefactory;
    FacebookPF facebookPF;

    @BeforeTest
    public void beforeTest() {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().window().maximize();
        driver.get("https://www.google.com/");
    }

    @Test(priority = 1, enabled = true)
    public void SearchOperation() {

        pagefactory = new Search(driver);
        pagefactory.searchgoogle("Facebook");
    }

    @Test(priority = 2)
    public void VerifyandAccessFacebook() {
        facebookPF = new FacebookPF(driver);
        facebookPF.loginFacebook("5103166706", "Deepa2014");

    }

    @AfterTest
    public void afterTest() {
        driver.quit();


    }
}