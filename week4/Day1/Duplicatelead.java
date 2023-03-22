package week4.Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class Duplicatelead {
	public static void main(String[] args) {
		EdgeDriver driver=new EdgeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("madhu");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("madhumitha");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("puppy");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("computer");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("good");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("puppymadhumitha19@gmail.com");
		WebElement stateDropdown=driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select state=new Select(stateDropdown);
		state.selectByVisibleText("New York");
		driver.findElement(By.name("submitButton")).click();
		System.out.println(driver.getTitle());
		driver.findElement(By.linkText("Duplicate Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).clear();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("LeafTest");
		driver.findElement(By.id("createLeadForm_firstName")).clear();
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Thrisha");
		driver.findElement(By.className("smallSubmit")).click();
	System.out.println(driver.getTitle());		
		
}}
