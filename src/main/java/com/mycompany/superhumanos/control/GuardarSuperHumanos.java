/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.superhumanos.control;
import com.mycompany.superhumanos.model.SuperHumanos;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Leonardo.amaris
 */
public class GuardarSuperHumanos {
    public GuardarSuperHumanos() {
        String[] nombres = {"dsa"}; // 10 nombres falta
        String[] superNombres = {"dsada"}; // 10 nombres falta 
        int edad = 20; // falta
        String estadoCivil = "soltero"; // falta
        List <SuperHumanos> superHerores = new ArrayList<>(Arrays.asList()); 
        
        for (int i = 0;  i < 1; i++){
            superHerores.add(CrearSuperHumanos.CrearSuperHumanos(nombres[i], superNombres[i], edad, estadoCivil));
        }
        
    }

}
