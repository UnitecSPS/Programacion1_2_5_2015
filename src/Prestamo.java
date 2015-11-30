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
    
    public Prestamo(){
        this(-1,"sin nombre");
        System.out.println("Llame el ()");
    }
    
    public Prestamo(int co, String n){
        this(co,0,n);
    }
    
    public Prestamo(int codigo, int cuotas, String cliente) {
        this.codigo = codigo;
        this.cuotas = cuotas;
        this.cliente = cliente;
        System.out.println("Llame el centralizado");
    }

    //funciones
}
