package actions;

import locators.CertificadoPagamentoPageLocators;
import org.openqa.selenium.support.PageFactory;
import utils.HelpDriverClass;

public class CertificadoPagamentoPageActions {

    CertificadoPagamentoPageLocators locators;

    public CertificadoPagamentoPageActions(){
        this.locators = new CertificadoPagamentoPageLocators();
        PageFactory.initElements(HelpDriverClass.getDriver(), locators);
    }

    public void selecionooMetododePagamento(String metodo) {
    }

    public void preenchoosDadosparaPagamento() {
    }

    public void preenchoEmailParaenviodePagamento() {
    }

    public void cliconoBotaoContinuardePagamento() {
    }

    public boolean validarMensagemdeSucessodoPedido(String mensagem) {
        return true;
    }
}
