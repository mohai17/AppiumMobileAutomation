package EMI_Calculator.screens;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

public class Calculator extends BaseScreen{

    public Calculator(AndroidDriver appDriver) {
        super(appDriver);
    }


    public Calculator fillAmount(String loanAmount){

        addInfo("Loan amount Field");
        waitForElement(By.id("etLoanAmount"));
        getAppElement(By.id("etLoanAmount")).clear();
        getAppElement(By.id("etLoanAmount")).sendKeys(loanAmount);
        getAppElement(By.id("rbLoanAmount")).click();

        return this;

    }

    public Calculator fillInterest(String interest){

        addInfo("Interest field.");
        waitForElement(By.id("etInterest"));
        getAppElement(By.id("etInterest")).clear();
        getAppElement(By.id("etInterest")).sendKeys(interest);
        getAppElement(By.id("rbInterest")).click();

        return this;

    }

    public Calculator fillPeriod(String years, String months){

        addInfo("Period Field");
        waitForElement(By.id("etYears"));
        getAppElement(By.id("etYears")).clear();
        getAppElement(By.id("etYears")).sendKeys(years);
        waitForElement(By.id("etMonths"));
        getAppElement(By.id("etMonths")).clear();
        getAppElement(By.id("etMonths")).sendKeys(months);
        getAppElement(By.id("rbPeriod")).click();

        return this;

    }

    public Calculator fillEMI(String emi){

        addInfo("EMI field.");
        waitForElement(By.id("etEMI"));
        getAppElement(By.id("etEMI")).clear();
        getAppElement(By.id("etEMI")).sendKeys(emi);
        getAppElement(By.id("rbEMI")).click();

        return this;

    }

    public Calculator fillProgressFee(String fee){

        addInfo("Progress Fee field.");
        waitForElement(By.id("etFee"));
        getAppElement(By.id("etFee")).clear();
        getAppElement(By.id("etFee")).sendKeys(fee);

        return this;

    }

    public Calculator tapCalculateButton(){

        waitForElement(By.id("btnCalculate"));
        getAppElement(By.id("btnCalculate")).click();
        return this;
    }

    public boolean hasDetailTable(){

        waitForElement(By.id("layoutTable"));
        return getAppElements(By.id("layoutTable")).isEmpty();
    }

    public Calculator tapResetButton(){

        waitForElement(By.id("btnReset"));
        getAppElement(By.id("btnReset")).click();
        return this;

    }

    public boolean doesResetWork(){

        waitForElement(By.id("etLoanAmount"));
        return getAppElement(By.id("etLoanAmount")).getText().isBlank();

    }

    public DetailsScreen tapDetailButton(){

        waitForElement(By.id("btnDetail"));
        getAppElement(By.id("btnDetail")).click();

        return getInstance(DetailsScreen.class);

    }

    public boolean isDetailButtonFound(){

        waitForElement(By.id("btnDetail"));
        return getAppElements(By.id("btnDetail")).isEmpty();

    }


}
