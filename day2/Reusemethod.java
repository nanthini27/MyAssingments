package week3.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Reusemethod {
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
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		WebElement companyname = driver.findElement(By.id("createLeadForm_companyName"));
		companyname.clear();
		companyname.sendKeys("testing");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("nandhu");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("nanthini");
		driver.findElement(By.className("smallSubmit")).click();
		String title="view lead|opentaps CRN";
		String title2=driver.getTitle();
		System.out.println(title2);
		if(title.equals(title2)) {
			System.out.println("createlead created successfully");
			
		}else {
			System.out.println("createleaf not created successfully");
		}
		

}
}