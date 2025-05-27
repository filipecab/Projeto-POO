import java.time.LocalDate;

public class CadastroLivro {
    
    private String titulo;
    private String autor;
    private String isbn;
    private LocalDate ano;
    private String editora;

    public CadastroLivro(String titulo, String autor, String iSBN, LocalDate ano, String editora) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = iSBN;
        this.ano = ano;
        this.editora = editora;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public LocalDate getAno() {
        return ano;
    }

    public void setAno(LocalDate ano) {
        this.ano = ano;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    

    

}
