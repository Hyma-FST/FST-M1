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

public class LmsActivity3 {
    WebDriver driver;
    WebDriverWait wait;

    @BeforeMethod
    public void launch3(){
        driver=new FirefoxDriver();
        wait=new WebDriverWait(driver, Duration.ofSeconds(20));
        driver.get("https://alchemy.hguy.co/lms");
    }
    @Test
    public void titleInfo(){
        WebElement loc3=driver.findElement(By.xpath("//h3[contains(text(),'Actionable Training')]"));
        String title3=loc3.getText();
        System.out.println(title3);
        Assert.assertEquals(title3,"Actionable Training");


    }
    @AfterMethod
    public void close3(){
        driver.quit();
    }

}
