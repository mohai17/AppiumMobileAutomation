package EMI_Calculator.screens;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;

public class Calculator extends BaseScreen{

    public Calculator(AndroidDriver appDriver) {
        super(appDriver);
    }

    public Calculator tapStartButton(){

        waitForElement(By.id("btnStart"));
        getAppElement(By.id("btnStart")).click();

        return this;

    }

    public Calculator fillAmount(){

        waitForElement(By.id("etLoanAmount"));
        getAppElement(By.id("etLoanAmount")).sendKeys("500");
        getAppElement(By.id("rbLoanAmount")).click();

        return this;

    }

    public Calculator fillInterest(){

        waitForElement(By.id("etInterest"));
        getAppElement(By.id("etInterest")).sendKeys("5");
        getAppElement(By.id("rbInterest")).click();

        return this;

    }

    public Calculator fillPeriod(){

        waitForElement(By.id("etYears"));
        getAppElement(By.id("etYears")).sendKeys("10");
        getAppElement(By.id("etMonths")).sendKeys("6");
        getAppElement(By.id("rbPeriod")).click();

        return this;

    }

    public Calculator fillEMI(){

        waitForElement(By.id("etEMI"));
        getAppElement(By.id("etEMI")).sendKeys("8");
        getAppElement(By.id("rbEMI")).click();

        return this;

    }

    public Calculator fillProgressFee(){

        waitForElement(By.id("etFee"));
        getAppElement(By.id("etFee")).sendKeys("3");

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
