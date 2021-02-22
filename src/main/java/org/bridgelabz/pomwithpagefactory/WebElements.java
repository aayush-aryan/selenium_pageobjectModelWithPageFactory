package org.bridgelabz.pomwithpagefactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class WebElements {
    WebDriver driver = null;

    @FindBy(xpath = "//INPUT[@id='email']")WebElement emailId;
    @FindBy(how= How.XPATH , using = "//INPUT[@id='pass']")WebElement password;
    @FindBy(how = How.XPATH,using = "//BUTTON[@id='loginbutton']")WebElement loginbutton;

    public WebElements(WebDriver driver) {
        this.driver = driver;
    }

    public void loginMethod(String email, String passwd){
        emailId.sendKeys(email);
        password.sendKeys(passwd);
        loginbutton.click();
    }

}
