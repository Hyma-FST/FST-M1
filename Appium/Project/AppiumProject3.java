package activities;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.List;

public class AppiumProject3 {
    AndroidDriver driver;
    WebDriverWait wait;

    @BeforeClass
    public void chrome() throws MalformedURLException {
        UiAutomator2Options options = new UiAutomator2Options();
        options.setDeviceName("Redmi Note 7 Pro");
        options.setPlatformName("android");
        options.setAutomationName("UiAutomator2");
        options.setAppPackage("com.android.chrome");
        options.setAppActivity("com.google.android.apps.chrome.Main");
        options.noReset();
        URL serverurl2 = new URL("http://localhost:4723/wd/hub");


        driver = new AndroidDriver(serverurl2, options);
        wait=new WebDriverWait(driver,Duration.ofSeconds(10));
    }

    @Test
    public void projectActivity3() {
        driver.get("https://www.training-support.net/selenium");
        driver.findElement(AppiumBy.id("com.android.chrome:id/search_box_text")).click();
        driver.findElement(MobileBy.AndroidUIAutomator("UiScrollable(new UiSelector()).scrollMethod()"));
        List<WebElement> we = driver.findElements(By.id(""));
        we.get(14).click();
        System.out.println(we.get(14).getText());
        driver.findElement(AppiumBy.id("")).click();
        driver.findElement(AppiumBy.id("taskInput")).click();
        driver.findElement(AppiumBy.id("taskInput")).sendKeys("task1");
        driver.findElement(AppiumBy.className("android.widget.Button")).click();
        driver.findElement(AppiumBy.id("")).click();
        driver.findElement(AppiumBy.id("taskInput")).click();
        driver.findElement(AppiumBy.id("taskInput")).sendKeys("task2");
        driver.findElement(AppiumBy.className("android.widget.Button")).click();


    }

    @AfterClass
    public void close3() {
        driver.close();
    }
}
