package EMI_Calculator.testCases;

import EMI_Calculator.common.General;
import EMI_Calculator.screens.HomeScreen;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HomeScreenTest extends BaseTest{

    HomeScreen homeScreen;

    @Test
    public void appNameTest(){

         homeScreen = screen.getInstance(HomeScreen.class);

        Assert.assertEquals(General.APP_NAME,homeScreen.getAppName());

    }

    @Test
    public void emiCalculatorButtonTest(){

        boolean actual = homeScreen.getEMICalculatorButton();
        Assert.assertFalse(actual);
    }

    @Test
    public void compareButtonTest(){
        boolean actual = homeScreen.getCompareButton();
        Assert.assertFalse(actual);
    }

}
