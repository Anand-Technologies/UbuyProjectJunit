package com.kss.libGlobal;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ReusableClass {

	public static WebDriver driver;

	public void launchBrowser() {

		System.setProperty("webdriver.chrome.driver",
				"C:\\GreensTechnology\\UbuyProjectJunit\\Driver\\chromedriver.exe");
		ChromeOptions xo = new ChromeOptions();
		xo.addArguments("--disable-notifications");
		driver = new ChromeDriver(xo);
		//driver.manage().window().maximize();
	}

	public void launchUrl(String s1) {
		driver.get(s1);
	}

}
