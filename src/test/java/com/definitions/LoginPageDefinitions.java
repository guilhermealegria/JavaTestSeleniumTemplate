package com.definitions;

import actions.LoginPageActions;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;


public class LoginPageDefinitions {

    LoginPageActions page = new LoginPageActions();
    @And("acesso a area pessoal")
    public void clicarParaModalLogin(){
        page.clickAreaPessoal();
    }

    @Then("modal de login é apresentado com sucesso")
    public void validarExibicaoModalLogin(){
        Assert.assertTrue(page.modalLoginVisivel());
    }

    @Then ("o menu minha conta apresenta as opções {string} {string} {string}")
    public void validarSessaoIniciadadoUsuario(String menuUm, String menuDois, String menuTres){
        Assert.assertTrue(page.validarSessaodoUsuario());
    }
}
