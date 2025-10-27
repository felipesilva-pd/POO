import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ArtigoTest {

    @Test
    public void testArtigoCriacao() {
        Autor autor = new Autor("Ana Clara", 40, false);
        Artigo artigo = new Artigo("IA na Educação", autor, "tecnologia", true);

        assertEquals("IA na Educação", artigo.getTitulo());
        assertEquals("Ana Clara", artigo.getAutor().getNome());
        assertEquals("tecnologia", artigo.getGenero());
        assertTrue(artigo.isPublicado());
    }
}