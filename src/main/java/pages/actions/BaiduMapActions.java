package pages.actions;

import java.net.MalformedURLException;

import org.openqa.selenium.support.PageFactory;
import capbase.BaiduMapCap;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import pages.locators.BaiduMapLocators;

public class BaiduMapActions extends BaiduMapCap{
	// 初始化打开百度地图app后，到完成搜索目标地点的所有步骤
	public BaiduMapLocators baiduMapLocators;

	public BaiduMapActions(AndroidDriver<MobileElement> driver) throws MalformedURLException {
		this.baiduMapLocators = new BaiduMapLocators();
		PageFactory.initElements(driver, this.baiduMapLocators);
	}
	
	public void clickAgreement() {
		baiduMapLocators.agree.click();
	}
	
	public void clickByCar() {
		baiduMapLocators.byCar.click();
	}
	
	public void clickToEnterMap() {
		baiduMapLocators.enterMap.click();
	}
	
	public void clickToCloseAd() {
		baiduMapLocators.closeAd.click();
	}
	
	public void clickSearchBox() {
		baiduMapLocators.searchBox.click();
	}
	
	public void sendDestnation(String location) {
		baiduMapLocators.searchBoxInput.sendKeys(location);
	}
	
	public void submitToSearch() {
		baiduMapLocators.search.click();
	}
}



















