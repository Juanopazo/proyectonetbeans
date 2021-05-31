/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo;

import java.util.Scanner;

/**
 *
 * @author juanXopazo
 */
public class POO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int opcion=0;
        
        Scanner leer=new Scanner(System.in);
        
 Jugador j1=new Jugador();
        j1.nombre="Lionel";
        j1.apellido="Messi";
        j1.edad=33;
        j1.peso=72;
        j1.altura=170;
        j1.goles=672;
        System.out.println("el j1 es: "+j1.nombre +j1.apellido);
        System.out.println("los atributos de j1 son: ");
        System.out.println("edad: "+j1.edad);
        System.out.println("peso: "+j1.peso+" kg");
        System.out.println("altura: "+j1.altura+ " cm");
        System.out.println("goles anotados: "+j1.goles);
        System.out.println("---------------");
        System.out.println(" ingresa 1 para aceptar o 2 para elejir otro jugador");
     opcion = leer.nextInt();
     
 
        
    }      
    
}
    
    

