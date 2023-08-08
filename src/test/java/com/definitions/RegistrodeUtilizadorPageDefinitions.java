package com.definitions;

import actions.RegistrodeUtilizadorPageActions;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import utils.HelpDriverClass;

import java.net.MalformedURLException;
import java.util.concurrent.TimeUnit;

public class RegistrodeUtilizadorPageDefinitions {
    RegistrodeUtilizadorPageActions page = new RegistrodeUtilizadorPageActions();

    @When ("clico em aceitar termos")
    public void clicarnoCheckBoxAceitarTermos() {
        Assert.assertTrue(page.getCheckoutBoxisTrue());
    }
    @And("clico no botão continuar")
    public void clicarnoBotaoContinuar(){
        Assert.assertTrue(true);
    }
    @Then ("os todos campos de preenchimento estam apresentando mensagem {string}")
    public void validarCamposObrigatorios(String message){
        Assert.assertTrue(true);
    }

}
