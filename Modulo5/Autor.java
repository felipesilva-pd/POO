import java.util.ArrayList;
import java.util.List;

public class Autor extends Pessoa {
    private List<Livro> livros;
    private boolean isUsuario;
    private PublicavelInterface estrategiaPublicacao;

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

    public void setEstrategiaPublicacao(PublicavelInterface estrategiaPublicacao) {
        this.estrategiaPublicacao = estrategiaPublicacao;
    }

    public void publicar() {
        if (estrategiaPublicacao != null) {
            estrategiaPublicacao.publicar();
        } else {
            System.out.println("Nenhuma estratégia de publicação definida.");
        }
    }
}

