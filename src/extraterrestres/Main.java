/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package extraterrestres;

import java.util.Scanner;
/**
 *
 * @author alejandrosebastian
 * @version 1.0
 * @since 15/04/2016
 */

//Clase principal que contiene al metodo main.
public class Main {
    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Extraterrestres aliens = new Extraterrestres();
        
        boolean continuar = true;
        int opcion = 1;
        
        do {
            do {
                try {
                    System.out.println("Elija una opcion para continuar."
                    +"\n1. Para agregar un Marciano."
                    +"\n2. Para agregar un Jupiteriano."
                    +"\n3. Para listar todos los alienigenas."
                    +"\n0. Para cerrar el programa.");
                    
                    opcion = Integer.parseInt(leer.next());
                    continuar = true;
                } catch (Exception e) {
                    System.err.println("Por favor elija una opción valida.");
                    continuar = false;
                }
            } while (continuar == false);
            
            switch (opcion){
                case 1:
                    aliens.crearAlien("Marciano");
                    break;
                case 2:
                    aliens.crearAlien("Jupiteriano");
                    break;
                case 3:
                    aliens.listarAliens();
                    break;
            }
            
        } while (opcion != 0);
        
    }
    
}
