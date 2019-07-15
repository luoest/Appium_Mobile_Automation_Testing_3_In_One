package pages.locators;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ChromeCtripLocators {

	// 机票选项页面元素
	@FindBy(css="a[id='c_flight']")
	public WebElement flightTicket;
	
	//点击出发城市页面元素
	@FindBy(xpath="//div[@class='city-item city-item-depart']")
	public WebElement departCity;
	
	//输入出发城市页面元素
	@FindBy(xpath="//input[@class='search-bar-input']")
	public WebElement departCityInput;
	
	// 出发城市所有机场
	@FindBy(xpath="//div[@class='children-class block']//div//span[@class='other']")
	public List<WebElement> allStartAirpots;
	
	//下滑项中带有“首都国际机场”的页面元素
//	@FindBy(xpath="//span[contains(text(),'首都国际机场')]")
//	public WebElement targetAirport;

	// 达到城市页面元素
	@FindBy(xpath="//div[@class='city-item city-item-dest']")
	public WebElement destCity;
	
	//输入到达城市页面元素
	@FindBy(xpath="//input[@class='search-bar-input']")
	public WebElement destCityInput;
	
	@FindBy(xpath="//div[@class='children-class block']//div//span[@class='other']")
	public List<WebElement> allDestAirpots;

//	//下滑项中带有“澳门”选项的页面元素
//	@FindBy(xpath="//span[contains(text(),'澳门')]")
//	public WebElement destCityAirport;
	
	// 搜索按钮页面元素
	@FindBy(xpath="//span[@class='plus-button']")
	public WebElement search;
	
}
