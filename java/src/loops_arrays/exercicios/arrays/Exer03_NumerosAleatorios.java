package loops_arrays.exercicios.arrays;

import java.util.Random;
import java.util.Scanner;

public class Exer03_NumerosAleatorios {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Random random = new Random();

        int[] numerosAleatorios = new int[20];

        for (int i = 0; i < numerosAleatorios.length; i++) {
            int numero = random.nextInt(100);
            numerosAleatorios[i] = numero;
        }

        System.out.println("Números aleatórios: ");
        for (int numero : numerosAleatorios) {
            System.out.println(numero + " ");
        }

        System.out.println("Sucessores dos Números Aleatórios: ");
        for (int numero : numerosAleatorios) {
            System.out.println((numero+1) + " ");
        }
    }
}
