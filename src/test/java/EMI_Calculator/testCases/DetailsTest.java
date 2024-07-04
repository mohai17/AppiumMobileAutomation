package EMI_Calculator.testCases;

import EMI_Calculator.screens.Calculator;
import EMI_Calculator.screens.DetailsScreen;
import EMI_Calculator.screens.HomeScreen;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DetailsTest extends BaseTest{

    HomeScreen homeScreen;
    DetailsScreen detailsScreen;

    @Test(priority = 0)
    public void detailsButtonTest(){

        homeScreen = screen.getInstance(HomeScreen.class);
        boolean actual = homeScreen.tapStartButton()
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
