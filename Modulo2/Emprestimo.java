import java.util.Date;
import java.util.List;

public class Emprestimo {
    private Usuario usuario;
    private List<Livro> livros;
    private Date dataRetirada;
    private Date dataDevolucao;

    public Emprestimo(Usuario usuario, List<Livro> livros, Date dataRetirada, Date dataDevolucao) {
        this.usuario = usuario;
        this.livros = livros;
        this.dataRetirada = dataRetirada;
        this.dataDevolucao = dataDevolucao;

        for (Livro livro : livros) {
            if (livro.isDisponivel()) {
                livro.setDisponivel(false);
            } else {
                System.out.println("O livro não está disponível");
            }
        }

        usuario.adicionarEmprestimo(this);
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public List<Livro> getLivros() {
        return livros;
    }

    public Date getDataRetirada() {
        return dataRetirada;
    }

    public Date getDataDevolucao() {
        return dataDevolucao;
    }
}
