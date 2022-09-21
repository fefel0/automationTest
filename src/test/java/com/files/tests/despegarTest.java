package com.files.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class despegarTest {
  @Test
  public void despegar() throws Exception {
	  
	  System.setProperty("webdriver.chrome.driver", "C:/Drivers/chromedriver.exe");
	  WebDriver driver = new ChromeDriver();
	  driver.get("https://www.despegar.com.ar/");
	  driver.manage().window().maximize();
	  
	  
	  WebDriverWait wait = new WebDriverWait(driver, 10);
	  
	  WebElement cookies = driver.findElement(By.xpath("//em[text()='Entendí']"));
	  wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//em[text()='Entendí']")));
	  cookies.click();
	  
	  WebElement btnActivar = driver.findElement(By.xpath("//i[@class='shifu-3-icon-close tooltip-web-push--close tooltip-close']"));
	  wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//i[@class='shifu-3-icon-close tooltip-web-push--close tooltip-close']")));
	  btnActivar.click();
	  
	  WebElement inputOrigen = driver.findElement(By.xpath("//input[@class='input-tag']"));
	  wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@class='input-tag']")));
	  inputOrigen.click();
	  inputOrigen.sendKeys("Cordoba");
	  
	  WebElement divOrigen = driver.findElement(By.xpath("//div[@class='ac-group-container']//li[1]"));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='ac-group-container']//li[1]")));
	  divOrigen.click();
	  
	  WebElement inputDestino = driver.findElement(By.xpath("//input[@placeholder='Ingresa hacia dónde viajas']"));
	  wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@placeholder='Ingresa hacia dónde viajas']")));
	  inputDestino.click();
	  inputDestino.sendKeys("Copenhague");
	  
	  WebElement divDestino = driver.findElement(By.xpath("//div[@class='ac-group-container']//li[1]"));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='ac-group-container']//li[1]")));
	  divDestino.click();
	  
	  WebElement calendario = driver.findElement(By.xpath("(//input[@class='input-tag'])[3]"));
	  wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//input[@class='input-tag'])[3]")));
	  calendario.click();
	  
	  WebElement inputIda = driver.findElement(By.xpath("//div[@id='component-modals']/div[1]/div[1]/div[2]/div[1]/div[3]/div[11]/div[1]"));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='component-modals']/div[1]/div[1]/div[2]/div[1]/div[3]/div[11]/div[1]")));
	  inputIda.click();
	  
	  WebElement inputVuelta = driver.findElement(By.xpath("//div[@id='component-modals']/div[1]/div[1]/div[2]/div[2]/div[3]/div[25]/div[1]"));
	  wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='component-modals']/div[1]/div[1]/div[2]/div[2]/div[3]/div[25]/div[1]")));
	  inputVuelta.click();
	  
	  WebElement aplicar = driver.findElement(By.xpath("//button[contains(@class,'sbox5-3-btn -primary')]//em"));
	  wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(@class,'sbox5-3-btn -primary')]//em")));
	  aplicar.click();
	  
	  WebElement pasajeros = driver.findElement(By.xpath("//button[contains(@class,'sbox5-3-btn -primary')]//em"));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[contains(@class,'sbox5-3-btn -primary')]//em")));
	  pasajeros.click();
	  
	  WebElement addPas = driver.findElement(By.xpath("//div[@class='stepper__room__row__stepper__contaer']//button[@class='steppers-icon-right stepper__icon']"));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='stepper__room__row__stepper__contaer']//button[@class='steppers-icon-right stepper__icon']")));
	  addPas.click();
	  addPas.click();
	  
	  WebElement addMen = driver.findElement(By.xpath("//div[@class='stepper__room__row__stepper__contaer']//button[2]"));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='stepper__room__row__stepper__contaer']//button[2]")));
	  addMen.sendKeys(Keys.CONTROL);
	  addMen.click();
	  
	  
	  WebElement edad = driver.findElement(By.xpath("//div[@id='component-modals']/div[3]/div[1]/div[1]/div[1]/div[3]/div[2]/div[1]/div[1]/select[1]"));
	  wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@id='component-modals']/div[3]/div[1]/div[1]/div[1]/div[3]/div[2]/div[1]/div[1]/select[1]")));
	  edad.click();
	  
	  WebElement apply = driver.findElement(By.xpath("(//em[text()='Aplicar'])[3]"));
	  wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//em[text()='Aplicar'])[3]")));
	  apply.click();
	  
	  WebElement btnBuscar = driver.findElement(By.xpath("//button[contains(@class,'sbox5-box-button-ovr--3LK5x sbox5-3-btn')]//em[1]"));
	  wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[contains(@class,'sbox5-box-button-ovr--3LK5x sbox5-3-btn')]//em[1]")));
	  btnBuscar.click();
	  
	  WebElement comprar = driver.findElement(By.xpath("//div[@id='clusters']/span[1]/div[1]/span[1]/cluster[1]/div[1]/div[1]/div[2]/fare[1]/span[1]/span[1]/div[1]/buy-button[1]/a[1]/div[1]/em[1]"));
	  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='clusters']/span[1]/div[1]/span[1]/cluster[1]/div[1]/div[1]/div[2]/fare[1]/span[1]/span[1]/div[1]/buy-button[1]/a[1]/div[1]/em[1]")));
	  Assert.assertTrue(comprar.isDisplayed());
  }
}
