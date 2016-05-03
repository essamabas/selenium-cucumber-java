/*
 * Decompiled with CFR 0_114.
 */
package methods;

import java.io.PrintStream;
import java.util.Arrays;

public class ErrorHandlingMethods {
    public void validateParameters(String platform, String browserType, String appPath) {
        if (platform.equals("desktop")) {
            if (Arrays.asList("ff", "ie", "chrome", "safari", "opera").contains(browserType)) {
                this.printErrorDesktop();
            }
        } else if (platform.equals("android")) {
            this.printErrorAndroid(browserType, appPath);
        } else if (platform.equals("iOS")) {
            System.out.println("Not Implemented...");
        } else {
            this.printInvalidPlatform();
        }
    }

    private void printErrorDesktop() {
        System.out.println("\nInappropraite desktop browser : \"#{ENV['BROWSER']}\"");
        System.out.println("\nUsage : cucumber BROWSER=browser_name");
        System.out.println("\nBrowser Supported  :\n");
        System.out.println("\n1.ie\n2.chrome\n3.ff\n4.safari\n5.opera");
        System.exit(0);
    }

    public void printErrorAndroid(String browserType, String appPath) {
    }

    public void printInvalidPlatform() {
        System.out.println("\nOops... Invalid Platform");
        System.out.println("\nSupported platform are \"android\" and \"iOS\".");
        System.out.println("\nTo run on Desktop no need to mention platform.");
        System.exit(0);
    }
}

