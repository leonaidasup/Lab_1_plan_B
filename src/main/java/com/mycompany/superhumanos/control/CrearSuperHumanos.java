/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.superhumanos.control;
import model.SuperHumanos;
/**
 *
 * @author Leonardo.amaris
 */
public class CrearSuperHumanos {
    public static SuperHumanos CrearSuperHumanos(String nombre, String superNombre, int edad, String estadoCivil) {
        return new SuperHumanos(nombre, edad,
                estadoCivil, 24, superNombre, 
                (int)(Math.random() * 100), (int)(Math.random() * 100));
    }
}
