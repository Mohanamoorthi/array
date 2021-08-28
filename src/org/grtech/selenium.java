package org.grtech;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class selenium {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\eclipse-workspace\\Greenstechnology\\Driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get(" http://greenstech.in/selenium-course-content.html");
		
		//Actions a = new Actions(driver);
		 WebElement courseelement = driver.findElement(By.xpath("(//p[contains(text(),'currently')]"));
		 
		 //a.moveToElement(courseelement).perform();
		 //a.click(courseelement).perform();
		
		String text = courseelement.getText();
		
		System.out.println(text);
		
		
		
		
	}

}
