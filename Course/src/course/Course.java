/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package course;

import java.util.Locale;

/**
 *
 * @author marib
 */
public class Course {
    public static void main(String[] args) {
       
            char gender = 'F';
        int age = 32;
        double balance = 10.35789;
        String name  = "Mariana";
        
        System.out.print("Good Morning!");
        System.out.println("Good Afternoon!");
        System.out.println("Good Night!");
        
        System.out.println("-------------------------------------------------------------------------");
        
        System.out.printf("%.2f%n", balance);
          System.out.printf("%.4f%n", balance);
          
          // Se voce quiser colocar ponto como de outro pais - como por exemplo dos EUA tem que colocar a seguinte comfiguracao.
                    Locale.setDefault(Locale.US);
                    System.out.printf("%.4f%n", balance);

                            System.out.println("-------------------------------------------------------------------------");
// Quando voce quiser colocar uma String no printf tem que colocar %s.
// Da mesma forma como o 32 é um variavel int tem que colocar %d 
// Exemplo:

System.out.printf("%s is %d years old, gender %c, and got balance = %.2f bitcoins%n", name,age,gender,balance);
                            
    }
    
}
