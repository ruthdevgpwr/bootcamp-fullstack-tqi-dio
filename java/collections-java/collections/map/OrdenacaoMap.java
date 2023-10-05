package map;

import java.util.*;

public class OrdenacaoMap {

       /*Dadas as seguintes informações sobre meus livros favoritos e seus autores, crie um dicionário e ordene este
        dicionário:
        exibindo (Nome Autor - Nome Livro)

        Autor = Hawking, Stephen - Livro = nome : Uma Breve História do Tempo. Páginas: 256
        Autor = Duhigg, Charles - Livro = nome : O Poder do Hábito. Páginas: 408
        Autor = Harari, Yuval Noah - Livro = nome : 21 lições para o século 21. Páginas: 432

        */

    public static void main(String[] args) {

        System.out.println("Ordem Aleatória: ");

        Map<String, Livro> meusLivros = new HashMap<>();
        meusLivros.put("Hawking, Stephen", new Livro("Uma Breve História do Tempo", 256));
        meusLivros.put("Duhigg, Charles", new Livro("O Poder do Hábito", 408));
        meusLivros.put("Harari, Yuval Noah", new Livro("21 lições para o século 21", 432));

        System.out.println(meusLivros);

        for(Map.Entry<String, Livro> livro : meusLivros.entrySet()) {
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome());
        }

        System.out.println("Ordem de Inserção: ");

        Map<String, Livro> meusLivrosOrdemInsercao = new LinkedHashMap<>();
        meusLivrosOrdemInsercao.put("Hawking, Stephen", new Livro("Uma Breve História do Tempo", 256));
        meusLivrosOrdemInsercao.put("Duhigg, Charles", new Livro("O Poder do Hábito", 408));
        meusLivrosOrdemInsercao.put("Harari, Yuval Noah", new Livro("21 lições para o século 21", 432));

        System.out.println(meusLivrosOrdemInsercao);

        for (Map.Entry<String, Livro> livro1 : meusLivrosOrdemInsercao.entrySet()) {
            System.out.println(livro1.getKey() + " - " + livro1.getValue().getNome());
        }

        System.out.println("Ordem alfabética dos autores: ");
        Map<String, Livro> meusLivrosOrdemAlfabetica = new TreeMap<>(meusLivrosOrdemInsercao);
        System.out.println(meusLivrosOrdemAlfabetica);

        for (Map.Entry<String, Livro> livro2 : meusLivrosOrdemAlfabetica.entrySet()) {
            System.out.println(livro2.getKey() + " - " + livro2.getValue().getNome());
        }

        System.out.println("Ordem alfabética dos livros: ");

        Set<Map.Entry<String, Livro>> meusLivros3 = new TreeSet<>(new ComparatorNome());
        meusLivros3.addAll(meusLivros.entrySet());
        for (Map.Entry<String, Livro> livro : meusLivros3) {
            System.out.println(livro.getKey() + " - " + livro.getValue().getNome());
        }


    }
}

class Livro {

    private String nome;
    private Integer paginas;

    public Livro(String nome, Integer paginas) {
        this.nome = nome;
        this.paginas = paginas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getPaginas() {
        return paginas;
    }

    public void setPaginas(Integer paginas) {
        this.paginas = paginas;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Livro livro = (Livro) o;
        return nome.equals(livro.nome) && paginas.equals(livro.paginas);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, paginas);
    }

    @Override
    public String toString() {
        return "Livro{" +
                "nome='" + nome + '\'' +
                ", paginas=" + paginas +
                '}';
    }
}

class ComparatorNome implements Comparator<Map.Entry<String, Livro>> {

    @Override
    public int compare(Map.Entry<String, Livro> l1, Map.Entry<String, Livro> l2) {
        return l1.getValue().getNome().compareToIgnoreCase(l2.getValue().getNome());
    }
}
