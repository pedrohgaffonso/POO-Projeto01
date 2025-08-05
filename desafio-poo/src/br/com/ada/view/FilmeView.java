package br.com.ada.view;

import br.com.ada.model.Filme;

import java.util.List;
import java.util.Scanner;

public class FilmeView {
    private final Scanner scanner;

    public FilmeView() {
        this.scanner = new Scanner(System.in);
    }

    public int menuInicial() {
        System.out.println("\n### Catálogo de Filmes ###");
        System.out.println("1. Cadastrar Filme");
        System.out.println("2. Cadastrar Ator");
        System.out.println("3. Cadastrar Diretor");
        System.out.println("4. Pesquisar Filme por Nome");
        System.out.println("5. Sair");
        System.out.print("Escolha uma opção: ");
        int opcao = scanner.nextInt();
        scanner.nextLine(); // Consumir nova linha
        return opcao;
    }

    public int menuTipoFilme() {
        System.out.println("\n--- Qual o tipo do filme? ---");
        System.out.println("1. Longa-Metragem");
        System.out.println("2. Curta-Metragem");
        System.out.println("3. Documentário");
        System.out.print("Escolha uma opção: ");
        int opcao = scanner.nextInt();
        scanner.nextLine(); // Consumir nova linha
        return opcao;
    }

    public String[] obterDadosFilme() {
        System.out.print("Nome do Filme: ");
        String nome = scanner.nextLine();
        System.out.print("Data de Lançamento: ");
        String data = scanner.nextLine();
        System.out.print("Orçamento (ex: 1000000.00): ");
        String orcamento = scanner.nextLine();
        System.out.print("Descrição: ");
        String descricao = scanner.nextLine();
        return new String[]{nome, data, orcamento, descricao};
    }

    public String[] obterDadosPessoa() {
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("Data de Nascimento: ");
        String data = scanner.nextLine();
        System.out.print("Nacionalidade: ");
        String nacionalidade = scanner.nextLine();
        return new String[]{nome, data, nacionalidade};
    }

    public String obterNomeParaPesquisa(String tipo) {
        System.out.print("Digite o nome do " + tipo + " que deseja pesquisar: ");
        return scanner.nextLine();
    }

    public String obterNomeAtor() {
        System.out.print("Digite o nome do ator (ou 'fim' para parar): ");
        return scanner.nextLine();
    }

    public void exibirFilmes(List<Filme> filmes) {
        if (filmes.isEmpty()) {
            System.out.println("Nenhum filme encontrado.");
        } else {
            System.out.println("\n--- Filmes Encontrados ---");
            filmes.forEach(filme -> {
                System.out.println(filme);
                System.out.println("--------------------------");
            });
        }
    }

    public void exibirMensagem(String mensagem) {
        System.out.println(mensagem);
    }

    public void fechar() {
        scanner.close();
    }
}