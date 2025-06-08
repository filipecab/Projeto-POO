public class Professor extends Usuario {
    private String departamento;

    public Professor(String nome, String cpf, String matricula, String email, String departamento) {
        super(nome, cpf, matricula, email);
        this.departamento = departamento;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    @Override
    public String getTipoUsuario() {
        return "PROFESSOR";
    }
}