package com.steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;


public class LoginStep {
	
	WebDriver driver;
	
	
	@Given("User navigates to login page {string}")
	public void user_navigates_to_login_page(String url) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		Thread.sleep(2000);
		driver.manage().window().maximize();
		driver.get(url);
		Thread.sleep(2000);
		
		
		System.out.println("Test");
		System.out.println("Test");
		System.out.println("Test");
	}

	@When("User enters username {string}")
	public void user_enters_username(String username) {
	  WebElement usernameField = driver.findElement(By.xpath("//input[@id='email']"));
	  usernameField.sendKeys(username);
	}

	@When("User enters password {string}")
	public void user_enters_password(String password) {
		  WebElement passwordField = driver.findElement(By.xpath("//input[@id='pass']"));
		  passwordField.sendKeys(password);
	}

	@When("User clicks login button")
	public void user_clicks_login_button() {
		  WebElement loginButton = driver.findElement(By.xpath("//button[@id='loginbutton']"));
		  loginButton.click();
	}

	
 
}
