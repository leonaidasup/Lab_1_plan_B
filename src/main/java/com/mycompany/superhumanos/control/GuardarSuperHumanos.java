/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.superhumanos.control;

import model.Persona;

/**
 *
 * @author Leonardo.amaris
 */
public class GuardarSuperHumanos {
  public static void crearIdentidad() {        
        Persona objeto1 = new Persona ();
        int[] edad = objeto1.getEdad(); 
        String [] estadoCivil = objeto1.getEstadoCivil();
        
        String[] nombres = {"María", "Carlos", "Javier", "Laura", "Alejandro", "Juan",
        "Mario", "Eduardo", "Heracles", "Isabel"};
   
        for (int i = 0; i < 10; i++){
           edad[i] = (int)(Math.random()*50)+1;
        }

        for (int i = 0; i < 10; i++){
            estadoCivil[i] = "Solter@";
        }
        
        for (int i = 0; i < 10; i++){
        System.out.println("Nombre: "+nombres[i]+" Edad: "+edad[i]+
                " Estado Civil: "+estadoCivil[i]); 
        }    
    }        
}
