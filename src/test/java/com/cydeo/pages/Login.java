package com.cydeo.pages;

import com.cydeo.utility.ConfigReader;
import com.cydeo.utility.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
    @FindBy(id="ctl00_MainContent_username")
    public WebElement usernameField;

    @FindBy(id="ctl00_MainContent_password")
    public WebElement passwordField;

    @FindBy(id="ctl00_MainContent_login_button")
    public WebElement button;

    public Login() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    public void goTo(){
        Driver.getDriver().get(ConfigReader.read("weborder_url"));
    }

    public void login(String username, String password){
        this.usernameField.sendKeys(username);
        this.passwordField.sendKeys(password);
        this.button.click();
    }
}
