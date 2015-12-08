/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estatico;

/**
 *
 * @author Aula
 */
public class Marciano {
    //atributo estatico o a nivel de clase
   public static int version=123;
   public static int contador=0;
   private String nombre;
   
   public Marciano(String n){
       nombre = n;
       contador++;
   }
   
   //funcion estaticas
   public static int getVersion(){
       return version;
   }
   
   public void atacar(){
       if(contador < 5)
           System.out.println("Yo "+nombre+
                   " Soy Cobarde!");
       else
           System.out.println("Yo "+nombre+
                   " Tengo el poder! Atacar!!");
   }
   
    public static void main(String[] args) {
        Batalla.main(args);
    }
}
