package com.trello.qspiders.pom.repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TrelloLoginPage {
	public WebDriver driver;

	public TrelloLoginPage(WebDriver driver) {
		this.driver = driver;

		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath = "//input[@id='user']")
	private WebElement enterMail;

	public WebElement getEnterMail() {
		return enterMail;
	}

	@FindBy(xpath = "//input[@id='login']")
	private WebElement loginContinueButton;

	public WebElement getLoginContinueButton() {
		return loginContinueButton;

	}

}
