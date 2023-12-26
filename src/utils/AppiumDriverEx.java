package utils;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.remote.MobileCapabilityType;

import java.net.URL;
import java.util.concurrent.TimeUnit;

public class AppiumDriverEx {
    public static AppiumDriver<MobileElement> getAppiumDriver(){
        AppiumDriver<MobileElement> appiumDriver = null;
        try {
            String appPath = "F:\\Code\\QA\\APKs/Delivery_debug.apk";
            // Set DesiredCapabilities to send to Appium server
            DesiredCapabilities desiredCapabilities = new DesiredCapabilities();
            desiredCapabilities.setCapability(MobileCapabilityTypeEx.PLATFORM_NAME, "Android");
            desiredCapabilities.setCapability(MobileCapabilityTypeEx.AUTOMATION_NAME, "uiautomator2");
            desiredCapabilities.setCapability(MobileCapabilityTypeEx.APP, appPath);

            //desiredCapabilities.setCapability(MobileCapabilityType.UDID, "");
            //desiredCapabilities.setCapability(MobileCapabilityTypeEx.APP_PACKAGE, "com.wdiodemoapp");
            //desiredCapabilities.setCapability(MobileCapabilityTypeEx.APP_ACTIVITY, "com.wdiodemoapp.MainActivity");
            //desiredCapabilities.setCapability(MobileCapabilityTypeEx.NEW_COMMAND_TIMEOUT, 120);

            desiredCapabilities.setCapability(MobileCapabilityTypeEx.ENSURE_WEBVIEWS_HAVEPAGES, true);
            desiredCapabilities.setCapability(MobileCapabilityTypeEx.NATIVE_WEB_SCREENSHOT, true);
            desiredCapabilities.setCapability(MobileCapabilityTypeEx.NEW_COMMAND_TIMEOUT, 3600);
            desiredCapabilities.setCapability(MobileCapabilityTypeEx.CONNECT_HARDWARE_KEYBOARD, true);
            desiredCapabilities.setCapability(MobileCapabilityTypeEx.AUTO_GRAND_PERMISSIONS, true);
            desiredCapabilities.setCapability(MobileCapabilityTypeEx.AUTO_ACCEPT_ALERTS, true);

            URL serverUri = new URL("http://localhost:4725/wd/hub");
            appiumDriver = new AppiumDriver<>(serverUri, desiredCapabilities);
            appiumDriver.manage().timeouts().implicitlyWait(30L, TimeUnit.SECONDS);

        } catch (Exception ex){
            System.out.println("Exception in AppiumDriverEx: " + ex.getMessage());
            ex.printStackTrace();
        }
        return appiumDriver;
    }
}
