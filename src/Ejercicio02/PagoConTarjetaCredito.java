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
public class PagoConTarjetaCredito extends Pagos{
    public int numTarjeta;

    public PagoConTarjetaCredito(int numTarjeta, int numeroCuenta, String titular) {
        super(numeroCuenta, titular);
        this.numTarjeta = numTarjeta;
    }

    @Override
    public String infoCliente() {
        String info="Numero de tu Tarjeta: " + this.numTarjeta + 
                    "\nTotal a Pagar: $" + this.pago;
        return super.infoCliente() + info; 
    }

    @Override
    public void pagar(double pg) {
        super.pagar(pg); 
    }
    
    
    
}
