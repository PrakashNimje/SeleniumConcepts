package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleFileUploadPopUp {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "./Drivers//chromedriver.exe");
		WebDriver driver = new ChromeDriver(); //launch chrome
		
		driver.get("http://html.com/input-type-file/");

		driver.findElement(By.xpath("//*[@id='fileupload']")).sendKeys("/Users/naveenkhunteta/Desktop/Extent.html");
		
	}

}
//https://github.com/naveenanimation20/SeleniumJavaCourse/tree/master/src/SeleniumSessions