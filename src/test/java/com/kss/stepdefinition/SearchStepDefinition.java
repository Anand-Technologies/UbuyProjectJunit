package com.kss.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import com.kss.libGlobal.ReusableClass;

import io.cucumber.java.en.*;

public class SearchStepDefinition extends ReusableClass {

	@Given("User is on home page")
	public void user_is_on_home_page() {
		launchBrowser();
		launchUrl("https://www.ubuy.co.in/");

	}

	@When("User has enter the {string} name in search bar")
	public void user_has_enter_the_name_in_search_bar(String string) {
		try {
			driver.findElement(By.xpath("//*[@class='fas fa-times popup-v2 ub-newsletter-dismiss']")).click();
		} catch (Exception e) {
			driver.findElement(By.xpath("//*[@class='fas fa-times-circle']")).click();
		}
		JavascriptExecutor js = (JavascriptExecutor) driver;

		WebElement txtSearch = driver.findElement(By.xpath("(//*[@class='search-box-text'])[2]"));
		js.executeScript("arguments[0].setAttribute('value','iphone 11')", txtSearch);
		driver.findElement(By.xpath("(//*[@class='search-btn'])[2]")).click();

	}

	@When("User has click the Search button")
	public void user_has_click_the_Search_button() {
		
		driver.findElement(By.xpath("(//*[contains(@title,'Simple Mobile Prepaid - Apple iPhone 11 Pro Max (64GB)')])[4]")).click();
		
	}

	@Then("User is on particular product page")
	public void user_is_on_particular_product_page() {

	}

}
