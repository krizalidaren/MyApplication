package io.dragh.myapplication.models;

/**
 * Created by reo on 21-07-15.
 */
public class Amigo {
    private String nombre;
    private String twitter;
    private String ultimaCancion;

    public Amigo() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTwitter() {
        return twitter;
    }

    public void setTwitter(String twitter) {
        this.twitter = twitter;
    }

    public String getUltimaCancion() {
        return ultimaCancion;
    }

    public void setUltimaCancion(String ultimaCancion) {
        this.ultimaCancion = ultimaCancion;
    }
}
