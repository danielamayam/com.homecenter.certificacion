package com.homecenter.certificacion.questions;

import com.choucair.moviles.app.interactions.choucair.TakeScreenshot;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.questions.Text;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.homecenter.certificacion.ui.UiFortmularioRegistro.LBL_ALERTA_EXITOSO;

public class VerificarRegistro implements Question<Boolean> {

    private String mensaje;

    public VerificarRegistro(String mensaje){
        this.mensaje = mensaje;
    }
    @Override
    public Boolean answeredBy(Actor actor) {
        actor.attemptsTo(
                WaitUntil.the(LBL_ALERTA_EXITOSO, WebElementStateMatchers.isVisible()).forNoMoreThan(15).seconds()
        );
        TakeScreenshot.asEvidence();
        return mensaje.equals(Text.of(LBL_ALERTA_EXITOSO).viewedBy(actor).asString());
    }

    public static VerificarRegistro as(String mensaje){
        return new VerificarRegistro(mensaje);
    }
}
