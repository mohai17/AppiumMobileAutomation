package EMI_Calculator.testCases;

import EMI_Calculator.screens.Calculator;
import EMI_Calculator.screens.HomeScreen;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CalculatorTest extends BaseTest{

    HomeScreen homeScreen;
    Calculator calculator;

    @Test(priority = 0)
    public void calculate(){

        homeScreen = screen.getInstance(HomeScreen.class);

        boolean actual = homeScreen.tapStartButton()
                         .fillAmount()
                         .fillInterest()
                         .fillPeriod()
                         .fillEMI()
                         .fillProgressFee()
                         .tapCalculateButton()
                         .hasDetailTable();

        Assert.assertFalse(actual);

    }

    @Test(priority = 1 )
    public void resetButtonTest(){

        calculator = screen.getInstance(Calculator.class);
        boolean actual = calculator.tapResetButton().doesResetWork();

        Assert.assertTrue(actual);

    }


}
