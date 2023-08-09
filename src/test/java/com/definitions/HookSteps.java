package com.definitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import org.junit.Assert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utils.HelpDriverClass;

import java.net.MalformedURLException;

public class HookSteps {

    @Before
    public static void before_setUp() throws MalformedURLException {
        HelpDriverClass.setUpDriver("local");
    }

    @After
    public static void after_tearDown(Scenario scenario) {
        if(scenario.isFailed()) {
            final byte[] screenshot = ((TakesScreenshot) HelpDriverClass.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", scenario.getName());
        } else {
            HelpDriverClass.tearDown();
        }
    }

    @Given("o navegador está aberto")
    public void openBrowser() throws MalformedURLException {
        Assert.assertTrue(HelpDriverClass.getDriver() != null);
    }
    @And("navego a pagina para registro de utilizador")
    public void acessUrl(){
        HelpDriverClass.goToUrl("https://teste.multicert.com/onlinestore/?lang=pt&redirect=%2Forder%2Fcdqi%2Fcharacteristics");
    }

    @And ("navego a pagina de loja online")
    public void acessUrlLoja(){
        HelpDriverClass.goToUrl("https://teste.multicert.com/onlinestore/?lang=pt");
    }

}
