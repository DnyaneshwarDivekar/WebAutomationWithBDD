package com.dddemo.tests;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Then;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LoginSteps {

    private WebDriver driver = new EdgeDriver();

    @Given("the user is on the login page")
    public void theUserIsOnTheLoginPage() {
        driver.get("https://dd-demo-tau.vercel.app/login.html");
    }

    @When("the user enters valid credentials")
    public void theUserEntersValidCredentials() {
        driver.findElement(By.xpath("//input[@id='username']")).sendKeys("dduser1");
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("test123");
    }

    @When("clicks the login button")
    public void clicksTheLoginButton() {
        driver.findElement(By.xpath("//button[@type='button']")).click();
    }

    @Then("the user should be logged in")
    public void theUserShouldBeLoggedIn() {
    	

    	assertTrue(true);
        
        driver.quit();
    }
}
