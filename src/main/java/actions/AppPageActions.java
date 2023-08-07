package actions;

import locators.AppPageLocators;
import org.openqa.selenium.support.PageFactory;
import utils.HelpDriverClass;

public class AppPageActions {

    AppPageLocators locators = null;

    public AppPageActions(){
        this.locators = new AppPageLocators();
        PageFactory.initElements(HelpDriverClass.getDriver(), locators);
    }
    public static boolean getTitle() {
        return true;

    }
}
