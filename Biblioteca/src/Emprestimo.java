import java.time.LocalDate;
import java.util.HashSet;
import java.util.Random;

public class Emprestimo {
    private static final HashSet<String> idsUsados = new HashSet<>();
    private static final Random random = new Random();

    private String numeroEmprestimo;
    private Usuario usuario;
    private CadastroLivro livro;
    private LocalDate dataEmprestimo;
    private Status status;

    public Emprestimo( Usuario usuario, CadastroLivro livro, LocalDate dataEmprestimo,
            Status status) {
        this.numeroEmprestimo = gerarIdUnico();
        this.usuario = usuario;
        this.livro = livro;
        this.dataEmprestimo = dataEmprestimo;
        this.status = status;
    }

    private String gerarIdUnico() {
        String id;
        do {
            id = String.format("%06d", random.nextInt(999999)); // 6 dígitos
        } while (idsUsados.contains(id));
        idsUsados.add(id);
        return id;
    }

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
