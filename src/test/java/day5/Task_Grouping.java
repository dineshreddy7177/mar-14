package day5;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Task_Grouping {
	WebDriver driver;
	@Test(priority=1,groups="smoke")

	void smokegroup() throws InterruptedException {
		driver= new ChromeDriver();
		driver.get("https://www.demoblaze.com/index.html#");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='Phones']")).click();
	}
	@Test(priority=2,groups="regression")
	void regressionGroup() throws InterruptedException {
		driver=new ChromeDriver();
		driver.get("https://www.demoblaze.com/index.html#");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='Laptops']")).click();
		
	}
	@Test(priority=3,groups="smoke,regression")
	void smokeAndRegressionGroup() throws InterruptedException {
		driver=new ChromeDriver();
		driver.get("https://www.demoblaze.com/index.html#");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//a[text()='Monitors']")).click();

		
	}	

}

