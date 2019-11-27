package org.pojo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.libglobal.BaseClass;

public class HotelConfirmPOJOClass extends BaseClass {
	
	public HotelConfirmPOJOClass() {
		PageFactory.initElements(driver,this);
	}
	@FindBy(id="radiobutton_0")
	private WebElement radio;
	@FindBy(id="continue")
	private WebElement Continue;
	public WebElement getRadio() {
		return radio;
	}
	public WebElement getContinue() {
		return Continue;
	}
	
}
