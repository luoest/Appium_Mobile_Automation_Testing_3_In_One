package testcases;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import capbase.DemoAppCap;
import io.appium.java_client.android.AndroidElement;
import pages.actions.DemoAppActions;
import utilities.StartAndStopServer;
import io.appium.java_client.android.AndroidDriver;

public class TestDemoApp extends DemoAppCap{
	// ����DemoApp���������WiFi���ò�����"Hello Appium Ya"

	@Test
	public void testDemoApp() throws MalformedURLException, InterruptedException {
		
		StartAndStopServer startAndStopServer = new StartAndStopServer();
		startAndStopServer.startServer();
		
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
		startAndStopServer.stopServer();
	}
}
