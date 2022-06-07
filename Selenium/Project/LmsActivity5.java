package activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class LmsActivity5 {
    WebDriver driver5;
    WebDriverWait wait;

    @BeforeMethod
    public void launch5(){
        driver5=new FirefoxDriver();
        wait=new WebDriverWait(driver5, Duration.ofSeconds(20));
        driver5.get("https://alchemy.hguy.co/lms");
    }

    @Test
    public void account5(){
        WebElement loc5=driver5.findElement(By.xpath("//a[contains(text(),'My Account')]"));
        loc5.click();
        String title5=driver5.getTitle();
        System.out.println(title5);
    }
    @AfterMethod
    public void close5(){
        driver5.quit();
    }
}
