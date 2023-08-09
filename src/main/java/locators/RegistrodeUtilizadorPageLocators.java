package locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.w3c.dom.html.HTMLInputElement;

import java.awt.*;

public class RegistrodeUtilizadorPageLocators {
    @FindBy(name = "privacy")
    public WebElement checkoutBoxAceitarTermo;
    @FindBy(xpath = "//button[@type='submit']")
    public WebElement buttonContinue;

    @FindBy(xpath = "//mtc-txt-input[@formcontrolname='firstName']")
    public WebElement inputName;

    @FindBy(xpath = "//mtc-txt-input[@formcontrolname='lastName']")
    public WebElement inputApelido;
    @FindBy(xpath = "//mtc-txt-input[@formcontrolname='phone']")
    public WebElement inputTelefone;
    @FindBy(xpath ="//mtc-txt-input[@formcontrolname='username']")
    public WebElement inputEmail;

    @FindBy(xpath = "//mtc-txt-input[@formcontrolname='phonePrefix']")
    public WebElement inputPrefixo;
    @FindBy(xpath = "//div[@class='modal-body']")
    public WebElement modalRegistro;
}
