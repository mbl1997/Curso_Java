/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entradadedados2;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author marib
 */


//TAREFAS 

/**
 Ler um numero inteiro
 Ler um texto ate a quebra de linha
 Ler um caracter
 Ler um codigo composto de uma letra e um digito(exemplo: "a3"). Armazenar os valores um uma variavel tipo char  e outra tipo int,respectivamente.
 Ler  um numero double
 Ler  um nome(unica palavra) , sexo( caracter F ou M ), idade (interiro) e altura (double) na mesma linha, armazemando-os em quatro variaveis com os  devidos tipos. 
 */

public class EntradaDeDados2 {
    
     public static void main(String[] args) {
         
         Locale.setDefault(Locale.US);
          Scanner e = new Scanner (System.in);
          
int  n1 = e.nextInt();// 35
e.nextLine();
String name = e.nextLine();// Samuel dos Santos
char gender = e.next().charAt(0);// M

// b5
String s = e.next();
char letter = s.charAt(0);
int digit = Integer.parseInt(s.substring(1));

// 4.32 
double n2 = e.nextDouble(); 

// Mariana  F  23  1.68
String name2 = e.next(); 
char ch = e.next().charAt(0);
int age = e.nextInt();
double height = e.nextDouble();

System.out.println(n1); 
System.out.println(name); 
System.out.println(gender); 
System.out.println(letter); 
System.out.println(digit);
System.out.println(n2);
System.out.println(name2);
System.out.println(age);
System.out.println(ch);
System.out.println(height);

e.close();

/* LIMPEZA DE STREAM DE ENTRADA (FLUSH)

Detalhe importante:

Antes de Fazer um nextLine()
 - Se antes foi dada uma quebra de linha na stream de entrada sem o nextLine()
- Então é preciso fazer um nextLine() extra para "limpar" a quebra de linha que fica pendente na stream.
*/
          
     }
}
