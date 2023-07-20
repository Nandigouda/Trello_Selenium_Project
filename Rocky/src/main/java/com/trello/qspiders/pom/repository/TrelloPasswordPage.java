package com.trello.qspiders.pom.repository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TrelloPasswordPage {
	WebDriver driver;

	public TrelloPasswordPage(WebDriver driver) {
		this.driver = driver;

		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@id='password']")
	private WebElement enterPwd;

	public WebElement getEnterPwd() {
		return enterPwd;
	}

	@FindBy(xpath = "//span[text()='Log in']")
	private WebElement clickOnPwdButton;

	public WebElement getClickOnPwdButton() {
		return clickOnPwdButton;

	}

}
