package week3.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Contactlead {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		String text=driver.findElement(By.tagName("h2")).getText();
		System.out.println(text);
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Contacts")).click();
		driver.findElement(By.linkText("Create Contact")).click();
		driver.findElement(By.id("firstNameField")).sendKeys("sakthi");
		driver.findElement(By.id("lastNameField")).sendKeys("suhaina");
		driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("roshini");
		driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("soundhu");
		driver.findElement(By.name("departmentName")).sendKeys("xxxx");
		driver.findElement(By.id("createContactForm_importantNote")).sendKeys("testing");
		driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("nandy@27.com");
		WebElement StateProvince=driver.findElement(By.id("createContactForm_generalStateProvinceGeoId"));
		Select dd1=new Select(StateProvince);
		dd1.selectByVisibleText("New York");
		driver.findElement(By.className("smallSubmit")).click();
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.id("updateContactForm_importantNote")).clear();
		driver.findElement(By.className("smallSubmit")).click();
	}

}
