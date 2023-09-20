/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Leonardo.amaris
 */
public class Persona {
    private final String [] Nombre;
    private final int [] edad;
    private final String [] estadoCivil;
    private final double [] disponibilidad;
    public Persona() {
        Nombre = new String [10];
        edad = new int [10];
        estadoCivil = new String [10];
        disponibilidad = new double [10];
    }
    public String[] getNombre() {
        return Nombre;
    }
    public int[] getEdad() {
        return edad;
    }
    public String[] getEstadoCivil() {
        return estadoCivil;
    }
    public double[] getDisponibilidad() {
        return disponibilidad;
    }   
}
