package EMI_Calculator.screens;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

public class HomeScreen  extends BaseScreen{

    public HomeScreen(AndroidDriver appDriver){
        super(appDriver);
    }

    public String getAppName(){

        addInfo("AppName is finding");
        waitForElement(By.id("appName"));
        return getAppElement(By.id("appName")).getText().trim();

    }

    public boolean getEMICalculatorButton(){

        addInfo("Start Button is finding");
        waitForElement(By.id("btnStart"));
        return getAppElements(By.id("btnStart")).isEmpty();

    }

    public boolean getCompareButton(){

        addInfo("Compare button is finding.");
        waitForElement(By.id("btnCompare"));
        return getAppElements(By.id("btnCompare")).isEmpty();
    }

    public Calculator tapStartButton(){

        addInfo("Start Button is tapping.");
        waitForElement(By.id("btnStart"));
        getAppElement(By.id("btnStart")).click();

        return getInstance(Calculator.class);

    }

    public Compare tapCompareButton(){

        addInfo("Compare Button is tapping.");
        waitForElement(By.id("btnCompare"));
        getAppElement(By.id("btnCompare")).click();
        return getInstance(Compare.class);

    }

}
