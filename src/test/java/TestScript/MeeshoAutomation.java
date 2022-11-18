package TestScript;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MeeshoAutomation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\MU69842\\eclipse-workspace\\Selenium-sample-project\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			
			driver.get("https://www.meesho.com/");	//To open Browser
			driver.manage().window().maximize();	// To maximize the screen
			Thread.sleep(5000);
			
			//WebElement 
			
			driver.quit();
		}catch(Exception ex) {
			ex.printStackTrace();
		}
	}

}
