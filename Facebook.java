package week3.day3;

import java.time.Duration;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration .ofSeconds(30));
		driver.findElement(By.linkText("Create New Account")).click();
		driver.findElement(By.name("firstname")).sendKeys("nanthini");
		driver.findElement(By.name("lastname")).sendKeys("nandhu"); 
		driver.findElement(By.name("reg_email__")).sendKeys("n@27.com");
		driver.findElement(By.xpath("//input[@name='reg_email_confirmation__']")).sendKeys("n@27.com");
		driver.findElement(By.id("password_step_input")).sendKeys("nandhu");
		WebElement birthDay=driver.findElement(By.name("birthday_day"));
		Select dd1=new Select(birthDay);
		dd1.selectByVisibleText("5");
		WebElement birthMonth=driver.findElement(By.name("birthday_month"));
		Select dd2=new Select(birthMonth);
		dd2.selectByVisibleText("Jan");
		WebElement birthYear=driver.findElement(By.name("birthday_year"));
		Select dd3=new Select(birthYear);
		dd3.selectByVisibleText("2003");
		driver.findElement(By.name("sex")).click();
		
		
		
		
		
	}
}
