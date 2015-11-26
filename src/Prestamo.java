/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Aula
 */
public class Prestamo {
    //atributos
    //acceso tipo id
    public int codigo, cuotas;
    public String cliente;
    
    //constructores
    
    /*public Prestamo(){
        cuotas = 0;
        codigo = -1;
        cliente = "sin nombre";
        System.out.println("Construyendo un Prestamo");
    }*/
    
    public Prestamo(int co, String n){
        codigo = co;
        cliente = n;
    }
    
    //funciones
}
