package Tests;


import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import FlipKart.FlipKart.App;
import PageObjects.Login;



public class Test2 extends App{
	
	private String testCaseID = "TC_002";
	/*@BeforeTest
	public void preTest(){
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
	
	@AfterTest
	public void afterTestCleanUp(){
		
	}*/
	
	@Test
	public void test2(){
		reports.startTest("Login and Logout again","Check Login Unsuccessful");
		try{
		Login login = new Login();	
		login.navigateToLogin(driver);
		login.loginToApp(driver, testCaseID);
		}catch(Exception e){
			System.out.println(e.getStackTrace());
		}
	}
	
	
}