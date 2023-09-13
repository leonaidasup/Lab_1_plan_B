/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.superhumanos.model;

/**
 *
 * @author Leonardo.amaris
 */
class Persona {
    private final String Nombre;
    private int edad;
    private String estadoCivil;
    private double disponibilidad;

    public Persona(String Nombre, int edad, String estadoCivil, double disponibilidad) {
        this.Nombre = Nombre;
        this.edad = edad;
        this.estadoCivil = estadoCivil;
        this.disponibilidad = disponibilidad;
    }

    public String getNombre() {
        return Nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public double getDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(double disponibilidad) {
        this.disponibilidad = disponibilidad;
    }
    
}
