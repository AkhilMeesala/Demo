package TestScript;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchActiveTab {
	// switch to active tab code
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\MU69842\\eclipse-workspace\\Selenium-sample-project\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			
			driver.get("https://www.myntra.com/");	//To open Browser
			driver.manage().window().maximize();	// To maximize the screen
			Thread.sleep(5000);
		
			ArrayList<String> tab = new ArrayList<String>(driver.getWindowHandles());
			// switch to active tab
			driver.switchTo().window(tab.get(1));
			//System.out.println("Page title of active tab: "+driver.getTitle());
			driver.quit();
		}catch(Exception ex) {
			ex.printStackTrace();
		}
	}

}
