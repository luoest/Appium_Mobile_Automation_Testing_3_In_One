package pages.actions;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import pages.locators.ChromeCtripLocators;

public class ChromeCtripActions {
	// ��ʼ����chrome�������������Ʊ�����в���
	public ChromeCtripLocators chromeCtripLocators;
	public ChromeCtripActions(AndroidDriver<MobileElement> driver) {
		this.chromeCtripLocators = new ChromeCtripLocators();
		PageFactory.initElements(driver, this.chromeCtripLocators);
	}
	
	public void clickFlightTicket() {
		chromeCtripLocators.flightTicket.click();
	}
	public void clickDepartCity() {
		chromeCtripLocators.departCity.click();
	}
	public void enterDepartCity(String fromCity) {
		chromeCtripLocators.departCityInput.sendKeys(fromCity);
	}
	// ����ʼ������ѡ�����
	public void selectFromStartAirpots(String targetAirport) {
		List<WebElement> airports = chromeCtripLocators.allStartAirpots;
		int fromCityAirs = chromeCtripLocators.allStartAirpots.size();
		for(int num=0; num<fromCityAirs; num++) {
			String airport = airports.get(num).getText();
			System.out.println("��ʼ���л�����" + airport);
			if (airport.contains(targetAirport)) {
				airports.get(num).click();
				break;
			}
		}
	}
	public void clickDestCity() {
		chromeCtripLocators.destCity.click();
	}
	public void enterDestCity(String toCity) {
		chromeCtripLocators.departCityInput.sendKeys(toCity);
	}
	// ѡ�񵽴���л���
	public void selectFromDestAirpots(String targetAirport) {
		List<WebElement> airports = chromeCtripLocators.allDestAirpots;
		int toCityAirs = chromeCtripLocators.allDestAirpots.size();
		for(int num=0; num<toCityAirs; num++) {
			String airport = airports.get(num).getText();
			System.out.println("������л�����" + airport);
			if (airport.contains(targetAirport)) {
				airports.get(num).click();
				break;
			}
		}
	}
	public void clickSearchBtn() {
		chromeCtripLocators.search.click();
	}
}

