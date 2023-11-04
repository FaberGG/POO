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

        Scanner input = new Scanner(System.in);
        //creo la lista de objetos trabajadores
        LinkedList<Empleado> objetos = new LinkedList<>();

         //se crean los objetos empleados
        EmpleadoAsalariado empleado1 = new EmpleadoAsalariado("Juan", 800, 100);
        EmpleadoAsalariado empleado2 = new EmpleadoAsalariado("Alberto", 1000, 250);
        EmpleadoAsalariado empleado3 = new EmpleadoAsalariado("Maria", 1000, 200);
        EmpleadoAsalariado empleado4 = new EmpleadoAsalariado("Camilo", 700, 200);
        EmpleadoAsalariado empleado5 = new EmpleadoAsalariado("Estefania", 1200, 300);
        EmpleadoPorHoras empleado6 = new EmpleadoPorHoras("Luis", 900, 35, 30);
        EmpleadoPorHoras empleado7 = new EmpleadoPorHoras("Marcos", 600, 40, 20);
        EmpleadoPorHoras empleado8 = new EmpleadoPorHoras("Teresa", 400, 35, 10);
        EmpleadoPorHoras empleado9 = new EmpleadoPorHoras("Sara", 400, 45, 5);
        EmpleadoPorHoras empleado10 = new EmpleadoPorHoras("Jhonatan", 450, 50, 5);

        //se añaden los objetos a la lista
        objetos.add(empleado1);
        objetos.add(empleado2);
        objetos.add(empleado3);
        objetos.add(empleado4);
        objetos.add(empleado5);
        objetos.add(empleado6);
        objetos.add(empleado7);
        objetos.add(empleado8);
        objetos.add(empleado9);
        objetos.add(empleado10);

        //obtener empleados por hora
        System.out.println("\n--------------------------------");
        System.out.println("LOS EMPLEADOS POR HORA SON:");
        System.out.println("--------------------------------");

        for (Empleado empleado : objetos) {
            if (empleado instanceof EmpleadoPorHoras empleadoPorHoras) {
                System.out.println("\n---Trabajador por horas---");
                System.out.println(" Nombre:               " + empleadoPorHoras.getNombre());
                System.out.println(" Salario:              " + empleadoPorHoras.getSalario());
                System.out.println(" Horas trabajadas:     " + empleadoPorHoras.getHorasTrabajadas());
                System.out.println(" Tarifa por hora:      " + empleadoPorHoras.getTarifaHora());
            }
        }
        // obtener empleados por deducciones
        System.out.println("\n--------------------------------");
        System.out.println("LOS EMPLEADOS CON SALARIO FIJO SON:");
        System.out.println("--------------------------------");
        for (Empleado empleado : objetos) {
            if (empleado instanceof EmpleadoAsalariado empleadoAsalariado) {
                System.out.println("\n---Trabajador con salario fijo---");
                System.out.println(" Nombre:               " + empleadoAsalariado.getNombre());
                System.out.println("Salario:               " + empleadoAsalariado.getSalario());
                System.out.println("Deducciones:           " + empleadoAsalariado.getDeducciones());
            }
        }
        //Modificar el nombre o salario de un empleado
        System.out.println("\n--------------------------------");
        System.out.println("MODIFICAR NOMBRE O SALARIO");
        System.out.println("--------------------------------");
        System.out.println("\n De cual trabajador desea modificar el nombre o salario? ");

        int num;
        do {
            System.out.print("  Ingese el numero de trabajador: ");
            num = input.nextInt();
            if (num < 0 || num >= objetos.size()) {
                System.out.println("Numero de trabajador fuera de rango. Por favor, ingrese un numero valido.");
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
                    input.nextLine(); // Consume la nueva línea

                }
            }
        } while (num < 0 || num >= objetos.size());

        //obtener empleados por hora
        System.out.println("\n--------------------------------");
        System.out.println("LOS EMPLEADOS POR HORA SON:");
        System.out.println("--------------------------------");

        for (Empleado empleado : objetos) {
            if (empleado instanceof EmpleadoPorHoras empleadoPorHoras) {
                System.out.println("\n---Trabajador por horas---");
                System.out.println(" Nombre:               " + empleadoPorHoras.getNombre());
                System.out.println(" Salario:              " + empleadoPorHoras.getSalario());
                System.out.println(" Horas trabajadas:     " + empleadoPorHoras.getHorasTrabajadas());
                System.out.println(" Tarifa por hora:      " + empleadoPorHoras.getTarifaHora());
            }
        }

        // obtener un empleado especifico
        System.out.println("\n--------------------------------");
        System.out.println("OBTENER UN EMPLEADO ESPECIFICO:");
        System.out.println("--------------------------------");

        System.out.println("De cual trabajador desea obtener su informacion? ");
        System.out.print("  Ingese el numero de trabajador: ");
        int opcion = input.nextInt();

        if (opcion < 0 || opcion >= objetos.size()) {
            System.out.println("Numero de trabajador fuera de rango. Por favor, ingrese un numero valido.");
        } else {
            System.out.println("\nLa informacion del trabajador " + num + " es:");
            System.out.println("Nombre:             " + objetos.get(num).getNombre());
            System.out.println("Salario:            " + objetos.get(num).getSalario());
            System.out.println("Salario Calculado:  " + objetos.get(num).calcularSalario());
        }

    }

}
