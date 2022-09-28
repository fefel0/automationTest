package com.files.tests;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.annotations.Test;

import com.files.driver.Driver;

public class despegarList extends Driver {
	
	WebDriver driver = null;
	WebDriverWait wait = null;
	
	
  @Test
  public void elementosDespegar(ITestContext context) throws Exception {
	  String navigatorSuite = context.getCurrentXmlTest().getParameter("nav");
	  String navigator = navigatorSuite != null ? navigatorSuite : "CHROME";
	  this.driver = Driver.LevantarBrowser(navigator, "https://www.despegar.com.ar/");
	  
	  
	  List<WebElement> buttons = driver.findElements(By.cssSelector("ul[class='header-list-products'] li"));
		for (WebElement elemento : buttons) {
			WebElement displayIcon = elemento.findElement(By.xpath("//i"));
			Assert.assertTrue(displayIcon.isDisplayed(), "El elemento no es visible");
		}
  }
}
