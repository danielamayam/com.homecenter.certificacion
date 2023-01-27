package com.homecenter.certificacion.tasks;

import com.choucair.moviles.app.interactions.choucair.GetDriver;
import com.choucair.moviles.app.interactions.choucair.TakeScreenshot;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.Tasks;
import net.thucydides.core.annotations.Step;

import java.util.logging.Logger;

public class AbrirElNavegador implements Task {

    @Override
    @Step("Se ingresa a la pagina web")
    public <T extends Actor> void performAs(T actor) {
        GetDriver.as(actor).webDriver().get("https://www.homecenter.com.co/");
        Logger.getAnonymousLogger().info("Se ingresa a la web Homecenter");
        TakeScreenshot.asEvidence();
    }

    public static AbrirElNavegador enLikeme(){
        return Tasks.instrumented(AbrirElNavegador.class);
    }
}
