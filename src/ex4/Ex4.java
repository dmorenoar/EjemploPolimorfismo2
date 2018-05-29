/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex4;

import java.util.ArrayList;

/**
 *
 * @author Xavier Castejon
 */
public class Ex4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Coche c = new Coche(5, "1170FFF", 19990);
        
        Camion ca = new Camion("222FF", 1880, 3500);
        
        ArrayList<Vehiculo> lista = new ArrayList();
        
        lista.add(c);
        lista.add(ca);
        
        //System.out.println("Cuanto cuesta el alquiler " + c.calcularAlquiler(2));
        
        for(Vehiculo v: lista){
             if(v instanceof Camion){
                 Camion cS = (Camion) v;
                 //Ahora usando cS puedo utilizar los métodos o atributos del Camion.
             }else if(v instanceof Coche){
                 Coche cSimple = (Coche) v;
                 //Ahora usando cSimple puedo utilizar los métodos o atributos del Coche.
                 
             }
        }
        
       
        
    }
    
}
