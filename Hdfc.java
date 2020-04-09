package spicejet;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hdfc {
	public static void main(String[] args) throws InterruptedException {	
		 
		 System.setProperty("webdriver.chrome.driver","E:\\selenium\\chromedriver.exe");
		 
		 WebDriver driver=new ChromeDriver();   
		 driver.get("https://www.hdfcbank.com/");
		 driver.manage().window().maximize();
		 System.out.println(driver.getTitle());	    
	}

}
