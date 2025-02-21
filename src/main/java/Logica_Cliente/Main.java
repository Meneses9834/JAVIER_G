/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Logica_Cliente;

import Helpers.HelpersValidacion;
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
        int conteo, rta;

        System.out.println("Digite la marca del computador");
        marca = scan.nextLine();
        rta = HelpersValidacion.ValidarVacio(marca);

        while (rta > 0) {
            System.out.println("Digite la marca del computador");
            marca = scan.nextLine();
            rta = HelpersValidacion.ValidarVacio(marca);
        }

        conteo = HelpersValidacion.ValidarTodo(marca);

        while (conteo != 0) {
            System.out.println("Digite la marca de la computador");
            marca = scan.nextLine();
            conteo = HelpersValidacion.ValidarTodo(marca);

        }

        System.out.println("Digite el serial del computador");
        serial = scan.nextLine();
        rta = HelpersValidacion.ValidarVacio(serial);

        while (rta > 0) {
            System.out.println("Digite el serial del computador");
            serial = scan.nextLine();
            rta = HelpersValidacion.ValidarVacio(serial);
        }

        conteo = HelpersValidacion.ValidarTodoSerial(serial);

        while (conteo != 0) {
            System.out.println("Digite el serial del computador");
            serial = scan.nextLine();
            conteo = HelpersValidacion.ValidarTodoSerial(serial);

        }

        System.out.println("Digite el tamaño del computador");
        tamaño = scan.nextLine();
        rta = HelpersValidacion.ValidarVacio(tamaño );

        while (rta > 0) {
            System.out.println("Digite el tamaño del computador");
            tamaño  = scan.nextLine();
            rta = HelpersValidacion.ValidarVacio(tamaño );
        }

        conteo = HelpersValidacion.ValidarTodo(tamaño );

        while (conteo != 0) {
            System.out.println("Digite el tamaño del computador");
            tamaño  = scan.nextLine();
            conteo = HelpersValidacion.ValidarTodo(tamaño );

        }

        System.out.println("Digite el color del computador");
        color = scan.nextLine();
        rta = HelpersValidacion.ValidarVacio(color);

        while (rta > 0) {
            System.out.println("Digite el color del computador");
            color = scan.nextLine();
            rta = HelpersValidacion.ValidarVacio(color);
        }

        conteo = HelpersValidacion.ValidarTodo(color);

        while (conteo != 0) {
            System.out.println("Digite el color del computador");
            color = scan.nextLine();
            conteo = HelpersValidacion.ValidarTodo(color);

        }
        
        objComputador= new Computador(marca, serial, tamaño, color);
        
        System.out.println("Digite el nombre de la persona");
        nombre=scan.nextLine();
        rta = HelpersValidacion.ValidarVacio(nombre);

        while (rta > 0) {
            System.out.println("Digite el nombre de la persona: ");
            nombre = scan.nextLine();
            rta = HelpersValidacion.ValidarVacio(nombre);
        }

        conteo = HelpersValidacion.ValidarTodo(nombre);

        while (conteo != 0) {
            System.out.println("Digite el nobre de la persona: ");
            nombre = scan.nextLine();
            conteo = HelpersValidacion.ValidarTodo(nombre);

        }
        
        System.out.println("Digite el apellido de la persona: ");
        apellido=scan.nextLine();
        rta = HelpersValidacion.ValidarVacio(apellido);

        while (rta > 0) {
            System.out.println("Digite el apellido de la persona:");
            apellido = scan.nextLine();
            rta = HelpersValidacion.ValidarVacio(apellido);
        }

        conteo = HelpersValidacion.ValidarTodo(apellido);

        while (conteo != 0) {
            System.out.println("Digite el apellido de la persona: ");
            apellido = scan.nextLine();
            conteo = HelpersValidacion.ValidarTodo(apellido);

        }
        
        System.out.println("Digite la cedula de la persona: ");
        cedula=scan.nextLine();
        rta = HelpersValidacion.ValidarVacio(cedula);

        while (rta > 0) {
            System.out.println("Digite la cedula de la persona: ");
            cedula = scan.nextLine();
            rta = HelpersValidacion.ValidarVacio(cedula);
        }

        conteo = HelpersValidacion.ValidarTodoLetra(cedula);

        while (conteo != 0) {
            System.out.println("Digite la cedula de la persona: ");
            cedula = scan.nextLine();
            conteo = HelpersValidacion.ValidarTodoLetra(cedula);

        }
        
        System.out.println("Digite la direccion de la persona: ");
        direccion=scan.nextLine();
        rta = HelpersValidacion.ValidarVacio(direccion);

        while (rta > 0) {
            System.out.println("Digite la direccion de la persona: ");
            direccion = scan.nextLine();
            rta = HelpersValidacion.ValidarVacio(direccion);
        }

        conteo = HelpersValidacion.ValidarTodoDireccion(direccion);

        while (conteo != 0) {
            System.out.println("Digite la direccion de la persona: ");
            direccion = scan.nextLine();
            conteo = HelpersValidacion.ValidarTodoDireccion(direccion);

        }
        
        objPersona= new Persona(nombre, apellido, cedula, direccion, objComputador); //eestoy asociando
        
        Helpers.HelperImpresion.ImprimirPersona(objPersona);
       
    }

}
