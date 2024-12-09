package pim_Selenium4_Automation;

import pages.HomePage;
import pages.Login_Page;
import java.io.IOException;

import org.testng.annotations.Test;

import common_functions.BaseTest;

public class GetPIM_Version extends BaseTest {

	@Test
	public void GetVersion() throws IOException {
		String className = this.getClass().getSimpleName();
		System.out.println(className);
		Login_Page loginPage = new Login_Page(driver);
		loginPage.LogintoPIM();
		HomePage homePage = new HomePage(driver);
		
		utils.waitForElement(homePage.HomePage_SearchButton(), "clickable");
		utils.Takescreenshot();
	}
}
