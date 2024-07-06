package pagePackage;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.commons.io.FileUtils;
import org.apache.commons.lang.RandomStringUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import utilities.ReadConfig;

import java.io.File;
import java.io.IOException;

public class BaseClass {
    ReadConfig readconfig=new ReadConfig("config");
  //public String baseUrl=readconfig.getApplicationUrl();
   public String baseUrl = "https://demo.guru99.com/V1/index.php";

   //public String txtUser=readconfig.getUsername();
    public String txtUser = "mngr577864";

   // public String txtPassword=readconfig.getPassword();
   public String txtPassword = "zYqAvUj";
    public static WebDriver driver;

    @BeforeClass
    public void SetUp() {
        driver = new FirefoxDriver();
        WebDriverManager.firefoxdriver().setup();
        driver.get(baseUrl);

    }

  /*  @AfterClass
    public void tearDown(){
        driver.quit();
    }*/
    public void captureScreen(WebDriver driver,String tname) throws IOException{
        TakesScreenshot ts=(TakesScreenshot) driver;
        File source=ts.getScreenshotAs(OutputType.FILE);
        File target=new File(System.getProperty("user,dir")+"/Screenshots/"+tname+".png");
        FileUtils.copyFile(source,target);
        System.out.println("Screenshot taken");
    }
    public String randomString(){
        String generateString= RandomStringUtils.randomAlphabetic(8);
        return generateString;
    }
    public int randomNumber(){
        String generateNumber=RandomStringUtils.randomNumeric(4);
        return  Integer.parseInt(generateNumber);
    }
}
