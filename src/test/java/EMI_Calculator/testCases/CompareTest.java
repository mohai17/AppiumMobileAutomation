package EMI_Calculator.testCases;

import EMI_Calculator.screens.Compare;
import EMI_Calculator.screens.HomeScreen;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CompareTest extends BaseTest{

    HomeScreen homeScreen;
    Compare compare;

    @Test
    public void comparisonTestSucceed(){

        homeScreen = screen.getInstance(HomeScreen.class);

        boolean actual = homeScreen.tapCompareButton()
                .fillLoan1Amount()
                .fillLoan2Amount()
                .fillInterest1()
                .fillInterest2()
                .fillMonths1()
                .fillMonths2()
                .tapCalculateButton()
                .isComparisonTableFound();

        Assert.assertFalse(actual);

    }

    @Test(priority = 1)

    public void resetButtonTest(){

        compare = screen.getInstance(Compare.class);

        String actual = compare.tapResetButton().doesResetWork();
        Assert.assertEquals(actual,"Loan 1 amount");

    }

}
