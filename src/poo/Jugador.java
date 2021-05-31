/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo;

/**
 *
 * @author paaabla
 */
public class Jugador {
     String nombre;
    String apodo;
    String apellido;
    int edad;
    float altura;
    float peso;
    int goles;
    int stamina;
    String posicion;
    String pie;
    
    
    public Jugador(String nombre, String apellido, String apodo){
    this.nombre="Cristiano";
    this.apellido="Ronaldo";
    this.apodo="CR7";
    }
    public Jugador (String nombre, String apodo){
    
        this.nombre=nombre;
        this.apodo=apodo;
    }
    
    
    //metodos
   public void correr(int velocidad, int metros, int segundos){
       velocidad=(metros*segundos);
   }
   public void saludar(){
       System.out.println("hola, gracias por elejirme");
   }
       
   }
    
    

