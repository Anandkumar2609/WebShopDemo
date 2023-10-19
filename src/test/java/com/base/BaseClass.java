package com.base;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	static WebDriver driver;

	public WebDriver launchbrowser() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		return driver;

	}

	public void send(WebElement element, String value) {
		element.sendKeys(value);
	}

	public void tap(WebElement element) {
		element.click();

	}

	public void maxi() {
		driver.manage().window().maximize();
	}

	public void openurl(String url) {
		driver.get(url);

	}
	@SuppressWarnings("deprecation")
	public static void impWait(long a) {

		
		try {
			driver.manage().timeouts().implicitlyWait(a,TimeUnit.SECONDS);
		} catch (Exception e) {
	
			e.printStackTrace();
		}

	}
	public static void mousuHoverAcc(WebElement element)
	{
		Actions acc=new Actions(driver);
		acc.moveToElement(element);		
	}

	public void selectByText(WebElement element,String text) {

		Select s= new Select(element);
		s.selectByVisibleText(text);

	}




}
