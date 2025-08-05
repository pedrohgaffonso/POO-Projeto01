package br.com.ada.model;

public class Documentario extends Filme {
    public Documentario(String nome, String dataLancamento, double orcamento, String descricao) {
        super(nome, dataLancamento, orcamento, descricao);
    }

    @Override
    public String toString() {
        return "Tipo: Documentário\n" + super.toString();
    }
}