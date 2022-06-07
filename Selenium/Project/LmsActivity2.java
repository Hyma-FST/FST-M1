package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class LmsActivity2 {
    WebDriver driver;
    WebDriverWait wait;
    @BeforeMethod
    public void launch2(){
        driver=new FirefoxDriver();
        wait=new WebDriverWait(driver, Duration.ofSeconds(20));
        driver.get("https://alchemy.hguy.co/lms/");
    }
    @Test
    public void heading(){
       WebElement loc =driver.findElement(By.xpath("//h1[@class='uagb-ifb-title']"));
       System.out.println(loc);
       String text=loc.getText();
       Assert.assertEquals(text,"Learn from Industry Experts");
    }
    @AfterMethod
    public void close2(){
        driver.quit();
    }
}
