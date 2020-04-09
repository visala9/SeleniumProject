package spicejet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class RaadioButtonValidation {
	public static void main(String[] args) throws InterruptedException {

		 System.setProperty("webdriver.chrome.driver","E:\\selenium\\chromedriver.exe");
		 
		 WebDriver driver=new ChromeDriver(); 		 
		 
		 driver.get("http://www.echoecho.com/htmlforms10.htm");
		 driver.manage().window().maximize();
      Thread.sleep(5000);
      
      int a = driver.findElements(By.xpath("//input [@name='group1']")).size();  
      System.out.println(a);  
      for(int i=1;i<=a;i++)  
      {  
          driver.findElements(By.xpath("//input[@name='group1']")).get(2).click(); 
          if(driver.findElement(By.name("group1")).isSelected()) {
              System.out.println("True");
          } else {
              System.out.println("False");
          }
      }  
      
      int b = driver.findElements(By.xpath("//input [@name='group2']")).size();  
      System.out.println(b);  
      for(int i=1;i<=b;i++)  
      {  
          driver.findElements(By.xpath("//input[@name='group2']")).get(2).click();  
          if(driver.findElement(By.name("group1")).isSelected()) {
              System.out.println("True");
          } else {
              System.out.println("False");
          }
      }  
      
    
}}