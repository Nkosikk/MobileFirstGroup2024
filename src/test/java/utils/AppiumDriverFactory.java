package utils;

import io.appium.java_client.AppiumDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class AppiumDriverFactory {
    public static AppiumDriver driver;

    public static AppiumDriverFactory instanceOfAppiumDriverFactory = null;

    public AppiumDriverFactory() {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("appium:automationName", "UiAutomator2");
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("appium:autoGrantPermission", true);
        capabilities.setCapability("autoAcceptAlert", true);
        capabilities.setCapability("appium:app", System.getProperty("user.dir") + "/src/main/Apps/ApiDemos-debug.apk");

    }
}
