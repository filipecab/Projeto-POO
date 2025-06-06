import java.time.LocalDate; // Representa datas sem horário
import java.util.HashSet;   // Conjunto que não permite elementos repetidos
import java.util.Random;    // Gerador de números aleatórios

public class Emprestimo {
    
    // Armazena os IDs de empréstimos já utilizados para garantir que não se repitam
    private static final HashSet<String> idsUsados = new HashSet<>();

    // Gerador de números aleatórios para criação dos IDs
    private static final Random random = new Random();

    // Atributos de cada empréstimo
    private String numeroEmprestimo;          // Número único do empréstimo
    private Usuario usuario;                  // Quem fez o empréstimo
    private CadastroLivro livro;              // Qual livro foi emprestado
    private LocalDate dataEmprestimo;         // Data em que o livro foi emprestado
    private Status status;                    // Status do empréstimo (ex: DISPONIVEL ou INDISPONIVEL)

    /**
     * Construtor que inicializa um empréstimo.
     * Gera automaticamente um número único de empréstimo.
     */
    public Emprestimo(Usuario usuario, CadastroLivro livro, LocalDate dataEmprestimo, Status status) {
        this.numeroEmprestimo = gerarIdUnico();     // Gera número do empréstimo automaticamente
        this.usuario = usuario;                     // Define o usuário
        this.livro = livro;                         // Define o livro
        this.dataEmprestimo = dataEmprestimo;       // Define a data do empréstimo
        this.status = status;                       // Define o status do empréstimo
    }

    /**
     * Método privado que gera um ID numérico de 6 dígitos.
     * Garante que o ID não seja repetido usando o HashSet idsUsados.
     */
    private String gerarIdUnico() {
        String id;
        do {
            id = String.format("%06d", random.nextInt(999999)); // Gera um número de 6 dígitos, com zeros à esquerda se necessário
        } while (idsUsados.contains(id)); // Garante que o ID não esteja já em uso
        idsUsados.add(id);                // Armazena o novo ID como utilizado
        return id;
    }

    // Getters e Setters

    public String getNumeroEmprestimo() {
        return numeroEmprestimo;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public CadastroLivro getLivro() {
        return livro;
    }

    public void setLivro(CadastroLivro livro) {
        this.livro = livro;
    }

    public LocalDate getDataEmprestimo() {
        return dataEmprestimo;
    }

    public void setDataEmprestimo(LocalDate dataEmprestimo) {
        this.dataEmprestimo = dataEmprestimo;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
