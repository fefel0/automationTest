package com.files.pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PageIndex {
	
	private WebDriver driver = null;
	private WebDriverWait wait = null;
	
	@FindBy(css="a[class='shifu-3-button-circle HOTELS paint-circle ']")
	WebElement alojamiento;
	
	@FindBy(xpath="//em[text()='Entendí']")
	WebElement cookies;
	
	@FindBy(xpath="//i[@class='shifu-3-icon-close tooltip-web-push--close tooltip-close']")
	WebElement alert;
	
	public PageIndex (WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(this.driver, this);
		this.wait = new WebDriverWait(this.driver, Duration.ofSeconds(10));
	}
	
	public void CloseCookies () {
		wait.until(ExpectedConditions.elementToBeClickable(cookies));
		cookies.click();
	}
	
	public void CloseAlert() {
		wait.until(ExpectedConditions.elementToBeClickable(alojamiento));
		alert.click();
	}
	
	public PageAlojamientos redirect() {
		wait.until(ExpectedConditions.elementToBeClickable(alojamiento));
		this.alojamiento.click();
		return new PageAlojamientos(this.driver);
	} 
}
