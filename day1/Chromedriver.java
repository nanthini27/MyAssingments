package week3.day1;

import org.openqa.selenium.By;

import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Chromedriver{
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get("");
		driver.findElement(By.xpath(""));
		
	}

	public void get(String string) {
		// TODO Auto-generated method stub
		
	}

	public Object manage() {
		// TODO Auto-generated method stub
		return null;
	}

	


		
	

	}


