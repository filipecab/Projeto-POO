public class Aluno extends Usuario {
    private String periodo;

    public Aluno(String nome, String cpf, String matricula, String email, String periodo) {
        super(nome, cpf, matricula, email);
        this.periodo = periodo;
    }

    public String getPeriodo() {
        return periodo;
    }

    @Override
    public String getTipoUsuario() {
        return "Aluno";
    }
}
