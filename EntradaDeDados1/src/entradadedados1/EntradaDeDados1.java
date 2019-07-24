/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entradadedados1;

import java.util.Scanner;

/**
 *
 * @author marib
 */


//TAREFAS 

/**
 Ler um texto ate a quebra de linha e armazenar em uma variavel.
  Ler 3 palavras, uma em cada linha, armazenando cada uma em ema variavel
 Ler 3 palavras na mesma linha, separadas por espaco, armazemando cada uma em uma variavel.
 */


public class EntradaDeDados1 {

    public static void main(String[] args) {
       
        Scanner entrada = new Scanner (System.in);
        
        String sentence = entrada.nextLine();
        String x,y,z;
        x = entrada.next();
        y = entrada.next();
        z = entrada.next();
        
        
        System.out.println(sentence);
         System.out.println(x);
          System.out.println(y);
           System.out.println(z);
        
           
           
        x = entrada.next();
        y = entrada.next();
        z = entrada.next();
     
          System.out.println(x);
          System.out.println(y);
          System.out.println(z);
 
        entrada.close();
    }
    
}
