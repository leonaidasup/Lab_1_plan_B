/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Juan José
 */
public class Persona {
    
    private String nombre;
    private String edad;
    private String estadoCivil; 
    private String DNI;
    private String CiudadDeResidencia;
    private String Hijos;

    public Persona(String nombre, String edad, String estadoCivil, String DNI, String CiudadDeResidencia, String Hijos) {
        this.nombre = nombre;
        this.edad = edad;
        this.estadoCivil = estadoCivil;
        this.DNI = DNI;
        this.CiudadDeResidencia = CiudadDeResidencia;
        this.Hijos = Hijos;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEdad() {
        return edad;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }


    public String getCiudadDeResidencia() {
        return CiudadDeResidencia;
    }

    public String getHijos() {
        return Hijos;
    }

    public void setHijos(String Hijos) {
        this.Hijos = Hijos;
    }

    public void setCiudadDeResidencia(String CiudadDeResidencia) {
        this.CiudadDeResidencia = CiudadDeResidencia;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", edad=" + edad + ", estadoCivil=" + estadoCivil + ", DNI=" + DNI + ", CiudadDeResidencia=" + CiudadDeResidencia + ", Hijos=" + Hijos + '}';
    }
    
    
}
