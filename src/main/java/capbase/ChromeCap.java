package capbase;

import static org.testng.Assert.assertEquals;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class ChromeCap {

	public static AndroidDriver<MobileElement> driver;
	public static AndroidDriver<MobileElement> chromeCapabilities() throws MalformedURLException {
		// ��ʼ��ChromeCap driver������chrome�����
		DesiredCapabilities capabilities= new DesiredCapabilities();
		capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Android device");
		capabilities.setCapability(MobileCapabilityType.BROWSER_NAME, "chrome");
		
		driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;
	}
	
	public static void isTitleEqual(String expected, int seconds) throws InterruptedException {
		// ����ʵ��Ԫ����Ԥ���Ƿ���������ж�ִ���Ƿ�ɹ���
		TimeUnit.SECONDS.sleep(seconds);
		String actual = driver.getTitle();
		try {
			assertEquals(actual, expected);
		} catch (AssertionError e) {
			e.printStackTrace();
		}
		
	}
	
	public static void quitBrowser() {
		driver.quit();
	}
}
