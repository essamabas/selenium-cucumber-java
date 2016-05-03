/*
 * Decompiled with CFR 0_114.
 * 
 * Could not load the following classes:
 *  env.BaseTest
 *  org.openqa.selenium.Alert
 *  org.openqa.selenium.WebDriver
 *  org.openqa.selenium.WebDriver$TargetLocator
 */
package methods;

import env.BaseTest;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;

public class JavascriptHandlingMethods
implements BaseTest {
    public void handleAlert(String decision) {
        if (decision.equals("accept")) {
            driver.switchTo().alert().accept();
        } else {
            driver.switchTo().alert().dismiss();
        }
    }
}

