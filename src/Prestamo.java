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
    private double monto;
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
        monto = 0;
        System.out.println("Llame el centralizado");
    }

    //funciones
    
    public void setCodigo(int cod){
        codigo = cod;
    }
    
    /*
    3 REGLAS DE GOCHEZ
    -------------------
    1- YO DEBO retornar un valor de acuerdo al tipo
        de la funcion. (Incompatible Types)
    2- YO DEBO retornar un valor SIEMPRE, evaluando
        incluso todos los caminos posibles 
        (Missing Return Statement)
    3- YO NUNCA DEBO de colocar instrucciones
        INMEDIATAMENTE despues de un return
        (Unreachable Statement)
    */
    public int getCodigo(){
        /*
        formato de retorno:
            return EXPR;
        */
        if(codigo >= 0)
            return codigo;
        return 0;
        //System.out.println("Se llamo getCodigo");
    }
    
    public void setCliente(String name){
        cliente = name;
    }
    
    public String getCliente(){
        return cliente;
    }
    
    public void print(){
        System.out.println(codigo+"-"+cliente);
    }
    
    public void setMonto(double m){
        monto = m;
    }
    
    public double getMonto(){
        return monto;
    }
    
    /*
    Funcion pagar. Recibe de parametro un valor
    double. Este valor se le resta al monto.
    Si el monto queda negativo se le asigna 0.
    Retorna el monto pagado real.
    */
    public double pagar(double m){
        if(m > monto)
            m = monto;
        monto -= m;
        return m;
    }
}
