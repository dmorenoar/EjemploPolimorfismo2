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
public class Coche extends Vehiculo{
    private int numPlazas = 5;
    private boolean estaRoto = false;

    public Coche(int numPlazas, String matricula, int anyo) {
        super(matricula, anyo);
        this.numPlazas = numPlazas;
    }

    public int getNumPlazas() {
        return numPlazas;
    }

    public void setNumPlazas(int numPlazas) {
        this.numPlazas = numPlazas;
    }

    public boolean isEstaRoto() {
        return estaRoto;
    }

    public void setEstaRoto(boolean estaRoto) {
        this.estaRoto = estaRoto;
    }
    
    
    //Métodos propios
    public int estaRoto(boolean estado){
        if(estado){
            return 20;
        }else{
            return 0;
        }
    }
    
    //En el coche calcularAlquiler se basa en el -> precio base * dias + numplazas + estaRoto
    // 10 * 2 + 5 + 20

    @Override
    public int calcularAlquiler(int dias) {
        return super.calcularAlquiler(dias) + this.numPlazas + estaRoto(true); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
