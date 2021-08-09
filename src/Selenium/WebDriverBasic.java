package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverBasic {

	public static void main(String[] args) {

		//1. FF browser:
				//geckodriver
					// C:\\downloads\\geckodriver.exe -- windows 
			//	System.setProperty("webdriver.gecko.driver", "/Users/naveenkhunteta/Downloads/geckodriver");	
			  //  WebDriver driver = new FirefoxDriver(); //launch FF
				
			    
			    //2. chrome browser:
		        System.setProperty("webdriver.chrome.driver", "./Drivers//chromedriver.exe");	
				WebDriver driver = new ChromeDriver(); //launch chrome
				driver.get("https://wallebi.asia/index");	//enter url
				
				String title = driver.getTitle(); //get title
				
				System.out.println(title);
				
				//validation point:
				if(title.equals("Wallebi")){
					System.out.println("correct title");
				}
				else{
					System.out.println("in-correct title");
				}
			   
				
				System.out.println(driver.getCurrentUrl());
				
				//System.out.println(driver.getPageSource());
				
				driver.quit(); //quit the browser
					
		
	}

}
