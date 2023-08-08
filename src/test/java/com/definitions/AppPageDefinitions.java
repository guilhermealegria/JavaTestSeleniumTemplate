package com.definitions;


import actions.AppPageActions;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import utils.HelpDriverClass;


import java.net.MalformedURLException;

public class AppPageDefinitions {

    @And("preencho a url {string}")
    public void acessUrl(String url){
        HelpDriverClass.goToUrl(url);
    }

    @Then("é apresentado o titulo da pagina")
    public void validateTitle(){
        Assert.assertTrue(AppPageActions.getTitle());
    }
}
