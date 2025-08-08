package br.com.ada;

import br.com.ada.controller.FilmeController;
import br.com.ada.service.AtorService;
import br.com.ada.service.DiretorService;
import br.com.ada.service.FilmeService;
import br.com.ada.view.FilmeView;

public class Main {
    public static void main(String[] args) {
        // Inicializar os componentes do MVC
        FilmeService filmeService = new FilmeService();
        AtorService atorService = new AtorService();
        DiretorService diretorService = new DiretorService();
        FilmeView filmeView = new FilmeView();

        FilmeController filmeController = new FilmeController(
                filmeService,
                atorService,
                diretorService,
                filmeView
        );

        // Iniciar a aplicação
        filmeController.iniciar();
    }
}