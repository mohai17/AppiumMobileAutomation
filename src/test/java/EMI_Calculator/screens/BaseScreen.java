package EMI_Calculator.screens;

import EMI_Calculator.common.General;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.lang.reflect.InvocationTargetException;
import java.time.Duration;
import java.util.List;

public class BaseScreen extends Screen{

    AndroidDriver appDriver;
    WebDriverWait wait;

    public BaseScreen(AndroidDriver appDriver){
        this.appDriver = appDriver;
        this.wait = new WebDriverWait(appDriver, Duration.ofSeconds(General.WAIT_TIME));
    }


    @Override
    public WebElement getAppElement(By locator) {
        return appDriver.findElement(locator);
    }

    @Override
    public List<WebElement> getAppElements(By locator) {
        return appDriver.findElements(locator);
    }

    @Override
    public void waitForElement(By locator) {
        wait.until(ExpectedConditions.presenceOfElementLocated(locator));
    }

    @Override
    public <T extends BaseScreen> T getInstance(Class<T> tClass) {
        try {
            return tClass.getDeclaredConstructor(AndroidDriver.class).newInstance(appDriver);
        } catch (InstantiationException | IllegalAccessException | InvocationTargetException | NoSuchMethodException e) {
            throw new RuntimeException(e);
        }
    }
}
