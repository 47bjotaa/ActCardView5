package com.example.actcardview;

public class ListadoDeElementos {
    private String color;
    private String nombre;
    private String ciudad;
    private String descripcion;

    public ListadoDeElementos(String color, String descripcion, String nombre, String ciudad) {
        this.color = color;
        this.descripcion = descripcion;
        this.nombre = nombre;
        this.ciudad = ciudad;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
}