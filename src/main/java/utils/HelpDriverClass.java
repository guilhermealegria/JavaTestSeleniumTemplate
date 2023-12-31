package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class HelpDriverClass {
    private static WebDriver driver;
    private static HelpDriverClass help;

    private static Wait<WebDriver> wait;

    private HelpDriverClass(String browsertype) throws MalformedURLException {
        if(browsertype == "remote") {
            ChromeOptions chromeOpt = new ChromeOptions();
            chromeOpt.setCapability("browserVersion", "101.0");
            chromeOpt.setCapability("platformName", "linux");
            driver = new RemoteWebDriver(new URL("http://192.168.1.10:4444/"), chromeOpt);
        } else if (browsertype == "local"){
            driver = new ChromeDriver();
        }
        driver.manage().deleteAllCookies();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
        this.wait = new WebDriverWait(driver, Duration.ofMillis(10000));

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


    public static void goToUrl(String url) {
        driver.navigate().to(url);
    }

    public static void getWaitElementVisivel(WebElement input){
        wait.until(ExpectedConditions.visibilityOf(input));
    }
    public boolean getBooleanWaitElementVisivel(WebElement input){
        return wait.until( driver -> input.isDisplayed());
    }

    public static boolean getWaitConteudoVisivel(WebElement input, String texto){
        return wait.until(ExpectedConditions.textToBePresentInElement(input,texto));
    }


    public static void getWaitElementHabilito(WebElement botaoContinuarModal) {
        wait.until(ExpectedConditions.elementToBeClickable(botaoContinuarModal));
    }

}
