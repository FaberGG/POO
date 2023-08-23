/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poo_1;

/**
 *
 * @author PERSONAL
 */
public class Poo_1 {

    /**
     * @param args the command line arguments
     */

    public static void main(String[] args) {
        // crear una instancia de la clase poo_1
        Poo_1 instance = new Poo_1();
        
        int resultado = instance.sum(1, 2);
        // llamado al metodo sum()
        System.out.println("Result: " + (resultado));
    }

    public int sum(int num1, int num2) {
//        System.out.println("Result: " + (num1 + num2));
        return (num1 + num2);
    }
}
