import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.time.LocalDate;
import java.time.Year;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Lista para armazenar livros cadastrados
        List<CadastroLivro> livro = new ArrayList<>();

        // Lista para armazenar usuários cadastrados
        List<Usuario> user = new ArrayList<>();

        // Lista de empréstimos feitos
        List<Emprestimo> emprestar = new ArrayList<>();

        int opcao;

        // Menu principal em loop até opção 0 (sair)
        do {
            System.out.println("Bem-vindo à Biblioteca");
            System.out.println("--- Menu Principal ---");
            System.out.println("Digite 1 - Para Cadastrar novo livro");
            System.out.println("Digite 2 - Para Cadastrar novo Usuário");
            System.out.println("Digite 3 - Para Listar Livros");
            System.out.println("Digite 4 - Para Emprestar Livro");
            System.out.println("Digite 0 - Para Sair");
            System.out.print("Digite: ");

            // Lê a opção e consome o \n
            opcao = sc.nextInt();
            sc.nextLine(); 
            System.out.println();

            String resposta = "";

            switch (opcao) {
                case 1:
                    // Cadastrar livros
                    do {
                        try {
                            System.out.print("Digite o título: ");
                            String titulo = sc.nextLine();

                            System.out.print("Digite o nome do autor: ");
                            String autor = sc.nextLine();

                            System.out.print("Digite o ISBN: ");
                            String isbn = sc.nextLine();

                            System.out.print("Digite o ano de lançamento: ");
                            int ano = sc.nextInt();
                            sc.nextLine(); 
                            Year data = Year.of(ano); // Usa Year para armazenar ano

                            System.out.print("Digite a editora: ");
                            String editora = sc.nextLine();

                            CadastroLivro novoLivro = new CadastroLivro(titulo, autor, isbn, data, editora);
                            livro.add(novoLivro);

                            System.out.println("Livro cadastrado com sucesso!");
                        } catch (Exception e) {
                            System.out.println("Erro ao cadastrar livro: " + e.getMessage());
                        }

                        System.out.print("Deseja cadastrar outro livro? (s/n): ");
                        resposta = sc.nextLine().toLowerCase();
                        System.out.println();
                    } while (resposta.equals("s"));
                    break;

                case 2:
                    // Cadastrar usuários
                    do {
                        try {
                            System.out.print("Digite o nome: ");
                            String nome = sc.nextLine();

                            System.out.print("Digite o cpf: ");
                            String cpf = sc.nextLine();

                            System.out.print("Digite a matrícula: ");
                            String matricula = sc.nextLine();

                            System.out.print("Digite o email: ");
                            String email = sc.next();
                            sc.nextLine(); 

                            System.out.print("Selecione o tipo: 1 - Aluno, 2 - Professor: ");
                            int t = sc.nextInt();
                            sc.nextLine();
                            tipo tipoUsuario = null;

                            if (t == 1) {
                                tipoUsuario = tipo.ALUNO;
                            } else if (t == 2) {
                                tipoUsuario = tipo.PROFESSOR;
                            } else {
                                System.out.println("Opção inválida. Usuário não cadastrado.");
                                continue; // Volta para o início do loop
                            }

                            Usuario novoUsuario = new Usuario(nome, cpf, matricula, email, tipoUsuario);
                            user.add(novoUsuario);

                            System.out.println("Usuário cadastrado com sucesso!");
                        } catch (Exception e) {
                            System.out.println("Erro ao cadastrar usuário: " + e.getMessage());
                        }

                        System.out.print("Deseja cadastrar outro usuário? (s/n): ");
                        resposta = sc.nextLine().toLowerCase();
                        System.out.println();
                    } while (resposta.equals("s"));
                    break;

                case 3:
                    // Listar livros cadastrados
                    if (livro.isEmpty()) {
                        System.out.println("Nenhum livro cadastrado ainda.");
                        break;
                    }

                    // Percorre todos os livros e exibe as informações
                    for (CadastroLivro liv : livro) {
                        System.out.println("Título: " + liv.getTitulo());
                        System.out.println("Autor: " + liv.getAutor());
                        System.out.println("ISBN: " + liv.getIsbn());
                        System.out.println("Ano de Lançamento: " + liv.getAno());
                        System.out.println("Editora: " + liv.getEditora());
                        System.out.println("----------------------------------------");
                    }
                    break;

                case 4:
                    // Emprestar livro

                    if (livro.isEmpty()) {
                        System.out.println("Nenhum livro cadastrado ainda.");
                        break;
                    }

                    CadastroLivro livroEscolhido = null;

                    // Enquanto o usuário não escolher um livro válido
                    while (livroEscolhido == null) {
                        System.out.println("Livros disponíveis para empréstimo:");

                        List<CadastroLivro> livrosDisponiveis = new ArrayList<>();

                        // Filtra livros que não estão emprestados
                        for (CadastroLivro liv : livro) {
                            boolean estaEmprestado = false;

                            for (Emprestimo emp : emprestar) {
                                // Se o título do livro for igual e o status for INDISPONIVEL, está emprestado
                                if (liv.getTitulo().equalsIgnoreCase(emp.getLivro().getTitulo()) &&
                                    emp.getStatus() == Status.INDISPONIVEL) {
                                    estaEmprestado = true;
                                    break;
                                }
                            }

                            // Se o livro está disponível, adiciona à lista e mostra
                            if (!estaEmprestado) {
                                livrosDisponiveis.add(liv);
                                System.out.println("- " + liv.getTitulo());
                            }
                        }

                        if (livrosDisponiveis.isEmpty()) {
                            System.out.println("Todos os livros estão emprestados no momento.");
                            break;
                        }

                        System.out.println("----------------------------------------");
                        System.out.print("Escolha o título conforme a lista acima: ");
                        String titulo = sc.nextLine();

                        // Verifica se o título digitado está na lista de disponíveis
                        for (CadastroLivro liv : livrosDisponiveis) {
                            if (liv.getTitulo().equalsIgnoreCase(titulo)) {
                                livroEscolhido = liv;
                                break;
                            }
                        }

                        if (livroEscolhido == null) {
                            System.out.println("Livro não encontrado. Tente novamente.\n");
                        }
                    }

                    // Se ainda for null, significa que não tem livro disponível
                    if (livroEscolhido == null) break;

                    if (user.isEmpty()) {
                        System.out.println("Nenhum usuário cadastrado ainda.");
                        break;
                    }

                    // Mostra usuários para escolha
                    System.out.println("Qual usuário deseja pegar o livro?");
                    for (Usuario u : user) {
                        System.out.println("- " + u.getNome());
                    }

                    System.out.println("----------------------------------------");
                    System.out.print("Escolha o nome conforme a lista acima: ");
                    String nome = sc.nextLine();

                    Usuario usuarioEscolhido = null;

                    // Verifica se o nome digitado existe na lista de usuários
                    for (Usuario u : user) {
                        if (u.getNome().equalsIgnoreCase(nome)) {
                            usuarioEscolhido = u;
                            break;
                        }
                    }

                    if (usuarioEscolhido == null) {
                        System.out.println("Usuário não encontrado. Tente novamente.");
                        break;
                    }

                    System.out.println("----------------------------------------");

                    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

                    try {
                        System.out.println("Qual a data do empréstimo? (dd/MM/yyyy)");
                        String dataEmprestimo = sc.nextLine();

                        // Converte a data de String para LocalDate
                        LocalDate data = LocalDate.parse(dataEmprestimo, formatter);

                        // Cria novo empréstimo com status INDISPONÍVEL
                        Emprestimo novoEmprestimo = new Emprestimo(usuarioEscolhido, livroEscolhido, data, Status.INDISPONIVEL);
                        emprestar.add(novoEmprestimo);

                        System.out.println("Empréstimo realizado com sucesso!");
                        System.out.println("Número do Empréstimo: " + novoEmprestimo.getNumeroEmprestimo());

                    } catch (DateTimeParseException e) {
                        System.out.println("Formato de data inválido. Use dd/MM/yyyy.");
                    }

                    break;

                case 0:
                    // Encerra o programa
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
