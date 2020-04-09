package SeleniumProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hdfc {
	public static void main(String[] args) throws InterruptedException {	
		 
		 System.setProperty("webdriver.chrome.driver","E:\\selenium\\chromedriver.exe");
		 
		 WebDriver driver=new ChromeDriver();   
		 driver.get("https://www.hdfcbank.com/");
		 driver.manage().window().maximize();
		 System.out.println(driver.getTitle());	
		 driver.findElement(By.id("popupBoxClose")).click();
		 driver.findElement(By.linkText("Select Product Type")).click();
		 driver.findElement(By.cssSelector(".dropdown1 > li:nth-child(2)")).click();
		  driver.findElement(By.linkText("Select Product")).click();
		  driver.findElement(By.cssSelector(".dropdown2 > li:nth-child(2)")).click();
		  driver.findElement(By.linkText("APPLY ONLINE")).click();
		  driver.close();

	}

}
