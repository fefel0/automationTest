package com.files.pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


public class PageAlojamientos {
	
	 private WebDriver driver;
	 private WebDriverWait wait = null;
	
	
	@FindBy(css ="input[placeholder='Ingresá una ciudad, alojamiento o punto de interés']")
	WebElement destino;
	
	@FindBy(css ="span[class='item-text']")
	WebElement selectDestino;
	
	@FindBy(css ="input[placeholder='Entrada']")
	WebElement fechas;
	
	@FindBy(xpath="(//div[@class='sbox5-floating-tooltip sbox5-floating-tooltip-opened']//div[@class='sbox5-monthgrid-datenumber-number'])[3]")
	WebElement selectFirstDate;
	
	@FindBy(xpath="(//div[@class='sbox5-floating-tooltip sbox5-floating-tooltip-opened']//div[@class='sbox5-monthgrid-datenumber-number'])[31]")
	WebElement selectLastDate;
	
	@FindBy(css="div[class='sbox5-floating-tooltip sbox5-floating-tooltip-opened'] em[class='btn-text']")
	WebElement apllyDate;
	
	@FindBy(css="div[class='sbox5-3-double-input']")
	WebElement pasajeros;
	
	@FindBy(xpath="(//div[@class='distribution__container distribution__type__rooms']//button[@class='steppers-icon-right stepper__icon'])[1]")
	WebElement addPasajero;
	
	@FindBy(xpath="(//div[@class='distribution__container distribution__type__rooms']//button[@class='steppers-icon-right stepper__icon'])[2]")
	WebElement addMenor;
	
	@FindBy(css="//*[@class='stepper__distribution_container']//select[@class='select']")
	WebElement elegirEdad;
	
	@FindBy(xpath="(//div[@class='sbox5-floating-tooltip sbox5-floating-tooltip-opened']//em[@class='btn-text'])[1]")
	WebElement applyHab;
	
	@FindBy(css="//div[@class='sbox5-box-container']//em")
	WebElement searchButton;
	
	public PageAlojamientos (WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		this.wait = new WebDriverWait(this.driver, Duration.ofSeconds(10));
	}
	
	public void Destino (String text) {
		wait.until(ExpectedConditions.elementToBeClickable(destino));
		destino.click();
		destino.sendKeys(text);
		wait.until(ExpectedConditions.elementToBeClickable(selectDestino));
		selectDestino.click();
	}
	
	public void FechaViaje() {
		wait.until(ExpectedConditions.elementToBeClickable(fechas));
		fechas.click();
		wait.until(ExpectedConditions.visibilityOf(selectFirstDate));
		selectFirstDate.click();
		selectLastDate.click();
		apllyDate.click();
	}
	
	public void Pasajeros(String text) {
		pasajeros.click();
		wait.until(ExpectedConditions.visibilityOf(addPasajero));
		addPasajero.click();
		addMenor.click();
		Select edad = new Select(elegirEdad);
		edad.selectByVisibleText(text);
		wait.until(ExpectedConditions.elementToBeClickable(applyHab));
		applyHab.click();
	}
	
	public PageHotels clickBuscar() {
		this.searchButton.click();
		return new PageHotels (this.driver);
	}
}
