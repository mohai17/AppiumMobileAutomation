package EMI_Calculator.testCases;

import EMI_Calculator.screens.BaseScreen;
import EMI_Calculator.screens.Screen;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import java.io.FileInputStream;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;

public class BaseTest {

    AndroidDriver appDriver;
    Screen screen;
    private final Properties properties;

    public BaseTest(){
        try {
            properties = new Properties();
            String filepath = System.getProperty("user.dir")+"/src/test/resources/emiConfig.properties";
            FileInputStream fileInputStream = new FileInputStream(filepath);
            properties.load(fileInputStream);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    @BeforeClass
    public void launchApp(){

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("udid",properties.getProperty("udid"));
        capabilities.setCapability("platformVersion",properties.getProperty("platformVersion"));
        capabilities.setCapability("appPackage",properties.getProperty("appPackage"));
        capabilities.setCapability("appActivity",properties.getProperty("appActivity"));
        capabilities.setCapability("platformName",properties.getProperty("platformName"));
        capabilities.setCapability("automationName",properties.getProperty("automationName"));

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
