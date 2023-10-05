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
public class DatosHumanosController {
    ArrayList<SuperHumano> Admitidos;
    ArrayList<SuperHumano> Denegados;
    ArrayList<SuperHumano> Escuadron1;
    ArrayList<SuperHumano> Escuadron2;
    ArrayList<SuperHumano> Reserva;
    
    public static VentanaDatosHumanos ventana = new VentanaDatosHumanos();
    public static void mostrar(){ ventana.setVisible(true);}
    public static void ocultar(){ ventana.setVisible(false);}
    
    public DatosHumanosController(){
        Admitidos=new ArrayList();
        Denegados=new ArrayList();
        Escuadron1=new ArrayList();
        Escuadron2=new ArrayList();
        Reserva=new ArrayList();
    }
    
    public String DevolverAdmitidos()
    {
        String reporte="";
        for(int contador=0;contador<Admitidos.size();contador++){
            reporte+=Admitidos.get(contador).toString()+"\n";}
        return reporte;
    }

    public String DevolverDenegados()
    {
        String reporte="";
        for(int contador=0;contador<Denegados.size();contador++)
        {
            reporte+=Denegados.get(contador).toString()+"\n";
        }
        return reporte;
    }
    
    public int pruebaPsicologica(){
        int total=0;
        int q1=JOptionPane.showConfirmDialog(null, "¿Usted ha matado en legitima defensa? ", "Prueba Psicologica", JOptionPane.YES_NO_OPTION);
        if (q1==0)
            total+=1;
        int q2=JOptionPane.showConfirmDialog(null, "¿Usted ha cometido un crimen pasional? ", "Prueba Psicologica", JOptionPane.YES_NO_OPTION);
        if (q2==0)
            total+=1;
        int q3=JOptionPane.showConfirmDialog(null, "¿Le gusta provocar enojo en las demas personas?", "Prueba Psicologica", JOptionPane.YES_NO_OPTION);
        if(q3==0)
            total+=1;
        int q4=JOptionPane.showConfirmDialog(null, "¿Se considera Egocentrico?", "Prueba Psicologica", JOptionPane.YES_NO_OPTION);
        if(q4==0)
            total+=1;
        
        return total;
    }
    
    
    public void eventoBoton1(int total){
        try{
            String nombre = ventana.getjTextField1().getText();
            int edad = Integer.parseInt(ventana.getjTextField2().getText());
            String estadocivil = ventana.getjTextField3().getText();
            String estadoCivil = estadocivil.toUpperCase();
            int hijos = Integer.parseInt(ventana.getjTextField4().getText());
            String DNI = ventana.getjTextField5().getText();
            int saludMental = total;
            String superNombre = ventana.getjTextField6().getText();
            int superFuerza = Integer.parseInt(ventana.getjTextField7().getText());
            String vision = ventana.getjTextField8().getText();
            String visionLaser = vision.toUpperCase();

            SuperHumano persona = new SuperHumano(superNombre, saludMental, superFuerza, visionLaser, nombre,edad,estadoCivil,hijos,DNI);
            
            if(saludMental<2){ // Si la salud mental es buena, entonces...
                if(superFuerza > 1000 || visionLaser.equals("SI")){ // Si tiene poderes, entonces...
                   if((edad<50 && estadoCivil.equals("SOLTERO") && hijos < 1) && Escuadron1.size() < 2){ // Si es menor de 50, esta soltero, no tiene hijos y el tamaño del escuadron 1 es menor a 15, entonces...
                        Admitidos.add(persona);
                        Escuadron1.add(persona);
                        System.out.println("Ingresa al escuadron 1");
                    }else if( hijos > 1 || (Escuadron1.size() >= 2 && Escuadron2.size() < 2)){ // puede tener hijos y el escuadron 2 es menor a 15 ó no tiene hijos pero el escuadron 1 esta lleno, entonces...
                        Admitidos.add(persona);
                        Escuadron2.add(persona);
                        System.out.println("Ingresa al escuadron 2");
                    }else{ // si los escuadrones estan llenos, entonces...
                        Reserva.add(persona);
                        Admitidos.add(persona);
                        System.out.println("Ingresas a reserva porque los escuadrones principales estan llenos");     
                    } // finaliza else de escuadrones
                } else { // Si no tiene poderes, entonces...
                Denegados.add(persona);
                System.out.println("Denegado porque no tiene poderes");
                } // finaliza else de poderes
            } else { // Si la salud Mental es mala, entonces...
                Denegados.add(persona);
                System.out.println("Denegado por SaludMental");
            }// finaliza else de salud mental

            JOptionPane.showMessageDialog(null, "¡Datos guardados correctamente!");
        }
        catch(NumberFormatException ex){
            JOptionPane.showMessageDialog(null, "ERROR. Debes introducir un número en edad, hijos y Prueba de fuerza");
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(null, "ERROR. fallo no identificado"+ ex.getMessage());
        }
    }
    
    
    public void BotonIrAlfis(){
        //if (admitidos.size() > 20){
            ocultar();
            DatosAlfisController.mostrar();
        /*} else {
            JOptionPane.showMessageDialog(null, "Tiene que haber al menos 20 SuperHumanos Admitidos");
        }*/
    
    }
}
