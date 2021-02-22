package org.bridgelabztest;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.bridgelabz.pomwithpagefactory.WebElements;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class LoginPageFactory {
    public  static WebDriver driver = null;
    @Test
    public void loginVerify(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
        driver.get("https://en-gb.facebook.com/login/");

        WebElements locateElements = PageFactory.initElements(driver,WebElements.class);
        locateElements.loginMethod("arya@gmail.com","gatepass");
}
}
