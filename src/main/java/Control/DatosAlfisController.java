/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Control;

import Model.Alfi;
import View.VentanaDatosAlfis;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Juan José
 */
public class DatosAlfisController {
    
    ArrayList<Alfi> alfisAdmitidos;
    ArrayList<Alfi> alfisDenegados;
    public static VentanaDatosAlfis ventana3 = new VentanaDatosAlfis();
    public static void mostrar(){ ventana3.setVisible(true);}
    public static void ocultar(){ ventana3.setVisible(false);}
    
    public DatosAlfisController(){
        alfisAdmitidos=new ArrayList();
        alfisDenegados=new ArrayList();
    }
    
    public int pruebaPsicologicaAlfi(){
        int total=0;
        int q1=JOptionPane.showConfirmDialog(null, "¿Sueles tomar decisiones rápidas en situaciones de presión? ", "Prueba Psicologica Alfis", JOptionPane.YES_NO_OPTION);
        if (q1==0)
            total+=1;
        int q2=JOptionPane.showConfirmDialog(null, "¿Sientes que tienes control sobre tus enomicones? ", "Prueba Psicologica Alfis", JOptionPane.YES_NO_OPTION);
        if (q2==0)
            total+=1;
        int q3=JOptionPane.showConfirmDialog(null, "¿Puedes identificar y aprovechar las oportunidades en momentos críticos?", "Prueba Psicologica Alfis", JOptionPane.YES_NO_OPTION);
        if(q3==0)
            total+=1;
        int q4=JOptionPane.showConfirmDialog(null, "¿Tienes mentalidad asesina?", "Prueba Psicologica Alfis", JOptionPane.YES_NO_OPTION);
        if(q4==0)
            total+=1;
        
        return total;
    }
    
    public void BotonSave(int total){
        
        try{
            String nombre = ventana3.getjTextField1().getText();
            int tamaño = Integer.parseInt(ventana3.getjTextField2().getText());
            int fuerza = tamaño * 5;
            int poderMental = total;

            Alfi alfi = new Alfi(nombre, tamaño, fuerza, poderMental);
            System.out.println(poderMental);
            JOptionPane.showMessageDialog(null, "¡Datos guardados correctamente!");

            if (poderMental>2){
                if (alfisAdmitidos.size()<=10){
                    alfisAdmitidos.add(alfi);
                    JOptionPane.showMessageDialog(null, "Alfi Admitido");
                } else {
                    alfisDenegados.add(alfi);
                    JOptionPane.showMessageDialog(null, "La lista de admision de Alfis esta llena");
                }  
            } else {    
                alfisDenegados.add(alfi);
                JOptionPane.showMessageDialog(null, "Alfi Denegado");
            }
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Fallo al guardar, debe llenar los espacios en blanco correctamente");
        }
                
    }
    
    public String DevolverAlfisAdmitidos(){
    
        String reporte4="";
        for(int contador=0;contador<alfisAdmitidos.size();contador++)
        {
            reporte4+=alfisAdmitidos.get(contador).toString()+"\n";
        }
        return reporte4;
    }
    
    public String DevolverAlfisDenegados()
    {
        String reporte5="";
        for(int contador=0;contador<alfisDenegados.size();contador++)
        {
            reporte5+=alfisDenegados.get(contador).toString()+"\n";
        }
        return reporte5;
    } 
}
