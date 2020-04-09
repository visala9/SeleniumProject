package SeleniumProject;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class PrintText {
	
	@Test
	
	public static void main(){
		 
		 System.setProperty("webdriver.chrome.driver","E:\\selenium\\chromedriver.exe");
		 
		 WebDriver driver=new ChromeDriver();   
		 driver.get("http://in.rediff.com/");
		 driver.manage().window().maximize();
		 System.out.println(driver.getTitle());	
		 WebElement query = driver.findElement(By.name("srchword"));

		 query.sendKeys("h");

		 long end = System.currentTimeMillis() + 5000;

		 while (System.currentTimeMillis() < end) {

		 WebElement resultsDiv = driver.findElement(By.xpath("//div[@id='sug']"));

		 if (resultsDiv.isDisplayed()) {

		 break;

		 }

		 }

		 List<WebElement> allSuggestions = driver.findElements(By.xpath("//div[@id='suggest_0']"));

		 for (WebElement suggestion : allSuggestions) {

		 System.out.println(suggestion.getText());

		 }

		 }

	}
