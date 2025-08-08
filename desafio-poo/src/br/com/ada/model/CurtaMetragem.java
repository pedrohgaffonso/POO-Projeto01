package br.com.ada.model;

public class CurtaMetragem extends Filme {
    public CurtaMetragem(String nome, String dataLancamento, double orcamento, String descricao) {
        super(nome, dataLancamento, orcamento, descricao);
    }

    @Override
    public String toString() {
        return "Tipo: Curta-Metragem\n" + super.toString();
    }
}