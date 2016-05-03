/*
 * Decompiled with CFR 0_114.
 * 
 * Could not load the following classes:
 *  env.BaseTest
 *  org.apache.commons.io.FileUtils
 *  org.openqa.selenium.OutputType
 *  org.openqa.selenium.TakesScreenshot
 *  org.openqa.selenium.WebDriver
 */
package methods;

import env.BaseTest;
import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class ScreenShotMethods
implements BaseTest {
    public void takeScreenShot() throws IOException {
        File scrFile = (File)((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMddHHmmss");
        Calendar cal = Calendar.getInstance();
        System.out.println(dateFormat.format(cal.getTime()));
        String scrFilepath = scrFile.getAbsolutePath();
        System.out.println("scrFilepath: " + scrFilepath);
        File currentDirFile = new File("Screenshots");
        String path = currentDirFile.getAbsolutePath();
        System.out.println("path: " + path + "+++");
        System.out.println("****\n" + path + "\\screenshot" + dateFormat.format(cal.getTime()) + ".png");
        FileUtils.copyFile((File)scrFile, (File)new File(String.valueOf(path) + "\\screenshot" + dateFormat.format(cal.getTime()) + ".png"));
    }
}

