package funtional;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Fileupload {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("https://demo.dealsdray.com/");
		driver.findElement(By.name("username")).sendKeys("prexo.mis@dealsdray.com");
		driver.findElement(By.name("password")).sendKeys("prexo.mis@dealsdray.com");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		driver.findElement(By.xpath("//*[text()='Order']")).click();
		driver.findElement(By.xpath("//button[@name='child']/span[text()='Orders']")).click();
		System.out.println("Opened order page");
		driver.findElement(By.xpath("//button[text()='Add Bulk Orders']")).click();
		Thread.sleep(3000);
		
		WebElement upload_file = driver.findElement(By.xpath("//input[@type='file']"));
        upload_file.sendKeys("C:/Users/HOME PC/Downloads/demo-data.xlsx");
        driver.findElement(By.xpath("//button[text()='Import']")).click();
        Thread.sleep(1000);
        
        driver.findElement(By.xpath("//button[text()='Validate Data']")).click();
        Thread.sleep(2000);
        Alert alert = driver.switchTo().alert();
        alert.accept();
        
        driver.findElement(By.xpath("//button[text()='Submit']")).click();
        Thread.sleep(2000);
        alert.accept();
    	Thread.sleep(15000); 
    	
    	JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("scroll(0,3200)");
        driver.quit();
	}

}
