/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Aula
 */

public class Pow {
    /*
    DEFINIR 3 atributos publicos, todos int
        * base, exponente, potencia
    DEFINIR 1 constructor que reciba de parametro
        valores para asignar al atributo base y al
        atributo exponente.
        Con estos valores inicializan la potencia.
    LUEGO hacer un main aparte para probarlo.
    */
    public int base, expo, potencia;
    
    public Pow(int base, int e){
        this.base = base;
        expo = e;
        
        potencia=1;
        for(int c=0; c < expo; c++)
            potencia *= base;
    }
    
    public static void main(String[] args) {
        Pow pow = new Pow(4,3);
        System.out.println(pow.base+"^"+pow.expo+
                " = "+pow.potencia);
    }
}
