package TestScript;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Facebook {

	public static void main(String[] args) {
		try {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\MU69842\\eclipse-workspace\\Selenium-sample-project\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver .get("https://www.facebook.com/login/");	//to open Browser
		driver.manage().window().maximize();	// To maximize the screen
		Thread.sleep(5000);
		
		WebElement Email = driver.findElement(By.xpath("//input[@class='inputtext _55r1 inputtext _1kbt inputtext _1kbt']"));
		Email.sendKeys("bezavadadivyasri@gmail.com");
		Thread.sleep(2000);
		
		WebElement password = driver.findElement(By.xpath("//input[@class='inputtext _55r1 inputtext _9npi inputtext _9npi']"));
		password.sendKeys("loveuamma");
		Thread.sleep(2000);
		
		WebElement Login = driver.findElement(By.xpath("//button[@class='_42ft _4jy0 _52e0 _4jy6 _4jy1 selected _51sy']"));
		Login.click();
		Thread.sleep(4000);
		
		WebElement Search = driver.findElement(By.xpath("(//input[@dir='ltr'][1])[1]"));
		Actions action = new Actions(driver);
		action.click(Search).build().perform();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
		Search.sendKeys("vinay reyy");
		Thread.sleep(5000);
		//Search.click();
		//Thread.sleep(5000);
		//driver.quit();
		
		}catch(Exception ex) {
			ex.printStackTrace();
		}
	}
}
