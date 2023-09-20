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
public class GuardarSuperHumanos {
    public static SuperHumanos[] GuardarSuperHumanos() {
        SuperHumanos[] listaSuperHumanos = new SuperHumanos[10];
        listaSuperHumanos[0] = new SuperHumanos("Persona1", 22, "soltero", 2.2, "Super1", 3, 9);
        listaSuperHumanos[1] = new SuperHumanos("Persona2", 66, "casado", 9.3, "Super2", 4, 1);
        listaSuperHumanos[2] = new SuperHumanos("Persona3", 74, "casado", 2.8, "Super3", 7, 1);
        listaSuperHumanos[3] = new SuperHumanos("Persona4", 38, "soltero", 3.2, "Super4", 2, 2);
        listaSuperHumanos[4] = new SuperHumanos("Persona5", 49, "soltero", 5.5, "Super5", 4, 7);
        listaSuperHumanos[5] = new SuperHumanos("Persona6", 83, "casado", 6.76, "Super6", 8, 5);
        listaSuperHumanos[6] = new SuperHumanos("Persona7", 12, "soltero", 2.12, "Super7", 9, 4);
        listaSuperHumanos[7] = new SuperHumanos("Persona8", 50, "soltero", 1.53, "Super8", 4, 4);
        listaSuperHumanos[8] = new SuperHumanos("Persona9", 31, "casado", 5.4, "Super9", 2, 3);
        listaSuperHumanos[9] = new SuperHumanos("Persona10", 83, "soltero", 6.3, "Super10", 3, 1);
        return listaSuperHumanos;
    }
}
