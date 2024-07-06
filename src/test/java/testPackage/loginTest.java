package testPackage;

import com.aventstack.extentreports.ExtentTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import pagePackage.BaseClass;
import pagePackage.LoginPage;

import java.io.IOException;


public class loginTest extends BaseClass {


    @Test
    public void loginTest() throws IOException {

        LoginPage lp = new LoginPage(driver);
        lp.setUserName(txtUser);
        lp.setPassword(txtPassword);
        lp.clickLoginButton();


        if (driver.getCurrentUrl().equals("https://demo.guru99.com/V1/html/Managerhomepage.php")) {
            Assert.assertTrue(true);
           // logger.info("login test passes");
        } else {
            captureScreen(driver,"logintest fail");
            Assert.assertTrue(false);
           // logger.info("Login test failed");
        }


    }


}
