package activities;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class AppiumGoogleKeep {
    AndroidDriver driver;

    @BeforeClass
    public void gooKeep() throws MalformedURLException {
        UiAutomator2Options options=new UiAutomator2Options();
        options.setDeviceName("Redmi Note 7 Pro");
        options.setPlatformName("android");
        options.setAutomationName("UiAutomator2");
        options.setAppPackage("com.google.android.keep");
        options.setAppActivity(".activities.BrowseActivity");
        options.noReset();

        URL serverurl1= new URL("http://localhost:4723/wd/hub");

        driver = new AndroidDriver(serverurl1, options);
    }

    @Test
    public void keep1() throws InterruptedException {
        driver.findElement(AppiumBy.id("com.google.android.keep:id/new_note_button")).click();
        Thread.sleep(100);
        driver.findElement(AppiumBy.id("com.google.android.keep:id/editable_title")).sendKeys("Google note");
        driver.findElement(AppiumBy.id("com.google.android.keep:id/edit_note_text")).sendKeys("description");
        Thread.sleep(1000);
        String ver=driver.findElement(AppiumBy.id("com.google.android.keep:id/edit_note_text")).getText();
        Thread.sleep(1000);
        driver.findElement(AppiumBy.xpath("//android.widget.ImageButton[@content-desc=\"Open navigation drawer\"]")).click();

        Assert.assertEquals(ver,"description");
    }
    @AfterClass
    public void close2(){
        driver.quit();
    }
}
