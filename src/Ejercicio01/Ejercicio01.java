/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio01;

/**
 *
 * @author samll
 */
public class Ejercicio01 {
    public static void main(String[] args) {
        EmpleadoAsalariado empleadoAsala=new EmpleadoAsalariado("La Constancia", "Josep Bale", "San Salvador", "Mecanico", 266619899, 455.55);
        EmpleadoPorHoras empleadoHora=new EmpleadoPorHoras(8, "Carlos Perez", "Chalatenango", "Vendedor", 22331212);
        EmpleadoPorComision empleadoComi=new EmpleadoPorComision(305.23, "Susana Distancia", "La Paz", "Distribuidor", 70981242, 415.75);
        
        System.out.println("EMPLEADO ASALARIADO++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println(empleadoAsala.infoEmpleado());
        System.out.println(empleadoAsala.salario());
        
        System.out.println("\nEMPLEADO POR HORAS++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println(empleadoHora.infoEmpleado());
        System.out.println(empleadoHora.salario());
        
        System.out.println("\nEMPLEADO POR COMISIONES++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println(empleadoComi.infoEmpleado());
        System.out.println(empleadoComi.salario());
        
    }
}
