package locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;
import java.util.logging.XMLFormatter;

public class CaracteristicadoCertificadoPageLocators {

    @FindBy(xpath = "//button[contains(text(),'Continuar')]")
    public WebElement botaoContinuar;
    @FindBy(xpath = "//h3[contains(text(),'Termos & Condições')]")
    public WebElement modalTermoseCondicoes;

    @FindBy(xpath = "//input[@formcontrolname='termsAndConditions']")
    public WebElement checkBox;
    @FindBy(xpath = "//div[@class = 'modal-body']//form/label/span/a")
    public WebElement linkTextDownload;
    @FindBy(xpath = "//div[@class='ta-c']//button")
    public WebElement botaoContinuarModal;



    @FindBy(xpath = "//h3[contains(text(),'Dados incorretos')]")
    public WebElement modalDadosIncorretos;
}
