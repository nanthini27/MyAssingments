package week6.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Visibilitywait {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.leafground.com/waits.xhtml;jsessionid=node0ekjs3fgmx9101p10nvvrkdz51140734.node0");
		WebElement ele=driver.findElement(By.xpath("(//span[text()='Click'])[1]"));
		ele.click();
		WebDriverWait Wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		Wait.until(ExpectedConditions.visibilityOf(ele));
		WebElement ele1= driver.findElement(By.xpath("(//span[text()='Click'])[2]"));
		ele1.click();
		WebDriverWait wait=new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.invisibilityOf(ele1));
		
	}
}
