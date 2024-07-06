package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {
    Properties pro;

    public ReadConfig(String propFileName) {
        File src = new File("Configurations/" + propFileName + ".properties");
        try {
            FileInputStream fis = new FileInputStream(src);
            pro = new Properties();
            pro.load(fis);

        } catch (Exception e) {
            System.out.println("Exception is" + e.getMessage());
        }
    }

    public String getApplicationUrl() {
        String url = pro.getProperty("baseUrl");

        return url;
    }

    public String getUsername() {
        String username = pro.getProperty("txtUser");
        return username;
    }

    public String getPassword() {
        String password = pro.getProperty("txtPassword");
        return password;
    }


    /*public static void main(String args[]){
        ReadConfig read=new ReadConfig();
        System.out.println(read.getPassword());
    }*/
}

