/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg060923;

import exercises.Persona;

/**
 *
 * @author IngSis
 */
public class Main {

    public static void main(String[] args) {
        Persona[] arrayPerson = new Persona[3];
        arrayPerson[0] = new Persona("faber", "navia", "225235");
        arrayPerson[1] = new Persona("edgar", "velazquez", "234523543");
        arrayPerson[2] = new Persona("arlejo", "sanchez", "7867868");

        System.out.println(arrayPerson[0].getFirstName());
        System.out.println(arrayPerson[0].getLastName());
        System.out.println(arrayPerson[0].getDocument());

        arrayPerson[0].setFirstName("john");
        arrayPerson[0].setLastName("Narvaez");
        arrayPerson[0].setDocument("12344324");

        for (Persona persona : arrayPerson) {
            System.out.println("-----------------\n" + persona.getFirstName());
            System.out.println(persona.getLastName());
            System.out.println(persona.getDocument());
        }

    }

}
