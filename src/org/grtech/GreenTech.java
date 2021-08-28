
package org.grtech;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GreenTech {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\eclipse-workspace\\Hdfc\\driver\\chromedriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	driver.manage().window().maximize();
	
	driver.get("http://www.greenstechnologys.com");
	
	//Thread.sleep(3000);
	//Dimension d =new Dimension(1000,1000);

	//driver.manage().window().setSize(d);
	
	
	WebElement txtelement= driver.findElement(By.xpath("//u[text()='Greens Technologys Software Training Centers in Chennai']"));
	String txt = txtelement.getText();
	System.out.println(txt);
	
	

	
	
	
	
	
	
	
	
	
	}
	
	
	
	

}
