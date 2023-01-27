package com.homecenter.certificacion.exceptions;

public class AssertionsHomecenter extends AssertionError {

    private static final long serialVersionUID = 1L;
    public static final String NO_SE_CREO_DE_FORMA_CORRECTA_EL_USUARIO = "No se creó de forma correcta el usuario";
    public static final String NO_SE_PUDO_LLENAR_EL_FORMULARIO_DE_FORMA_CORRECTA = "No se pudo llenar el formulario de forma correcta";

    public AssertionsHomecenter(String message, Throwable cause){
        super(message, cause);
    }
    public AssertionsHomecenter(String message){
        super(message);
    }
}
