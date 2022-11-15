package week5;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LearnAlert {
	public static void main(String[] args) throws InterruptedException {
		

	WebDriverManager.chromedriver().setup();
	ChromeDriver driver=new ChromeDriver(); 
	driver.get("https://www.leafground.com/alert.xhtml;jsessionid=node0jg5lnvgxcb5bx9r42bjn6s4981299.node0");
	driver.manage().window().maximize();
	driver.findElement(By.xpath("(//span[text()='Show'])[1]")).click();
	Alert simpleAlert=driver.switchTo().alert();
	Thread.sleep(3000);
	simpleAlert.accept();
	driver.findElement(By.xpath("(//span[text()='Show'])[2]")).click();
	Alert confirmAlert=driver.switchTo().alert();
	Thread.sleep(3000);
	confirmAlert.dismiss();
	driver.findElement(By.xpath("(//span[text()='Show'])[5]")).click();
	Alert promptAlert=driver.switchTo().alert();
	Thread.sleep(3000);
	promptAlert.sendKeys("TestLeaf");
	promptAlert.accept();
	String text=promptAlert.getText();
	System.out.println(text);
	driver.findElement(By.xpath("(//span[text()='Show'])[3]")).click();
	Alert SweetAlert=driver.switchTo().alert();
	driver.findElement(By.xpath("//span[text()='Dismiss']")).click();
	
	Thread.sleep(3000);
	SweetAlert.dismiss();
	
	
	
	



	
	
	
	
	
}}

