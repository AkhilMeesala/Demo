package TestScript;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScreenShortFile {

	public static void main(String[] args) {
		
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\MU69842\\eclipse-workspace\\Selenium-sample-project\\chromedriver.exe");
		//WebDriverManager.chromedriver().setup();
        // above will automatically handle System.setPropert() function we dont need to handle it manually and include path of chromdriver.exe manually
        try {
        	WebDriver driver = new ChromeDriver();
        	driver.get("https://zenloungeplus.zensar.com/");
        	driver.manage().window().maximize();
        
        	File screenShotFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        
        	FileUtils.copyFile(screenShotFile, new File(".//Screenshots/screen.png"));
        	
        	//driver.quit();
        }catch (IOException e) {
            e.printStackTrace();
        }
		 
	}

}
