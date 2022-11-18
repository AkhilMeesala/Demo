package TestScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class NavigationAutomation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\MU69842\\eclipse-workspace\\Selenium-sample-project\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.google.com/");	//to open Browser
		driver.manage().window().maximize();	// To maximize the screen
		Thread.sleep(5000);
		
		WebElement Search = driver.findElement(By.xpath("//input[@class='gLFyf gsfi']"));
		WebElement GoogleSearch = driver.findElement(By.xpath("(//input[@class='gNO89b'])[2]"));
		Search.sendKeys("Todays date");
		Thread.sleep(3000);
		
		Actions action = new Actions(driver);
		
		action.click(GoogleSearch).build().perform();
		Thread.sleep(3000);
		
		driver.navigate().back();	
		Thread.sleep(5000);
		driver.navigate().forward();
		Thread.sleep(5000);
		
		driver.quit();
		}catch(Exception ex) {
			ex.printStackTrace();
		}
	}

}
