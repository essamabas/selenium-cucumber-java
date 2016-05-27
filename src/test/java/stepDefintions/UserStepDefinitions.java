package stepDefintions;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
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
		private String workspaceDir = "C:\\Users\\e.abas.sqs\\Downloads\\";
	
	  
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
// Tree-Elements
// -------------------------	   
	    /**
	    * Expand Tree Element by clicking the image beside given Text 
	    * @param	elementName		Tree Element Name to be searched for    
	    */
		@Then("^I expand Tree element contains text \"(.*?)\"$")
		public void expand_tree_element(String elementName) throws Exception
		{
			String accessName = "//a[contains(text(),'" + elementName +"')]/../..//td/a/img";
			String type = "xpath";
			miscmethodObj.validateLocator(type);
			progressObj.waitForElementToClick(type, accessName, "10");
			clickObj.clickForcefully(type,accessName);
		}
		
	    /**
	    * Click on Tree Element 
	    * @param	elementName		Tree Element Name to be searched for    
	    */		
		@Then("^I click Tree element contains text \"(.*?)\"$")
		public void click_tree_element(String elementName) throws Exception
		{
			String accessName = "//a[contains(text(),'" + elementName +"')]";
			String type = "xpath";
			miscmethodObj.validateLocator(type);
			progressObj.waitForElementToClick(type, accessName, "10");			
			clickObj.clickForcefully(type,accessName);
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
		
	    /**
	    * Check that pop-up Alert contains subtext
	    * @param	subtext		subtext to be compared to    
	    */		
		@Then("^I may see error alert text contains \"(.*?)\"$") 
		public void dismiss_alert_text(String subtext) throws TestCaseFailed
		{
			try{
				driver.switchTo().alert().dismiss();
			 } catch (NoAlertPresentException ex) {
				 // Alert not present
				 ex.printStackTrace();
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

	
// -------------------------
// Save Dialog
// -------------------------		
	    /**
	    * Check that Authentication Dialog is present
	    * @param	arg1	of the file to be modified    
	    */		
		@Then("^Save dialog with title \"(.*?)\" is present$")
		public void save_dialog_with_title_is_present(String arg1) throws Throwable {
		    // Write code here that turns the phrase above into concrete actions
		    //throw new PendingException();
			//ToDO
		}		
		
	    /**
	    * Save File when Save-File Dialog appeared
	    * @param	path		path of the file
	    * @Todo		Pass Parameters to AutoIt Script 
	    */
		@Then("^I save file under \"(.*?)\"$")
		public void i_save_file_under(String path) {
		    // Write code here that turns the phrase above into concrete actions
			String FilePath = "resources/AutoIt/FireFox_SaveAsDialog.exe";
			File MyAutoIt = new File(FilePath);
			try {
				String[] options = new String[]{path};
				//Runtime.getRuntime().exec(MyAutoIt.getAbsolutePath(), options);
				Process p = Runtime.getRuntime().exec("cmd /c start /wait " + MyAutoIt.getAbsolutePath());
				System.out.println("Waiting for AutoIT SaveDialog Script ...");
				p.waitFor();
				System.out.println("AutoIt SaveDialog Script done.");						
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	    /**
	    * Save File when Save-File Dialog appeared
	    * @param	path		path of the file
	    * @Todo		Pass Parameters to AutoIt Script 
	    */
		@Then("^I save file to workspace$")
		public void i_save_file() {
		    // Write code here that turns the phrase above into concrete actions
			String FilePath = "resources/AutoIt/FireFox_SaveDialog.exe";
			File MyAutoIt = new File(FilePath);
			try {
				Process p = Runtime.getRuntime().exec("cmd /c start /wait " + MyAutoIt.getAbsolutePath());
				System.out.println("Waiting for AutoIT SaveDialog Script ...");
				p.waitFor();
		        BufferedReader in = new BufferedReader(
		                new InputStreamReader(p.getInputStream()));
				String line = null;
				while ((line = in.readLine()) != null) {
					System.out.println(line);
				}				
				System.out.println("AutoIt SaveDialog Script done.");						
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (InterruptedException e) {
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
		
		
// -------------------------
// Batches
// -------------------------		
		@Then("^I rename file in workspace \"(.*?)\" to \"(.*?)\"$")
		public void i_rename_file_in_workspace_to(String arg1, String arg2) throws Throwable {
		    // Write code here that turns the phrase above into concrete actions
			Process p = Runtime.getRuntime().exec("cmd /c ren " + workspaceDir + arg1 + " " + arg2);
	        BufferedReader in = new BufferedReader(
	                new InputStreamReader(p.getInputStream()));
			String line = null;
			while ((line = in.readLine()) != null) {
				System.out.println(line);
			}			
		}

}
