import java.time.Year; // Importa a classe Year para representar o ano de publicação
                       // Usado para armazenar apenas o ano, sem mês ou dia

public class CadastroLivro {
    
    // Atributos privados que representam as informações do livro
    private String titulo;   // Título do livro
    private String autor;    // Nome do autor do livro
    private String isbn;     // Código ISBN que identifica o livro
    private Year ano;        // Ano de lançamento (utiliza a classe Year)
    private String editora;  // Nome da editora responsável pela publicação

    /**
     * Construtor da classe. Inicializa todos os atributos com os valores recebidos.
     * 
     * @param titulo   Título do livro
     * @param autor    Nome do autor
     * @param iSBN     Código ISBN do livro
     * @param ano      Ano de publicação (do tipo Year)
     * @param editora  Nome da editora
     */
    public CadastroLivro(String titulo, String autor, String iSBN, Year ano, String editora) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = iSBN;
        this.ano = ano;
        this.editora = editora;
    }

    // Métodos GET e SET: usados para acessar ou modificar os atributos da classe

    public String getTitulo() {
        return titulo; // Retorna o título do livro
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo; // Define um novo título
    }

    public String getAutor() {
        return autor; // Retorna o nome do autor
    }

    public void setAutor(String autor) {
        this.autor = autor; // Define um novo autor
    }

    public String getIsbn() {
        return isbn; // Retorna o código ISBN
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn; // Define um novo código ISBN
    }

    public Year getAno() {
        return ano; // Retorna o ano de publicação
    }

    public void setAno(Year ano) {
        this.ano = ano; // Define um novo ano de publicação
    }

    public String getEditora() {
        return editora; // Retorna o nome da editora
    }

    public void setEditora(String editora) {
        this.editora = editora; // Define uma nova editora
    }
}
