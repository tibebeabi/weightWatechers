package com.myfirstproject.base;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TestBase {
		
		public static WebDriver driver;// global variable
		public static Properties prop;// global variable

		public TestBase() {

			try {
				prop = new Properties();
				FileInputStream ip = new FileInputStream(
						"C:\\Users\\taber\\Documents\\Selnium\\com.myfirstproject\\src\\main\\java\\com\\myfirstproject\\config\\config.properties");
				prop.load(ip);
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

		public static void initialization() {

			String browsername = prop.getProperty("browser");
			// String browsername = prop.getProperty("browser");

			if (browsername.equals("chrome")) {
				System.setProperty("webdriver.chrome.driver", "C:\\auto\\chromedriver.exe");
				driver = new ChromeDriver();
			} else if (browsername.equals("FF")) {
				System.setProperty("webdriver.gecko.driver", "C:\\auto\\chromedriver.exe");
				driver = new FirefoxDriver();

	    	  }  
					
					driver.manage().window().maximize();
					driver.manage().deleteAllCookies();
					driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
					driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
					driver.get(prop.getProperty("url"));
			
		}
		}

