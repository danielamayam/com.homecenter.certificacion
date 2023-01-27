package com.homecenter.certificacion.stepsdefinitions;

import cucumber.api.java.Before;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;

public class Hooks {

    @Before
    public void inicio(){
        OnStage.setTheStage(new OnlineCast());
    }
}
