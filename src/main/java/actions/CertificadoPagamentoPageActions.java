package actions;

import locators.CertificadoPagamentoPageLocators;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import utils.HelpDataUserClass;
import utils.HelpDriverClass;
import utils.UserClass;

public class CertificadoPagamentoPageActions {

    CertificadoPagamentoPageLocators locators;
    HelpDataUserClass data = new HelpDataUserClass();
    UserClass usuario = data.getUser();


    Actions act = new Actions(HelpDriverClass.getDriver());
    JavascriptExecutor js = (JavascriptExecutor) HelpDriverClass.getDriver();

    public CertificadoPagamentoPageActions() throws Exception {
        this.locators = new CertificadoPagamentoPageLocators();
        PageFactory.initElements(HelpDriverClass.getDriver(), locators);
    }

    public void selecionooMetododePagamento(String metodo) {
        switch (metodo){
            case "Pagar mais  tarde":
                locators.buttonPagarMaistarde.findElement(By.cssSelector("span")).click();
                break;
        }
    }

    public void preenchoosDadosparaPagamento() {
        locators.inputnomeFiscal.findElement(By.tagName("input")).sendKeys(usuario.getFirst_name());
        locators.inputNif.findElement(By.tagName("input")).sendKeys("386333966");
        js.executeScript("arguments[0].scrollIntoView();", locators.inputLocalidade);
        locators.inputMorada.findElement(By.tagName("input")).sendKeys("Rua teste abelardo bueno");
        locators.inputCP.findElement(By.tagName("input")).sendKeys("4480-666");
        locators.inputLocalidade.findElement(By.tagName("input")).sendKeys("Vila do Conde");
        locators.country.click();
        Select selecPais = new Select(locators.country);
        selecPais.selectByVisibleText("Portugal");
    }

    public void preenchoEmailParaenviodePagamento() {
        locators.inputEmailParaEnvio.sendKeys(usuario.getEmail());
    }

    public void cliconoBotaoContinuardePagamento() {
        locators.buttonContinuardePagamento.click();
    }

    public boolean validarMensagemdeSucessodoPedido(String mensagem) {
        return HelpDriverClass.getWaitConteudoVisivel(locators.textSucess, mensagem);
    }
}
