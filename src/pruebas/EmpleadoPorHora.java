/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebas;

/**
 *
 * @author Aula
 */
public class EmpleadoPorHora {
     private int codigo;
     private String nombre;
     private double horas;
     
     public EmpleadoPorHora(int c, String n){
         codigo = c;
         nombre = n;
         horas = 0;
     }
     
     public void setHoras(double h){
         horas=h;
     }

    public int getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public double getHoras() {
        return horas;
    }

    public double pagar(){
        if(horas > 40)
            return (40*100)+((horas-40)*200);
        return horas*100;
    }
}
