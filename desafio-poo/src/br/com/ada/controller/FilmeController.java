package br.com.ada.controller;

import br.com.ada.model.*;
import br.com.ada.service.AtorService;
import br.com.ada.service.DiretorService;
import br.com.ada.service.FilmeService;
import br.com.ada.view.FilmeView;

import java.util.List;

public class FilmeController {
    private final FilmeService filmeService;
    private final AtorService atorService;
    private final DiretorService diretorService;
    private final FilmeView filmeView;

    public FilmeController(FilmeService filmeService, AtorService atorService, DiretorService diretorService, FilmeView filmeView) {
        this.filmeService = filmeService;
        this.atorService = atorService;
        this.diretorService = diretorService;
        this.filmeView = filmeView;
    }

    public void iniciar() {
        while (true) {
            int opcao = filmeView.menuInicial();
            switch (opcao) {
                case 1:
                    cadastrarFilme();
                    break;
                case 2:
                    cadastrarAtor();
                    break;
                case 3:
                    cadastrarDiretor();
                    break;
                case 4:
                    pesquisarFilme();
                    break;
                case 5:
                    filmeView.exibirMensagem("Saindo do sistema...");
                    filmeView.fechar();
                    return;
                default:
                    filmeView.exibirMensagem("Opção inválida. Tente novamente.");
            }
        }
    }

    private void cadastrarFilme() {
        filmeView.exibirMensagem("\n--- Cadastro de Filme ---");

        int tipoFilme = filmeView.menuTipoFilme();
        String[] dadosFilme = filmeView.obterDadosFilme();
        double orcamento;
        try {
            orcamento = Double.parseDouble(dadosFilme[2]);
        } catch (NumberFormatException e) {
            filmeView.exibirMensagem("Orçamento inválido. Use ponto como separador decimal.");
            return;
        }

        Filme filme;
        switch (tipoFilme) {
            case 1:
                filme = new LongaMetragem(dadosFilme[0], dadosFilme[1], orcamento, dadosFilme[3]);
                break;
            case 2:
                filme = new CurtaMetragem(dadosFilme[0], dadosFilme[1], orcamento, dadosFilme[3]);
                break;
            case 3:
                filme = new Documentario(dadosFilme[0], dadosFilme[1], orcamento, dadosFilme[3]);
                break;
            default:
                filmeView.exibirMensagem("Tipo de filme inválido.");
                return;
        }

        // Associar Diretor
        String nomeDiretor = filmeView.obterNomeParaPesquisa("diretor");
        Diretor diretor = diretorService.obterDiretorPorNome(nomeDiretor);
        if (diretor != null) {
            filme.setDiretor(diretor);
        } else {
            filmeView.exibirMensagem("Diretor não encontrado. Cadastre o diretor primeiro.");
        }

        // Associar Atores
        while (true) {
            String nomeAtor = filmeView.obterNomeAtor();
            if (nomeAtor.equalsIgnoreCase("fim")) {
                break;
            }
            Ator ator = atorService.obterAtorPorNome(nomeAtor);
            if (ator != null) {
                filme.adicionarAtor(ator);
                filmeView.exibirMensagem("Ator '" + ator.getNome() + "' adicionado.");
            } else {
                filmeView.exibirMensagem("Ator não encontrado. Cadastre o ator primeiro.");
            }
        }

        filmeService.cadastrarFilme(filme);
        filmeView.exibirMensagem("Filme cadastrado com sucesso!");
    }

    private void cadastrarAtor() {
        filmeView.exibirMensagem("\n--- Cadastro de Ator ---");
        String[] dados = filmeView.obterDadosPessoa();
        Ator ator = new Ator(dados[0]);
        atorService.cadastrarAtor(ator);
        filmeView.exibirMensagem("Ator cadastrado com sucesso!");
    }

    private void cadastrarDiretor() {
        filmeView.exibirMensagem("\n--- Cadastro de Diretor ---");
        String[] dados = filmeView.obterDadosPessoa();
        Diretor diretor = new Diretor(dados[0]);
        diretorService.cadastrarDiretor(diretor);
        filmeView.exibirMensagem("Diretor cadastrado com sucesso!");
    }

    private void pesquisarFilme() {
        filmeView.exibirMensagem("\n--- Pesquisa de Filme ---");
        String nome = filmeView.obterNomeParaPesquisa("filme");
        List<Filme> filmesEncontrados = filmeService.pesquisarFilmePorNome(nome);
        filmeView.exibirFilmes(filmesEncontrados);
    }
}