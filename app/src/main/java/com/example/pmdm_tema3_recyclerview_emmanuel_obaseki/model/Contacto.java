package com.example.pmdm_tema3_recyclerview_emmanuel_obaseki.model;

public class Contacto {
    private int fotoResId; // ID del recurso de la foto
    private String nombre;
    private String apellidos;
    private String email;
    private String telefono;

    public Contacto(int fotoResId, String nombre, String apellidos, String email, String telefono) {
        this.fotoResId = fotoResId;
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.email = email;
        this.telefono = telefono;
    }

    public int getFotoResId() {
        return fotoResId;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getEmail() {
        return email;
    }

    public String getTelefono() {
        return telefono;
    }
}

