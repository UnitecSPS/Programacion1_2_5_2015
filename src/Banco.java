
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
        Prestamo pre = new Prestamo();
        Prestamo pre2 = new Prestamo();
        
        pre.cliente = lea.next();
        pre.codigo = 10;
        System.out.println(pre.codigo+"-"+pre.cliente);
        
        pre2.cliente = lea.next();
        pre2.codigo = lea.nextInt();
        System.out.println(pre2.codigo+"-"+pre2.cliente);
    }
}
