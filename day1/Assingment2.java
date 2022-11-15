package week6.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assingment2 {
	
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
		String text=driver.findElement(By.tagName("h1")).getText();
		System.out.println(text);
		driver.findElement(By.xpath("//span[text()='Sort By : popularity']")).click();
		driver.findElement(By.xpath("//span[text()='customer top rated']")).click();
		driver.findElement(By.xpath("//span[text()='Category']")).click();
		driver.findElement(By.xpath("//span[text()='Hair']")).click();
		driver.findElement(By.xpath("//span[text()='Hair Care']")).click();
		driver.findElement(By.xpath("//span[text()='Shampoo']")).click();
		driver.findElement(By.xpath("//span[text()='Concern']")).click();
		driver.findElement(By.xpath("//span[text()='Color Protection']")).click();
		driver.findElement(By.xpath("(//div[@class=\"css-1rd7vky\"]/div)[1]")).click();
		driver.findElement(By.xpath("(//select[@class=\"css-2t5nwu\"]/option)[2]")).click();
		driver.findElement(By.linkText("Add to Bag")).click();
				
	}


}
