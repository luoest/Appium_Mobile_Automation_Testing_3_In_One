package pages.locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DemoAppLocators {

	@FindBy(xpath="//android.widget.TextView[@text='Preference']")
	public WebElement Preference;
	
	@FindBy(xpath="//android.widget.TextView[@text='3. Preference dependencies']")
	public WebElement Preference_dependencies;
	
	@FindBy(id="android:id/checkbox")
	public WebElement checkbox;
	
	@FindBy(xpath="//android.widget.TextView[@text='WiFi settings']")
	public WebElement WiFi_settings;
	
	// 发送字符到设置中
	@FindBy(id="android:id/edit")
	public WebElement edit;
	
	@FindBy(id="android:id/button1")
	public WebElement button1Submit;
	
}
