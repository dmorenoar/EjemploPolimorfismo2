/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex4;

/**
 *
 * @author Xavier Castejon
 */
public class Camion extends Vehiculo{
    private int PMA = 3500;

    public Camion(String matricula, int anyo,int PMA) {
        super(matricula, anyo);
        this.PMA = PMA;
    }

    public int getPMA() {
        return PMA;
    }

    public void setPMA(int PMA) {
        this.PMA = PMA;
    }
    
    //Calcula el precio con Precio base * dias + PMA

    
    @Override
    public int calcularAlquiler(int dias) {
        return super.calcularAlquiler(dias) + this.PMA; //To change body of generated methods, choose Tools | Templates.
    }
    
    public void pitar(){
        System.out.println("PIII PIII");
    }
    
}
