package testPackage;

import org.apache.commons.lang.RandomStringUtils;
import org.testng.Assert;
import org.testng.annotations.Test;
import pagePackage.AddCustomerPage;
import pagePackage.BaseClass;
import pagePackage.LoginPage;

import java.io.IOException;

public class AddCustomerPageTest extends BaseClass {
    @Test
    public void addNewCustomer() throws InterruptedException, IOException {
        LoginPage lp=new LoginPage(driver);
        lp.setUserName(txtUser);
        lp.setPassword(txtPassword);
        lp.clickLoginButton();

        Thread.sleep(3000);

        AddCustomerPage addCustomer=new AddCustomerPage(driver);
        addCustomer.clickCustomer();
        addCustomer.customerName("ann");
        addCustomer.customerGender();
        addCustomer.customerDOB("10","4","1987");
        Thread.sleep(3000);
        addCustomer.customerAddress("INDIA");
        addCustomer.customerCity("HYD");
        addCustomer.customerState("AP");
        addCustomer.customerPin("500074");
        addCustomer.customerPhone("9878900910");
        addCustomer.customerEmail(randomString()+"@gmail.com");
        addCustomer.clickSubmitButton();
        Thread.sleep(3000);
        boolean res=driver.getPageSource().contains("Connection failed: Access denied for user 'root'@'localhost' (using password: NO)");
        if(res==true){
            Assert.assertTrue(true);
            System.out.println("pass");
        }
        else{
            captureScreen(driver,"AddCustomerPage");
            Assert.assertTrue(false);
            System.out.println("fail");
        }





    }


}
