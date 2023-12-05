package Config;

import com.aventstack.extentreports.ExtentReports;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.Setting;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class Base {
    public static AppiumDriver<MobileElement> driver;

    public static DesiredCapabilities capabilities;

    @BeforeClass
    public static void initialization() {

        try {
            capabilities = new DesiredCapabilities();
            capabilities.setCapability("udid", "emulator-5554");
            capabilities.setCapability("platformName", "Android");
            capabilities.setCapability("appPackage", "staging.cicle");
            capabilities.setCapability("appActivity", "staging.cicle.MainActivity");
            capabilities.setCapability("noReset", true);



            URL url = new URL("http://127.0.0.1:4723/wd/hub");
            driver = new AppiumDriver<MobileElement>(url, capabilities);
            driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
            driver.setSetting(Setting.WAIT_FOR_IDLE_TIMEOUT, 1000);

        } catch (MalformedURLException e) {
            e.printStackTrace();
        }

    }
    @AfterClass
    public static void tearDown() throws Exception {
        //    Thread.sleep(3000);
        //     driver.closeApp();
    }
}
