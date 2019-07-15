package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BaiduMapLocators {

	// 初次进入，需点选“同意”
	@FindBy(id="com.baidu.BaiduMap:id/ok_btn")
	public WebElement agree;
	
	//“驾车”元素
	@FindBy(id="com.baidu.BaiduMap:id/btn_car")
	public WebElement byCar;
	
	//“进入地图”元素
	@FindBy(id="com.baidu.BaiduMap:id/btn_enter_map")
	public WebElement enterMap;
	
	//“关闭广告”元素
	@FindBy(id="com.baidu.BaiduMap:id/guide_close")
	public WebElement closeAd;
	
	//进入搜索框元素
	@FindBy(id="com.baidu.BaiduMap:id/tv_searchbox_home_text")
	public WebElement searchBox;
	
	//搜索框元素
	@FindBy(id="com.baidu.BaiduMap:id/tvSearchBoxInput")
	public WebElement searchBoxInput;
	
	//搜索按钮元素
	@FindBy(id="com.baidu.BaiduMap:id/tvSearchButton")
	public WebElement search;
}
