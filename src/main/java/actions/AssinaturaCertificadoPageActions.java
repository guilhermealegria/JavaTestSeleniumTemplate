package actions;

import locators.AssinaturaCertificadoPageLocators;
import locators.CaracteristicadoCertificadoPageLocators;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import utils.HelpDriverClass;

public class AssinaturaCertificadoPageActions {
    AssinaturaCertificadoPageLocators locators = new AssinaturaCertificadoPageLocators();
    public AssinaturaCertificadoPageActions(){
        this.locators = new AssinaturaCertificadoPageLocators();
        PageFactory.initElements(HelpDriverClass.getDriver(), locators);
    }

    public void selecionarUtilizacaodoProduto(String utlizacao) {
        switch (utlizacao){
            case "Pessoas ou Organizações":
                locators.tipoUtilizacao.findElement(By.cssSelector("label")).isEnabled();
                break;
        }

    }

    public void clicarNoBotaoComprarParaaOpcaodeAssinatura(String opcao) {

        locators.botaoComprar.findElement(By.cssSelector("div > div")).click();
    }

    public void selecionarFimdeUtilizacaodoProduto(String fim) {
        switch (fim){
            case "Pessoal":
                locators.fimdeUtilizacao.click();
                break;
        }
    }
}
