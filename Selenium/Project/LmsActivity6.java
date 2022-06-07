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

public class LmsActivity6 {
    WebDriver driver6;
    WebDriverWait wait;
     @BeforeMethod
    public void launch(){
         driver6=new FirefoxDriver();
         wait=new WebDriverWait(driver6, Duration.ofSeconds(20));
         driver6.get("https://alchemy.hguy.co/lms");
     }
     @Test
    public void login6() throws InterruptedException{
         WebElement account6=driver6.findElement(By.xpath("//a[contains(text(),'My Account')]"));
         account6.click();
         String title6=driver6.getTitle();
         Assert.assertEquals(title6,"My Account – Alchemy LMS");
         WebElement log6=driver6.findElement(By.xpath("//a[@class='ld-login ld-login ld-login-text ld-login-button ld-button']"));
         log6.click();
         Thread.sleep(3000);
         driver6.findElement(By.xpath("//input[@id='user_login']")).sendKeys("root");
         Thread.sleep(3000);
         driver6.findElement(By.xpath("//input[@id='user_pass']")).sendKeys("pa$$w0rd");
         Thread.sleep(3000);
         driver6.findElement(By.xpath("//input[@id='wp-submit']")).click();
         Thread.sleep(3000);
     }
     @AfterMethod
    public void close6(){
         driver6.quit();
     }
}
