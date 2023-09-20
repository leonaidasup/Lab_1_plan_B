/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.superhumanos.control;
import com.mycompany.superhumanos.model.SuperHumanos;
/**
 *
 * @author Leonardo.amaris
 */
public class CrearSuperHumanos {
    public static SuperHumanos CrearSuperHumanos(String nombre, String superNombre, 
            double disponibilidad, int edad, String estadoCivil, int fuerza, int velocidad) {
        return new SuperHumanos(nombre, edad, estadoCivil, disponibilidad, 
                superNombre, fuerza, velocidad);
    };
}
