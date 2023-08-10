package com.definitions;

import actions.CaracteristicadoCertificadoPageActions;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CaracteristicaCertificadoPageDefinitions {
    CaracteristicadoCertificadoPageActions page = new CaracteristicadoCertificadoPageActions();
    @Then("clico no botão Continuar com as caracteristicas do certificado em default")
    public void clicarnoBotaoContinuarcomInformacoesDefault(){
        page.clicarnoBotaoContinuar();
    }
    @And("o modal de termos e condições é apresentado")
    public void validarExibicaoModalTermos(){
        page.validarExibicaodoModaldeTermoseCondicoes();
    }
    @Then("clico no link de termos e condições para download")
    public void clicarNoLinkdeTermosparaDowload(){
        page.clicarnoLinkdeTermoseCondicoesParadownload();
    }

    @And("clico no checkBox termos e condições")
    public void clicarnoCheckBoxTermoseCondicoes(){
        page.clicarnoCheckboxTermoseCondicoes();
    }

    @When("clico no botão Continuar no modal de Termos e condições")
    public void clicaremContinuar(){
        page.clicarnoBotaoContinuarModalTermos();
;    }
}
