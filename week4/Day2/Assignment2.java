package week4.Day2;

import org.openqa.selenium.By;
import org.openqa.selenium.edge.EdgeDriver;

public class Assignment2 {
public static void main(String[] args) {
	EdgeDriver driver=new EdgeDriver();
	driver.get("https://acme-test.uipath.com/login");
	driver.manage().window().maximize();
	driver.findElement(By.id("email")).sendKeys("kumar.testleaf@gmail.com");
	driver.findElement(By.id("password")).sendKeys("leaf@12");
	driver.findElement(By.xpath("//button[contains(text(),' Login')]")).click();
	String expectedResult="ACME System 1";
	String actualResult=driver.getTitle();
	if (expectedResult.equals(actualResult));
	System.out.println(driver.getTitle());
	driver.findElement(By.linkText("Log Out")).click();
	driver.close();	
}
}