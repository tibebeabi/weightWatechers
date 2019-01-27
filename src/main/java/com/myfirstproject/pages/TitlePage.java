
package com.myfirstproject.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.myfirstproject.base.TestBase;


public class TitlePage extends TestBase {
	
	@FindBy(id = "ela-nav_footer_find-a-studio")
	
	WebElement FindaStudio;
	
    @FindBy(id = "meetingSearch")
	
	WebElement FindaStudioLocation;
    
    @FindBy(xpath="//button[contains(.,'Submit')]")
	
  	WebElement FindaStudioLocationclick;
    
    @FindBy(xpath="//*[@class='location__name']//*[text()='WW Studio Flatiron']")
    
	WebElement FindTheFirstStudio;
    
    @FindBy(className ="location__distance")
    
   	WebElement FindThedistanceStudio;
    
  @FindBy(className ="location__name")
    
   	WebElement FindTheLocstionName;
  
   @FindBy(className ="hours-list-item-hours")
    
   WebElement FindTheLocstionHours;
	
	
	
	
	
		// contractor
		public TitlePage() {

			// pagefactory
			PageFactory.initElements(driver, this);
		}

		// validate login page
		public String validateTitlePage() {
			return driver.getTitle();
		}
		public String findaStudio() {
			  FindaStudio.click();
			  return driver.getTitle();
		}
		public String enterStudioLocation() {
			FindaStudioLocation.sendKeys("10011");
			FindaStudioLocationclick.click();
			return FindTheFirstStudio.getText();  
		}
		
		public String enterStudioDistance() {
			FindaStudioLocation.sendKeys("10011");
			FindaStudioLocationclick.click();
			return FindThedistanceStudio.getText();  
		}
		
		public String enterStudioDuration() {
			FindaStudioLocation.sendKeys("10011");
			FindaStudioLocationclick.click();
			FindThedistanceStudio.click();
			return FindTheLocstionName.getText();
			  
		}
		public String enterStudioTime() {
			FindaStudioLocation.sendKeys("10011");
			FindaStudioLocationclick.click();
			FindThedistanceStudio.click();
			return FindTheLocstionHours.getText();
			
//		public String FindaStudio() {
//			  FindaStudio.click();
//		}
		
		
		}
}