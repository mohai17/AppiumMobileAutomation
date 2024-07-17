package EMI_Calculator.testCases;


import EMI_Calculator.screens.DetailsScreen;
import EMI_Calculator.screens.HomeScreen;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DetailsTest extends BaseTest{

    HomeScreen homeScreen;
    DetailsScreen detailsScreen;

    @Test
    public void detailsButtonTest(){

        homeScreen = screen.getInstance(HomeScreen.class);
        boolean actual = homeScreen.tapStartButton()
                        .fillAmount("1000")
                        .fillInterest("4")
                        .fillPeriod("5","6")
                        .fillEMI("6")
                        .fillProgressFee("7")
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
