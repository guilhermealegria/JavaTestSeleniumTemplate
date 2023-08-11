package actions;

import locators.LoginPageLocators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import utils.HelpDriverClass;

import java.time.Duration;
import java.util.List;

public class LoginPageActions {
    LoginPageLocators locator = new LoginPageLocators();
    HelpDriverClass help = new HelpDriverClass();
    Actions act = new Actions(help.getDriver());

    public LoginPageActions(){
        this.locator = new LoginPageLocators();
        PageFactory.initElements(HelpDriverClass.getDriver(), locator);
    }


    public void clickAreaPessoal() {
        locator.elementAreaPessoal.click();
    }

    public boolean modalLoginVisivel() {
        help.getWaitElementVisivel(locator.modalLogin.findElement(By.tagName("h3")));
        return locator.modalLogin.findElement(By.tagName("h3")).getText().contains("Bem-vindo novamente!");
    }

    public void preencherLoginSucess(String mail, String s) {
        help.getWaitElementVisivel(locator.inputEmail);
        help.getWaitElementVisivel(locator.inputSenha);
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
        act.moveToElement(locator.menuMinhaConta.findElement(By.xpath(""))).click().perform();
        help.getWaitElementVisivel(locator.menuMinhaConta.findElement(By.xpath("mtc-dropdown/div/ul")));
        List<WebElement> listMenu = locator.menuMinhaConta.findElements(By.xpath("mtc-dropdown/div/ul/li"));
        return listMenu.size() == 3;
    }

    public void clicarEmlogin() {
        help.getWaitElementVisivel(locator.clickFacaLogin);
        act.moveToElement(locator.clickFacaLogin).click().perform();
        act.pause(Duration.ofSeconds(2));
    }
}
