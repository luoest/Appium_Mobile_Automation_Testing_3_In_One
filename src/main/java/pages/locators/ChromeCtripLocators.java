package pages.locators;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ChromeCtripLocators {

	// ��Ʊѡ��ҳ��Ԫ��
	@FindBy(css="a[id='c_flight']")
	public WebElement flightTicket;
	
	//�����������ҳ��Ԫ��
	@FindBy(xpath="//div[@class='city-item city-item-depart']")
	public WebElement departCity;
	
	//�����������ҳ��Ԫ��
	@FindBy(xpath="//input[@class='search-bar-input']")
	public WebElement departCityInput;
	
	// �����������л���
	@FindBy(xpath="//div[@class='children-class block']//div//span[@class='other']")
	public List<WebElement> allStartAirpots;
	
	//�»����д��С��׶����ʻ�������ҳ��Ԫ��
//	@FindBy(xpath="//span[contains(text(),'�׶����ʻ���')]")
//	public WebElement targetAirport;

	// �ﵽ����ҳ��Ԫ��
	@FindBy(xpath="//div[@class='city-item city-item-dest']")
	public WebElement destCity;
	
	//���뵽�����ҳ��Ԫ��
	@FindBy(xpath="//input[@class='search-bar-input']")
	public WebElement destCityInput;
	
	@FindBy(xpath="//div[@class='children-class block']//div//span[@class='other']")
	public List<WebElement> allDestAirpots;

//	//�»����д��С����š�ѡ���ҳ��Ԫ��
//	@FindBy(xpath="//span[contains(text(),'����')]")
//	public WebElement destCityAirport;
	
	// ������ťҳ��Ԫ��
	@FindBy(xpath="//span[@class='plus-button']")
	public WebElement search;
	
}
