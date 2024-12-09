package pim_Selenium4_Automation;

import pages.HomePage;
import pages.Login_Page;
import java.io.IOException;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import common_functions.BaseTest;

public class TC_01_Test1 extends BaseTest {
	@Test
	public void GetVersion() throws IOException, InterruptedException {
		String className = this.getClass().getSimpleName();
		System.out.println(className);
		homePage = new HomePage(driver);
		utils.waitForElement(homePage.HomePage_SearchButton(), "clickable");
		utils.Takescreenshot();
		homePage.AppHeader_Administrator().click();
		Thread.sleep(1000);
		homePage.Version_manager().click();
		utils.Takescreenshot();
		utils.waitForElement(homePage.Version_manager_info_dialog(), "visible");
		utils.Takescreenshot();
		String App_version = homePage.Version_manager_version_number().getText();
		System.out.println("App version is " + App_version);
		homePage.Version_manager_Close_btn().click();
		utils.Takescreenshot();
	}

	@Test
	public void click_Tabs_Home_Screen() throws InterruptedException, IOException {
		utils.waitForElement(homePage.HomePage_SearchButton(), "clickable");
		utils.Takescreenshot();
		homePage = new HomePage(driver);
		String tabname = "Marketing Enrichment";
		homePage.SelectTab_ByName_ToDos_Tab(tabname);
		utils.Takescreenshot();
		Thread.sleep(5000);
	}
}
