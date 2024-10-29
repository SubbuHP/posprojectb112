package script;

import org.testng.Assert;
import org.testng.annotations.Test;

import generic.BaseTest;
import generic.Utility;
import page.HomePage;
import page.LoginPage;

public class ValidLogin extends BaseTest {
	
@Test(priority=1)
public void testValidLogin()
{
	//Get Test Data
	String un=Utility.getXLCellData(XL_PATH, "ValidLogin", 1, 0);
	String pw=Utility.getXLCellData(XL_PATH, "ValidLogin", 1, 1);
	
	
	//1:enter valid un
	test.info("Enter Valid Username:"+un);
	LoginPage loginPage = new LoginPage(driver);
	loginPage.setUserName(un);
	
	//2:enter valid pw
	test.info("Enter Valid Password:"+pw);
	loginPage.setPassword(pw);
	
	//3:click on login
	test.info("Click on Go Button");
	loginPage.clickGoButton();

	//4:Home page should be displayed
	test.info("Home Page should be displayed");
    HomePage homePage=new HomePage(driver);
    boolean result =homePage.verifyHomePageIsDisplayed(wait);
    Assert.assertTrue(result);

}

}
