package lists.exercicios;


/*Faça um programa que receba a temperatura média os 6 primeiros meses do ano e armazene-as em uma lista.
Após isto, calcule a média semestral das temperaturas e mostre todas as temperaturas acima desta média,
e em que mês elas ocorreram (mostrar o mês por extenso: 1 – Janeiro, 2 – Fevereiro e etc).
*/

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Exer01_Temperaturas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Double> temperaturas = new ArrayList<Double>();

        int count = 0;
        while (true) {
            if (count == 6) break;

            System.out.println("Digite a temperatura: ");
            double temperatura = scanner.nextDouble();
            temperaturas.add(temperatura);
            count++;
        }

        System.out.println("---------------------");

        System.out.print("Todas as temperaturas: ");
    }
}
