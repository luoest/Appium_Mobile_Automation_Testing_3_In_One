package trying;

import java.net.MalformedURLException;
import org.openqa.selenium.By;

import capbase.ChromeCap;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class TestChromeCap extends ChromeCap{

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		AndroidDriver<MobileElement> driver = chromeCapabilities();
		driver.get("https://www.ctrip.com");
		driver.findElement(By.cssSelector("a[id='c_flight']")).click();//点选机票
		driver.findElement(By.xpath("//div[@class='city-item city-item-depart']")).click();//点击出发城市
		driver.findElement(By.xpath("//input[@class='search-bar-input']")).sendKeys("北京");//输入出发城市
		driver.findElement(By.xpath("//span[contains(text(),'首都国际机场')]")).click();//点选下滑项中带有“首都国际机场”的选项
		
		driver.findElement(By.xpath("//div[@class='city-item city-item-dest']")).click();// 点选达到城市
		driver.findElement(By.xpath("//input[@class='search-bar-input']")).sendKeys("澳门");//输入到达城市
		driver.findElement(By.xpath("//span[contains(text(),'澳门')]")).click();//点选下滑项中带有“澳门”的选项
		driver.findElement(By.xpath("//span[@class='plus-button']")).click(); // 点击搜索按钮
		
		
		isTitleEqual("北京 ⇀ 澳门", 6); //断言标题，根据实际情况设置等待时间
		
		quitBrowser();
	}
}
