package com.training.steps;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.training.base.BaseTest;

import io.cucumber.java.Before;
import io.cucumber.java.en.*;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Steps extends BaseTest{
	
	@Before
	public void setup() throws IOException {
		launchapplication();
	}
	
    WebDriver driver;
	@Given("User Launch the saleforce application")
	public void user_launch_the_saleforce_application() {
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
	    driver.get("https://login.salesforce.com/");
	}
	
	@When("user enter username")
	public void user_enter_username() {
	   driver.findElement(By.id("username")).sendKeys("abcdefgh@tekarch.com");
	
	}
	@When("user enter password")
	public void user_enter_password() {
	   driver.findElement(By.id("password")).sendKeys("asdfghjk87");
	}
	
	@Then("Click on login button")
	public void click_on_login_button() {
	    driver.findElement(By.id("Login")).click();
	}
	
	@Then("error message should be displayed {string}")
	public void error_message_should_be_displayed(String string) {
	   
	}
}
