package Assessment;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
public class FacebookTest {
	public static void main(String[] args) {
		EdgeDriver driver=new EdgeDriver();
		driver.get("https://www.facebook.com/'");
		driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		driver.findElement(By.name("firstname")).sendKeys("Madhu");
		driver.findElement(By.name("lastname")).sendKeys("mitha");
		driver.findElement(By.name("reg_email__")).sendKeys("puppymadhumitha19@gmail.com");
		driver.findElement(By.name("reg_passwd__")).sendKeys("madhumitha");
		WebElement dateDropDown=driver.findElement(By.id("day"));
        Select date=new Select(dateDropDown);
        date.selectByValue("19");
        WebElement monthDropDown=driver.findElement(By.id("month"));
        Select month=new Select(monthDropDown);
        month.selectByValue("4");
        WebElement yearDropDown=driver.findElement(By.id("year"));
        Select year=new Select(yearDropDown);
        year.selectByValue("2001");
        driver.findElement(By.xpath("//label[text()='Female']")).click();
        driver.close();
	}
}
   
          
