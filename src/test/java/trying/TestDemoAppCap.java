package trying;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import capbase.DemoAppCap;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class TestDemoAppCap extends DemoAppCap{

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// 进入WIFI设置并发送字符
		AndroidDriver<AndroidElement> driver = demoAppCapabilities();
		driver.findElementByXPath("//android.widget.TextView[@text='Preference']").click();
		driver.findElement(By.xpath("//android.widget.TextView[@text='3. Preference dependencies']")).click();
		driver.findElement(By.id("android:id/checkbox")).click();
		driver.findElement(By.xpath("//android.widget.TextView[@text='WiFi settings']")).click();
		driver.findElement(By.id("android:id/edit")).sendKeys("Hello Appium");
		driver.findElement(By.id("android:id/button1")).click();
		TimeUnit.SECONDS.sleep(3);
		driver.quit();
	}
}
