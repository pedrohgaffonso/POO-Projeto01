package br.com.ada.model;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public abstract class Filme {
    private String nome;
    private final String dataLancamento;
    private final double orcamento;
    private final String descricao;
    private Diretor diretor;
    private final List<Ator> atores = new ArrayList<>();

    public Filme(String nome, String dataLancamento, double orcamento, String descricao) {
        this.nome = nome;
        this.dataLancamento = dataLancamento;
        this.orcamento = orcamento;
        this.descricao = descricao;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDiretor(Diretor diretor) {
        this.diretor = diretor;
    }

    public void adicionarAtor(Ator ator) {
        this.atores.add(ator);
    }

    @Override
    public String toString() {
        return "Nome: '" + nome + '\'' +
                "\n  Data de Lançamento: " + dataLancamento +
                "\n  Orçamento: " + String.format("R$%,.2f", orcamento) +
                "\n  Descrição: '" + descricao + '\'' +
                "\n  Diretor: " + (diretor != null ? diretor.getNome() : "Não definido") +
                "\n  Atores: " + atores.stream().map(Pessoa::getNome).collect(Collectors.joining(", "));
    }
}