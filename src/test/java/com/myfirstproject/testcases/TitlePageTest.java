package com.myfirstproject.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.myfirstproject.base.TestBase;
import com.myfirstproject.pages.TitlePage;
public class TitlePageTest extends TestBase {
	
	// import all classes
		
		TitlePage titlePage;

		// constructor

		public TitlePageTest() {

			super();
		//test
		}

		@BeforeMethod
		public void setup() {
			initialization();
			titlePage = new TitlePage();

		}

		@Test(priority = 1)

		public void titlePageTitle() {
			String title = titlePage.validateTitlePage();
			Assert.assertEquals(title, "WW (Weight Watchers): Weight Loss & Wellness Help");
		}

//		private String validateTitlePage() {
//			return null;
//		}
		
		@Test(priority=2)
		public void findaStudioTest(){
		String title =titlePage.findaStudio();
		Assert.assertEquals(title, "Find a Studio & Meeting Near You | WW USA");
		
	
		}
		
		@Test(priority=3)
		public void findaStudioClick(){
			titlePage.findaStudio();
			String title =titlePage.enterStudioLocation();
			Assert.assertEquals(title, "WW Studio Flatiron");
			
		}
		
		

		@Test(priority=4)
		public void findaStudioDistance(){
			titlePage.findaStudio();
			String title =titlePage.enterStudioDistance();
			Assert.assertEquals(title, "0.49 mi.");
			
		}
		
		@Test(priority=5)
		public void findaStudioLocationName(){
			titlePage.findaStudio();
			String title =titlePage.enterStudioDuration();
			Assert.assertEquals(title, "WW Studio Flatiron");
			
		}
		@Test(priority=6)
		public void findaStudioTime(){
			titlePage.findaStudio();
			String title =titlePage.enterStudioDuration();
			Assert.assertEquals(title, "WW Studio Flatiron");
		
		}
		
		@AfterMethod
		public void teardown() {
			driver.quit();
		}
		
		


}
