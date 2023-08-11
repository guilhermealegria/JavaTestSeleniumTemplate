package actions;

import locators.CaracteristicadoCertificadoPageLocators;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.HelpDriverClass;

import java.time.Duration;

public class CaracteristicadoCertificadoPageActions {

    CaracteristicadoCertificadoPageLocators locators;
    HelpDriverClass help = new HelpDriverClass();
    Actions actions = new Actions(help.getDriver());
    JavascriptExecutor js = (JavascriptExecutor) help.getDriver();



    public CaracteristicadoCertificadoPageActions() {
        this.locators = new CaracteristicadoCertificadoPageLocators();
        PageFactory.initElements(help.getDriver(), locators);
    }


    public void clicarnoBotaoContinuar() {
        help.getDriver().manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));
        js.executeScript("arguments[0].scrollIntoView();", locators.botaoContinuar);
        locators.botaoContinuar.click();
    }


    public boolean validarExibicaodoModaldeTermoseCondicoes(){
        help.getWaitElementVisivel(locators.modalTermoseCondicoes);
         return  locators.modalTermoseCondicoes.getText().contains("Termos & Condições");
    }

    public void clicarnoCheckboxTermoseCondicoes() {
        help.getWaitElementVisivel(locators.checkBox);
        locators.checkBox.click();
    }

    public void clicarnoLinkdeTermoseCondicoesParadownload() {
        locators.linkTextDownload.click();
    }

    public void clicarnoBotaoContinuarModalTermos() {
        help.getWaitElementHabilito(locators.botaoContinuarModal);
        locators.botaoContinuarModal.click();
    }
}
