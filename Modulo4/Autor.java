import java.util.ArrayList;
import java.util.List;

public class Autor extends Pessoa {
    private List<Livro> livros;
    private boolean isUsuario;

    public Autor(String nome, int idade, boolean isUsuario) {
        super(nome, idade);
        this.livros = new ArrayList<>();
        this.isUsuario = isUsuario;
    }

    public void adicionarLivro(Livro livro) {
        livros.add(livro);
    }

    public List<Livro> getLivros() {
        return livros;
    }

    public boolean isUsuario() {
        return isUsuario;
    }
}
