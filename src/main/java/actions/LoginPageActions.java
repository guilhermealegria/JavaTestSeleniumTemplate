package actions;

import locators.LoginPageLocators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import utils.HelpDriverClass;

import java.util.List;

public class LoginPageActions {
    LoginPageLocators locator = new LoginPageLocators();
    HelpDriverClass help = new HelpDriverClass();


    public LoginPageActions(){
        this.locator = new LoginPageLocators();
        PageFactory.initElements(HelpDriverClass.getDriver(), locator);
    }


    public void clickAreaPessoal() {
        locator.elementAreaPessoal.click();
    }

    public boolean modalLoginVisivel() {
        help.getWait(locator.modalLogin.findElement(By.tagName("h3")));
        return locator.modalLogin.findElement(By.tagName("h3")).getText().contains("Bem-vindo novamente!");
    }

    public void preencherLoginSucess(String mail, String s) {
        help.getWait(locator.inputEmail);
        help.getWait(locator.inputSenha);
        locator.inputEmail.sendKeys(mail);
        locator.inputSenha.sendKeys(s);
    }

    public void clickBotaoIniciarSessao() {
        locator.botaoIniciarSessao.click();

    }

    public boolean validarSessaodoUsuario() {
        return (getListMenu());
    }

    private boolean getListMenu() {
        Actions act = new Actions(HelpDriverClass.getDriver());
        act.moveToElement(locator.elementAreaPessoal).click().perform();
        help.getWait(locator.menuMinhaConta.findElement(By.cssSelector("mtc-dropdown > div > ul")));
        List<WebElement> listMenu = locator.menuMinhaConta.findElements(By.cssSelector("mtc-dropdown > div > ul > li"));
        return listMenu.size() == 3;
    }
}
