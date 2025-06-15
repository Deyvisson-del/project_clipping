package com.clipping.clipping.controller;

import com.clipping.clipping.model.ClippingModel;
import com.clipping.clipping.service.ClippingService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class ClippingController {

    private final ClippingService clippingService;

    public ClippingController(ClippingService clippingService) {
        this.clippingService = clippingService;
    }

    @GetMapping("/")
    public String paginaInicial() {
        return "index";
    }

    @GetMapping("/buscar")
    public String buscarNoticias(@RequestParam String palavraBusca, Model model) {
        List<ClippingModel> resultados = clippingService.buscarESalvarNoticias(palavraBusca);
        model.addAttribute("noticias", resultados);
        model.addAttribute("palavraBusca", palavraBusca);
        return "resultados";
    }
}