package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Pom {
	WebDriver driver;

	public Pom(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[@class='ico-register']")
	private WebElement Register;

	@FindBy(id = "gender-male")
	private WebElement Gender;

	@FindBy(id = "FirstName")
	private WebElement firstname;

	@FindBy(id = "LastName")
	private WebElement lastname;

	@FindBy(id = "Email")
	private WebElement email;

	@FindBy(id = "Password")
	private WebElement password;

	@FindBy(id = "ConfirmPassword")
	private WebElement confirmpassword;

	@FindBy(id = "register-button")
	private WebElement save;

	@FindBy(xpath = "(//a[contains(text(),'Electronics')])[3]")

	private WebElement ElecButton;

	@FindBy(xpath = "(//input[@type='button'])[3]")

	private WebElement AddToCart;

	@FindBy(xpath = "(//a[contains(text(),'Cell phones')])[3]")

	private WebElement CellLink;

	@FindBy(xpath = "//img[@title='Show products in category Cell phones']")
	private WebElement phoneLink;
	@FindBy(xpath = "//a[text()='Log in']")

	private WebElement Login;

	@FindBy(xpath = "//input[@value='Log in']")

	private WebElement LoginMail;

	@FindBy(xpath = "(//a[contains(text(),'Gift Cards')])[1]")

	private WebElement giftCard;

	@FindBy(xpath = "//a[@title='Show details for $5 Virtual Gift Card']")

	private WebElement linkiftCard;

	@FindBy(id = "giftcard_1_RecipientName")

	private WebElement recName;

	@FindBy(id = "giftcard_1_RecipientEmail")

	private WebElement recEmail;

	@FindBy(id = "giftcard_1_SenderName")

	private WebElement recSenderName;

	@FindBy(id = "giftcard_1_SenderEmail")

	private WebElement recSenderEmail;

	@FindBy(id = "giftcard_1_Message")

	private WebElement recSenderMsg;

	@FindBy(xpath = "(//input[@type='button'])[5]")

	private WebElement emailBtn;

	@FindBy(id = "FriendEmail")

	private WebElement frndMail;

	@FindBy(name = "send-email")
		
	private WebElement submitMail;

	@FindBy(xpath = "(//a[@href='/computers'])[1]")

 	private WebElement computerLink;

    @FindBy(xpath = "//img[@title='Show products in category Desktops']")

 	private WebElement desktopLink;

    @FindBy(id = "products-orderby")

 	private WebElement sortProduct;

 	@FindBy(xpath = "//img[@alt='Picture of Build your own expensive computer']")

 	private WebElement selectProduct;

	@FindBy(xpath = "//input[@value='Add to compare list']")

	private WebElement addCmpListBtn;

	@FindBy(xpath = "//a[@class='ico-logout']")

	private WebElement logoutBtn;
	
	public WebDriver getDriver() {
		return driver;
	}

	public WebElement getRegister() {
		return Register;
	}

	public WebElement getGender() {
		return Gender;
	}

	public WebElement getFirstname() {
		return firstname;
	}

	public WebElement getLastname() {
		return lastname;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getConfirmpassword() {
		return confirmpassword;
	}

	public WebElement getSave() {
		return save;
	}

	public WebElement getLogin() {
		return Login;
	}

	public WebElement getLoginMail() {
		return LoginMail;
	}

	public WebElement getElecButton() {
		return ElecButton;
	}

	public WebElement getAddToCart() {
		return AddToCart;
	}

	public WebElement getCellLink() {
		return CellLink;
	}

	public WebElement getPhoneLink() {
		return phoneLink;
	}

	public WebElement getGiftCard() {
		return giftCard;
	}

	public WebElement getLinkiftCard() {
		return linkiftCard;
	}

	public WebElement getRecName() {
		return recName;
	}

	public WebElement getRecEmail() {
		return recEmail;
	}

	public WebElement getRecSenderName() {
		return recSenderName;
	}

	public WebElement getRecSenderEmail() {
		return recSenderEmail;
	}

	public WebElement getRecSenderMsg() {
		return recSenderMsg;
	}

	public WebElement getEmailBtn() {
		return emailBtn;
	}

	public WebElement getFrndMail() {
		return frndMail;
	}

	public WebElement getSubmitMail() {
		return submitMail;
	}

	public WebElement getComputerLink() {
		return computerLink;
	}

	public WebElement getDesktopLink() {
		return desktopLink;
	}

	public WebElement getSortProduct() {
		return sortProduct;
	}

	public WebElement getSelectProduct() {
		return selectProduct;
	}

	public WebElement getAddCmpListBtn() {
		return addCmpListBtn;
	}

	public WebElement getLogoutBtn() {
		return logoutBtn;
	}
}
