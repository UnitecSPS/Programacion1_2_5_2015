
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Aula
 */
public class Banco {
    public static void main(String[] args) {
        Scanner lea = new Scanner(System.in);
        //creamos un objeto prestamo y lo INSTANCIAMOS
        int c = 5;
        Prestamo pre = new Prestamo(c, lea.next());
        Prestamo pre2 = new Prestamo(7,"Celeste");
        Prestamo pre3 = new Prestamo();
        
        pre3.setCodigo(10);
        pre3.setCliente("Panchito");
        
        pre.print();
        pre2.print();
        pre3.print();
    }
}
