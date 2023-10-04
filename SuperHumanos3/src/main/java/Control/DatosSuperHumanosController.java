/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Control;

import Model.SuperHumano;
import View.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Juan José
 */
public class DatosSuperHumanosController {  
    ArrayList<SuperHumano> admitidos;
    ArrayList<SuperHumano> denegados;
    
    
    public static VentanaDatosSuperHumanos ventana2 = new VentanaDatosSuperHumanos();
    public static void mostrar(){ ventana2.setVisible(true);}
    public static void ocultar(){ ventana2.setVisible(false);}
    
    public DatosSuperHumanosController(){
        admitidos=new ArrayList();
        denegados=new ArrayList();
    }
    
    public int pruebaPsicologica(){
        int total=0;
        int q1=JOptionPane.showConfirmDialog(null, "¿Usted ha matado en legitima defensa? ", "Prueba Psicologica", JOptionPane.YES_NO_OPTION);
        if (q1==1)
            total+=1;
        int q2=JOptionPane.showConfirmDialog(null, "¿Usted ha cometido un crimen pasional? ", "Prueba Psicologica", JOptionPane.YES_NO_OPTION);
        if (q2==1)
            total+=1;
        int q3=JOptionPane.showConfirmDialog(null, "¿Le gusta provocar enojo en las demas personas?", "Prueba Psicologica", JOptionPane.YES_NO_OPTION);
        if(q3==1)
            total+=1;
        int q4=JOptionPane.showConfirmDialog(null, "¿Se considera Egocentrico?", "Prueba Psicologica", JOptionPane.YES_NO_OPTION);
        if(q4==1)
            total+=1;
        
        return total;
    }
    
    public void BotonGuardar(){
        int saludMental = total;
        String superNombre = ventana2.getjTextField3().getText();
        int superFuerza = Integer.parseInt(ventana2.getjTextField1().getText());
        String visionLaser = ventana2.getjTextField2().getText();
        
        SuperHumano superHumano = new SuperHumano(superNombre, saludMental, superFuerza, visionLaser,nombre, edad, estadoCivil, hijos, DNI);
        
        System.out.println(saludMental+superNombre+superFuerza+visionLaser);
    }
}
