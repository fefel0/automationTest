package com.files.tests;

import org.testng.annotations.Test;

import com.files.driver.Driver;
import com.files.pages.PageAlojamientos;
import com.files.pages.PageIndex;
import com.files.pages.PageHotels;

import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.ITestContext;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;

public class testDespegar extends Driver{
	
	WebDriver driver = null;
	PageIndex pageHome = null;
	
  @BeforeMethod(alwaysRun = true)
  public void iniciarTest(ITestContext context) {
	  String navigatorSuite = context.getCurrentXmlTest().getParameter("nav");
	  String navigator = navigatorSuite != null ? navigatorSuite : "CHROME";
	  this.driver = Driver.LevantarBrowser(navigator, "https://www.despegar.com.ar");
	  pageHome = new PageIndex(this.driver);
  }
	  
	  
  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
    	{"Mallorca"},
        {"5 años"},
    };
  }
	
  
  @Test(dataProvider = "dp")
  public void test(String destino, String edad) throws InterruptedException {
	  pageHome.CloseCookies();
	  pageHome.CloseAlert();
	  pageHome.redirect();
	  PageAlojamientos alojamientoPage = pageHome.redirect();
	  alojamientoPage.Destino(destino);
	  alojamientoPage.FechaViaje();
	  alojamientoPage.Pasajeros(edad);
	  alojamientoPage.clickBuscar();
	  PageHotels result = alojamientoPage.clickBuscar();
	  result.resultValidar();
	  Assert.assertTrue(result.resultValidar().isDisplayed(), "El elemento se encuentra visible para su uso");
  }
  

  @AfterMethod(alwaysRun = true)
  public void afterMethod() {
	  driver.close();
  }


  
}
