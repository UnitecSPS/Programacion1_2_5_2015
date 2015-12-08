
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
        
        if( pepsi.addEmployee2(1, "Mae") )
            System.out.println("Se agrego bien!");
        
        /*
        TODO: Hace un menu con las opciones
            1- Agregar EMpleado
            2- Listar los empleados
            3- Pagar a un empleado
            4- Asignar las horas a un empleado
        */
        pepsi.list();
        pepsi.setHorasToEmployee(1, 88);
    }
}
