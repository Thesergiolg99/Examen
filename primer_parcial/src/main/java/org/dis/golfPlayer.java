package org.dis;

//Clase para crear el objeto plano (POJO) con anotaciones
public class golfPlayer {
    private String Posicion;

    public void setPosicion(String posicion) {
        Posicion = posicion;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public void setApellido(String apellido) {
        Apellido = apellido;
    }

    public void setPais(String pais) {
        Pais = pais;
    }

    public void setEdad(String edad) {
        Edad = edad;
    }

    private String Nombre;
    private String Apellido;
    private String Pais;
    private String Edad;

    public String getPosicion() {
        return Posicion;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public String getPais() {
        return Pais;
    }

    public String getEdad() {
        return Edad;
    }





}