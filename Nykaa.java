package week6.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Nykaa {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.nykaa.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		WebElement Brands =driver.findElement(By.xpath("//a[text()='brands']"));
		Actions builder=new Actions(driver);
		builder.moveToElement(Brands).perform();
		driver.findElement(By.xpath("(//div[@class=\"css-ov2o3v\"]/a)[6]")).click();
		
	}

}
