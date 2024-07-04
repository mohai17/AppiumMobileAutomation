package EMI_Calculator.testCases;

import EMI_Calculator.screens.DetailsScreen;
import EMI_Calculator.screens.Calculator;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CalculatorTest extends BaseTest{

    Calculator calculator;
    DetailsScreen detailsScreen;

    @Test(priority = 0)
    public void calculate(){

        calculator = screen.getInstance(Calculator.class);

        boolean actual = calculator.tapStartButton()
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

        boolean actual = calculator.tapResetButton().doesResetWork();

        Assert.assertTrue(actual);

    }


}
