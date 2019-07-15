package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BaiduMapLocators {

	// ���ν��룬���ѡ��ͬ�⡱
	@FindBy(id="com.baidu.BaiduMap:id/ok_btn")
	public WebElement agree;
	
	//���ݳ���Ԫ��
	@FindBy(id="com.baidu.BaiduMap:id/btn_car")
	public WebElement byCar;
	
	//�������ͼ��Ԫ��
	@FindBy(id="com.baidu.BaiduMap:id/btn_enter_map")
	public WebElement enterMap;
	
	//���رչ�桱Ԫ��
	@FindBy(id="com.baidu.BaiduMap:id/guide_close")
	public WebElement closeAd;
	
	//����������Ԫ��
	@FindBy(id="com.baidu.BaiduMap:id/tv_searchbox_home_text")
	public WebElement searchBox;
	
	//������Ԫ��
	@FindBy(id="com.baidu.BaiduMap:id/tvSearchBoxInput")
	public WebElement searchBoxInput;
	
	//������ťԪ��
	@FindBy(id="com.baidu.BaiduMap:id/tvSearchButton")
	public WebElement search;
}
