package activities;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class LmsActivity8 {
    WebDriver driver8;
    WebDriverWait wait;

    @BeforeMethod
    public void launch8(){
        driver8=new FirefoxDriver();
        wait=new WebDriverWait(driver8, Duration.ofSeconds(20));
        driver8.get("https://alchemy.hguy.co/lms");
    }

    @Test
    public void test8(){
        driver8.findElement(By.xpath("//a[contains(text(),'Contact')]")).click();
        driver8.findElement(By.xpath("//input[@id='wpforms-8-field_0']")).sendKeys("LMSactivity8");
        driver8.findElement(By.xpath("//input[@id='wpforms-8-field_1']")).sendKeys("lms@gmail.com");
        driver8.findElement(By.xpath("//textarea[@id='wpforms-8-field_2']")).sendKeys("test123");
        driver8.findElement(By.xpath("//button[@id='wpforms-submit-8']")).click();
        WebElement loc8=driver8.findElement(By.xpath("//p[contains(text(),'Thanks for contacting us! We will be in touch with you shortly')]"));
        System.out.print(loc8);

    }

    @AfterMethod
    public void close8(){
        driver8.close();
    }

}
