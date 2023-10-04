/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Juan José
 */
public class SuperHumano extends Persona{
    private String superNombre;
    private int saludMental;
    private int superFuerza;
    private String visionLaser;

    public SuperHumano(String superNombre, int saludMental, int superFuerza, String visionLaser, String nombre, int edad, String estadoCivil, int hijos, String DNI) {
        super(nombre, edad, estadoCivil, hijos, DNI);
        this.superNombre = superNombre;
        this.saludMental = saludMental;
        this.superFuerza = superFuerza;
        this.visionLaser = visionLaser;
    }

    public String getSuperNombre() {
        return superNombre;
    }

    public void setSuperNombre(String superNombre) {
        this.superNombre = superNombre;
    }

    public int getSaludMental() {
        return saludMental;
    }

    public void setSaludMental(int saludMental) {
        this.saludMental = saludMental;
    }

    public int getSuperFuerza() {
        return superFuerza;
    }

    public void setSuperFuerza(int superFuerza) {
        this.superFuerza = superFuerza;
    }

    public String getVisionLaser() {
        return visionLaser;
    }

    public void setVisionLaser(String visionLaser) {
        this.visionLaser = visionLaser;
    }
    
}
