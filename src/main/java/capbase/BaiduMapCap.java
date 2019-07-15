package capbase;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class BaiduMapCap {
	
	public static AndroidDriver<MobileElement> baiduMapCapabilities() throws MalformedURLException {
		// ��ʼ��BaiduMapCap driver������BaiduMapApp
		AndroidDriver<MobileElement> driver;
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "Android device");
		/*��ȡappPackage��appActivity��Ϣ��
		�ֻ��е㿪���app��
		cmd������ָ�adb shell��֮�������ʾ����ָ�dumpsys activity | grep mFocusedActivity*/
		capabilities.setCapability("appPackage", "com.baidu.BaiduMap");
		capabilities.setCapability("appActivity", "com.baidu.baidumaps.MapsActivity");
		capabilities.setCapability(MobileCapabilityType.NEW_COMMAND_TIMEOUT, "100");
		
		capabilities.setCapability("unicodeKeyboard", true); // ���ÿ�����������
		capabilities.setCapability("resetKeyboard", true);
		
		driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		return driver;
	}
}
