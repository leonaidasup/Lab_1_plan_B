/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.superhumanos.view;

import com.mycompany.superhumanos.model.SuperHumanos;
import com.mycompany.superhumanos.control.GuardarSuperHumanos;
/**
 *
 * @author Leonardo.amaris
 */
public class Impresion {
    public static void imprimir() {
        for (SuperHumanos SuperHeroe : GuardarSuperHumanos.GuardarSuperHumanos()) {
            if (SuperHeroe.getEdad() < 50 && "soltero".equals(SuperHeroe.getEstadoCivil())){
                System.out.println(SuperHeroe);
            }
        }
    }
    public static void main(String[] args) {
        imprimir();
    }
}
