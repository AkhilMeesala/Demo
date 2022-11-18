package TestScript;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertWebsite {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 try {
			 System.setProperty("webdriver.chrome.driver","C:\\Users\\MU69842\\eclipse-workspace\\Selenium-sample-project\\chromedriver.exe");
	            WebDriver driver = new ChromeDriver();
	            driver.get("https://sweetalert2.github.io/");
	            driver.manage().window().maximize();
	            Thread.sleep(3000);
	            
	            JavascriptExecutor js =(JavascriptExecutor) driver;
	            js.executeScript("javascript:window.scrollBy(0,350)");
	            
	            WebElement Alert1 =driver.findElement(By.xpath("//div[@class='showcase normal']/button"));
	            WebElement Alert2 = driver.findElement(By.xpath("//div[@class='showcase sweet']/button"));
	            
	            Thread.sleep(3000);
	            Alert1.click();
	            Thread.sleep(2000);
	            driver.switchTo().alert().accept();
	            Thread.sleep(2000);
	            Alert2.click();
	            Thread.sleep(2000);
	            
	            WebElement Alert2_Ok = driver.findElement(By.xpath("//div[@class='swal2-actions']/button"));
	            Alert2_Ok.click();
	            Thread.sleep(3000);
	            
	            js.executeScript("javascript:window.scrollBy(408,950)");
	            Thread.sleep(3000);
	            WebElement Alert3 = driver.findElement(By.xpath("(//button[@class='show-example-btn'])[2]"));
	            Alert3.click();
	            Thread.sleep(3000);
	            WebElement Alert3_Ok = driver.findElement(By.xpath("(//div[@class='swal2-actions']/button)[1]"));
	            Alert3_Ok.click();
	            Thread.sleep(3000);
	            WebElement Alert4 = driver.findElement(By.xpath("(//button[@class='show-example-btn'])[3]"));
	            Alert4.click();
	            Thread.sleep(3000);
	            WebElement Alert4_Ok = driver.findElement(By.xpath("(//div[@class='swal2-actions']/button)[1]"));
	            Alert4_Ok.click();
	            Thread.sleep(3000);
	            WebElement Alert5 = driver.findElement(By.xpath("//button[@aria-label='Try me! Example: A modal with a title, an error icon, a text, and a footer']"));
	            Alert5.click();
	            Thread.sleep(3000);
	            WebElement Alert5_Ok = driver.findElement(By.xpath("//button[@class='swal2-confirm swal2-styled']"));
	            Alert5_Ok.click();
	            Thread.sleep(3000);	
	            WebElement Alert6 = driver.findElement(By.xpath("(//button[@class='show-example-btn'])[5]"));
	            Alert6.click();
	            Thread.sleep(3000);
	            WebElement Alert6_Ok = driver.findElement(By.xpath("//button[@class='swal2-confirm swal2-styled']"));
	            Alert6_Ok.click();
	            
	            js.executeScript("javascript:window.scrollBy(0,610)");
	            Thread.sleep(3000);
	            WebElement Alert7 = driver.findElement(By.xpath("(//button[@class='show-example-btn'])[6]"));
	            Alert7.click();
	            Thread.sleep(3000);
	            WebElement ClickGreat = driver.findElement(By.xpath("//button[@class='swal2-confirm swal2-styled']"));
	            ClickGreat.click();
	            Thread.sleep(3000);
	            Alert7.click();
	            Thread.sleep(3000);
	            WebElement DisLike = driver.findElement(By.xpath("//button[@class='swal2-cancel swal2-styled']"));
	            DisLike.click();
	            Thread.sleep(3000);
	            WebElement Alert8 = driver.findElement(By.xpath("(//button[@class='show-example-btn'])[7]"));
	            Alert8.click();
	            Thread.sleep(3000);
	            WebElement ClickSave = driver.findElement(By.xpath("//button[@class='swal2-confirm swal2-styled']"));
	            ClickSave.click();
	            Thread.sleep(3000);
	            WebElement ClickSaveOk = driver.findElement(By.xpath("//button[@class='swal2-confirm swal2-styled']"));
	            ClickSaveOk.click();
	            Thread.sleep(3000);
	            Alert8.click();
	            Thread.sleep(3000);
	            WebElement DontSave = driver.findElement(By.xpath("//button[@class='swal2-deny swal2-styled']"));
	            DontSave.click();
	            Thread.sleep(3000);
	            WebElement ClickDontSaveOk = driver.findElement(By.xpath("//button[@class='swal2-confirm swal2-styled']"));
	            ClickDontSaveOk.click();
	            Thread.sleep(3000);
	            Alert8.click();
	            Thread.sleep(3000);
	            WebElement cancel = driver.findElement(By.xpath("//button[@class='swal2-cancel swal2-styled']"));
	            cancel.click();
	            
	            js.executeScript("javascript:window.scrollBy(0,600)");
	            Thread.sleep(3000);
	            WebElement Alert9 = driver.findElement(By.xpath("(//button[@class='show-example-btn'])[8]"));
	            Alert9.click();
	            Thread.sleep(3000);
	            WebElement Alert10 = driver.findElement(By.xpath("(//button[@class='show-example-btn'])[9]"));
	            Alert10.click();
	            Thread.sleep(3000);
	            WebElement Alert10_Ok = driver.findElement(By.xpath("//button[@class='swal2-confirm swal2-styled']"));
	            Alert10_Ok.click();
	            Thread.sleep(3000);
	            
	            js.executeScript("javascript:window.scrollBy(0,600)");
	            Thread.sleep(3000);
	            WebElement Alert11 = driver.findElement(By.xpath("(//button[@class='show-example-btn'])[10]"));
	            Alert11.click();
	            Thread.sleep(3000);
	            WebElement DeleteIt = driver.findElement(By.xpath("//button[@class='swal2-confirm swal2-styled swal2-default-outline']"));
	            DeleteIt.click();
	            Thread.sleep(3000);
	            WebElement DeleteIt_Ok = driver.findElement(By.xpath("//button[@class='swal2-confirm swal2-styled']"));
	            DeleteIt_Ok.click();
	            Thread.sleep(3000);
	            Alert11.click();
	            Thread.sleep(3000);
	            WebElement cancel_1 = driver.findElement(By.xpath("//button[@class='swal2-cancel swal2-styled swal2-default-outline']"));
	            cancel_1.click();
	            Thread.sleep(3000);
	            WebElement Alert12 = driver.findElement(By.xpath("(//button[@class='show-example-btn'])[11]"));
	            Alert12.click();
	            Thread.sleep(3000);
	            WebElement Ok_cancel = driver.findElement(By.xpath("//button[@class='swal2-cancel btn btn-danger']"));
	            Ok_cancel.click();
	            Thread.sleep(3000);
	            WebElement cancelled_Ok = driver.findElement(By.xpath("//button[@class='swal2-confirm btn btn-success']"));
	            cancelled_Ok.click();
	            //  Thread.sleep(3000);
	            
	            Thread.sleep(5000);
	            driver.quit();
	        }catch(Exception ex) {
	            ex.printStackTrace();
	            
	        }
	}

}
