package com.homecenter.certificacion.models;

public class RegistroModel {

    private String nombre;
    private String apellidos;
    private String tipodocumento;
    private String cedulaciudadania;
    private String telefono;
    private String contribuyente;
    private String correoelectronico;
    private String contrasena;
    private boolean puntos;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getTipodocumento() {
        return tipodocumento;
    }

    public void setTipodocumento(String tipodocumento) {
        this.tipodocumento = tipodocumento;
    }

    public String getCedulaciudadania() {
        return cedulaciudadania;
    }

    public void setCedulaciudadania(String cedulaciudadania) {
        this.cedulaciudadania = cedulaciudadania;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getContribuyente() {
        return contribuyente;
    }

    public void setContribuyente(String contribuyente) {
        this.contribuyente = contribuyente;
    }

    public String getCorreoelectronico() {
        return correoelectronico;
    }

    public void setCorreoelectronico(String correoelectronico) {
        this.correoelectronico = correoelectronico;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public boolean isPuntos() {
        return puntos;
    }

    public void setPuntos(boolean puntos) {
        this.puntos = puntos;
    }
}
