package com.definitions;

import actions.CaracteristicadoCertificadoPageActions;
import actions.LoginPageActions;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utils.HelpDriverClass;

import java.net.MalformedURLException;

public class HookSteps {
    LoginPageActions page = new LoginPageActions();

    @Before
    public static void before_setUp() throws MalformedURLException {
        HelpDriverClass.setUpDriver("remote");
    }

    @After
    public static void after_tearDown(Scenario scenario) {
        if(scenario.isFailed()) {
            final byte[] screenshot = ((TakesScreenshot) HelpDriverClass.getDriver()).getScreenshotAs(OutputType.BYTES);
            scenario.attach(screenshot, "image/png", scenario.getName());
        }
            HelpDriverClass.tearDown();
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

    @When("efetuo login com sucesso")
    public void preencherCamposdeLogincomUsuarioValido()  {
        page.preencherLoginSucess("guilhermemoraes.3@gmail.com", "@Alegria1991");
        page.clickBotaoIniciarSessao();
    }
    @And("efetuo login com sucesso na area de login")
    public void preencherCamposdeLoginDepois(){
        page.clicarEmlogin();
        page.preencherLoginSucess("guilhermemoraes.3@gmail.com", "@Alegria1991");
        page.clickBotaoIniciarSessao();
    }

}
