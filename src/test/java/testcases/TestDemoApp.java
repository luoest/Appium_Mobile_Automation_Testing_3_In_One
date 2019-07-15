package testcases;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import capbase.DemoAppCap;
import io.appium.java_client.android.AndroidElement;
import pages.actions.DemoAppActions;
import io.appium.java_client.android.AndroidDriver;

public class TestDemoApp extends DemoAppCap{
	// 操作DemoApp，点击进入WiFi设置并输入"Hello Appium Ya"

	@Test
	public void testDemoApp() throws MalformedURLException, InterruptedException {
		AndroidDriver<AndroidElement> driver = demoAppCapabilities();
		DemoAppActions demoAppActions = new DemoAppActions(driver);
		demoAppActions.clickPreference();
		demoAppActions.clickPreference_dependencies();
		demoAppActions.clickCheckbox();
		demoAppActions.clickWiFi_settings();
		demoAppActions.enterEdit("Hello Appium Ya");
		demoAppActions.clickButton1Submit();
		
		TimeUnit.SECONDS.sleep(1);
		driver.quit();
	}
}
