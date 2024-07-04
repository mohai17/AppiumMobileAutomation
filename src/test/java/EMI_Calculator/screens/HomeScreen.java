package EMI_Calculator.screens;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

public class HomeScreen  extends BaseScreen{

    public HomeScreen(AndroidDriver appDriver){
        super(appDriver);
    }

    public String getAppName(){

        waitForElement(By.id("appName"));
        return getAppElement(By.id("appName")).getText().trim();

    }

    public boolean getEMICalculatorButton(){

        waitForElement(By.id("btnStart"));
        return getAppElements(By.id("btnStart")).isEmpty();

    }

    public boolean getCompareButton(){

        waitForElement(By.id("btnCompare"));
        return getAppElements(By.id("btnCompare")).isEmpty();
    }

    public Calculator tapStartButton(){

        waitForElement(By.id("btnStart"));
        getAppElement(By.id("btnStart")).click();

        return getInstance(Calculator.class);

    }

    public Compare tapCompareButton(){

        waitForElement(By.id("btnCompare"));
        getAppElement(By.id("btnCompare")).click();
        return getInstance(Compare.class);

    }

}
