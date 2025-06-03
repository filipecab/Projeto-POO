import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.time.Year;

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
            sc.nextLine(); // consumir quebra de linha

            System.out.println();

            switch (opcao) {
                case 1:
                    String resposta;
                    do {
                        System.out.print("Digite o título: ");
                        String titulo = sc.nextLine();

                        System.out.print("Digite o nome do autor: ");
                        String autor = sc.nextLine();

                        System.out.print("Digite o ISBN: ");
                        String isbn = sc.nextLine();

                        System.out.print("Digite o ano de lançamento: ");
                        int ano = sc.nextInt();
                        sc.nextLine(); // consumir quebra de linha
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
                    // cadastrar usuário
                    break;

                case 3:
                    // listar livros
                    break;

                case 4:
                    // emprestar livro
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
