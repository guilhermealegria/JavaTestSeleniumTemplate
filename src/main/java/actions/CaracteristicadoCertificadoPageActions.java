package actions;

import locators.CaracteristicadoCertificadoPageLocators;
import org.openqa.selenium.support.PageFactory;
import utils.HelpDriverClass;

public class CaracteristicadoCertificadoPageActions {

    CaracteristicadoCertificadoPageLocators locators = new CaracteristicadoCertificadoPageLocators();
    
    public CaracteristicadoCertificadoPageActions(){
        this.locators = new CaracteristicadoCertificadoPageLocators();
        PageFactory.initElements(HelpDriverClass.getDriver(), locators);
    }

    public void selecionarFormatodoCertificado(String texto){
        
    }

    public void selecionaroTempodeUtilizacaodoCertificado(String tempo) {
    }

    public void selecionarTempodeEmissaodoCertificado(String emissao) {
        
    }

    public void clicarnoBotaoContinuar() {
        
    }

    public void validarExibicaodoModaldeTermoseCondicoes() {
    }

    public void clicarnoCheckboxTermoseCondicoes() {
    }

    public void clicarnoLinkdeTermoseCondicoesParadownload() {
    }

    public void clicarnoBotaoContinuarModalTermos() {
    }
}
