
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
        Prestamo pre2 = new Prestamo(10,"Celeste");
        
        System.out.println(pre.codigo+"-"+pre.cliente);
        System.out.println(pre2.codigo+"-"+pre2.cliente);
    }
}
