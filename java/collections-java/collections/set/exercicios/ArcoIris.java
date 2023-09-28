package set.exercicios;

import java.util.*;

public class ArcoIris {

    public static void main(String[] args) {

        //Crie um conjunto contendo cores do arco-iris e :
        // A - Exiba todas as cores uma abaixo da outra
        // B - Mostre a quantidade de cores que o arco-iris tem
        // C - Exiba as cores em ordem alfabética
        // D - Exiba as cores na ordem inversa da que foi informada
        // E - Exiba todas as cores que começa com a letra V
        // F - Remova todas as cores que não começam com a letra V
        // G - Limpe o conjunto
        // H - Confira se o conjunto está vazio


        System.out.println("Crie um conjunto contendo cores do arco-iris: ");
        Set<String> coresArcoIris = new HashSet<>(Arrays.asList("vermelho", "laranja", "amarelo", "verde", "azul", "anil", "violeta"));
        System.out.println(coresArcoIris);

        System.out.println("Exiba todas as cores uma abaixo da outra: ");
        for (String cor: coresArcoIris) System.out.println(cor);

        System.out.println("Mostre a quantidade de cores que o arco-iris tem: ");
        System.out.println(coresArcoIris.size());

        System.out.println("Exiba as cores em ordem alfabética: ");
        Set<String> coresArcoIris2 = new TreeSet<>(coresArcoIris);
        System.out.println(coresArcoIris2);

        System.out.println("Exiba todas as cores que começa com a letra 'v': ");
        for (String cor : coresArcoIris) {
            if (cor.startsWith("v")) System.out.println(cor);
        }

        System.out.println("Remova todas as cores que não começam com a letra V: ");
        Iterator<String> iterator2 = coresArcoIris.iterator();
        while (iterator2.hasNext()) {
            if (!iterator2.next().startsWith("v")) iterator2.remove();

        }
        System.out.println(coresArcoIris);

        System.out.println("Limpe o conjunto: ");
        coresArcoIris.clear();

        System.out.println("Confira se o conjunto está vazio: " + coresArcoIris.isEmpty());
    }
}
