package spicejet;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google {
	
	public static void main(String[] args) {

		 System.setProperty("webdriver.chrome.driver","E:\\selenium\\chromedriver.exe");
		 
		 WebDriver driver=new ChromeDriver(); 		 
		 
		 driver.get("https://www.google.com");
		 driver.manage().window().maximize();
		 List<WebElement> allLinks = driver.findElements(By.tagName("a"));
		
		  
		 for(WebElement link:allLinks)
		 {
		 System.out.println(link.getText() + " - " + link.getAttribute("href"));
		 }
		 
		 }
		 
		}

