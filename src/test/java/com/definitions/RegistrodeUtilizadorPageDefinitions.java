package com.definitions;

import actions.RegistrodeUtilizadorPageActions;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;



public class RegistrodeUtilizadorPageDefinitions {
    RegistrodeUtilizadorPageActions page = new RegistrodeUtilizadorPageActions();

    public RegistrodeUtilizadorPageDefinitions() throws Exception {
    }


    @When ("clico em aceitar termos")
    public void clicarnoCheckBoxAceitarTermos() throws InterruptedException {
        Thread.sleep(5000);
        page.clickCheckoutBoxPrivacy();
    }
    @And("clico no botão continuar")
    public void clicarnoBotaoContinuar(){
        page.clickInButtonContinuar();
    }
    @Then ("todos os campos de preenchimento obrigatório estam apresentando mensagem {string}")
    public void validarMensagemCamposObrigatorios(String message) throws InterruptedException {
        Assert.assertTrue(page.viewMessageForFieldObrigated(message));
    }

    @Then ("o botão continuar está desabilitado")
    public void validarBotaoContinuarDesabilitado(){
        Assert.assertFalse(page.buttonContinuarDisabled());
    }

    @When ("preencho os campos  {string} {string} {string} {string}")
    public void preencherCamposObrigatorios(String name, String lastname, String telefone, String email){
        page.preencherCamposObrigatórios(name, lastname, telefone, email);
    }
    @And ("a politica de privacidade não está marcada")
    public void validarCheckedPoliticadePrivacidade(){
        Assert.assertFalse(page.validateCheckedPoliticadePrivacidade());
    }

    @When ("preencho o campo apelido com valor diferente de letras {string}")
    public void preenchoCampoApelidocomValorIncorreto(String texto){
        page.preencherCampoApelido(texto);
    }
    @When ("preencho o campo nome com valor diferente de letras {string}")
    public void preenchoCampoNomecomValorIncorreto(String texto){
        page.preencherCampoNome(texto);
    }

    @When ("preencho o campo telefone com valor diferente de numeros {string}")
    public void preenchoCampoTelefonecomValorIncorreto(String texto){
        page.preencherCampoTelefone(texto);
    }

    @And("preencho o campo prefixo com formato inválido {string}")
    public void preencherCampoPrefixocomValorIncorreto(String texto){
        page.preencherCampoPrefixo(texto);
    }
    @Then ("é apresentada mensagem indicativa no campo nome {string}")
    public void validarMensagemdeErronoCampoNome(String mensagem){
        Assert.assertTrue(page.validarMensagemdeErronoCampoNome(mensagem));
    }

    @Then ("é apresentada mensagem indicativa no campo apelido {string}")
    public void validarMensagemdeErronoCampoApelido(String mensagem){
        Assert.assertTrue(page.validarMensagemdeErronoCampoApelido(mensagem));
    }

    @Then ("é apresentada mensagem indicativa no campo telefone {string}")
    public void validarMensagemdeErronoCampoTelefone(String mensagem){
        Assert.assertTrue(page.validarMensagemdeErronoCampoTelefone(mensagem));
    }

    @When ("preencho o campo e-mail com formato inválido {string}")
    public void preenchoCampoEmailcomFormatoInvalido(String texto){
        page.preencherCampoEmail(texto);
    }

    @Then ("é apresentada mensagem indicativa no campo e-mail {string}")
    public void validarMensagemdeErronoCampoEmail(String mensagem){
        Assert.assertTrue(page.validarMensagemdeErronoCampoEmail(mensagem));
    }

    @When ("apago o valor default do campo prefixo")
    public void apagarValorDefaultdoCampoPrefixo(){
        Assert.assertTrue(page.validarCampoPrefixoVazio());
    }

    @Then ("é apresentada mensagem indicativa no campo prefixo {string}")
    public void validarMensagemdeCampoObrigatorioPrefixo(String mensagem){
        Assert.assertTrue(page.validarMensagemdeIndicativaCampoPrefixo(mensagem));
    }

    @When ("preencho o campo nome nome")
    public void preenchoCampoNomecomDadosFake(){
        page.preencherCampoNome(page.gerarNomeparaPreenchimento());
    }
    @And ("preencho o campo apelido apelido")
    public void preenchoCampoApelidocomDadosFake(){
        page.preencherCampoApelido(page.gerarApelidoparaPreenchimento());
    }
    @And ("preencho o campo telefone numero")
    public void preenchoCampoTelefonecomDadosFake(){
        page.preencherCampoTelefone(page.gerarTelefoneparaPreenchimento());
    }
    @And ("preencho o campo e-mail email")
    public void preenchoCampoEmailcomDadosFake(){
        page.preencherCampoEmail(page.gerarEmailparaPreenchimento());
    }

    @And ("as mensagens indicativas são apresentadas {string} {string}")
    public void validarModalcomMensagemdeRegistrocomSucesso(String sucesso, String mensagem){
        Assert.assertTrue(page.validarModaldeMensagemdeSucesso(sucesso, mensagem));
    }

    @When ("preencho o campo nome {string}")
    public void preenchoCampoNome(String nome){
        page.preencherCampoNome(nome);
    }
    @And ("preencho o campo apelido {string}")
    public void preenchoCampoApelido(String apelido){
        page.preencherCampoApelido(apelido);
    }
    @And ("preencho o campo telefone {string}")
    public void preenchoCampoTelefone(String telefone){
        page.preencherCampoTelefone(telefone);
    }
    @And ("preencho o campo e-mail {string}")
    public void preenchoCampoEmail(String email){
        page.preencherCampoEmail(email);
    }

    @And ("a mensagem indicativa é apresentada {string}")
    public void validarMensagemindicarEmailjaRegistrado(String mensagem){
        Assert.assertTrue(page.validarMensagemIndicativaEmailRegistrado(mensagem));
    }
}
