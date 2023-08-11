package com.definitions;

import actions.AssinaturaCertificadoPageActions;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AssinaturaCertificadoPageDefinitions {
    AssinaturaCertificadoPageActions page = new AssinaturaCertificadoPageActions();

    //Steps da pagina de seleção de opções de assinatura


    @When("seleciono a utilização do produto como {string}")
    public void selecionarUtilizacaodoProduto(String utlizacao){
        page.selecionarUtilizacaodoProduto(utlizacao);
    }
    @And("Seleciono o fim de utilização como {string}")
    public void selecionarFimdeUtilizacao(String fim){
        page.selecionarFimdeUtilizacaodoProduto(fim);
    }
    @And("clico no botão Comprar na opção de {string}")
    public void clicarnoBotaoComprar(String opcao){
        page.clicarNoBotaoComprarParaaOpcaodeAssinatura(opcao);
    }

}
