/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Juan José
 */
public class Alfi {
    private String nombre;
    private int tamaño;
    private int fuerza;
    private int poderMental;
    

    public Alfi(String nombre, int tamaño, int fuerza, int poderMental) {
        this.nombre = nombre;
        this.tamaño = tamaño;
        this.fuerza = fuerza;
        this.poderMental = poderMental;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTamaño() {
        return tamaño;
    }

    public void setTamaño(int tamaño) {
        this.tamaño = tamaño;
    }

    public int getFuerza() {
        return fuerza;
    }

    public void setFuerza(int fuerza) {
        this.fuerza = fuerza;
    }

    public int getPoderMental() {
        return poderMental;
    }

    public void setPoderMental(int poderMental) {
        this.poderMental = poderMental;
    }
    
    
    @Override
    public String toString() {
        return "Alfi{" + "nombre=" + nombre + ", tamaño=" + tamaño + ", fuerza=" + fuerza + '}';
    }



    
}
