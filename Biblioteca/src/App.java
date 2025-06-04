import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.time.LocalDate;
import java.time.Year;
import java.time.format.DateTimeFormatter;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        List<CadastroLivro> livro = new ArrayList<>();
        List<Usuario> user = new ArrayList<>();
        List<Emprestimo> emprestar = new ArrayList<>();

        int opcao;

        do {
            System.out.println("Bem-vindo à Biblioteca");
            System.out.println("--- Menu Principal ---");
            System.out.println("Digite 1 - Para Cadastrar novo livro");
            System.out.println("Digite 2 - Para Cadastrar novo Usuário");
            System.out.println("Digite 3 - Para Listar Livros");
            System.out.println("Digite 4 - Para Emprestar Livro");
            System.out.println("Digite 0 - Para Sair");
            System.out.println("----------------------");
            System.out.print("Digite: ");
            opcao = sc.nextInt();
            sc.nextLine(); 

            System.out.println();

            String resposta="";

            switch (opcao) {
                case 1:
                    
                    do {
                        System.out.print("Digite o título: ");
                        String titulo = sc.nextLine();

                        System.out.print("Digite o nome do autor: ");
                        String autor = sc.nextLine();

                        System.out.print("Digite o ISBN: ");
                        String isbn = sc.nextLine();

                        System.out.print("Digite o ano de lançamento: ");
                        int ano = sc.nextInt();
                        sc.nextLine(); 
                        Year data = Year.of(ano);

                        System.out.print("Digite a editora: ");
                        String editora = sc.nextLine();

                        CadastroLivro novoLivro = new CadastroLivro(titulo, autor, isbn, data, editora);
                        livro.add(novoLivro);

                        System.out.println("Livro cadastrado com sucesso!");
                        System.out.print("Deseja cadastrar outro livro? (s/n): ");
                        resposta = sc.nextLine().toLowerCase();

                        System.out.println();
                    } while (resposta.equals("s"));
                    break;

                case 2:
                    
                    do {
                        System.out.print("Digite o nome: ");
                        String nome = sc.nextLine();

                        System.out.print("Digite o cpf: ");
                        String cpf = sc.nextLine();

                        System.out.print("Digite a matricula: ");
                        String matricula = sc.nextLine();

                        System.out.print("Digite o email: ");
                        String emaill = sc.next();
                        sc.nextLine(); 
                       

                        System.out.print("Selecione o tipo: 1 - Aluno, 2 - Professor ");
                        int t=sc.nextInt();
                        tipo tipoUsuario = null;

                        if (t == 1) {
                            tipoUsuario = tipo.ALUNO;
                        } else if (t == 2) {
                            tipoUsuario = tipo.PROFESSOR;
                        } else {
                            System.out.println("Opção inválida. Usuário não cadastrado.");
                            continue; 
                        }
                        Usuario novoUsuario = new Usuario(nome, cpf, matricula, emaill, tipoUsuario);
                        user.add(novoUsuario);

                        System.out.println("Usuario cadastrado com sucesso!");
                        System.out.print("Deseja cadastrar outro Usuario? (s/n): ");
                        resposta = sc.nextLine().toLowerCase();

                        System.out.println();
                    } while (resposta.equals("s"));


                    break;

                case 3:
                    // listar livros
                    break;

                case 4:
                    System.out.println("Qual livor deseja emprestar? ");
                    
                    //listar livros

                    System.out.println("Qual usuario deseja pegar o livro? ");

                    //lista usuarios cadastrados

                    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

                    System.out.println("Qual a data do emprestimo? dd/MM/yyyy");
                    String dataEmprestimo = sc.nextLine();
                    LocalDate data = LocalDate.parse(dataEmprestimo, formatter);

                    //Emprestimo novoEmprestimo = new Emprestimo();
                    //emprestimo.add(novoEmprestimo);
                    break;

                case 0:
                    System.out.println("Encerrando o programa...");
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }

            System.out.println();

        } while (opcao != 0);

        sc.close();
    }
}
