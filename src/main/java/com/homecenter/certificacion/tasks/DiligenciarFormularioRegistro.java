package com.homecenter.certificacion.tasks;

import com.homecenter.certificacion.exceptions.AssertionsHomecenter;
import com.homecenter.certificacion.interactions.FormularioRegistro;
import com.homecenter.certificacion.interactions.GeolocationPopup;
import com.homecenter.certificacion.models.RegistroModel;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;

public class DiligenciarFormularioRegistro implements Task {
    private RegistroModel registroModel;
    public DiligenciarFormularioRegistro(RegistroModel registroModel){
        this.registroModel = registroModel;
    }
    @Override
    public <T extends Actor> void performAs(T actor) {
        try {
            actor.attemptsTo(
                    GeolocationPopup.cerrar(),
                    FormularioRegistro.write(registroModel)
            );
        }catch (RuntimeException ex){
            throw new AssertionsHomecenter(AssertionsHomecenter.NO_SE_PUDO_LLENAR_EL_FORMULARIO_DE_FORMA_CORRECTA, ex);
        }
    }
    public static DiligenciarFormularioRegistro go(RegistroModel registroModels){
        return Tasks.instrumented(DiligenciarFormularioRegistro.class, registroModels);
    }
}
