package locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class CertificadoPagamentoPageLocators {
    @FindBy(xpath = "//mtc-txt-input[@formcontrolname='entityName']")
    public WebElement inputnomeFiscal;
    @FindBy(xpath = "//mtc-txt-input[@formcontrolname='nif']")
    public WebElement inputNif;
    @FindBy(xpath = "//mtc-txt-input[@formcontrolname='address']")
    public WebElement inputMorada;
    @FindBy(xpath = "//mtc-txt-input[@formcontrolname='zipCode']")
    public WebElement inputCP;
    @FindBy(xpath = "//mtc-txt-input[@formcontrolname='addressZone']")
    public WebElement inputLocalidade;

    @FindBy(name = "country")
    public WebElement country;
    @FindBy(xpath = "//*[contains(@id,'payLater')]")
    public WebElement buttonPagarMaistarde;

    @FindBy(xpath = "//input[@type='email']")
    public WebElement inputEmailParaEnvio;
    @FindBy(xpath = "//*[contains(text(),'Continuar')]")
    public WebElement buttonContinuardePagamento;

    @FindBy(xpath = "//h3[contains(text(),'Pedido efetuado com sucesso!')]")
    public WebElement textSucess;

}
