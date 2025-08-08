package br.com.ada.service;

import br.com.ada.model.Diretor;
import java.util.ArrayList;
import java.util.List;

public class DiretorService {
    private final List<Diretor> diretores = new ArrayList<>();

    public void cadastrarDiretor(Diretor diretor) {
        diretores.add(diretor);
    }

    public Diretor obterDiretorPorNome(String nome) {
        for (Diretor diretor : diretores) {
            if (diretor.getNome().equalsIgnoreCase(nome)) {
                return diretor;
            }
        }
        return null;
    }

    public List<Diretor> listarTodos() {
        return new ArrayList<>(diretores);
    }
}
