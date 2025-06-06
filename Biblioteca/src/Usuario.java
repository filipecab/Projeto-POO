// Classe que representa um usuário da biblioteca
public class Usuario {

    // Atributos privados que armazenam as informações pessoais do usuário
    private String nome;         // Nome completo do usuário
    private String cpf;          // CPF do usuário
    private String matricula;    // Número de matrícula (pode ser RA, ID institucional etc.)
    private String emaill;       // E-mail de contato
    private tipo tipo;           // Tipo de usuário (ALUNO ou PROFESSOR) - usa um enum chamado 'tipo'

    /**
     * Construtor da classe Usuario.
     * Inicializa os atributos com os valores recebidos ao criar um novo objeto.
     * 
     * @param nome      Nome do usuário
     * @param cpf       CPF do usuário
     * @param matricula Número de matrícula
     * @param emaill    E-mail do usuário
     * @param tipo      Tipo de usuário (enum: ALUNO ou PROFESSOR)
     */
    public Usuario(String nome, String cpf, String matricula, String emaill, tipo tipo) {
        this.nome = nome;
        this.cpf = cpf;
        this.matricula = matricula;
        this.emaill = emaill;
        this.tipo = tipo;
    }

    // Métodos GET e SET (acessadores e modificadores)
    // Permitem acessar e modificar os atributos da classe com segurança

    public String getNome() {
        return nome; // Retorna o nome do usuário
    }

    public void setNome(String nome) {
        this.nome = nome; // Altera o nome do usuário
    }

    public String getCpf() {
        return cpf; // Retorna o CPF
    }

    public void setCpf(String cpf) {
        this.cpf = cpf; // Altera o CPF
    }

    public String getMatricula() {
        return matricula; // Retorna a matrícula
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula; // Altera a matrícula
    }

    public String getEmaill() {
        return emaill; // Retorna o e-mail
    }

    public void setEmaill(String emaill) {
        this.emaill = emaill; // Altera o e-mail
    }

    public tipo getTipo() {
        return tipo; // Retorna o tipo do usuário (ALUNO ou PROFESSOR)
    }

    public void setTipo(tipo tipo) {
        this.tipo = tipo; // Altera o tipo de usuário
    }
}
