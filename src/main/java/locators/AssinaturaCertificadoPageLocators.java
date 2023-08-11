package locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.w3c.dom.html.HTMLInputElement;

public class AssinaturaCertificadoPageLocators {
    @FindBy(xpath = "//div[@class='view-choose-certificate']/main/div/label")
    public WebElement tipoUtilizacao;
    @FindBy(id = "individual_particular")
    public WebElement botaoComprar;
    @FindBy(xpath = "//div[@id='cert-filter']//div/div/label[2]/input")
    public WebElement fimdeUtilizacaoPessoal;

    @FindBy(xpath = "//div[@id='cert-filter']//div/div/label/input")
    public WebElement fimdeUtilizacaoProfissional;
}
