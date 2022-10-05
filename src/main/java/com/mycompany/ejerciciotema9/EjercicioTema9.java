/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ejerciciotema9;

/**
 *
 * @author Sebastian
 */
public class EjercicioTema9 {

    public static void main(String[] args) {
        Cliente nuevoCliente = new Cliente();
        
        nuevoCliente.setCredito(100);
        nuevoCliente.setEdad(21);
        nuevoCliente.setNombre("Juan");
        nuevoCliente.setTelefono(334455);
        
        System.out.println("Cliente");
        System.out.println("Nombre: "+ nuevoCliente.getNombre());
        System.out.println("Edad: "+ nuevoCliente.getEdad());
        System.out.println("Telefono: "+ nuevoCliente.getTelefono());
        System.out.println("Credito: "+ nuevoCliente.getCredito());

        Trabajador nuevoTrabajador = new Trabajador();
        
        nuevoTrabajador.setNombre("Miguel");
        nuevoTrabajador.setEdad(35);
        nuevoTrabajador.setTelefono(151515);
        nuevoTrabajador.setSalario(1500);
        
        
    }
}
