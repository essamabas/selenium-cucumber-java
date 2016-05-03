/*
 * Decompiled with CFR 0_114.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Function
 *  env.BaseTest
 *  org.openqa.selenium.By
 *  org.openqa.selenium.Dimension
 *  org.openqa.selenium.JavascriptExecutor
 *  org.openqa.selenium.Keys
 *  org.openqa.selenium.WebDriver
 *  org.openqa.selenium.WebDriver$Navigation
 *  org.openqa.selenium.WebDriver$Options
 *  org.openqa.selenium.WebDriver$TargetLocator
 *  org.openqa.selenium.WebDriver$Window
 *  org.openqa.selenium.WebElement
 *  org.openqa.selenium.interactions.Actions
 *  org.openqa.selenium.support.ui.ExpectedConditions
 *  org.openqa.selenium.support.ui.WebDriverWait
 */
package methods;

import com.google.common.base.Function;
import env.BaseTest;
import java.util.Iterator;
import java.util.Set;
import methods.SelectElementByType;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class NavigateMethods
extends SelectElementByType
implements BaseTest {
    private WebElement element = null;
    private String old_win = null;
    private String lastWinHandle;

    public void navigateTo(String url) {
        driver.get(url);
    }

    public void navigate(String direction) {
        if (direction.equals("back")) {
            driver.navigate().back();
        } else {
            driver.navigate().forward();
        }
    }

    public void closeDriver() {
        driver.quit();
    }

    public Keys getKey() {
        String os = System.getProperty("os.name").toLowerCase();
        if (os.contains("win")) {
            return Keys.CONTROL;
        }
        if (os.contains("nux") || os.contains("nix")) {
            return Keys.CONTROL;
        }
        if (os.contains("mac")) {
            return Keys.COMMAND;
        }
        return null;
    }

    public void zoomInOut(String inOut) {
        WebElement Sel = driver.findElement(this.getelementbytype("tagName", "html"));
        if (inOut.equals("ADD")) {
            Sel.sendKeys(new CharSequence[]{Keys.chord((CharSequence[])new CharSequence[]{this.getKey(), Keys.ADD})});
        } else if (inOut.equals("SUBTRACT")) {
            Sel.sendKeys(new CharSequence[]{Keys.chord((CharSequence[])new CharSequence[]{this.getKey(), Keys.SUBTRACT})});
        } else if (inOut.equals("reset")) {
            Sel.sendKeys(new CharSequence[]{Keys.chord((CharSequence[])new CharSequence[]{this.getKey(), Keys.NUMPAD0})});
        }
    }

    public void zoomInOutTillElementDisplay(String accessType, String inOut, String accessName) {
        Actions action = new Actions(driver);
        this.element = (WebElement)wait.until((Function)ExpectedConditions.presenceOfElementLocated((By)this.getelementbytype(accessType, accessName)));
        while (!this.element.isDisplayed()) {
            action.keyDown(this.getKey()).sendKeys(new CharSequence[]{inOut}).keyUp(this.getKey()).perform();
        }
    }

    public void resizeBrowser(int width, int height) {
        driver.manage().window().setSize(new Dimension(width, height));
    }

    public void maximizeBrowser() {
        driver.manage().window().maximize();
    }

    public void hoverOverElement(String accessType, String accessName) {
        Actions action = new Actions(driver);
        this.element = (WebElement)wait.until((Function)ExpectedConditions.presenceOfElementLocated((By)this.getelementbytype(accessType, accessName)));
        action.moveToElement(this.element).perform();
    }

    public void scrollToElement(String accessType, String accessName) {
        this.element = (WebElement)wait.until((Function)ExpectedConditions.presenceOfElementLocated((By)this.getelementbytype(accessType, accessName)));
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        executor.executeScript("arguments[0].scrollIntoView();", new Object[]{this.element});
    }

    public void scrollPage(String to) throws Exception {
        JavascriptExecutor executor = (JavascriptExecutor)driver;
        if (to.equals("end")) {
            executor.executeScript("window.scrollTo(0,Math.max(document.documentElement.scrollHeight,document.body.scrollHeight,document.documentElement.clientHeight));", new Object[0]);
        } else if (to.equals("top")) {
            executor.executeScript("window.scrollTo(Math.max(document.documentElement.scrollHeight,document.body.scrollHeight,document.documentElement.clientHeight),0);", new Object[0]);
        } else {
            throw new Exception("Exception : Invalid Direction (only scroll \"top\" or \"end\")");
        }
    }

    public void switchToNewWindow() {
        this.old_win = driver.getWindowHandle();
        Iterator iterator = driver.getWindowHandles().iterator();
        while (iterator.hasNext()) {
            String winHandle;
            this.lastWinHandle = winHandle = (String)iterator.next();
        }
        driver.switchTo().window(this.lastWinHandle);
    }

    public void switchToOldWindow() {
        driver.switchTo().window(this.old_win);
    }

    public void switchToWindowByTitle(String windowTitle) throws Exception {
        this.old_win = driver.getWindowHandle();
        boolean winFound = false;
        for (String winHandle : driver.getWindowHandles()) {
            String str = driver.switchTo().window(winHandle).getTitle();
            if (!str.equals(windowTitle)) continue;
            winFound = true;
            break;
        }
        if (!winFound) {
            throw new Exception("Window having title " + windowTitle + " not found");
        }
    }

    public void closeNewWindow() {
        driver.close();
    }

    public void switchFrame(String accessType, String accessName) {
        if (accessType.equalsIgnoreCase("index")) {
            driver.switchTo().frame(accessName);
        } else {
            this.element = (WebElement)wait.until((Function)ExpectedConditions.presenceOfElementLocated((By)this.getelementbytype(accessType, accessName)));
            driver.switchTo().frame(this.element);
        }
    }

    public void switchToDefaultContent() {
        driver.switchTo().defaultContent();
    }
}

