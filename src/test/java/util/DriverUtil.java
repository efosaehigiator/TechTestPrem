package util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverUtil {

    public static WebDriver driver;

    public void setDriver(String Browser){
        if(driver == null){
            if (Browser.equalsIgnoreCase("firefox")) {
                System.setProperty("webdriver.gecko.driver","C:\\DRIVERS\\geckodriver.exe");
            }
            driver = new FirefoxDriver();


        /*   if (Browser.equalsIgnoreCase("chrome")) {
               System.setProperty("webdriver.chrome.driver","C:\\DRIVERS\\ChromeDriver.exe");
           }
           driver = new ChromeDriver();  */
        }
    }

    public void closeDriver(){

        driver.quit();
    }
}
