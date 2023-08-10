package actions;

import locators.LoginPageLocators;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import utils.HelpDriverClass;

public class LoginPageActions {
    LoginPageLocators locator = new LoginPageLocators();
    HelpDriverClass help = new HelpDriverClass();

    public LoginPageActions(){
        this.locator = new LoginPageLocators();
        PageFactory.initElements(HelpDriverClass.getDriver(), locator);
    }


    public void clickAreaPessoal() {
        locator.elementAreaPessoal.findElement(By.cssSelector("button")).click();
    }

    public boolean modalLoginVisivel() {
        help.getWait(locator.modalLogin.findElement(By.tagName("h3")));
        return locator.modalLogin.findElement(By.tagName("h3")).getText().contains("Bem-vindo novamente!");
    }
}
