/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Logica_Cliente;

import Logica_Negocio.Computador;
import Logica_Negocio.Persona;
import java.util.Scanner;

/**
 *
 * @author Santiago Lopez
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner(System.in);
        String marca, serial, tamaño, color;
        String nombre, apellido, cedula, direccion;
        Computador objComputador;
        Persona objPersona;

        System.out.println("Digite la marca del computador");
        marca = scan.nextLine();

        System.out.println("Digite el serial del computador");
        serial = scan.nextLine();

        System.out.println("Digite el tamaño del computador");
        tamaño = scan.nextLine();

        System.out.println("Digite el color del computador");
        color = scan.nextLine();
        
        objComputador= new Computador(marca, serial, tamaño, color);
        
        System.out.println("Digite el nombre de la persona");
        nombre=scan.nextLine();
        
        System.out.println("Digite el apellido de la persona");
        apellido=scan.nextLine();
        
        System.out.println("Digite la cedula de la persona");
        cedula=scan.nextLine();
        
        System.out.println("Digite la direccion de la persona");
        direccion=scan.nextLine();
        
        objPersona= new Persona(nombre, apellido, cedula, direccion, objComputador); //eestoy asociando
        
        Helpers.HelperImpresion.ImprimirPersona(objPersona);
       
    }

}
