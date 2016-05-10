package stepDefintions;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.google.common.base.Predicate;

import cucumber.api.PendingException;
import cucumber.api.Scenario;
import cucumber.api.java.After;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import env.BaseTest;
import methods.TestCaseFailed;

public class UserStepDefinitions implements BaseTest{

	  	// private Scenarios - List
	  	private static HashMap<Integer,Object> ScenariosList = new HashMap<Integer, Object>();
	
	  
	    /**
	    * After-Scenario Hook function - used to save Scenario-Object and take Screen-shots upon failure
	    * @param	scenario		Current scenario object    
	    */		  
	   @After
	    public void tearDown(Scenario scenario) {
	        try {
	        	System.out.println(scenario.getName());
	        	//ScenariosList.put(ScenariosList.size()+1, scenario);
	            if (scenario.isFailed()) {
	                final byte[] screenshot = ((TakesScreenshot) driver)
	                        .getScreenshotAs(OutputType.BYTES);
	                scenario.embed(screenshot, "image/png");
	            }
	        } finally {
	        	ScenariosList.put(ScenariosList.size()+1, scenario);
	        }
	    }
	   
// -------------------------
// Navigation
// -------------------------
	
	    /**
	    * Navigate to specified URL - with suppressing not-found Url exception
	    * @param	link			Url of the page to navigate    
	    */
		@Then("^I navigate to Url \"([^\"]*)\"$")
		public void navigate_to_url(String link)
		{
			try {
				driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
			    driver.get(link);
			} catch (Exception e) {
			    System.out.println(e.toString());
			}
			driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
		}
	
// -------------------------
// Alerts
// -------------------------
	
	    /**
	    * Check that pop-up Alert contains subtext
	    * @param	subtext		subtext to be compared to    
	    */		
		@Then("^I should see alert text contains \"(.*?)\"$") 
		public void check_alert_text(String subtext) throws TestCaseFailed
		{
			if(assertionObj.getAlertText().indexOf(subtext)>-1) {
				assertionObj.checkAlertText(assertionObj.getAlertText());
			}
		}

// -------------------------
// Authentication Dialog
// -------------------------
	
	    /**
	    * Check that Authentication Dialog is present
	    * @param	arg1	of the file to be modified    
	    */		
		@Given("^Authenication dialog with title \"(.*?)\" is present$")
		public void authenication_dialog_with_title_is_present(String arg1) throws Throwable {
		    // Write code here that turns the phrase above into concrete actions
		    //throw new PendingException();
		}

	
	    /**
	    * Check that Authentication Dialog is dismissed
	    * @param	title	of the dialog box    
	    */		
		@Then("^Authentication dialog is dismissed$")
		public void authentication_dialog_is_dismissed() throws Throwable {
		    // Write code here that turns the phrase above into concrete actions
		    //throw new PendingException();
			//@Todo: Write AutoIt Script to check Authentication Dialog is dismissed
			Thread.sleep(5000);
		}
		
	    /**
	    * Enter Credentials into that Authentication Dialog
	    * @param	username	user-name
	    * @param	password	password    
	    * @Todo		Pass Parameters to AutoIt Script and beware of any Custom entered Characters/ Throws execption upon Failure 
	    */
		@Then("^I Enter Authenication Credentials \"(.*?)\",\"(.*?)\"$")
		public void i_Enter_Authenication_Credentials(String username, String password) throws Throwable {
		    // Write code here that turns the phrase above into concrete actions
			String FilePath = "resources/AutoIt/FireFox_Authentication.exe";
			File MyAutoIt = new File(FilePath);
			try {
				String[] options = new String[]{username, password};
				//Runtime.getRuntime().exec(MyAutoIt.getAbsolutePath(), options);
				Process p = Runtime.getRuntime().exec("cmd /c start /wait " + MyAutoIt.getAbsolutePath());
				System.out.println("Waiting for AutoIT Script ...");
				p.waitFor();
				System.out.println("AutoIt Script done.");						
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}	

	
		@Given("^dummy$")
		public void dummy() throws Throwable {
		    // Write code here that turns the phrase above into concrete actions
		    //throw new PendingException();
		}
	
	    /**
	    * Check that Scenario is passed
	    * @param	name		name of the scenario    
	    * @Todo		Pass Parameters to AutoIt Script and beware of any Custom entered Characters
	    * @throws	TestCaseFailed from Junit - upon Failure 
	    */	
		@Given("^Scenerio \"(.*?)\" is passed$")
		public void scenario_is_passed(String name) throws Throwable {
		    // Write code here that turns the phrase above into concrete actions
			for(int i =1; i<ScenariosList.size()+1; i++){
				if(((Scenario) ScenariosList.get(i)).getName().contains(name)) {
					if(((Scenario) ScenariosList.get(i)).isFailed()){
						throw new TestCaseFailed("Scenario : " + name + " is found to be Failed");
					}
				}
			}
		}
	
// -------------------------
// Window
// -------------------------
	
	    /**
	    * Check if Window is found
	    * @param	name		name of the scenario
	    * @return	WebDriver to the switched window     
	    */
		@SuppressWarnings("unchecked")
		private Predicate<WebDriver> is_window_found(String name) {
			try {
				return (Predicate<WebDriver>) driver.switchTo().window(name);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				return null;
			}
		}
		
		@Then("^I switch to main window$")
		public void i_switch_to_main_window() throws Throwable {
		    // Write code here that turns the phrase above into concrete actions
		    driver.switchTo().defaultContent();
		}
	
	
		@Then("^I wait (\\d+) seconds for window having (.+) \"(.*?)\" to display$")	
		public void waitForWindow(String duration, String type, String accessName) throws Exception	
		{
	
			WebDriverWait wait = new WebDriverWait(driver, Integer.parseInt(duration) * 1000);
			wait.until(is_window_found(accessName));	
		}
	
// -------------------------
// Frames
// -------------------------
		@Then("^I switch to frame \"(.*?)\"$")
		public void i_switch_to_frame(String arg1) throws Throwable {
		    // Write code here that turns the phrase above into concrete actions
			driver.switchTo().frame(arg1);
		}

}
