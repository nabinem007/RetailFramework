package Objects;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class FacebookPage {
        WebDriver driver ;



    public FacebookPage(WebDriver driver) {
        this.driver = driver ;

    }
    By email_Fb = By.xpath("//*[@name='email']");
    By password_Fb = By.xpath("//*[@name='pass']");
    By login_Fb = By.xpath("//*[@type='submit']");

    public void loginFacebook(String email, String password){
        try {
            driver.findElement(email_Fb).sendKeys(email);
            driver.findElement(password_Fb).sendKeys(password);
            driver.findElement(login_Fb).click();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
            String text = driver.findElement(By.xpath("//span[text()='Nabinn Cchetri']")).getText();
            System.out.println(text);
            //Assert.assertEquals(text,"Nabinn Cchetri");



        }catch (Exception e){
            System.out.println("Exception Caught " + e.getMessage());
        }
    }

}