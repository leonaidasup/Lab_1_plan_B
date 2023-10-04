/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Control;
import Model.Persona;
import View.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;
/**
 *
 * @author Juan José
 */
public class DatosHumanosController {
    ArrayList<Persona> personas;
    
    public static VentanaDatosHumanos ventana = new VentanaDatosHumanos();
    public static void mostrar(){ ventana.setVisible(true);}
    public static void ocultar(){ ventana.setVisible(false);}
    
    public DatosHumanosController(){
        personas=new ArrayList();
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
    
    public void eventoBoton1(){
        try{
            String nombre = ventana.getjTextField1().getText();
            int edad = Integer.parseInt(ventana.getjTextField2().getText());
            String estadoCivil = ventana.getjTextField3().getText();
            int hijos = Integer.parseInt(ventana.getjTextField4().getText());
            String DNI = ventana.getjTextField5().getText();

            Persona persona = new Persona(nombre,edad,estadoCivil,hijos,DNI);
            personas.add(persona);
            JOptionPane.showMessageDialog(null, "¡Datos guardados correctamente!");
        }
        catch(NumberFormatException ex){
            JOptionPane.showMessageDialog(null, "ERROR. Debes introducir un número en edad e hijos");
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(null, "ERROR. fallo no identificado"+ ex.getMessage());
        }
    }
    public void BotonIrASuperHumanos(){
        //if (personas.size() > 20){
            ocultar();
            DatosSuperHumanosController.mostrar();
        /*} else {
            JOptionPane.showMessageDialog(null, "Tiene que ingresar los datos de al menos 20 personas");
        }*/
    
    }
}
