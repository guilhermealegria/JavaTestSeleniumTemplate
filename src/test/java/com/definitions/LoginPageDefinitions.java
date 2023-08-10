package com.definitions;

import actions.LoginPageActions;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;


public class LoginPageDefinitions {

    LoginPageActions page = new LoginPageActions();
    @And("clico em area pessoal")
    public void clicarParaModalLogin(){
        page.clickAreaPessoal();
    }

    @Then("modal de login é apresentado com sucesso")
    public void validarExibicaoModalLogin(){
        Assert.assertTrue(page.modalLoginVisivel());
    }
}
