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
    private final int poderVision;
    private final int telepatia;
    private final int oido;

    public SuperHumanos(String superNombre, int poderFuerza, int poderVelocidad, int poderVision, int telepatia, int oido, String Nombre, int edad, String estadoCivil, double disponibilidad) {
        super(Nombre, edad, estadoCivil, disponibilidad);
        this.superNombre = superNombre;
        this.poderFuerza = poderFuerza;
        this.poderVelocidad = poderVelocidad;
        this.poderVision = poderVision;
        this.telepatia = telepatia;
        this.oido = oido;
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
    public String visionDeCalor() {
        return "El de la vision de calor de " + this.superNombre + " es: " + this.poderVision;
    }

    @Override
    public String telepatia() {
        return "La super fuerza de " + this.superNombre + " es: " + this.telepatia;
    }

    @Override
    public String superOido() {
        return "La super fuerza de " + this.superNombre + " es: " + this.oido;
    }
   
}
