/*
 * Decompiled with CFR 0_114.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Function
 *  env.BaseTest
 *  org.openqa.selenium.By
 *  org.openqa.selenium.JavascriptExecutor
 *  org.openqa.selenium.WebDriver
 *  org.openqa.selenium.WebElement
 *  org.openqa.selenium.interactions.Actions
 *  org.openqa.selenium.support.ui.ExpectedConditions
 *  org.openqa.selenium.support.ui.WebDriverWait
 */
package methods;

import com.google.common.base.Function;
import env.BaseTest;
import methods.SelectElementByType;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ClickElementsMethods
extends SelectElementByType
implements BaseTest {
    private WebElement element = null;

    public void click(String accessType, String accessName) {
        this.element = (WebElement)wait.until((Function)ExpectedConditions.presenceOfElementLocated((By)this.getelementbytype(accessType, accessName)));
        this.element.click();
    }

    public void clickForcefully(String accessType, String accessName) {
        this.element = (WebElement)wait.until((Function)ExpectedConditions.presenceOfElementLocated((By)this.getelementbytype(accessType, accessName)));
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].click();", new Object[]{this.element});
    }

    public void doubleClick(String accessType, String accessValue) {
        this.element = (WebElement)wait.until((Function)ExpectedConditions.presenceOfElementLocated((By)this.getelementbytype(accessType, accessValue)));
        Actions action = new Actions(driver);
        action.moveToElement(this.element).doubleClick().perform();
    }
}

