import java.time.LocalDate;

public class Emprestimo {
    private String numeroEmprestimo;
    private Usuario usuario;
    private CadastroLivro livro;
    private LocalDate dataEmprestimo;
    private Status status;

    public Emprestimo(String numeroEmprestimo, Usuario usuario, CadastroLivro livro, LocalDate dataEmprestimo,
            Status status) {
        this.numeroEmprestimo = numeroEmprestimo;
        this.usuario = usuario;
        this.livro = livro;
        this.dataEmprestimo = dataEmprestimo;
        this.status = status;
    }

    public String getNumeroEmprestimo() {
        return numeroEmprestimo;
    }

    public void setNumeroEmprestimo(String numeroEmprestimo) {
        this.numeroEmprestimo = numeroEmprestimo;
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
