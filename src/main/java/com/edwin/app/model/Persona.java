package com.edwin.app.model;

public class Persona {
    private int edad;
    private String name;
    private String surnames;
    private String email;

    public Persona() {
    }

    public Persona(int edad, String name, String surnames, String email) {
        this.edad = edad;
        this.name = name;
        this.surnames = surnames;
        this.email = email;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurnames() {
        return surnames;
    }

    public void setSurnames(String surnames) {
        this.surnames = surnames;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
