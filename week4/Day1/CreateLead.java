package week4.Day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateLead {
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
	WebElement sourceDropdown=driver.findElement(By.id("createLeadForm_dataSourceId"));
	Select source=new Select(sourceDropdown);
	source.selectByVisibleText("Employee");
    WebElement marketingDropdown = driver.findElement(By.name("createLeadForm_marketingCampaignId"));
	Select  marketingCampaign=new Select( marketingDropdown);
	marketingCampaign.selectByValue("Pay Per Click Advertising");
	WebElement  ownershipDropdown=driver.findElement(By.id("createLeadForm_ownershipEnumId"));
	Select ownership=new Select(ownershipDropdown);
	ownership.selectByIndex(5);
	driver.findElement(By.name("submitButton")).click();
	driver.getTitle();
}
}