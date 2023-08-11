package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.w3c.dom.html.HTMLInputElement;

public class LoginPageLocators {
    @FindBy(xpath = "//button[@aria-label='Área pessoal']")
    public WebElement elementAreaPessoal;
    @FindBy(className = "modal-body")
    public WebElement modalLogin;
    @FindBy(xpath = "//input[@type='email']")
    public WebElement inputEmail;
    @FindBy(xpath = "//input[@type='password']")
    public WebElement inputSenha;
    @FindBy(xpath = "//button[@type='submit']")
    public WebElement botaoIniciarSessao;

    @FindBy(xpath = "//div[@class='container']")
    public WebElement menuMinhaConta;



    @FindBy(xpath = "//button[contains(text(),'Faça login!')]")
    public WebElement clickFacaLogin;
}
