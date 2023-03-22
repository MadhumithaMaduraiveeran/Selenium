package Assessment;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
public class Bank {
	public static void main(String[] args) {
		EdgeDriver driver=new EdgeDriver();
		driver.get("https://uibank.uipath.com/register-account");
		driver.manage().window().maximize();
driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("madhu");
		WebElement soureDropDown=driver.findElement(By.xpath("//select[@id='title']"));
		Select dropDown =new Select(soureDropDown);
		dropDown.selectByValue("ms");
		driver.findElement(By.xpath("//input[@id='middleName']")).sendKeys("M");
		driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("Maduraiveeran");		
		WebElement soureDropDown1=driver.findElement(By.name("gender"));
		Select dropDown1 =new Select(soureDropDown1);
		dropDown1.selectByValue("female");		
		WebElement soureDropDown2=driver.findElement(By.id("employmentStatus"));
		Select dropDown2 =new Select(soureDropDown2);
		dropDown2.selectByVisibleText("Unemployed");		
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("maddy");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("puppymadhumitha19@gmail.com");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("//input[@id='password']");
		driver.close();				
	}}
		