package com.homecenter.certificacion.stepsdefinitions;

import com.homecenter.certificacion.exceptions.AssertionsHomecenter;
import com.homecenter.certificacion.models.RegistroModel;
import com.homecenter.certificacion.questions.VerificarRegistro;
import com.homecenter.certificacion.tasks.AbrirElNavegador;
import com.homecenter.certificacion.tasks.DiligenciarFormularioRegistro;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import java.util.List;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class InicioStepDefinitions {


    @Given("^(.*) abre la web Homecenter$")
    public void danielAbreLaWebHomecenter(String actor) {
        theActorCalled(actor).wasAbleTo(
                AbrirElNavegador.enLikeme()
        );
    }

    @When("^Diligencia el formulario de registro$")
    public void diligenciaElFormularioDeRegistro(List<RegistroModel> registroModels) {
        theActorInTheSpotlight().attemptsTo(
                DiligenciarFormularioRegistro.go(registroModels.get(0))
        );
    }

    @Then("^válido el mensaje de:(.*)$")
    public void válidoElMensajeDeTuCuentaFueCreadaConÉxito(String mensaje) {
        theActorInTheSpotlight().should(seeThat(
                VerificarRegistro.as(mensaje)
        ).orComplainWith(AssertionsHomecenter.class, AssertionsHomecenter.NO_SE_CREO_DE_FORMA_CORRECTA_EL_USUARIO));
    }
}
