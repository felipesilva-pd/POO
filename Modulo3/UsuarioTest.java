import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class UsuarioTest {

    @Test
    public void testCriacaoUsuario() {
        Usuario usuario = new Usuario("Maria", 30);
        assertEquals("Maria", usuario.getNome());
        assertEquals(30, usuario.getIdade());
    }

    @Test
    public void testAdicionarEmprestimo() {
        Usuario usuario = new Usuario("João", 22);
        Autor autor = new Autor("Autor X", "Brasileiro");
        Livro livro = new Livro("Livro X", autor, "Ficção", true);
        Emprestimo emprestimo = new Emprestimo(usuario, java.util.List.of(livro), new java.util.Date(), new java.util.Date());
        assertEquals(1, usuario.getEmprestimos().size());
    }
}
