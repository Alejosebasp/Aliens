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
public class Jupiter extends Alienigena{
    
    public Jupiter(String color, int numeroOjos, int numeroVidas, double altura, int numeroCabezas, int numeroDeManos) {
        super(color, numeroOjos, numeroVidas, altura, numeroCabezas, numeroDeManos);
    }

    @Override
    public String toString() {
        return "Tipo de alien: Jupiteriano"+"\nColor: "+color+"\nNumero de ojos: "+numeroOjos
                +"\nNumero de vidas: "+numeroVidas+"\nAltura: "+altura+"m"+"\nNumero de cabezas: "+numeroCabezas
                +"\nNumero de manos: "+numeroDeManos;
        
    }
        
    
    
}
