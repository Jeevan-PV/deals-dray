package funtional;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.google.common.io.Files;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowSet {

	public static void main(String[] args) throws IOException, InterruptedException {
		 WebDriverManager.firefoxdriver().setup();
		 FirefoxDriver driver = new FirefoxDriver();
		 driver.manage().window().maximize();
		 driver.get("https://www.getcalley.com/how-calley-auto-dialer-app-works/"); //Here paste different url's
		 
		 
		 driver.manage().window().setSize(new Dimension(360,640));
		 Date d1 = new Date();
	     String FileName = d1.toString().replace(":", "_").replace(" ", "_") + ".png";
		 File f = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		 Files.copy(f,new File("C:\\Users\\HOME PC\\Desktop\\screenshot\\MobileShots\\mobile" +FileName));
		 Thread.sleep(3000);
		 
		 driver.manage().window().setSize(new Dimension(414,896));
		 Date d2 = new Date();
		 String FileName1 = d2.toString().replace(":", "_").replace(" ", "_") + ".png";
		 File f1 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		 Files.copy(f1,new File("C:\\Users\\HOME PC\\Desktop\\screenshot\\MobileShots\\mobile" +FileName1));
		 Thread.sleep(3000);
		 
		 driver.manage().window().setSize(new Dimension(375,667));
		 Date d3 = new Date();
		 String FileName2 = d3.toString().replace(":", "_").replace(" ", "_") + ".png";
		 File f2 = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		 Files.copy(f2,new File("C:\\Users\\HOME PC\\Desktop\\screenshot\\MobileShots\\mobile" +FileName2));
		 
		 driver.quit(); 

	}

}
