package com.stepdefinition;

import org.pojo.BookHotelPOJOClass;
import org.pojo.ConfirmationPOJOClass;
import org.pojo.HotelConfirmPOJOClass;
import org.pojo.LoginPOJOClass;
import org.pojo.SearchHotelPOJOClass;
import com.libglobal.BaseClass;

import io.cucumber.java.en.*;

public class StepDefinition extends BaseClass {

	LoginPOJOClass l;
	SearchHotelPOJOClass s;
	HotelConfirmPOJOClass h;
	BookHotelPOJOClass b;

	@Given("User is on adactin page")
	public void user_is_on_adactin_page() {
		launchBrowser();
		loadUrl("https://adactin.com/HotelApp/");
		maximizeWindow();
	}

	@When("User enters {string}and{string}")
	public void user_enters_and(String userName, String passWord) {
		l = new LoginPOJOClass();
		type(l.getUser(), userName);
		type(l.getPass(), passWord);

	}

	@When("User clicks login button")
	public void user_clicks_login_button() {

		btnClick(l.getLog());

	}

	@Then("User verify success message")
	public void user_verify_success_message() {
		System.out.println("Successfuly login");
	}

	@When("User select {string}and{string}and{string}and{string}and{string}and{string}")
	public void user_select_and_and_and_and_and(String location, String hotel, String roomtp, String roomnums,
			String aproom, String cproom) {
		s = new SearchHotelPOJOClass();
		selectByVisibleText(s.getLocation(), location);
		selectByVisibleText(s.getHotels(), hotel);
		selectByVisibleText(s.getRoomtype(), roomtp);
		selectByVisibleText(s.getRooms(), roomnums);
		selectByVisibleText(s.getAdult_room(), aproom);
		selectByVisibleText(s.getChild_room(), cproom);
	}

	@When("User click search button")
	public void user_click_search_button() {
		btnClick(s.getSubmit());
	}

	@When("User select the Hotel")
	public void user_select_the_Hotel() {
		h = new HotelConfirmPOJOClass();
		btnClick(h.getRadio());
	}

	@When("User click the continue button")
	public void user_click_the_continue_button() {
		btnClick(h.getContinue());
	}

	@When("User enter {string}and{string}and{string}and{string}and{string}and{string}and{string}and{string}")
	public void user_enter_and_and_and_and_and_and_and(String firstnmae, String lastname, String address,
			String ccardno, String cardtype, String emonth, String eyear, String cvv) {
		
		b = new BookHotelPOJOClass();
		type(b.getFname(), firstnmae);
		type(b.getLname(), lastname);
		type(b.getAddress(), address);
		type(b.getCcnum(), ccardno);
		selectByVisibleText(b.getCardtype(), cardtype);
		selectByVisibleText(b.getMonth(), emonth);
		selectByVisibleText(b.getYear(), eyear);
		type(b.getCvv(), cvv);

	}

	@When("User click BookNow button")
	public void user_click_BookNow_button() {
		btnClick(b.getBook());
	}

	@When("User click search hotel")
	public void user_click_search_hotel() {
		ConfirmationPOJOClass c = new ConfirmationPOJOClass();
		
		btnClick(c.getSearchhotel());
		quitBrowser();
	}

}

