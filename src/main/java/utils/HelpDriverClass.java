package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class HelpDriverClass {
    private static WebDriver driver;
    private static HelpDriverClass help;
    private HelpDriverClass(String browsertype) throws MalformedURLException {
        if(browsertype == "remote") {
            ChromeOptions chromeOpt = new ChromeOptions();
            chromeOpt.setCapability("browserVersion", "114.0");
            chromeOpt.setCapability("platformName", "linux");
            driver = new RemoteWebDriver(new URL("https://selenium-hub.appai.org.br/"), chromeOpt);
        } else if (browsertype == "local"){
            driver = new ChromeDriver();
        }
        driver.manage().window().maximize();
    }
    public static void setUpDriver(String browsertype) throws MalformedURLException {
        if(help==null){
            help = new HelpDriverClass(browsertype);
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
