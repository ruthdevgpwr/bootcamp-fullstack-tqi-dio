package exercicios.loops;

import java.util.Scanner;

public class Exer02_Nota {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int nota;

        System.out.println("Digite uma nota: ");
        nota = scanner.nextInt();

        while (nota < 0 | nota > 10) {
            System.out.println("Nota inválida. Digite uma nota de 0 a 10: ");
            nota = scanner.nextInt();
        }
    }
}
