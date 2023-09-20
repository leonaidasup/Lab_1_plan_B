/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.superhumanos.model;

/**
 *
 * @author Leonardo.amaris
 */
public class SuperHumanos extends Persona implements Poderes{
    private final String superNombre;
    private final int poderFuerza;
    private final int poderVelocidad;
    public SuperHumanos(String Nombre, int edad, String estadoCivil, 
            double disponibilidad, String superNombre, int poderFuerza, 
            int poderVelocidad) {
        super(Nombre, edad, estadoCivil, disponibilidad);
        this.superNombre = superNombre;
        this.poderFuerza = poderFuerza;
        this.poderVelocidad = poderVelocidad;
    }
    @Override
    public String superFuerza() {
        return "La super fuerza de " + this.superNombre + " es: " + this.poderFuerza;
    }
    @Override
    public String superVelocidad() {
        return "La super velocidad de " + this.superNombre + " es: " + this.poderVelocidad;
    }
    @Override
    public String toString() {
        return "SuperHerore = " + superNombre + ", poderFuerza = " + poderFuerza + ", poderVelocidad = " + poderVelocidad;
    }
}
