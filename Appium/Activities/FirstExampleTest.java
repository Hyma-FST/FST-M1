package examples;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.springframework.objenesis.instantiator.android.Android10Instantiator;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;


public class FirstExampleTest {
    //Driver Declaration

    AndroidDriver driver;

    //Setup method
    @BeforeClass
    public void setup() throws MalformedURLException {
        UiAutomator2Options options= new UiAutomator2Options();
        options.setDeviceName("Redmi Note 7 Pro");
        options.setPlatformName("android");
        options.setAutomationName("UiAutomator2");
        options.setAppPackage("com.miui.calculator");
        options.setAppActivity(".cal.CalculatorActivity");
        options.noReset();

        //server address
        URL serverURl = new URL("http://localhost:4723/wd/hub");

        //Driver initilization

        driver = new AndroidDriver(serverURl,options);
    }

    //Test method
    @Test
    public void additionTest(){
        driver.findElement(AppiumBy.id("com.miui.calculator:id/btn_9_s")).click();
        driver.findElement(AppiumBy.id("com.miui.calculator:id/btn_plus_s")).click();
        driver.findElement(AppiumBy.id("com.miui.calculator:id/btn_1_s")).click();
        driver.findElement(AppiumBy.id("com.miui.calculator:id/btn_equal_s")).click();
        String result=driver.findElement(AppiumBy.id("com.miui.calculator:id/result")).getText();

        //Assertions
        Assert.assertEquals(result,"= 10");
    }

    //tear Down method
    @AfterClass
    public void tearDown(){
        //close the app
        driver.quit();
    }
}
