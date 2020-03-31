/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio02;

/**
 *
 * @author samll
 */
public class Ejercicio02 {
    public static void main(String[] args) {
        PagoAlContado pagoCont=new PagoAlContado(2211144, "Roxana Gomez");
        pagoCont.pagar(89.10);
        PagoConTarjetaCredito pagoTarje=new PagoConTarjetaCredito(1222111, 2222111, "Pedro Chavez");
        pagoTarje.pagar(133.99);
        
        System.out.println(pagoCont.infoCliente());
        System.out.println("\n********************************************************************\n");
        System.out.println(pagoTarje.infoCliente());
    }
    
}
