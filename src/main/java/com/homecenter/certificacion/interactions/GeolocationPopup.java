package com.homecenter.certificacion.interactions;

import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import java.util.logging.Logger;
import static com.homecenter.certificacion.ui.UiFortmularioRegistro.CIERRE_GEOLOCALIZACION;
import static com.homecenter.certificacion.ui.UiFortmularioRegistro.GEOLOCALIZACION;

public class GeolocationPopup implements Interaction {
    @Override
    public <T extends Actor> void performAs(T actor) {
        do {
            if (GEOLOCALIZACION.resolveFor(actor).isVisible()) {
                actor.attemptsTo(
                        Click.on(CIERRE_GEOLOCALIZACION)
                );
                break;
            }
        } while (GEOLOCALIZACION.resolveFor(actor).isVisible());
        Logger.getAnonymousLogger().info("Verificar cierre Pop Up");
    }

    public static GeolocationPopup cerrar(){
        return Instrumented.instanceOf(GeolocationPopup.class).withProperties();
    }
}
