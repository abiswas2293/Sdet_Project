package pagePackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
    public WebDriver driver;

    public LoginPage(WebDriver driver) {
        this.driver = driver;

    }

    //mngr577864
    //zYqAvUj
    By username = By.xpath("//input[@name='uid']");
    By password = By.name("password");

    By button = By.name("btnLogin");

    public void setUserName(String txtUser){
        driver.findElement(username).sendKeys(txtUser);
    }
    public void setPassword(String txtPassword){
        driver.findElement(password).sendKeys(txtPassword);
    }
    public void clickLoginButton(){
        driver.findElement(button).click();
    }


}
