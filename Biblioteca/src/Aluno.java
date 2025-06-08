public class Aluno extends Usuario {
    private int periodo;

    public Aluno(String nome, String cpf, String matricula, String email, int periodo) {
        super(nome, cpf, matricula, email);
        this.periodo = periodo;
    }

    public int getPeriodo() {
        return periodo;
    }

    public void setPeriodo(int periodo) {
        this.periodo = periodo;
    }

    @Override
    public String getTipoUsuario() {
        return "ALUNO";
    }
}