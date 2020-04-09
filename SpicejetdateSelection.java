 package spicejet;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class SpicejetdateSelection {
	
	public static void main(String[] args) throws InterruptedException {	
		 
		 System.setProperty("webdriver.chrome.driver","E:\\selenium\\chromedriver.exe");
		 
		 WebDriver driver=new ChromeDriver();   
		 
		 driver.get("http://www.spicejet.com/");
		 driver.manage().window().maximize();
		 System.out.println(driver.getTitle());	    
		 driver.findElement(By.cssSelector("#ctl00_mainContent_rbtnl_Trip_1")).click();
		 driver.findElement(By.xpath(".//*[@id='ctl00_mainContent_ddl_originStation1_CTXT']")).click();
		 driver.findElement(By.cssSelector("a[value='DEL']")).click();     
		 driver.findElement(By.xpath(".//*[@id='ctl00_mainContent_ddl_destinationStation1_CTXT']")).click();
		 driver.findElement(By.xpath("(//a[@value='HYD'])[2]")).click();
		 Thread.sleep(3000);	
			 WebElement FromDateWidget = driver.findElement(By.xpath(".//*[@id='ui-datepicker-div']/div[1]"));
			
			List<WebElement> columns1 = FromDateWidget.findElements(By.tagName("td"));
			
			for(WebElement cell1: columns1)
			{
				if(cell1.getText().equals("11"))
				{
					cell1.findElement(By.linkText("11")).click();
					break;
				}
			}
			
			
			WebElement ToDateWidget = driver.findElement(By.xpath(".//*[@id='ui-datepicker-div']/div[2]"));
			
			List<WebElement> columns2 = ToDateWidget.findElements(By.tagName("td"));
			
			for(WebElement cell2: columns2)
			{
				if(cell2.getText().equals("1"))
				{
					cell2.findElement(By.linkText("1")).click();
					break;
				}
			}
				
			
			Select AdultDropdown = new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Adult")));
			
			AdultDropdown.selectByValue("2");
			
			Select ChildDropdown = new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Child")));
			
			ChildDropdown.selectByValue("1");
			
			Select InfantDropdown = new Select(driver.findElement(By.id("ctl00_mainContent_ddl_Infant")));
			
			InfantDropdown.selectByValue("0");
			
			Select Currency = new Select(driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency")));
			
			Currency.selectByValue("INR");
			
			driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();
			driver.close();		
			

		
		 }
}