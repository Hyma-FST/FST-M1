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

public class LmsActivity7 {
    WebDriver driver7;
    WebDriverWait wait;

    @BeforeMethod
    public void launch7(){
        driver7=new FirefoxDriver();
        wait=new WebDriverWait(driver7, Duration.ofSeconds(20));
        driver7.get("https://alchemy.hguy.co/lms");
    }

    @Test
    public void test7(){
        WebElement we1=driver7.findElement(By.xpath("//a[contains(text(),'All Courses')]"));
        we1.click();
       int count=0;
       for (int i=0;i>count;i++)
           System.out.println("Total number of links are"+i);

        }
        @AfterMethod
    public void close7()
        {
        driver7.close();
        }
    }

