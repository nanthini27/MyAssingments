package week6.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SnapDeal {
	
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.snapdeal.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement MensFashion=driver.findElement(By.xpath("(//a[@class=\"menuLinks leftCategoriesProduct \"]/span)[2]"));
        Actions builder=new Actions(driver);
        builder.moveToElement(MensFashion).perform();
        driver.findElement(By.xpath("(//span[text()='Sports Shoes'])[1]")).click();
        
        
        
	}
}
