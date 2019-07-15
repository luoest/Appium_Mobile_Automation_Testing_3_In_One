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
		driver.findElement(By.id("com.baidu.BaiduMap:id/ok_btn")).click();// ���ν��룬��ѡ��ͬ�⡱
		driver.findElement(By.id("com.baidu.BaiduMap:id/btn_car")).click();//��ѡ���ݳ���
		driver.findElement(By.id("com.baidu.BaiduMap:id/btn_enter_map")).click();//��ѡ�������ͼ��
		driver.findElement(By.id("com.baidu.BaiduMap:id/guide_close")).click();//��ѡ���رչ�桱
		driver.findElement(By.id("com.baidu.BaiduMap:id/tv_searchbox_home_text")).click();//��ѡ������
		driver.findElement(By.id("com.baidu.BaiduMap:id/tvSearchBoxInput")).sendKeys("��ó");// ��������Ŀ�ĵ�
		driver.findElement(By.id("com.baidu.BaiduMap:id/tvSearchButton")).click();// ���������ť
		
		TimeUnit.SECONDS.sleep(6);
		driver.quit();
	}
}
