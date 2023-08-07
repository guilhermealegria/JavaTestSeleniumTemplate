package com.definitions;


import actions.AppPageActions;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import utils.HelpDriverClass;

public class AppPageDefinitions {

    @Given("o navegador está aberto")
    public void openBrowser(){
        HelpDriverClass.setUpDriver();
    }

    @When("preencho a url {string}")
    public void acessUrl(String url){
        HelpDriverClass.goToUrl(url);
    }

    @Then("é apresentado o titulo da pagina")
    public void validateTitle(){
        Assert.assertTrue(AppPageActions.getTitle());
    }
}
