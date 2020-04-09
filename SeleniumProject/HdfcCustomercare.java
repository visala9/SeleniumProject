package SeleniumProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HdfcCustomercare {

	public static void main(String[] args) throws InterruptedException {	
		 
		 System.setProperty("webdriver.chrome.driver","E:\\selenium\\chromedriver.exe");
		 
		 WebDriver driver=new ChromeDriver();   
		 driver.get("https://www.hdfcbank.com/");
		 driver.manage().window().maximize();
		 System.out.println(driver.getTitle());	
		 driver.findElement(By.id("popupBoxClose")).click();
		 driver.findElement(By.cssSelector(".col-sm-2:nth-child(13) li:nth-child(3) .social-title")).click();
		 driver.close();
	}
}
