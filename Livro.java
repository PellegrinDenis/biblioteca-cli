public class Livro {
    private String titulo;
    private String autor;
    private int ano;
    private boolean lido;

    public Livro(String titulo, String autor, int ano) {
        this.titulo = titulo;
        this.autor = autor;
        this.ano = ano;
        this.lido = false;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getAno() {
        return ano;
    }

    public boolean isLido() {
        return lido;
    }

    public void marcarComoLido() {
        this.lido = true;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    @Override
    public String toString() {
        String status = lido ? "Lido" : "Não lido";
        return titulo + " - " + autor + " (" + ano + ") [" + status + "]";
    }
}
