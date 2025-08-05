package br.com.ada.model;

public class LongaMetragem extends Filme {
    public LongaMetragem(String nome, String dataLancamento, double orcamento, String descricao) {
        super(nome, dataLancamento, orcamento, descricao);
    }

    @Override
    public String toString() {
        return "Tipo: Longa-Metragem\n" + super.toString();
    }
}