package TestScript;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class FirstAutomation {
	//For nopcommerce website 
	
	public static void main(String[] args) {
		try {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\MU69842\\eclipse-workspace\\Selenium-sample-project\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.nopcommerce.com/en");	//to open Browser
		driver.manage().window().maximize();	// To maximize the screen
		Thread.sleep(5000);
		
		WebElement Usericon = driver.findElement(By.xpath("//ul[@class='navigation-top-menu navigation-top-menu-user-actions']/li[3]"));
		WebElement Register = driver.findElement(By.xpath("(//ul[@class='navigation-top-menu-sublist'])[6]/li[2]"));
		Actions action = new Actions(driver);
		
		action.moveToElement(Usericon);
		Thread.sleep(5000);
		action.click(Register).build().perform();
		Thread.sleep(5000);
		
		WebElement FirstName = driver.findElement(By.xpath("//input[@id='FirstName']"));
		WebElement LastName = driver.findElement(By.xpath("//input[@id='LastName']"));
		WebElement Email = driver.findElement(By.xpath("//input[@id='Email']"));
		WebElement ConfirmEmail = driver.findElement(By.xpath("//input[@id='ConfirmEmail']"));
		WebElement Username = driver.findElement(By.xpath("//input[@id='Username']"));
		WebElement check_availability_button = driver.findElement(By.xpath("//input[@id='check-availability-button']"));
		
		WebElement TimeZoneId = driver.findElement(By.xpath("//select[@id='TimeZoneId']"));
		WebElement CheckBox = driver.findElement(By.xpath("//label[@for='Newsletter']"));
		WebElement Password = driver.findElement(By.xpath("//input[@id='Password']"));
		WebElement ConfirmPassword = driver.findElement(By.xpath("//input[@id='ConfirmPassword']"));
		WebElement Details_CompanyIndustryId = driver.findElement(By.xpath("//select[@id='Details_CompanyIndustryId']"));
		WebElement register_button = driver.findElement(By.xpath("//input[@id='register-button']"));
		//WebElement LogIn = driver.findElement(By.tagName("Log in"));
		
		FirstName.sendKeys("MyFirstName");
		Thread.sleep(2000);
		LastName.sendKeys("MyLastName");
		Thread.sleep(2000);
		Email.sendKeys("myemailid007@gmail.com");
		Thread.sleep(2000);
		ConfirmEmail.sendKeys("myemailid007@gmail.com");
		Thread.sleep(2000);
		Username.sendKeys("MyUserName003");
		Thread.sleep(2000);
		check_availability_button.click();
		Thread.sleep(3000);
		Select CountryId = new Select(driver.findElement(By.xpath("//select[@id='CountryId']")));
		CountryId.selectByVisibleText("India");
		Thread.sleep(3000);
		TimeZoneId.sendKeys("(UTC+05:30) Chennai, Kolkata, Mumbai, New Delhi");
		Thread.sleep(2000);
		
		if(CheckBox.isEnabled()) {
			CheckBox.click();
		}
		Thread.sleep(2000);
		Password.sendKeys("123456789");
		Thread.sleep(2000);
		ConfirmPassword.sendKeys("123456789");
		Thread.sleep(2000);
		Details_CompanyIndustryId.sendKeys("I am student");
		Thread.sleep(2000);
		register_button.click();
		Thread.sleep(10000);
		
		driver.quit();
		
		}catch(Exception ex) {
			ex.printStackTrace();
		}
	}

}

