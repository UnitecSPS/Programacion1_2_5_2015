/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estatico;

/**
 *
 * @author Aula
 */
public class Batalla {
    public static void main(String[] args) {
        Marciano marcianos[] = new Marciano[5];
        
        marcianos[0] = new Marciano("Alf");
        marcianos[1] = new Marciano("Marvin");
        marcianos[2] = new Marciano("ET");
        marcianos[3] = new Marciano("Goku");
        marcianos[4] = new Marciano("Gino G");
        
        System.out.println("Contador: "+
                Marciano.contador);
        
        for(Marciano m : marcianos)
            if( m!=null){
                System.out.println(m.contador);
                m.atacar();
            }
        }
}
