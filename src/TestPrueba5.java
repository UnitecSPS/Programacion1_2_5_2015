
import pruebas.EmpleadoPorHora;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Aula
 */
public class TestPrueba5 {
    public static void main(String[] args) {
        EmpleadoPorHora e = new EmpleadoPorHora(1,"MARTIN");
        e.setHoras(100);
        System.out.println(e.pagar());
    }
}
