package env;


import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.phantomjs.PhantomJSDriver;
import org.openqa.selenium.safari.SafariDriver;


public class Env 
{
	static WebDriver driver = null;
	static String browserName = null;
	
	public static String getBrowserName()
	{
		browserName = System.getProperty("browser"); 
		
		if(browserName == null)
			browserName = "firefox";
		return browserName;
	}
	
	public static WebDriver CreateWebDriver(String browser)
	{
			System.out.println("Browser: " + browser);
			File file;
			
			switch (browser.toLowerCase()) {
			case "ff":
			case "firefox":
				File pathToBinary = new File("C:\\Users\\e.abas.sqs\\MyData\\Installed\\PortableApps\\PortableApps\\FirefoxPortable\\FirefoxPortable.exe");
				FirefoxBinary ffBinary = new FirefoxBinary(pathToBinary);
				FirefoxProfile firefoxProfile = new FirefoxProfile();
				driver = new FirefoxDriver(ffBinary,firefoxProfile);				
				//driver = new FirefoxDriver("C:\Users\e.abas.sqs\MyData\Installed\PortableApps\PortableApps\FirefoxPortable\Data");
				break;

			case "ch":
			case "chrome":
				  // Set Chrome in PATH
				 file = new File("resources/selenium_standalone/windows/googlechrome/32bit/chromedriver.exe");
				 System.setProperty("webdriver.chrome.driver", 
						 file.getAbsolutePath());
				 File pathToBinary1 = new File("C:\\Users\\e.abas.sqs\\MyData\\Installed\\PortableApps\\PortableApps\\GoogleChromePortable\\App\\Chrome-bin\\chrome.exe");				 
				 ChromeOptions chromeOptions = new ChromeOptions();
				 chromeOptions.setBinary(pathToBinary1);
				 driver = new ChromeDriver(chromeOptions);
				break;

			case "ie" :
			case "internetexplorer":
				  // Set IE in PATH
				 file = new File("resources/selenium_standalone/windows/internetexplorer/32bit/IEDriverServer.exe");
				 System.setProperty("webdriver.ie.driver", 
						 file.getAbsolutePath());				
				driver = new InternetExplorerDriver();
				break;

			case "safari":
				driver = new SafariDriver();
				break;
				
			case "phantomjs":
				  // Set IE in PATH
				 file = new File("resources/selenium_standalone/windows/phantomjs/32bit/phantomjs.exe");
				 System.setProperty("phantomjs.binary.path", 
						 file.getAbsolutePath());
				 driver = new PhantomJSDriver();
				break;
				
			case "htmlunit":
				driver = new HtmlUnitDriver();
				break;				
				
			 default:
				 System.out.println("Invalid browser name "+browser);
				 System.exit(0);
					break;	
			}//switch
			
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
			driver.manage().timeouts().setScriptTimeout(60, TimeUnit.SECONDS);
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);

			return driver;
        }
	}
