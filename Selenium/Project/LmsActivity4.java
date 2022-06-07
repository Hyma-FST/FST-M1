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

public class LmsActivity4 {
 WebDriver driver4;
 WebDriverWait wait;

 @BeforeMethod
    public void launch4(){
     driver4=new FirefoxDriver();
     wait=new WebDriverWait(driver4, Duration.ofSeconds(20));
     driver4.get("https://alchemy.hguy.co/lms/");
 }
 @Test
    public void title4(){
     WebElement loc4=driver4.findElement(By.xpath("//h3[contains(text(),'Email Marketing Strategies')]"));
     String text4=loc4.getText();
     System.out.println("test pass");
     Assert.assertEquals(text4,"Email Marketing Strategies");
 }
 @AfterMethod
    public void close4(){
     driver4.quit();
 }
}
