package testcases;

import java.net.MalformedURLException;

import org.testng.annotations.Test;

import capbase.ChromeCap;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import pages.actions.ChromeCtripActions;

public class TestChromeCtripSearch extends ChromeCap{
	// 在手机chrome浏览器中搜索从北京到上海的机票信息

	@Test
	public void testChromeCtripSearch() throws MalformedURLException, InterruptedException {
		AndroidDriver<MobileElement> driver = chromeCapabilities();
		ChromeCtripActions chromeCtripActions = new ChromeCtripActions(driver);
		driver.get("https://www.ctrip.com");
		
		chromeCtripActions.clickFlightTicket();
		chromeCtripActions.clickDepartCity();
		chromeCtripActions.enterDepartCity("北京");
		chromeCtripActions.selectFromStartAirpots("首都国际机场");
		chromeCtripActions.clickDestCity();
		chromeCtripActions.enterDestCity("上海");
		chromeCtripActions.selectFromDestAirpots("虹桥");
		chromeCtripActions.clickSearchBtn();
		
		isTitleEqual("北京 ⇀ 上海", 6); //断言标题，根据实际情况设置等待时间
		
		quitBrowser();
		
	}
}
