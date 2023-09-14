package aula_classe.exercicios;

public class Main {
    public static void main(String[] args) {
        Carro carro1 = new Carro("Azul", "Mercedes Benz Classe C", 60);
        System.out.println(carro1.cor);
        System.out.println(carro1.modelo);
        System.out.println(carro1.capacidadeTanque);
        System.out.println(carro1.totalValorTanque(5));
    }
}
