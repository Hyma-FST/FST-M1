package activities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.time.Duration;

public class LmsActivity1 {
    WebDriver driver;
    WebDriverWait wait;
   @BeforeMethod
   public void launch(){
       driver=new FirefoxDriver();
       wait=new WebDriverWait(driver, Duration.ofSeconds(20));
       driver.get("https://alchemy.hguy.co/lms");
   }

        @Test
        public void title(){
           String title=driver.getTitle();
            Assert.assertEquals(title,"Alchemy LMS – An LMS Application");
        }

        @AfterMethod
        public void close(){
           driver.quit();

        }



}
