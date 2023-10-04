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
    private int edad;
    private String estadoCivil; 
    private int hijos;
    private String DNI;

    public Persona(String nombre, int edad, String estadoCivil, int hijos, String DNI) {
        this.nombre = nombre;
        this.edad = edad;
        this.estadoCivil = estadoCivil;
        this.hijos = hijos;
        this.DNI = DNI;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public int getHijos() {
        return hijos;
    }

    public void setHijos(int hijos) {
        this.hijos = hijos;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", edad=" + edad + ", estadoCivil=" + estadoCivil + ", hijos=" + hijos + ", DNI=" + DNI + '}';
    }
}
