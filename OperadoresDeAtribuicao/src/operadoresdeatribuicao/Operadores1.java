/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operadoresdeatribuicao;

/**
 *
 * @author marib
 */
public class Operadores1 {

    public static void main(String[] args) {
       
        double n1 = 10;
        double n2 = 30;
        String  s ="ABC";
        
        System.out.println(n1);
        System.out.println(n2);
         System.out.println(s);
         
          System.out.println("--------------------------------------------------------------");
          
          n1 *=2; // Vai fazer a variavel n1 receber o que j estava nela (10) multiplicando com o 2.
          n2 += n1; // Esta variavel vai ter que receber o que ja estava nela(30) + a variavel n1 (10) que estava valendo 20 depois do comando acima.
          s += "DEF"; 
          
         System.out.println(n1);
        System.out.println(n2);
         System.out.println(s);
    }
    
}
