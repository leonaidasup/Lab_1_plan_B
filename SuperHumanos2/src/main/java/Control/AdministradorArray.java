/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Control;

import Model.Persona;
import java.util.ArrayList;

/**
 *
 * @author Juan José
 */
public class AdministradorArray {
    
    ArrayList <Persona> personas;
    
    public AdministradorArray(){
    }
    public void CrearArraylist()
    {
        personas=new ArrayList();
    }
    public void InsertarPersona(Persona persona)
    {
        personas.add(persona);
    }
    public String DevolverInformacion()
    {
        String reporte="";
        for(int contador=0;contador<personas.size();contador++)
        {
            reporte+=personas.get(contador).toString()+"\n";
        }
        return reporte;
    }
    
            
}
