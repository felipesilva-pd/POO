public class EstrategiaPublicacaoArtigo implements PublicavelInterface {
    private Artigo artigo;

    public EstrategiaPublicacaoArtigo(Artigo artigo) {
        this.artigo = artigo;
    }

    @Override
    public void publicar() {
        System.out.println("Publicando artigo: " + artigo.getTitulo() + " do autor " + artigo.getAutor().getNome());
    }
}