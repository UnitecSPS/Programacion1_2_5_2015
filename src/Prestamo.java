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
    private int codigo, cuotas;
    private String cliente;
    
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
    
    public void setCodigo(int cod){
        codigo = cod;
    }
    
    public void setCliente(String name){
        cliente = name;
    }
    
    public void print(){
        System.out.println(codigo+"-"+cliente);
    }
}
