/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extraterrestres;

import java.util.*;
/**
 *
 * @author alejandrosebastian
 */
public class Extraterrestres {
    
    private ArrayList <Alienigena>aliens;

    public Extraterrestres() {
        aliens = new ArrayList<>();
    }
    
    public void crearAlien(String tipoAlien){
        
        Scanner leer = new Scanner(System.in);
        Alienigena alien;
        
        String color;
        int numeroOjos, numeroVidas, numeroCabezas, numeroDeManos;
        double altura;
        
        System.out.println("Digite el color del alien.");
        color = leer.next();
        System.out.println("Digite el numero de ojos del alien.");
        numeroOjos = leer.nextInt();
        System.out.println("Digite el numero de vidas del alien.");
        numeroVidas = leer.nextInt();
        System.out.println("Digite la altura del alien.");
        altura = leer.nextDouble();
        System.out.println("Digite el numero de cabezas del alien.");
        numeroCabezas = leer.nextInt();
        System.out.println("Digite el numero de manos del alien.");
        numeroDeManos = leer.nextInt();
        
        if (tipoAlien.equals("Marciano")) {
            alien = new Marte(color, numeroOjos, numeroVidas, altura, numeroCabezas, numeroDeManos);
            aliens.add(alien);
            System.out.println("Alien creado con exito:");
            System.out.println(alien.toString());
        }
        
        else if (tipoAlien.equals("Jupiteriano")){
            alien = new Jupiter(color, numeroOjos, numeroVidas, altura, numeroCabezas, numeroDeManos);
            aliens.add(alien);
            System.out.println("Alien creado con exito:");
            System.out.println(alien.toString());
        }
    }
    
    public void listarAliens(){
        for (Alienigena a: aliens){
            System.out.println(a);
        }
    }
}
