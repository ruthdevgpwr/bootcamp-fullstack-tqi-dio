package loops_arrays.exercicios.loops;

import java.util.Scanner;

public class Exer04_ParEImpar {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int quantidadeNumeros;
        int numero;
        int numerosPares = 0;
        int numerosImpares = 0;

        System.out.println("Quantidade de números: ");
        quantidadeNumeros = scanner.nextInt();

        int count = 0;

        do {
            System.out.println("Número: ");
            numero = scanner.nextInt();

            if (numero % 2 == 0) {
                numerosPares++;
            } else {
                numerosImpares++;
            }

            count ++;
        } while (count < quantidadeNumeros);
        System.out.println("Números pares: " + numerosPares);
        System.out.println("Números Ímpares: " + numerosImpares);
    }
}
