package EMI_Calculator.screens;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

public class Compare extends BaseScreen{

    public Compare(AndroidDriver appDriver) {
        super(appDriver);
    }

    public Compare fillLoan1Amount(){

        waitForElement(By.id("etLoanAmount1"));
        getAppElement(By.id("etLoanAmount1")).sendKeys("50000");
        return this;
    }

    public Compare fillInterest1(){
        getAppElement(By.id("etInterest1")).sendKeys("7");
        return this;
    }

    public Compare fillMonths1(){
        getAppElement(By.id("etPeriod1")).sendKeys("12");
        return this;
    }


    public Compare fillLoan2Amount(){

        waitForElement(By.id("etLoanAmount2"));
        getAppElement(By.id("etLoanAmount2")).sendKeys("70000");
        return this;
    }

    public Compare fillInterest2(){
        getAppElement(By.id("etInterest2")).sendKeys("3");
        return this;
    }

    public Compare fillMonths2(){
        getAppElement(By.id("etPeriod2")).sendKeys("12");
        return this;
    }

    public Compare tapCalculateButton()
    {
        getAppElement(By.id("btnCalculate")).click();
        return this;
    }

    public boolean isComparisonTableFound(){

        waitForElement(By.id("layoutTable"));
        return getAppElements(By.id("layoutTable")).isEmpty();
    }

    public Compare tapResetButton(){

        waitForElement(By.id("btnReset"));
        getAppElement(By.id("btnReset")).click();
        return this;
    }

    public String doesResetWork(){

        waitForElement(By.id("etLoanAmount1"));
        return getAppElement(By.id("etLoanAmount1")).getText().trim();
    }


}
