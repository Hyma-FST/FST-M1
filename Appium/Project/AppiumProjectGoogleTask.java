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


public class AppiumProjectGoogleTask {

    AndroidDriver driver;

    @BeforeClass
    public void task() throws MalformedURLException {
        UiAutomator2Options options = new UiAutomator2Options();
        options.setDeviceName("Redmi Note 7 Pro");
        options.setPlatformName("android");
        options.setAutomationName("UiAutomator2");
        options.setAppPackage("com.google.android.apps.tasks");
        options.setAppActivity(".ui.TaskListsActivity");
        options.noReset();

        URL serverurl= new URL("http://localhost:4723/wd/hub");

        driver = new AndroidDriver(serverurl, options);
    }
    @Test
    public void task1() throws InterruptedException {
        driver.findElement(AppiumBy.id("com.google.android.apps.tasks:id/tasks_fab")).click();
        Thread.sleep(1000);
        driver.findElement(AppiumBy.id("com.google.android.apps.tasks:id/add_task_title")).sendKeys("Complete Activity with Google Tasks");
        Thread.sleep(1000);
        String assert1=driver.findElement(AppiumBy.id("com.google.android.apps.tasks:id/add_task_title")).getText();
        Thread.sleep(1000);
        driver.findElement(AppiumBy.id("com.google.android.apps.tasks:id/add_task_done")).click();
        Thread.sleep(3000);
        driver.findElement(AppiumBy.id("com.google.android.apps.tasks:id/tasks_fab")).click();
        Thread.sleep(1000);
        driver.findElement(AppiumBy.id("com.google.android.apps.tasks:id/add_task_title")).sendKeys("Complete Activity with Google Keep");
        Thread.sleep(1000);
        String assert2=driver.findElement(AppiumBy.id("com.google.android.apps.tasks:id/add_task_title")).getText();
        Thread.sleep(1000);
        driver.findElement(AppiumBy.id("com.google.android.apps.tasks:id/add_task_done")).click();
        Thread.sleep(3000);
        driver.findElement(AppiumBy.id("com.google.android.apps.tasks:id/tasks_fab")).click();
        Thread.sleep(1000);

        driver.findElement(AppiumBy.id("com.google.android.apps.tasks:id/add_task_title")).sendKeys("Complete the second Activity Google Keep");
        Thread.sleep(1000);
        String assert3=driver.findElement(AppiumBy.id("com.google.android.apps.tasks:id/add_task_title")).getText();
        Thread.sleep(1000);
        driver.findElement(AppiumBy.id("com.google.android.apps.tasks:id/add_task_done")).click();


        Assert.assertEquals(assert1,"Complete Activity with Google Tasks");
        Assert.assertEquals(assert2,"Complete Activity with Google Keep");
        Assert.assertEquals(assert3,"Complete the second Activity Google Keep");

    }

    @AfterClass
    public void task1close(){
        driver.quit();
    }
}
