/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Control;

import Model.SuperHumanos;
import java.util.ArrayList;

/**
 *
 * @author Juan José
 */
public class AdmitirSupers {
    
    ArrayList <SuperHumanos> supers;
    
    public AdmitirSupers(){
    }
    public void CrearArraylist2()
    {
        supers=new ArrayList();
    }
    public void InsertarSuper(SuperHumanos superh)
    {
        supers.add(superh);
    }
    public String DevolverInformacion2()
    {
        String reporte="";
        for(int contador=0;contador<supers.size();contador++)
        {
            reporte+=supers.get(contador).toString()+"\n";
        }
        return reporte;
    }
    
            
}

