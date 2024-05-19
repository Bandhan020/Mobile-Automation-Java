import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class CreateDriverSession {
    public static void main(String[]args) throws MalformedURLException {
        DesiredCapabilities caps=new DesiredCapabilities();
        caps.setCapability("platformName","Android");
        caps.setCapability("udid","R28M41DFL6V");
        caps.setCapability("automationName","uiautomator2");
        caps.setCapability("app","D:\\Automation2024\\Test Apk\\ApiDemos-debug.apk");

        /*try {
            URL url = new URL("http://0.0.0.0:4723");
            // Use the 'url' object as needed
        } catch (Exception e) {
            e.printStackTrace(); // Handle any potential exceptions
        }*/

        URL url = new URL("http://0.0.0.0:4723");
        AppiumDriver driver = new AndroidDriver(url,caps);
    }
}
