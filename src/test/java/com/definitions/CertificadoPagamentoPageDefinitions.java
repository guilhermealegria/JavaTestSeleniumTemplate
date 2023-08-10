package com.definitions;

import actions.CertificadoPagamentoPageActions;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class CertificadoPagamentoPageDefinitions {
    CertificadoPagamentoPageActions page = new CertificadoPagamentoPageActions();

    @And("preencho os dados para pagamento")
    public void preencherDadosparaPagamento(){
        page.preenchoosDadosparaPagamento();
    }
    @And("seleciono o método de pagamento como {String}")
    public void selecionarMetododePagamento(String metodo){
        page.selecionooMetododePagamento(metodo);
    }
    @And ("preencho os dados para envio de pagamento")
    public void preencherDadosparaEnviodePagamento(){
        page.preenchoEmailParaenviodePagamento();
    }
    @And("cliclo no botão continuar pagamento")
    public void clicarnoBotaoContinuardePagamento(){
        page.cliconoBotaoContinuardePagamento();
    }
    @Then("é apresentado modal com mensagem a mensagem de sucesso {string}")
    public void validarModaldePedidocomSucesso(String mensagem){
        Assert.assertTrue(page.validarMensagemdeSucessodoPedido(mensagem));
    }
}
