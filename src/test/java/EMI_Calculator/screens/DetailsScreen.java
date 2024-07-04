package EMI_Calculator.screens;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

public class DetailsScreen extends BaseScreen {
    public DetailsScreen(AndroidDriver appDriver) {
        super(appDriver);
    }


    public boolean doesDetailButtonWork(){

        waitForElement(By.id("actionMenuBack"));
        return getAppElements(By.id("detailListView")).isEmpty();

    }

    public Calculator menuBack(){

        getAppElement(By.id("actionMenuBack")).click();
        waitForElement(By.id("btnReset"));

        return getInstance(Calculator.class);

    }


}
