/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exercise_1;

/**
 *
 * @author John Faber Navia Narvaez
 */
public class Exercise_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Exercise_1 ex = new Exercise_1();
        
        int num=5;
        System.out.println("METODO FACTORIAL  \n El factorial de " + num + " es: " + ex.factorial(num));
        System.out.println("CON RECURSIVIDAD   \n El factorial de " + num + " es: " + ex.factorial_r(num));

    }
    
    public int factorial_r (int n){
        if( n == 0 || n== 1) return 1;
        return factorial_r(n-1)* n;
    }
    
    public int factorial(int numero){
        int resultado=1;
        for (int i=1; i<=numero; i++){
            resultado = resultado * i;
        }
        return resultado;
    }
  
}
