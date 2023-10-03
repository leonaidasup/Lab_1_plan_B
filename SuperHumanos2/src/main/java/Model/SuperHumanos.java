/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Juan José
 */
public class SuperHumanos extends Persona implements Poderes{
    private String superNombre;
    private int saludMental;
    private final int superFuerza;
    private final int visionLaser;
    private final int visionXray;

    public SuperHumanos(String nombre, String edad, String estadoCivil, 
            String DNI, String CiudadDeResidencia, String Hijos, String superNombre, int saludMental, int superFuerza,
            int visionLaser, int visionXray) {
        super(nombre, edad, estadoCivil, DNI, CiudadDeResidencia, Hijos);
        this.superNombre = superNombre;
        this.superFuerza = superFuerza;
        this.visionLaser = visionLaser;
        this.visionXray = visionXray;
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

    @Override
    public int superFuerza(){
        return (int)(Math.random()*10+1);
        
    }
    
    @Override
    public int visionLaser(){   
        return (int)(Math.random()*10+1);
        
    }
    
    @Override
    public int visionXray(){    
        return (int)(Math.random()*10+1);
        
    }

    @Override
    public String toString() {
        return "SuperHumanos{" + "superNombre=" + superNombre + ", saludMental=" + saludMental + 
                ", superFuerza=" + superFuerza + ", visionLaser=" + visionLaser + ", Edad=" + 
                getEdad() + ", EstadoCivil=" + getEstadoCivil() +'}';
    }
    
    
}
