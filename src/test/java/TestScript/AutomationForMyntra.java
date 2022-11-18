package TestScript;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class AutomationForMyntra {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\MU69842\\eclipse-workspace\\Selenium-sample-project\\chromedriver.exe");
			
			WebDriver driver = new ChromeDriver();
			
			driver.get("https://www.myntra.com/");	//To open Browser
			driver.manage().window().maximize();	// To maximize the screen
			Thread.sleep(5000);
			
			WebElement Men = driver.findElement(By.xpath("(//div[@class='desktop-navLinks']/div)[1]"));
			WebElement PhoneCase = driver.findElement(By.xpath("(((//div[@class='desktop-backdropStyle'])[1]/div/div/li)[5]/ul/li)[11]/a"));
			Actions action = new Actions(driver);
			
			action.moveToElement(Men);
			Thread.sleep(5000);
			ArrayList<String> tab = new ArrayList<String>(driver.getWindowHandles());
			// switch to active tab
			driver.switchTo().window(tab.get(1));
			action.click(PhoneCase).build().perform();
			Thread.sleep(5000);
			
			WebElement Case = driver.findElement(By.xpath("(//div[@class='product-imageSliderContainer'])[11]/div/div/div/picture/img"));
			Case.click();
			Thread.sleep(8000);
			driver.quit();
		}catch(Exception ex) {
			ex.printStackTrace();
		}
	}

}