package testcases;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import capbase.BaiduMapCap;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import pages.actions.BaiduMapActions;

public class TestBaiduMapApp extends BaiduMapCap{
	// 打开百度地图app, 搜索“国贸”

	@Test
	public void testBaiduMapApp() throws MalformedURLException, InterruptedException {
		AndroidDriver<MobileElement> driver = baiduMapCapabilities();
		BaiduMapActions baiduMapActions = new BaiduMapActions(driver);
		
		baiduMapActions.clickAgreement();
		baiduMapActions.clickByCar();
		baiduMapActions.clickToEnterMap();
		baiduMapActions.clickToCloseAd();
		baiduMapActions.clickSearchBox();
		baiduMapActions.sendDestnation("国贸");
		baiduMapActions.submitToSearch();
		
		TimeUnit.SECONDS.sleep(6);
		driver.quit();
		
	}
}
