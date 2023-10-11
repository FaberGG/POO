package parcialpoo;

import empleados.Empleado;
import empleados.EmpleadoAsalariado;
import empleados.EmpleadoPorHoras;
import java.util.LinkedList;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author John Faber Navia Narvaez
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

//        Empleado empleado = new Empleado();
        Scanner input = new Scanner(System.in);

        LinkedList<Empleado> objetos = new LinkedList<Empleado>();
        System.out.println("--CUANTOS TRABAJADORES DESEA INGRESAR AL SISTEMA?--");
        int cantTrabajadores = input.nextInt();
        
        for (int i = 0; i < cantTrabajadores; i++) {
            input.nextLine(); // consume la nueva linea antes de la nueva entrada
            
            System.out.println("ingrese el nombre del trabajador " + (i + 1));
            String nombre = input.nextLine();
            
            System.out.println("¿Qué tipo de trabajador es? (1 para Asalariado, 2 para Por Horas)");
            int tipoTrabajador = input.nextInt();
            input.nextLine(); // Consume la nueva línea
            
            System.out.println("ingrese el salario del trabajador " + (i + 1));
            Double salario = input.nextDouble();
            
            if (tipoTrabajador == 1) {
                System.out.println("ingrese el las deducciones del trabajador " + (i + 1));
                Double deducciones = input.nextDouble();
                EmpleadoAsalariado empleadoA = new EmpleadoAsalariado(nombre, salario, deducciones);
                objetos.add(i, empleadoA);

            } else if(tipoTrabajador == 2){
                System.out.println("ingrese el las horas trabajadas del trabajador " + (i + 1));
                int horasTrabajadas = input.nextInt();
                System.out.println("ingrese el valor por hora del trabajador " + (i + 1));
                Double tarifaHora = input.nextDouble();
                EmpleadoPorHoras empleadoH = new EmpleadoPorHoras(nombre, salario, horasTrabajadas, tarifaHora);
                objetos.add(i, empleadoH);
            }            
        }

        //obtener empleados por hora
        for (Empleado empleado : objetos) {
            System.out.println("Los empleados por hora son:");
            if (empleado instanceof EmpleadoPorHoras) {
                System.out.println("Empleado " + (i + 1));
                System.out.println(" Nombre:" + objetos.get(i).getNombre());
                System.out.println(" Salario:" + objetos.get(i).getSalario());
            }
        }
        // obtener empleados por deducciones
        for (Empleado empleado : objetos) {
            System.out.println("Los empleados por salario fijo son son:");
            if(empleado instanceof EmpleadoAsalariado){
                System.out.println("Empleado " + (i + 1));
                System.out.println(" Nombre:" + objetos.get(i).getNombre());
                System.out.println(" Salario:" + objetos.get(i).getSalario());
            }
        }
        //Modificar el nombre o salario de un empleado
        System.out.println("---MODIFICAR NOMBRE O SALARIO---");
        System.out.println("De cual trabajador desea modificar el nombre o salario? ");
        System.out.print("  Ingese el numero de trabajador: ");
        int num = input.nextInt();

        if (num < 0 || num >= objetos.size()) {
            System.out.println("Número de trabajador fuera de rango. Por favor, ingrese un número válido.");
        } else {
            System.out.println("Que desea modificar NOMBRE[1] O SALARIO[2]");
            int opc = input.nextInt();
            input.nextLine(); // Consume la nueva línea
            if (opc == 1) {
                System.out.print(" \nIngrese el nombre nuevo del trabajador: ");
                String nombre = input.nextLine();
                objetos.get(num).setNombre(nombre);
            } else if (opc == 2) {
                System.out.print(" \nIngrese el salario nuevo del trabajador: ");
                double salario = input.nextDouble();
                objetos.get(num).setSalario(salario);
            }
            input.nextLine(); // Consume la nueva línea
        }

        // Obtener empleados por horas
        for (Empleado empleado : objetos) {
            System.out.println("Los empleados por hora son:");
            if (empleado instanceof EmpleadoPorHoras) {
                System.out.println("Empleado " + (i + 1));
                System.out.println(" Nombre:" + objetos.get(i).getNombre());
                System.out.println(" Salario:" + objetos.get(i).getSalario());
            }
        }

        // obtener un empleado especifico
        System.out.println("De cual trabajador desea obtener su informacion? ");
        System.out.print("  Ingese el numero de trabajador: ");
        int opcion = input.nextInt();

        if (opcion < 0 || opcion >= objetos.size()) {
            System.out.println("Número de trabajador fuera de rango. Por favor, ingrese un número válido.");
        } else {
            System.out.println("\nLa informacion del trabajador " + num + " es:");
            System.out.println("Nombre: " + objetos.get(num).getNombre());
            System.out.println("Salario " + objetos.get(num).getSalario());
        }

    }

}
