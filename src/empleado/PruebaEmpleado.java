/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package empleado;

/**
 *
 * @author andys
 */
import java.util.Scanner;
public class PruebaEmpleado {
     // Variables receptoras de valores introducidos por el usuario del programa
        String nombre; // Nombre del empleado
        String apellido; // Apellido del empleado
        double salario; // Salario mensual del empleado
       
        // Instacimiento de dos objetos con valores iniciales
        Empleado empleado1 = new Empleado( "Zhen" , "Gholz" , 800 );
        Empleado empleado2 = new Empleado( "Larz" , "Binz" , -900 );
       
        // Solicitud y obtención de los del empleado1
        // Crear un objeto Scanner que admita la entrada de valores de la ventana de comandos
        Scanner entrada = new Scanner( System.in );
        {
        System.out.print( "\nSolicitud y recepción de los datos del empleado1" );
       
        // Nombre
        System.out.print( "\nEscriba su nombre: " );
        nombre = entrada.nextLine();
        empleado1.establecerNombre( nombre );
       
        // Apellido
        System.out.print( "\nEscriba su apellido: " );
        apellido = entrada.nextLine();
        empleado1.establecerApellido( apellido );
       
        // Salario
        System.out.print( "\nEscriba su salario mensual: " );
        salario = entrada.nextDouble();
        empleado1.establecerSalarioMensual( salario );
       
        // Muestra el resumen del empleado1
        System.out.print( "\nResumen para empleado1: " );
        empleado1.mostrarResumen();
       
        System.out.println( "\n\nSolicitud y recepción de los datos del empleado2" );
       
        // Nombre
        System.out.print( "\nEscriba su nombre: " );
        nombre = entrada.nextLine();
        empleado2.establecerNombre( nombre );
       
        // Apellido
        System.out.print( "\nEscriba su apellido: " );
        apellido = entrada.nextLine();
        empleado2.establecerApellido( apellido );
       
        // Salario
        System.out.print( "\nEscriba su salario mensual: " );
        salario = entrada.nextDouble();
        empleado2.establecerSalarioMensual( salario );
       
        // Muestra el resumen del empleado1
        System.out.print( "\nResumen para empleado2: " );
        empleado2.mostrarResumen();
       
        System.out.println();
    } // Fin del método main
}
