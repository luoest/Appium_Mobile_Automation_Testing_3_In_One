package pages.actions;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import pages.locators.DemoAppLocators;

public class DemoAppActions {
	// 初始化打开DemoApp后，对WiFi设置输入信息的所有步骤

	DemoAppLocators demoAppLocators;
	public DemoAppActions(AndroidDriver<AndroidElement> driver) {
		this.demoAppLocators = new DemoAppLocators();
		PageFactory.initElements(driver, this.demoAppLocators);
	}
	public void clickPreference() {
		demoAppLocators.Preference.click();
	}
	public void clickPreference_dependencies() {
		demoAppLocators.Preference_dependencies.click();
	}
	public void clickCheckbox() {
		demoAppLocators.checkbox.click();
	}
	public void clickWiFi_settings() {
		demoAppLocators.WiFi_settings.click();
	}
	public void enterEdit(String value) {
		demoAppLocators.edit.sendKeys(value);
	}
	public void clickButton1Submit() {
		demoAppLocators.button1Submit.click();
	}
	
}
