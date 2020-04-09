package spicejet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Yatra {

	public static void main(String[] args) throws InterruptedException {
		
		 
		 System.setProperty("webdriver.chrome.driver","E:\\selenium\\chromedriver.exe");
		 
		 WebDriver driver=new ChromeDriver();   
		 driver.get("https://www.yatra.com/");
		 driver.manage().window().maximize();
		
		 
				driver.findElement(By.xpath("//a[@id='signInBtn']")).click();
				
				Thread.sleep(5000);
				driver.findElement(By.xpath("//input[@name='login-input']")).sendKeys("g.makond@gmail.com");
				driver.findElement(By.xpath("//*[@id='login-continue-btn']")).click();
				driver.findElement(By.xpath("//input[@id='login-password']")).sendKeys("Rajeshwari123");
				driver.findElement(By.xpath("//*[text()='Login']")).click();
				 
				Thread.sleep(5000);
				
				driver.findElement(By.xpath(".//*[@id='skip-mobile-verification']/a")).click();

				driver.findElement(By.xpath("//input[@name='flight_origin_city']")).sendKeys("Bangalore, India (BLR)");
				driver.findElement(By.xpath("//input[@name='flight_destination_city']")).sendKeys("Hyderabad, India (HYD)");
				driver.findElement(By.xpath(".//*[@id='logOut']")).click();
	     }
	
	}

