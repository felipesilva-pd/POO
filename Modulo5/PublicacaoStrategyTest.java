import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PublicacaoStrategyTest {

    @Test
    public void testPublicacaoLivro() {
        Autor autor = new Autor("João", 40, true);
        Livro livro = new Livro("Estratégia em Java", "Tecnologia", autor);
        EstrategiaPublicacaoLivro estrategiaLivro = new EstrategiaPublicacaoLivro(livro);

        autor.setEstrategiaPublicacao(estrategiaLivro);
        autor.publicar(); // Deve imprimir a publicação do livro
    }

    @Test
    public void testPublicacaoArtigo() {
        Autor autor = new Autor("Maria", 38, false);
        Artigo artigo = new Artigo("Design Patterns", autor, "Tecnologia", true);
        EstrategiaPublicacaoArtigo estrategiaArtigo = new EstrategiaPublicacaoArtigo(artigo);

        autor.setEstrategiaPublicacao(estrategiaArtigo);
        autor.publicar(); // Deve imprimir a publicação do artigo
    }
}