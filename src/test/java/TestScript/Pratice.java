package TestScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Pratice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("Webdriver.chrome.driver", "C:\\Users\\MU69842\\eclipse-workspace\\Selenium-sample-project\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();		
		driver.get("https://www.nopcommerce.com/en");
		driver.manage().window().maximize();
		
		WebElement user = driver.findElement(By.xpath("(//span[@class='navigation-top-menu-label navigation-top-menu-label-arrow'])[6]"));
		
		WebElement Register = driver.findElement(By.xpath("(//li[@class='navigation-top-menu-item']/a)[38]"));
		
		Actions action = new Actions(driver);
		
		action.moveToElement(user);
		action.click(Register).build().perform();
		
		
	}

}
