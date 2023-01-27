package com.homecenter.certificacion.interactions;

import com.choucair.moviles.app.interactions.choucair.Hide;
import com.choucair.moviles.app.interactions.choucair.TakeScreenshot;
import com.homecenter.certificacion.models.RegistroModel;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.conditions.Check;
import net.serenitybdd.screenplay.matchers.WebElementStateMatchers;
import net.serenitybdd.screenplay.waits.WaitUntil;
import net.thucydides.core.annotations.Step;
import java.util.logging.Logger;

import static com.homecenter.certificacion.ui.UiFortmularioRegistro.*;

public class FormularioRegistro implements Interaction {

    private RegistroModel registroModel;

    public FormularioRegistro(RegistroModel registroModel){
        this.registroModel = registroModel;
    }

    @Override
    @Step("Formulario de registro")
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                WaitUntil.the(BTN_CUENTA, WebElementStateMatchers.isClickable()).forNoMoreThan(15).seconds(),
                Click.on(BTN_CUENTA),
                WaitUntil.the(BTN_CREAR_CUENTA, WebElementStateMatchers.isClickable()).forNoMoreThan(15).seconds(),
                Click.on(BTN_CREAR_CUENTA),
                WaitUntil.the(TXT_NOMBRES, WebElementStateMatchers.isClickable()).forNoMoreThan(15).seconds(),
                Enter.theValue(registroModel.getNombre()).into(TXT_NOMBRES),
                Hide.keyboard(),
                Enter.theValue(registroModel.getApellidos()).into(TXT_APELLIDOS),
                Hide.keyboard(),
                Click.on(SELECT_TIPO_DOCUMENTO),
                Click.on(itemComun(registroModel.getTipodocumento())),
                Enter.theValue(registroModel.getCedulaciudadania()).into(TXT_DOCUMENTO),
                Hide.keyboard(),
                Enter.theValue(registroModel.getTelefono()).into(TXT_TELEFONO),
                Hide.keyboard(),
                Click.on(SELECT_CONTRIBUYENTE),
                Click.on(itemComun(registroModel.getContribuyente())),
                Enter.theValue(registroModel.getCorreoelectronico()).into(TXT_CORREO),
                Hide.keyboard(),
                Enter.theValue(registroModel.getContrasena()).into(TXT_PASSWORD),
                Hide.keyboard(),
                Check.whether(registroModel.isPuntos()).andIfSo(Click.on(CHECKBOX_PUNTOS)),
                Click.on(CHECKBOX_TERMINOS),
                TakeScreenshot.asEvidence(),
                WaitUntil.the(BTN_CREAR, WebElementStateMatchers.isClickable()).forNoMoreThan(15).seconds(),
                Click.on(BTN_CREAR)
        );
        Logger.getAnonymousLogger().info("Se diligencia el formulario de registro");
    }

    public static FormularioRegistro write(RegistroModel registroModel){
        return Instrumented.instanceOf(FormularioRegistro.class).withProperties(registroModel);
    }
}
