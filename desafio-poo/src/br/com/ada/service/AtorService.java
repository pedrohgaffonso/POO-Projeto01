package br.com.ada.service;

import br.com.ada.model.Ator;
import java.util.ArrayList;
import java.util.List;

public class AtorService {
    private final List<Ator> atores = new ArrayList<>();

    public void cadastrarAtor(Ator ator) {
        atores.add(ator);
    }

    public Ator obterAtorPorNome(String nome) {
        for (Ator ator : atores) {
            if (ator.getNome().equalsIgnoreCase(nome)) {
                return ator;
            }
        }
        return null;
    }

    public List<Ator> listarTodos() {
        return new ArrayList<>(atores);
    }
}
