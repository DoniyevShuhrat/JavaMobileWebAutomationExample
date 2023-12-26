package utils;
import io.appium.java_client.remote.MobileCapabilityType;
public interface MobileCapabilityTypeEx extends MobileCapabilityType {
    String APP_PACKAGE = "appPackage";
    String APP_ACTIVITY = "appActivity";
    String ENSURE_WEBVIEWS_HAVEPAGES = "ensureWebviewsHavePages";
    String NATIVE_WEB_SCREENSHOT = "nativeWebScreenshot";
    String CONNECT_HARDWARE_KEYBOARD = "connectHardwareKeyboard";
    String AUTO_GRAND_PERMISSIONS = "autoGrantPermissions";
    String AUTO_ACCEPT_ALERTS = "autoAcceptAlerts";


}
