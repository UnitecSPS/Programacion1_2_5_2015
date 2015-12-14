/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exa2;

/**
 *
 * @author Aula
 */
public class Banco {
   private CuentaBancaria cuentas[];
   public static double TASA = 0.03;
   
   public Banco(int lon){
       cuentas = new CuentaBancaria[lon];
   }
   
   public int buscar(int cod){
       for(int c=0; c < cuentas.length; c++){
           if(cuentas[c] != null && 
                   cuentas[c].getCodigo() == cod)
               return c;
       }
       return -1;
   }
   
   public boolean agregar(int cod, String n){
       if(buscar(cod) == -1){
           for(int c=0; c < cuentas.length; c++){
               if(cuentas[c] == null){
                   cuentas[c] = new CuentaBancaria(cod,n);
                   return true;
               }
           }
       }
       return false;
   }
   
   public void transferir(int codo, int codd, double m){
       int origen=buscar(codo);
       int destino=buscar(codd);
       
       if(origen != -1 && destino != -1){
           if(cuentas[origen].retirar(m))
               cuentas[destino].depositar(m);
       }
   }
   
   public void intereses(){
       for(CuentaBancaria cb : cuentas){
           if(cb != null)
               cb.depositar(cb.getSaldo()*TASA);
       }
   }
   
   public void list(double m){
       for(CuentaBancaria cb : cuentas){
           if(cb != null && cb.getSaldo() >= m)
               cb.print();
       }
   }
}
