package edu.chayonn.primeiroModulo;

import java.util.Locale;
import java.util.Scanner;

public class SobreMimComScanner {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite seu nome:");
        String nome = scanner.next();

        System.out.println("Digite seu sobrenome:");
        String sobrenome = scanner.next();

        System.out.println("Digite sua idade");
        int idade = scanner.nextInt();

        System.out.println("Digite a sua altura");
        double altura = scanner.nextDouble();


        System.out.println("Eu me chamo " + nome + " " + sobrenome + ".");
        System.out.println("Minha idade é " + idade + " anos.");
        System.out.println("Tenho " + altura + "m.");

        scanner.close();


        
    }
    
}