/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extraterrestres;

/**
 *
 * @author alejandrosebastian
 */
public abstract class Alienigena {
    
    protected String color;
    protected int numeroOjos;
    protected int numeroVidas;
    protected double altura;
    protected int numeroCabezas;
    protected int numeroDeManos;
    
    public Alienigena(String color, int numeroOjos, int numeroVidas, double altura, int numeroCabezas, int numeroDeManos) {
        this.color = color;
        this.numeroOjos = numeroOjos;
        this.numeroVidas = numeroVidas;
        this.altura = altura;
        this.numeroCabezas = numeroCabezas;
        this.numeroDeManos = numeroDeManos;
    }

    @Override
    public abstract String toString();
    
   }
