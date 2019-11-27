package org.pojo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.libglobal.BaseClass;

public class ConfirmationPOJOClass extends BaseClass {

	public ConfirmationPOJOClass() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(id="search_hotel")
	private WebElement searchhotel;
	public WebElement getSearchhotel() {
		return searchhotel;
	}
	}
