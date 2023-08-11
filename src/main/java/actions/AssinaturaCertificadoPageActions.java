package actions;

import locators.AssinaturaCertificadoPageLocators;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import utils.HelpDriverClass;

public class AssinaturaCertificadoPageActions {
    AssinaturaCertificadoPageLocators locators;
    HelpDriverClass help = new HelpDriverClass();
    Actions actions = new Actions(help.getDriver());
    public AssinaturaCertificadoPageActions(){
        this.locators = new AssinaturaCertificadoPageLocators();
        PageFactory.initElements(HelpDriverClass.getDriver(), locators);
    }

    public void selecionarUtilizacaodoProduto(String utlizacao) {
        switch (utlizacao){
            case "Pessoas ou Organizações":
                locators.tipoUtilizacao.isEnabled();
                break;
        }

    }
    public void selecionarFimdeUtilizacaodoProduto(String fim) {
        switch (fim){
            case "Pessoal":
                actions.moveToElement(locators.fimdeUtilizacaoPessoal).click().perform();
                break;
            case "Profissional":
                actions.moveToElement(locators.fimdeUtilizacaoProfissional).click().perform();
                break;
        }
    }

    public void clicarNoBotaoComprarParaaOpcaodeAssinatura(String opcao) {
        switch (opcao){
            case "Individual Particular":
                    actions.moveToElement(locators.botaoComprar.findElement(By.xpath("div[2]/div/a"))).click().perform();
                break;

        }
    }


}
