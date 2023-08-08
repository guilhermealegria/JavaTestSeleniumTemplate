package actions;

import locators.RegistrodeUtilizadorPageLocators;
import org.openqa.selenium.support.PageFactory;
import utils.HelpDriverClass;

public class RegistrodeUtilizadorPageActions {

    RegistrodeUtilizadorPageLocators locator = null;
    public RegistrodeUtilizadorPageActions(){
        this.locator = new RegistrodeUtilizadorPageLocators();
        PageFactory.initElements(HelpDriverClass.getDriver(), locator);
    }


    public boolean getCheckoutBoxisTrue() {
        return (locator.checkoutBoxAceitarTermo!=null && locator.checkoutBoxAceitarTermo.isDisplayed())  ;
    }
}
