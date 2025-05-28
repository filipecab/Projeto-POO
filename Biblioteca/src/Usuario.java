
public class Usuario {
 
    private String nome;
    private String cpf;
    private String matricula;
    private String emaill;
    private tipo tipo;

    public Usuario(String nome, String cpf, String matricula, String emaill, tipo tipo) {
        this.nome = nome;
        this.cpf = cpf;
        this.matricula = matricula;
        this.emaill = emaill;
        this.tipo = tipo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome; 
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getEmaill() {
        return emaill;
    }

    public void setEmaill(String emaill) {
        this.emaill = emaill;
    }

    public tipo getTipo() {
        return tipo;
    }

    public void setTipo(tipo tipo) {
        this.tipo = tipo;
    }

 


}
