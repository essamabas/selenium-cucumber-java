/*
 * Decompiled with CFR 0_114.
 * 
 * Could not load the following classes:
 *  com.google.common.base.Function
 *  env.BaseTest
 *  org.openqa.selenium.By
 *  org.openqa.selenium.WebDriver
 *  org.openqa.selenium.WebElement
 *  org.openqa.selenium.support.ui.ExpectedConditions
 *  org.openqa.selenium.support.ui.Select
 *  org.openqa.selenium.support.ui.WebDriverWait
 */
package methods;

import com.google.common.base.Function;
import env.BaseTest;
import java.util.List;
import methods.SelectElementByType;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class InputMethods
extends SelectElementByType
implements BaseTest {
    private WebElement dropdown = null;
    private Select selectList = null;

    public void enterText(String accessType, String text, String accessName) {
        wait.until((Function)ExpectedConditions.presenceOfElementLocated((By)this.getelementbytype(accessType, accessName)));
        driver.findElement(this.getelementbytype(accessType, accessName)).sendKeys(new CharSequence[]{text});
    }

    public void clearText(String accessType, String accessName) {
        wait.until((Function)ExpectedConditions.presenceOfElementLocated((By)this.getelementbytype(accessType, accessName)));
        driver.findElement(this.getelementbytype(accessType, accessName)).clear();
    }

    public void selectelementfromdropdownbytype(Select select_list, String bytype, String option) {
        if (bytype.equals("selectByIndex")) {
            int index = Integer.parseInt(option);
            select_list.selectByIndex(index - 1);
        } else if (bytype.equals("value")) {
            select_list.selectByValue(option);
        } else if (bytype.equals("text")) {
            select_list.selectByVisibleText(option);
        }
    }

    public void selectOptionFromDropdown(String accessType, String optionBy, String option, String accessName) {
        this.dropdown = (WebElement)wait.until((Function)ExpectedConditions.presenceOfElementLocated((By)this.getelementbytype(accessType, accessName)));
        this.selectList = new Select(this.dropdown);
        if (optionBy.equals("selectByIndex")) {
            this.selectList.selectByIndex(Integer.parseInt(option) - 1);
        } else if (optionBy.equals("value")) {
            this.selectList.selectByValue(option);
        } else if (optionBy.equals("text")) {
            this.selectList.selectByVisibleText(option);
        }
    }

    public void unselectAllOptionFromMultiselectDropdown(String accessType, String accessName) {
        this.dropdown = (WebElement)wait.until((Function)ExpectedConditions.presenceOfElementLocated((By)this.getelementbytype(accessType, accessName)));
        this.selectList = new Select(this.dropdown);
        this.selectList.deselectAll();
    }

    public void deselectOptionFromDropdown(String accessType, String optionBy, String option, String accessName) {
        this.dropdown = (WebElement)wait.until((Function)ExpectedConditions.presenceOfElementLocated((By)this.getelementbytype(accessType, accessName)));
        this.selectList = new Select(this.dropdown);
        if (optionBy.equals("selectByIndex")) {
            this.selectList.deselectByIndex(Integer.parseInt(option) - 1);
        } else if (optionBy.equals("value")) {
            this.selectList.deselectByValue(option);
        } else if (optionBy.equals("text")) {
            this.selectList.deselectByVisibleText(option);
        }
    }

    public void checkCheckbox(String accessType, String accessName) {
        WebElement checkbox = (WebElement)wait.until((Function)ExpectedConditions.presenceOfElementLocated((By)this.getelementbytype(accessType, accessName)));
        if (!checkbox.isSelected()) {
            checkbox.click();
        }
    }

    public void uncheckCheckbox(String accessType, String accessName) {
        WebElement checkbox = (WebElement)wait.until((Function)ExpectedConditions.presenceOfElementLocated((By)this.getelementbytype(accessType, accessName)));
        if (checkbox.isSelected()) {
            checkbox.click();
        }
    }

    public void toggleCheckbox(String accessType, String accessName) {
        ((WebElement)wait.until((Function)ExpectedConditions.presenceOfElementLocated((By)this.getelementbytype(accessType, accessName)))).click();
    }

    public void selectRadioButton(String accessType, String accessName) {
        WebElement radioButton = (WebElement)wait.until((Function)ExpectedConditions.presenceOfElementLocated((By)this.getelementbytype(accessType, accessName)));
        if (!radioButton.isSelected()) {
            radioButton.click();
        }
    }

    public void selectOptionFromRadioButtonGroup(String accessType, String option, String by, String accessName) {
        List radioButtonGroup = driver.findElements(this.getelementbytype(accessType, accessName));
        for (WebElement rb : radioButtonGroup) {
            if (by.equals("value")) {
                if (!rb.getAttribute("value").equals(option) || rb.isSelected()) continue;
                rb.click();
                continue;
            }
            if (!by.equals("text") || !rb.getText().equals(option) || rb.isSelected()) continue;
            rb.click();
        }
    }
}

