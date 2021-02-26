package framework;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class test {

	
	//1. WITH DEFAULT MAIN CLASS RUN SELENIUM TEST 
	//JAVA RUNNER
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "/Users/abraartishan/Downloads/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		System.out.println(driver.getPageSource());
		driver.quit();

	}
	
	//OR
	
	//2. WITH TESTNG FRAMEWORK RUN SELENIUM TEST
	//TESTNG RUNNER
	@Test
	public void test1(){
		System.setProperty("webdriver.chrome.driver", "/Users/abraartishan/Downloads/chromedriver");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		System.out.println(driver.getTitle());
		driver.quit();
		
	}

}
