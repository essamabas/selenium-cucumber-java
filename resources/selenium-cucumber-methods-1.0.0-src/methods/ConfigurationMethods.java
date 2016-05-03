/*
 * Decompiled with CFR 0_114.
 * 
 * Could not load the following classes:
 *  env.BaseTest
 *  org.openqa.selenium.Capabilities
 *  org.openqa.selenium.Platform
 *  org.openqa.selenium.WebDriver
 *  org.openqa.selenium.remote.RemoteWebDriver
 */
package methods;

import env.BaseTest;
import java.io.PrintStream;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class ConfigurationMethods
implements BaseTest {
    public void printDesktopConfiguration() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy hh:mm:ss");
        Calendar cal = Calendar.getInstance();
        System.out.println("Following are machine configurations : \n");
        System.out.println("Date (MM/DD/YYYY) and Time (HH:MM:SS) : " + dateFormat.format(cal.getTime()));
        Capabilities cap = ((RemoteWebDriver)driver).getCapabilities();
        System.out.println("Browser : " + cap.getBrowserName());
        System.out.println("Platform : " + (Object)cap.getPlatform());
    }
}

