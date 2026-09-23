import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Livro> livros = new ArrayList<>();
        int opcao;

        do {
            System.out.println("\n=== Sistema de Cadastro de Livros ===");
            System.out.println("1 - Cadastrar livro");
            System.out.println("2 - Listar livros");
            System.out.println("3 - Atualizar livro");
            System.out.println("4 - Remover livro");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            try {
                opcao = scanner.nextInt();
                scanner.nextLine();
            } catch (InputMismatchException e) {
                System.out.println("Por favor, digite apenas números.");
                scanner.nextLine();
                opcao = -1;
            }

            switch (opcao) {
                case 1:
                    cadastrarLivro(scanner, livros);
                    break;
                case 2:
                    listarLivros(livros);
                    break;
                case 3:
                    atualizarLivro(scanner, livros);
                    break;
                case 4:
                    removerLivro(scanner, livros);
                    break;
                case 0:
                    System.out.println("Até logo!");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        } while (opcao != 0);

        scanner.close();
    }

    private static void cadastrarLivro(Scanner scanner, ArrayList<Livro> livros) {
        System.out.print("Título: ");
        String titulo = scanner.nextLine();

        System.out.print("Autor: ");
        String autor = scanner.nextLine();

        System.out.print("Ano: ");
        int ano = scanner.nextInt();
        scanner.nextLine();

        Livro livro = new Livro(titulo, autor, ano);
        livros.add(livro);

        System.out.println("Livro cadastrado com sucesso!");
    }

    private static void atualizarLivro(Scanner scanner, ArrayList<Livro> livros) {
        listarLivros(livros);
        if (livros.isEmpty()) {
            return;
        }

        System.out.print("Digite o número do livro que deseja atualizar: ");
        int indice = scanner.nextInt();
        scanner.nextLine();

        if (indice < 1 || indice > livros.size()) {
            System.out.println("Número inválido.");
            return;
        }

        Livro livro = livros.get(indice - 1);

        System.out.print("Novo título (atual: " + livro.getTitulo() + "): ");
        String titulo = scanner.nextLine();

        System.out.print("Novo autor (atual: " + livro.getAutor() + "): ");
        String autor = scanner.nextLine();

        System.out.print("Novo ano (atual: " + livro.getAno() + "): ");
        int ano = scanner.nextInt();
        scanner.nextLine();

        livro.setTitulo(titulo);
        livro.setAutor(autor);
        livro.setAno(ano);

        System.out.println("Livro atualizado com sucesso!");
    }

    private static void removerLivro(Scanner scanner, ArrayList<Livro> livros) {
        listarLivros(livros);
        if (livros.isEmpty()) {
            return;
        }

        System.out.print("Digite o número do livro que deseja remover: ");
        int indice = scanner.nextInt();
        scanner.nextLine();

        if (indice < 1 || indice > livros.size()) {
            System.out.println("Número inválido.");
            return;
        }

        Livro livroRemovido = livros.remove(indice - 1);
        System.out.println("Livro removido: " + livroRemovido.getTitulo());
    }

    private static void listarLivros(ArrayList<Livro> livros) {
        if (livros.isEmpty()) {
            System.out.println("Nenhum livro cadastrado ainda.");
            return;
        }

        System.out.println("\n--- Livros cadastrados ---");
        for (int i = 0; i < livros.size(); i++) {
            System.out.println((i + 1) + ". " + livros.get(i));
        }
    }
}
