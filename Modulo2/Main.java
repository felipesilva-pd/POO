import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Autor autor = new Autor("Jessica Felix", 35);
        Livro livro = new Livro("Java for Beginners", "Tecnologia", autor);

        Usuario usuario = new Usuario("Lucas Rafael", 25);

        List<Livro> livrosEmprestados = new ArrayList<>();
        livrosEmprestados.add(livro);

        Date dataRetirada = new Date();  // hoje
        Date dataDevolucao = new Date(); // mesma data como exemplo

        Emprestimo emprestimo1 = new Emprestimo(usuario, livrosEmprestados, dataRetirada, dataDevolucao);

        // Tentativa de emprestar novamente (não deve estar disponível)
        Emprestimo emprestimo2 = new Emprestimo(usuario, livrosEmprestados, dataRetirada, dataDevolucao);

        System.out.println("\nLivro: " + livro.getTitulo());
        System.out.println("Autor: " + livro.getAutor().getNome());
        System.out.println("Genero: " + livro.getGenero());
        System.out.println("Usuario: " + usuario.getNome());
        System.out.println("Idade: " + usuario.getIdade());
        System.out.println("Data de Retirada: " + emprestimo1.getDataRetirada());
        System.out.println("Data de Devolucao: " + emprestimo1.getDataDevolucao());
    }
}
