package exercicios.loops;

import java.util.Scanner;

public class Exer03_MaiorEMedia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numero;
        int maior = 0;
        int soma = 0;

        int count = 0;
        do {
            System.out.println("Número: ");
            numero = scanner.nextInt();

            soma = soma + numero;

            if (numero > maior) maior = numero;

            count += 1;
        } while(count < 5);
        System.out.println("Maior: " + maior);
        System.out.println("Média: " + soma/5);
    }
}
