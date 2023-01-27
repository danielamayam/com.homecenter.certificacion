package com.homecenter.certificacion.ui;

import net.serenitybdd.screenplay.targets.Target;

public class UiFortmularioRegistro {

    public static final Target GEOLOCALIZACION = Target.the("Modal geolocalizacion")
            .locatedBy("//div[@id='geolocation-body']");

    public static final Target CIERRE_GEOLOCALIZACION = Target.the("Cierre modal geolocalizacion")
            .locatedBy("//div[@id='geolocation-close-icon']");

    public static final Target BTN_CUENTA = Target.the("Botón ir a cuenta")
            .locatedBy("//a[@class='Account-module_icon-container__0tgoQ']");


    public static final Target BTN_CREAR_CUENTA = Target.the("Botón crear cuenta")
            .locatedBy("(//button[@id='testId-btn-signup-button' and contains(text(),'Crear cuenta Sodimac')])[1]");


    public static final Target TXT_NOMBRES = Target.the("Input nombres")
            .locatedBy("//input[@id='testId-firstName']");

    public static final Target TXT_APELLIDOS = Target.the("Input apellidos")
            .locatedBy("//input[@id='testId-lastName']");

    public static final Target SELECT_TIPO_DOCUMENTO = Target.the("Select tipo de documento")
            .locatedBy("//div[@id='testId-Dropdown--value']");

    public static Target itemComun (String item){
        return Target.the("Item tipo de documento")
                .locatedBy("//li[contains(@role, 'presentation') and contains(text(),'"+item+"')]");
    }

    public static final Target TXT_DOCUMENTO = Target.the("Input documento")
            .locatedBy("//input[@id='testId-document']");

    public static final Target TXT_TELEFONO= Target.the("Input telefono")
            .locatedBy("//input[@id='testId-input-phoneNumber']");

    public static final Target SELECT_CONTRIBUYENTE= Target.the("selec contribuyente")
            .locatedBy("//div[@id='testId-Dropdown-taxpayerType-value']");

    public static final Target TXT_CORREO = Target.the("Input correo electronico")
            .locatedBy("//input[@id='testId-email']");

    public static final Target TXT_PASSWORD = Target.the("Input password")
            .locatedBy("//input[@id='testId-password']");

    public static final Target CHECKBOX_PUNTOS = Target.the("Checkbox puntos")
            .locatedBy("//span[@id='checkbox-testId-addCMR']");

    public static final Target CHECKBOX_TERMINOS = Target.the("Checkbox terminos")
            .locatedBy("//span[@id='checkbox-testId-acceptTermsAndConditions']");

    public static final Target BTN_CREAR = Target.the("Boton crear cuenta")
            .locatedBy("//button[@id='testId-btn-registration-submit']");

    public static final Target LBL_ALERTA_EXITOSO = Target.the("Mensaje de satisfaccion")
            .locatedBy("//span[@class='jsx-3470068517 header-text']");

    private UiFortmularioRegistro() {
        throw new IllegalStateException("Error en UiFortmularioRegistro");
    }


}
