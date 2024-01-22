package Objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GoogleSearch {

    WebDriver driver;

    public GoogleSearch(WebDriver driver) {

        this.driver = driver;
    }

    By searchBox = By.xpath("//*[@name='q']");
    By Search_btn = By.xpath("(//input[@aria-label='Google Search'])[1]");
    By Facebook_link = By.xpath(" //h3[text()='Facebook - log in or sign up']");


    public void searchGoogle(String searchinput) {
        try {
            driver.findElement(searchBox).sendKeys(searchinput);
            driver.findElement(Search_btn).click();
            Thread.sleep(5000);

        } catch (Exception e) {
            System.out.println("Exception Caught" + e.getMessage());
        }


    }
    public void clickFacebook(){
        try {
            driver.findElement(Facebook_link).click();
            Thread.sleep(5000);
        } catch (Exception e) {
            System.out.println("Exception Caught" + e.getMessage());
        }

    }

}
