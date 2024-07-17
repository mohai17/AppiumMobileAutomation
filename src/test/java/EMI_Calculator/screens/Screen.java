package EMI_Calculator.screens;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public abstract class Screen {

    public abstract WebElement getAppElement(By locator);
    public abstract List<WebElement> getAppElements(By locator);
    public abstract void waitForElement(By locator);
    public abstract <T extends BaseScreen> T getInstance(Class<T> tClass);

}
