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
    Actions actions = new Actions(HelpDriverClass.getDriver());
    JavascriptExecutor js = (JavascriptExecutor) HelpDriverClass.getDriver();



    public CaracteristicadoCertificadoPageActions() {
        this.locators = new CaracteristicadoCertificadoPageLocators();
        PageFactory.initElements(HelpDriverClass.getDriver(), locators);
    }


    public void clicarnoBotaoContinuar() {
        HelpDriverClass.getDriver().manage().timeouts().pageLoadTimeout(Duration.ofSeconds(5));
        js.executeScript("arguments[0].scrollIntoView();", locators.botaoContinuar);
        locators.botaoContinuar.click();
    }


    public boolean validarExibicaodoModaldeTermoseCondicoes(){
        HelpDriverClass.getWaitElementVisivel(locators.modalTermoseCondicoes);
         return  locators.modalTermoseCondicoes.getText().contains("Termos & Condições");
    }

    public void clicarnoCheckboxTermoseCondicoes() {
        HelpDriverClass.getWaitElementVisivel(locators.checkBox);
        locators.checkBox.click();
    }

    public void clicarnoLinkdeTermoseCondicoesParadownload() {
        locators.linkTextDownload.click();
    }

    public void clicarnoBotaoContinuarModalTermos() {
        HelpDriverClass.getWaitElementHabilito(locators.botaoContinuarModal);
        locators.botaoContinuarModal.click();
    }
}
