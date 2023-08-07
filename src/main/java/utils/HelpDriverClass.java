package utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HelpDriverClass {
    private static WebDriver driver;
    private static HelpDriverClass help;
    private HelpDriverClass(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
    }
    public static void setUpDriver() {
        if(help==null){
            help = new HelpDriverClass();
        }
    }
    public static void tearDown() {
        if(driver!=null){
            driver.close();
            driver.quit();
        }
        help = null;
    }

    public static WebDriver getDriver(){
        return driver;
    }

    public static void goToUrl(String url){
        driver.get(url);
    }
}
