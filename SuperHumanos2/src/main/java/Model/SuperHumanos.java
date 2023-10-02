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
    private int SaludMental;
    private final int superFuerza;
    private final int visionLaser;
    private final int visionXray;

    public SuperHumanos(String nombre, String edad, String estadoCivil, 
            String DNI, String CiudadDeResidencia, String superNombre, int superFuerza,
            int visionLaser, int visionXray) {
        super(nombre, edad, estadoCivil, DNI, CiudadDeResidencia);
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
        return SaludMental;
    }

    public void setSaludMental(int SaludMental) {
        this.SaludMental = SaludMental;
    }

    @Override
    public int superFuerza(){   
        return superFuerza;
        
    }
    
    @Override
    public int visionLaser(){   
        return visionLaser;
        
    }
    
    @Override
    public int visionXray(){    
        return visionXray;
        
    }

    @Override
    public String toString() {
        return "SuperHumanos{" + "superNombre=" + superNombre + ", SaludMental=" + SaludMental + ", superFuerza=" + superFuerza + ", visionLaser=" + visionLaser + ", visionXray=" + visionXray + '}';
    }
    
    
}
