package actions;


import locators.RegistrodeUtilizadorPageLocators;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import utils.HelpDataUserClass;
import utils.HelpDriverClass;
import utils.UserClass;

import java.io.IOException;
import java.net.MalformedURLException;


public class RegistrodeUtilizadorPageActions {

    RegistrodeUtilizadorPageLocators locator = null;
    HelpDataUserClass data = new HelpDataUserClass();

    UserClass usuario = data.getUser();
    HelpDriverClass help = new HelpDriverClass();

    public RegistrodeUtilizadorPageActions() throws Exception {
        this.locator = new RegistrodeUtilizadorPageLocators();
        PageFactory.initElements(HelpDriverClass.getDriver(), locator);
    }


    public void clickCheckoutBoxPrivacy() {
        locator.checkoutBoxAceitarTermo.click();
    }

    public void clickInButtonContinuar() {
        if (locator.buttonContinue.isEnabled()) locator.buttonContinue.click();
    }

    public boolean viewMessageForFieldObrigated(String message) throws InterruptedException {
        String textName = locator.inputName.findElement(By.cssSelector("div > span")).getText();
        if((locator.inputName.findElement(By.cssSelector("div > span")).getText().contains(message) && locator.inputApelido.findElement(By.cssSelector("div > span")).getText().contains(message)) &&
        (locator.inputTelefone.findElement(By.cssSelector("div > span")).getText().contains(message) && locator.inputEmail.findElement(By.cssSelector("div > span")).getText().contains(message)) &&
        locator.inputPrefixo.findElement(By.cssSelector(("div > span"))).getText().contains(message)){
            return true;
        } else return false;
    }

    public boolean buttonContinuarDisabled() {
        return locator.buttonContinue.isEnabled();
    }

    public void preencherCamposObrigatórios(String name, String lastname, String telefone, String email) {
        locator.inputName.findElement(By.tagName("input")).sendKeys(name);
        locator.inputApelido.findElement(By.tagName("input")).sendKeys(lastname);
        locator.inputTelefone.findElement(By.tagName("input")).sendKeys(telefone);
        locator.inputEmail.findElement(By.tagName("input")).sendKeys(email);
    }

    public boolean validateCheckedPoliticadePrivacidade() {
        return locator.checkoutBoxAceitarTermo.isSelected();
    }

    public void preencherCampoNome(String texto) {
        locator.inputName.findElement(By.tagName("input")).sendKeys(texto);
    }

    public boolean validarMensagemdeErronoCampoNome(String mensagem) {
        return locator.inputName.findElement(By.cssSelector("div > span")).getText().contains(mensagem);
    }

    public void preencherCampoApelido(String texto) {
        locator.inputApelido.findElement(By.tagName("input")).sendKeys(texto);
    }

    public void preencherCampoTelefone(String texto) {
        locator.inputTelefone.findElement(By.tagName("input")).sendKeys(texto);
    }

    public boolean validarMensagemdeErronoCampoApelido(String mensagem) {
        return locator.inputApelido.findElement(By.cssSelector("div > span")).getText().contains(mensagem);
    }

    public boolean validarMensagemdeErronoCampoTelefone(String mensagem) {
        return locator.inputTelefone.findElement(By.cssSelector("div > span")).getText().contains(mensagem);
    }

    public void preencherCampoEmail(String texto) {
        locator.inputEmail.findElement(By.tagName("input")).sendKeys(texto);
    }

    public boolean validarMensagemdeErronoCampoEmail(String mensagem) {
        return locator.inputEmail.findElement(By.cssSelector("div > span")).getText().contains(mensagem);
    }

    public boolean validarCampoPrefixoVazio() {
        locator.inputPrefixo.findElement(By.tagName("input")).clear();
        return locator.inputPrefixo.findElement(By.tagName("input")).getText().isEmpty();
    }

    public boolean validarMensagemdeIndicativaCampoPrefixo(String mensagem) {
        return locator.inputPrefixo.findElement(By.cssSelector("div > span")).getText().contains(mensagem);
    }

    public void preencherCampoPrefixo(String texto) {
        locator.inputPrefixo.findElement(By.tagName("input")).sendKeys(texto);
    }

    public boolean validarModaldeMensagemdeSucesso(String sucesso, String mensagem) {
        help.getWait(locator.modalRegistro.findElement(By.cssSelector("h3")));
        help.getWait(locator.modalRegistro.findElement(By.cssSelector("p")));
        return (locator.modalRegistro.findElement(By.cssSelector("h3")).getText().contains(sucesso) &&
                locator.modalRegistro.findElement(By.cssSelector("p")).getText().contains(mensagem));
    }

    public boolean validarMensagemIndicativaEmailRegistrado(String mensagem) {
        String mensagemAtual = null;
        if(help.getWaitConteudoVisivel(locator.modalRegistro.findElement(By.cssSelector(" form > p")), mensagem))
            mensagemAtual = locator.modalRegistro.findElement(By.cssSelector("p")).getText();
        return mensagemAtual.contains(mensagem);
    }

    public String gerarNomeparaPreenchimento() {
        return usuario.getFirst_name();
    }

    public String gerarApelidoparaPreenchimento() {
        return usuario.getLast_name();
    }

    public String gerarTelefoneparaPreenchimento() {
        String telefoneTotal = usuario.getPhone_number().substring(0,17);
        String telefone = telefoneTotal.replace(" ","");
        telefone = telefone.replace("+","");
        telefone = telefone.replace("(","");
        telefone = telefone.replace(")","");
        telefone = telefone.replace("-","");
        telefone = telefone.replace(".","");
        telefone = telefone.substring(0,9);
        return  telefone.replaceFirst(telefone.substring(0,1),"9");
    }

    public String gerarEmailparaPreenchimento() {
        return usuario.getEmail();
    }
}
