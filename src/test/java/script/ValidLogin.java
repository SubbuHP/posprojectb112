package script;

import org.testng.Assert;
import org.testng.annotations.Test;

import generic.BaseTest;
import page.HomePage;
import page.LoginPage;

public class ValidLogin extends BaseTest {
	
@Test(priority=1)
public void testValidLogin()
{
	//1:enter valid un
	test.info("Enter Valid Username");
	LoginPage loginPage = new LoginPage(driver);
	loginPage.setUserName("admin");
	
	//2:enter valid pw
	test.info("Enter Valid Password");
	loginPage.setPassword("pointofsale");
	
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
