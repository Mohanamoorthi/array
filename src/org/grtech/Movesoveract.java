package org.grtech;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Movesoveract {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\Greenstechnology\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		Actions a = new Actions(driver);
		
		driver.get(" http://greenstech.in/selenium-course-content.html");
		
		WebElement course = driver.findElement(By.className("header-browse-greens"));
		
		a.moveToElement(course).perform();
		
		WebElement softtest= driver.findElement(By.xpath("//span[text()='Software Testing (12)']"));
		a.moveToElement(softtest).perform();
		
		WebElement selenium = driver.findElement(By.xpath("//span[text()='Selenium Certification Training']"));
		a.click(selenium).perform();
		
		WebElement course1 = driver.findElement(By.xpath("//a[text()='COURSES']"));
		a.moveToElement(course1).perform();
		
		
				
		
	}
	
	
	
	

}
