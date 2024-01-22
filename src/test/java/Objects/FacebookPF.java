package Objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import java.time.Duration;

public class FacebookPF {

    WebDriver driver;

    public FacebookPF(WebDriver driver)
    {
        this.driver = driver ;
        PageFactory.initElements(driver,this);
    }
    @FindBy(xpath = "//*[@name='email']")
    WebElement phone;
    @FindBy(xpath = "//*[@name='pass']")
    WebElement pass;
    @FindBy(xpath = "//*[@type='submit']")
    WebElement login_btn;

    public void loginFacebook(String email, String password){
        try {
            phone.sendKeys(email);
            pass.sendKeys(password);
            login_btn.click();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
            String text = driver.findElement(By.xpath("//span[text()='Nabinn Cchetri']")).getText();
            System.out.println(text);
            //Assert.assertEquals(text,"Nabinn Cchetri");



        }catch (Exception e){
            System.out.println("Exception Caught " + e.getMessage());
        }
    }
}
