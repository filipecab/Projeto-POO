import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);

        
        List<CadastroLivro> livro= new ArrayList<>();
        List<Usuario> user= new ArrayList<>();
        List<Emprestimo> emprestar= new ArrayList<>();

        System.out.println("Bem-vindo a Biblioteca");
        System.out.println("---Menu Principal---");
        System.out.println("Digite 1 - Para Cadastrar novo livro");
        System.out.println("Digite 2 - Para Cadastrar novo Usuario");
        System.out.println("Digite 3 - Para Listar Livros");
        System.out.println("Digite 4 - Para emprestar Livro");
        System.out.println("-------------------------------");
        System.out.print("Digite: ");
        int opcao=sc.nextInt();

        switch (opcao) {
            case 1:
                //chamar funcao cadastrar livro
                break;
            case 2:
                //chamar funcao cadastrar Usuario
                break;
            case 3:
                //chamar funcao Listar Livro
                break;
            case 4:
                //chamar funcao emprestar livro
                break;
        
            default:
                break;
        }
        

    }
}
