package trying;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;

import capbase.BaiduMapCap;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class TestBaiduMapApp extends BaiduMapCap{

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		AndroidDriver<MobileElement> driver = baiduMapCapabilities();
		driver.findElement(By.id("com.baidu.BaiduMap:id/ok_btn")).click();// 初次进入，点选“同意”
		driver.findElement(By.id("com.baidu.BaiduMap:id/btn_car")).click();//点选“驾车”
		driver.findElement(By.id("com.baidu.BaiduMap:id/btn_enter_map")).click();//点选“进入地图”
		driver.findElement(By.id("com.baidu.BaiduMap:id/guide_close")).click();//点选“关闭广告”
		driver.findElement(By.id("com.baidu.BaiduMap:id/tv_searchbox_home_text")).click();//点选搜索框
		driver.findElement(By.id("com.baidu.BaiduMap:id/tvSearchBoxInput")).sendKeys("国贸");// 输入搜索目的地
		driver.findElement(By.id("com.baidu.BaiduMap:id/tvSearchButton")).click();// 点击搜索按钮
		
		TimeUnit.SECONDS.sleep(6);
		driver.quit();
	}
}
