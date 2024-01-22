package TestScenarios;

import Objects.FacebookPage;
import Objects.GoogleSearch;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

public class TestMethods {
    WebDriver driver;
    GoogleSearch objectrepo;
    FacebookPage object;

    @BeforeTest
    public void beforeTest(){
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        driver =new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().window().maximize();
        driver.get("https://www.google.com/");
    }

    @Test(priority = 0)
    public void SearchOperation()  {

        GoogleSearch page = new GoogleSearch(driver);
        page.searchGoogle("facebook");
    }
    @Test (priority = 1)
    public void VerifyandAccessFacebook(){
        objectrepo = new GoogleSearch(driver);
        objectrepo.clickFacebook();
    }
    @Test (priority = 2)
    public void loginFacebook(){
        object = new FacebookPage(driver);
        object.loginFacebook("5103166706","Deepa2014");
        loginFacebook();
    }

    @AfterTest
    public void afterTest(){
       driver.quit();

    }


}


