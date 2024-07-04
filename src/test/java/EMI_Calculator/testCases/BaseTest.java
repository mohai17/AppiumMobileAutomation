package EMI_Calculator.testCases;

import EMI_Calculator.screens.BaseScreen;
import EMI_Calculator.screens.Screen;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.net.MalformedURLException;
import java.net.URL;

public class BaseTest {

    AndroidDriver appDriver;
    Screen screen;

    @BeforeClass
    public void launchApp(){

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("udid","R58NB4G0S1J");
        capabilities.setCapability("platformVersion","13");
        capabilities.setCapability("appPackage","com.continuum.emi.calculator");
        capabilities.setCapability("appActivity","com.finance.emicalci.activity.Splash_screnn");
        capabilities.setCapability("platformName","Android");
        capabilities.setCapability("automationName","UiAutomator2");

        try {
            appDriver = new AndroidDriver(new URL("http://localhost:4723/wd/hub"),capabilities);
            screen = new BaseScreen(appDriver);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }


    }


    @AfterClass
    public void tearDown(){
        appDriver.quit();
    }

}
