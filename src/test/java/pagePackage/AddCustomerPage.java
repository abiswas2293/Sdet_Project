package pagePackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddCustomerPage {
    WebDriver driver;
    public AddCustomerPage(WebDriver driver){
        this.driver=driver;
    }
By newCustomer= By.xpath("//a[text()='New Customer']");
    By name=By.name("name");
    By gender=By.xpath("//input[@name='rad1'][1]");
    By dob=By.id("dob");
    By address=By.name("addr");
    By city=By.name("city");
    By state=By.name("state");
    By pin=By.name("pinno");
    By phone=By.name("telephoneno");
    By email=By.name("emailid");
    By submitButton=By.name("sub");

    public void clickCustomer(){
        driver.findElement(newCustomer).click();
    }
    public void customerName(String cName){
        driver.findElement(name).sendKeys(cName);
    }
    public void customerGender(){
        driver.findElement(gender).click();
    }
    public void customerDOB(String dd,String mm,String yy){
        driver.findElement(dob).sendKeys(dd);
        driver.findElement(dob).sendKeys(mm);
        driver.findElement(dob).sendKeys(yy);
    }
    public void customerAddress(String cAddress){
        driver.findElement(address).sendKeys(cAddress);

    }
    public void customerCity(String cCity){
        driver.findElement(city).sendKeys(cCity);

    }
    public void customerState(String cState){
        driver.findElement(state).sendKeys(cState);
    }
    public void customerPin(String cPin){
        driver.findElement(pin).sendKeys(String.valueOf(cPin));
    }
    public void customerPhone(String cPhone){
        driver.findElement(phone).sendKeys(cPhone);
    }
    public void customerEmail(String cEmail){
        driver.findElement(email).sendKeys(cEmail);
    }
    public void clickSubmitButton(){
        driver.findElement(submitButton).click();
    }


}
