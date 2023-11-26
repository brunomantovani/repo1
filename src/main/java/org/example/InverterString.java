package org.example;

public class InverterString {

 // Um método estático que recebe uma string e retorna a mesma string invertida
 public static String inverterString(String s) {
     // Uma variável para armazenar a string invertida
     String invertida = "";
     // Um laço for para percorrer a string de trás para frente
     for (int i = s.length() - 1; i >= 0; i--) {
         // Concatenando cada caractere da string original na string invertida
         invertida = invertida + s.charAt(i);
     }
     // Retornando a string invertida
     return invertida;
 }

 // Um método estático que recebe uma string e imprime a mesma string e a sua versão invertida na tela
 public static void imprimirResultado(String s) {
     // Chamando o método inverterString e armazenando o resultado em uma variável
     String invertida = inverterString(s);
     // Imprimindo a string original e a string invertida na tela
     System.out.println("A string original é: " + s);
     System.out.println("A string invertida é: " + invertida);
 }

 // Um método principal para testar o inversor de string
 public static void main(String[] args) {
     // Um exemplo de string
     String s = "Olá, eu sou o Bing";
     // Chamando o método imprimirResultado e passando a string como argumento
     imprimirResultado(s);
 }
}
