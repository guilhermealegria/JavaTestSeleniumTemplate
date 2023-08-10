package locators;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.w3c.dom.html.HTMLInputElement;

public class LoginPageLocators {
    @FindBy(id = "header")
    public WebElement elementAreaPessoal;
    @FindBy(className = "modal-body")
    public WebElement modalLogin;
}
