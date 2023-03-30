package basic;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class pract_screenshot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
//	LocalDateTime ldt = LocalDateTime.now();
	
//	String timestamp = ldt.toString().replace(':', '-');
	
	FirefoxOptions option = new FirefoxOptions();
	
	option.addArguments("---remote-allow-origins=*");
	
	System.setProperty("webdriver.gecko.driver", "E:\\firefox\\driver\\geckodriver.exe");
	
	WebDriver driver = new FirefoxDriver(option);
	
	driver.get("https://demo.actitime.com/login.do");
	
/*	TakesScreenshot ts = (TakesScreenshot) driver;
	
	 File temp = ts.getScreenshotAs(OutputType.FILE);
	 
	  File destfile = new File("./waff/srcnst"+timestamp+".png");
	  
	  FileUtils.copyFile(temp, destfile); */
	
//	System.out.println(driver.getTitle());
	
	
/*	TakesScreenshot ts = (TakesScreenshot)driver;
	
File screenst = ts.getScreenshotAs(OutputType.FILE);

System.out.println(screenst.getAbsolutePath());

         File dest = new File("./scst1/img.png");
        // screenst.renameTo(dest);
         
         FileUtils.copyFileToDirectory(screenst, dest);  */
	
	
WebElement ele = driver.findElement(By.xpath("//div[text()='Login '] "));

  File scst5 = ele.getScreenshotAs(OutputType.FILE);
  
  File fl2 = new File("./elesnst/ss1.png");
  
  FileUtils.copyFile(scst5, fl2);
  
  
  
  
    
    
	
	
	
	
         
         
         

	
	
	

	
	

	}

}
