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

public class LmsActivity9 {
    WebDriver driver9;
    WebDriverWait wait;

    @BeforeMethod
    public void launch9(){
        driver9=new FirefoxDriver();
        wait=new WebDriverWait(driver9,Duration.ofSeconds(20));
        driver9.get("https://alchemy.hguy.co/lms/");
    }
    @Test
    public void test9() throws InterruptedException{
        driver9.findElement(By.xpath("//a[contains(text(),'All Courses')]")).click();
        driver9.findElement(By.xpath("(//a[@class='btn btn-primary'])[1]")).click();
        Thread.sleep(3000);
        driver9.findElement(By.xpath("(//span[@class='ld-text ld-primary-color'])[1]")).click();
        Thread.sleep(3000);
        WebElement loc9 =driver9.findElement(By.xpath("//div[@id='ld-table-list-item-175']"));
        String text9=loc9.getText();
        Assert.assertEquals(text9,"This is the First Topic");
        Thread.sleep(3000);
        System.out.println(text9);
        System.out.print("Radio button is disabled so skipping enable step and unable to mark it as completed");
    }
    @AfterMethod
    public void close9(){
        driver9.close();
    }
}
