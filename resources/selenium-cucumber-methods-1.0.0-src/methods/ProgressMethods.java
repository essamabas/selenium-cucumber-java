/*
 * Decompiled with CFR 0_114.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Function
 *  env.BaseTest
 *  org.openqa.selenium.By
 *  org.openqa.selenium.WebDriver
 *  org.openqa.selenium.support.ui.ExpectedConditions
 *  org.openqa.selenium.support.ui.WebDriverWait
 */
package methods;

import com.google.common.base.Function;
import env.BaseTest;
import methods.SelectElementByType;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ProgressMethods
extends SelectElementByType
implements BaseTest {
    public void wait(String time) throws NumberFormatException, InterruptedException {
        Thread.sleep(Integer.parseInt(time) * 1000);
    }

    public void waitForElementToDisplay(String accessType, String accessName, String duration) {
        By byEle = this.getelementbytype(accessType, accessName);
        WebDriverWait wait = new WebDriverWait(driver, (long)(Integer.parseInt(duration) * 1000));
        wait.until((Function)ExpectedConditions.visibilityOfElementLocated((By)byEle));
    }

    public void waitForElementToClick(String accessType, String accessName, String duration) {
        By byEle = this.getelementbytype(accessType, accessName);
        WebDriverWait wait = new WebDriverWait(driver, (long)(Integer.parseInt(duration) * 1000));
        wait.until((Function)ExpectedConditions.elementToBeClickable((By)byEle));
    }
}

