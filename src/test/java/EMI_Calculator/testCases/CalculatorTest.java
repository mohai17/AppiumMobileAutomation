package EMI_Calculator.testCases;

import EMI_Calculator.common.General;
import EMI_Calculator.screens.Calculator;
import EMI_Calculator.screens.HomeScreen;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CalculatorTest extends BaseTest{

    HomeScreen homeScreen;
    Calculator calculator;


    @DataProvider
    public Object[][] getDataProvider(){
        return General.getData("Sheet1");
    }

    @Test
    public void calculateShouldSucceed(){
        homeScreen = screen.getInstance(HomeScreen.class);

        boolean actual = homeScreen.tapStartButton()
                .fillAmount("4000")
                .fillInterest("4.6")
                .fillPeriod("5","6")
                .fillEMI("5")
                .fillProgressFee("3.4")
                .tapCalculateButton()
                .hasDetailTable();

        Assert.assertFalse(actual);
    }


    @Test(priority = 1, dataProvider = "getDataProvider")
    public void calculate(String... args){

        calculator = screen.getInstance(Calculator.class);

        boolean actual = calculator.fillAmount(args[0])
                         .fillInterest(args[1])
                         .fillPeriod(args[2],args[3].replaceAll(".0",""))
                         .fillEMI(args[4])
                         .fillProgressFee(args[5])
                         .tapCalculateButton()
                         .hasDetailTable();

        Assert.assertFalse(actual);

    }

    @Test(priority = 2 )
    public void resetButtonTest(){

        calculator = screen.getInstance(Calculator.class);
        boolean actual = calculator.tapResetButton().doesResetWork();

        Assert.assertTrue(actual);

    }


}
