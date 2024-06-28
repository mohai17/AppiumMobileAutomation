package simpleCalculator;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Calculator extends BaseTest {

    @Test
    public void addSucceed(){

        androidDriver.findElement(By.id("btn_7")).click();
        androidDriver.findElement(By.id("plus")).click();
        androidDriver.findElement(By.id("btn_8")).click();
        androidDriver.findElement(By.id("equal")).click();
        String actual = androidDriver.findElement(By.id("formula")).getText().trim();
        String expected = "15";

        Assert.assertEquals(actual,expected);

    }

}
