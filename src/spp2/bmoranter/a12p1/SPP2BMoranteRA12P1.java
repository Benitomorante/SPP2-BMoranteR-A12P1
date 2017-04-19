/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp2.bmoranter.a12p1;
import java.util.Scanner;
import javax.swing.JOptionPane;
/**
 *
 * @author Benito Mv
 */
public class SPP2BMoranteRA12P1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     double estatura, peso, imc;
     estatura= solicitarDato("Introduce estatura");
     peso= solicitarDato("Introduce peso");
     
     imc= peso/Math.pow(estatura,2);
     JOptionPane.showMessageDialog(null, "IMC: "+imc);
    }
    public static double solicitarDato(String mensaje){
        Scanner kb = new Scanner (System.in);
        String dato;
        double num = 0;
        boolean flag;
        do{
            try{
            dato = JOptionPane.showInputDialog (null, mensaje);
            num = Double.parseDouble(dato);
            flag=false;
            }catch (Exception ex) {
                JOptionPane.showMessageDialog (null, "Error");
                flag=true;
                } 
        } while (flag); 
        return num;
    }
}
    

                
        
    
    
