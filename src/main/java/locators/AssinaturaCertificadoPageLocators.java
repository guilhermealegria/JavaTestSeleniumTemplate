package locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.w3c.dom.html.HTMLInputElement;

public class AssinaturaCertificadoPageLocators {
    @FindBy(xpath = "//div[@class='view-choose-certificate']/main/div")
    public WebElement tipoUtilizacao;
    @FindBy(id = "individual_particular")
    public WebElement botaoComprar;
    @FindBy(xpath = "//div[@class='view-choose-certificate']/main/mtc-cert-filter")
    public WebElement fimdeUtilizacao;
}
