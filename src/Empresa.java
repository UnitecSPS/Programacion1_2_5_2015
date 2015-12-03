
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
public class Empresa {
    private String name;
    public EmpleadoPorHora empleados[];

    public Empresa(String name, int max) {
        this.name = name;
        empleados = new EmpleadoPorHora[max];
    }
    
    
}
