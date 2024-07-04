package EMI_Calculator.testCases;

import EMI_Calculator.screens.Calculator;
import EMI_Calculator.screens.DetailsScreen;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DetailsTest extends BaseTest{

    Calculator calculator;
    DetailsScreen detailsScreen;

    @Test(priority = 0)
    public void detailsButtonTest(){

        calculator = screen.getInstance(Calculator.class);
        boolean actual = calculator.tapStartButton()
                        .fillAmount()
                        .fillInterest()
                        .fillPeriod()
                        .fillEMI()
                        .fillProgressFee()
                        .tapCalculateButton()
                        .tapDetailButton()
                        .doesDetailButtonWork();

        Assert.assertFalse(actual);

    }

    @Test(priority = 1)
    public void backFromDetailShouldSucceed(){

        detailsScreen = screen.getInstance(DetailsScreen.class);
        boolean actual = detailsScreen.menuBack().isDetailButtonFound();

        Assert.assertFalse(actual);

    }


}
