/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercise_class;
import call.unicauca.edu.co.Ex_atrr;

/**
 *
 * @author John Faber Navia Narvaez
 */
public class Exercise_class {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Instancia la clase Ex_atrr()
        Ex_atrr atrr = new Ex_atrr();
        
        System.out.println("Access var: ");
        System.out.println("Name import: " + atrr.name);
        
        atrr.name = "John Navia";
        
        System.out.println("Import name attemp2 : " + atrr.name);
        System.out.println("Import year_hbd: " + atrr.year_hbd);
    }
    
}
