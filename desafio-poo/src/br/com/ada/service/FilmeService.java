package br.com.ada.service;

import br.com.ada.model.Filme;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FilmeService {
    private final List<Filme> filmes = new ArrayList<>();

    public void cadastrarFilme(Filme filme) {
        filmes.add(filme);
    }

    public List<Filme> pesquisarFilmePorNome(String nome) {
        return filmes.stream()
                .filter(filme -> filme.getNome().toLowerCase().contains(nome.toLowerCase()))
                .collect(Collectors.toList());
    }

    public List<Filme> listarTodos() {
        return new ArrayList<>(filmes);
    }
}
