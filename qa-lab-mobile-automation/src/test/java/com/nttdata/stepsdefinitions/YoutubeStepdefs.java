package com.nttdata.stepsdefinitions;

import com.nttdata.steps.YoutubeStep;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.thucydides.core.annotations.Steps;

public class YoutubeStepdefs {
    @Steps
    YoutubeStep youtubeStep;
    @Given("estoy en la app de YouTube")
    public void estoyEnLaAppDeYouTube() {
        System.out.println("estoyEnLaAppDeYouTube");
    }

    @When("busco el termino {string}")
    public void buscoElTermino(String arg0) {
        System.out.println("buscoElTermino ini");
        youtubeStep.searchByText(arg0);
        System.out.println("buscoElTermino fin");
    }

    @Then("valido los resultados de la busqueda")
    public void validoLosResultadosDeLaBusqueda() {
        try{
            Thread.sleep(10000);
        }catch (Exception e){

        }
    }
}
