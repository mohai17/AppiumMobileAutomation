package simpleCalculator;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.net.MalformedURLException;
import java.net.URL;

public class BaseTest {

    AndroidDriver androidDriver;

    @BeforeClass

    public void setupAppium(){

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("udid", "R58NB4G0S1J");
        capabilities.setCapability("platformVersion", "13");
        capabilities.setCapability("appPackage", "com.bng.calculator");
        capabilities.setCapability("appActivity", "com.bng.calc.MainActivity");
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("automationName", "UiAutomator2");

        try {
            androidDriver = new AndroidDriver(new URL("http://localhost:4723/wd/hub"),capabilities);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }

    }

    @AfterClass
    public void tearDown(){

        androidDriver.quit();

    }


}
