
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
    private int contador=0;
    private EmpleadoPorHora empleados[];

    public Empresa(String name, int max) {
        this.name = name;
        empleados = new EmpleadoPorHora[max];
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public EmpleadoPorHora search(int cod){
       for(EmpleadoPorHora eph : empleados){
           if(eph != null && eph.getCodigo() == cod)
               return eph;
       } 
       return null;
    } 
    
    //ESTRATEGIA 1-Buscar la posicion nula
    public boolean addEmployee1(int c, String nom){
        if(search(c) == null){
            for(int e=0; e < empleados.length; e++){
                if(empleados[e] == null){
                    empleados[e] = new EmpleadoPorHora(c, nom);
                    contador++;
                    return true;
                }
            }
        }
        return false;
    }
    
    //ESTRATEGIA 2: Usar un contador
    public boolean addEmployee2(int c, String nom){
        if(search(c)==null && contador < empleados.length){
            empleados[contador] = new EmpleadoPorHora(c, nom);
            contador++;
            return true;
        }
        return false;
    }
    
    /*
    Imprime los datos (CODIGO-NOMBRE) de todos
    los empleados en el arreglo.
    OJO CON LAS posiciones NULAS
    */
    public void list(){
      
    }
    
    /*
    Retorna el monto a pagar a un empleado
    que exista con codigo "cod". Si no
    existe retorno -1;
    */
    public double pagar(int cod){
        return 0;
    }
    
    /*
    1- buscar el empleado
    2- Si existe, asignarle a dicho empleado las
         horas que se reciben de parametro y se
         retorna true
    3- Si no existe retorno false.
    */
    public boolean setHorasToEmployee(int cod, double h){
        return false;
    }
}
