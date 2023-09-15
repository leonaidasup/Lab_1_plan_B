/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package model;

//import com.mycompany.superhumanos.control.GuardarSuperHumanos;

/**
 *
 * @author Leonardo.amaris
 */
public class SuperHumanos extends Persona implements Poderes{
    //GuardarSuperHumanos objeto2 = new GuardarSuperHumanos ();
    public int[] PoderFuerza;
    public int[] PoderVision;
    public static String[] superNombres = {"Vigor Watcher", "Strength Spectacle", "Supervision Surge",
            "Visionary Colossus", "La Máquina de la Fuerza", "El Coloso Invencible", "La Mole de Acero", "Hércules Moderno", "Supervigía", "Super"};



    public SuperHumanos(String Nombre, int edad, String estadoCivil, 
            double  disponibilidad, String superNombre, int poderFuerza, 
            int poderVision) {
   
    }
    public SuperHumanos() {
        PoderFuerza = new int [10];
        PoderVision = new int [10];
        
    }
    
    @Override
    public void superFuerza() {
        for (int i = 0; i<1; i++)
        System.out.println("La super fuerza de " + superNombres[i] + " es: " + PoderFuerza[i]);
    }

    @Override
    public void visionDeCalor() {
        for (int i = 0; i<1; i++)
        System.out.println("La super Vision de " + superNombres[i] + " es: " + PoderVision[i]);
    }  
}

