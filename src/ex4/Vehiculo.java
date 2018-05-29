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
public class Vehiculo {
    private String matricula;
    private int anyo;
    private int PRECIOBASE = 10;
    
    public Vehiculo(){}
    
    public Vehiculo(String matricula, int anyo) {
        this.matricula = matricula;
        this.anyo = anyo;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getAnyo() {
        return anyo;
    }

    public void setAnyo(int anyo) {
        this.anyo = anyo;
    }
    
    //Métodos propios
    public int calcularAlquiler(int dias){
        return PRECIOBASE * dias;
    }
    
}
