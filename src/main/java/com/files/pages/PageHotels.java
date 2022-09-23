package com.files.pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PageHotels {
	
	private WebDriver driver = null;
	private WebDriverWait wait = null;
	
	@FindBy(css="//div[@class='eva-3-cluster-gallery -eva-3-bc-white -eva-3-shadow-line-hover']//em[@class='btn-text']")
	WebElement result;
	
	public PageHotels (WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(this.driver, this);
		this.wait = new WebDriverWait(this.driver, Duration.ofSeconds(10));
	}

	public void result() {
		wait.until(ExpectedConditions.visibilityOf(result));
	}
	
	public WebElement resultValidar ( ) {
		return resultValidar();
	}
}
