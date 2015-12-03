
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
public class TestEmpresa {
    public static void main(String[] args) {
        Empresa pepsi = new Empresa("Pepsi co.",200);
        
        pepsi.empleados[0] = new EmpleadoPorHora(1, "Mae");
        pepsi.empleados[0].setHoras(50);
        System.out.println(pepsi.empleados[0].pagar());
    }
}
