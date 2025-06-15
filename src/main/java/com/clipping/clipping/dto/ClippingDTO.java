package com.clipping.clipping.dto;

import java.time.LocalDateTime;

public class ClippingDTO {
    private String tituloNoticia;
    private String autorNoticia;
    private String url;
    private String fonteNoticia;
    private LocalDateTime dataPublicacao;
    private LocalDateTime dataBusca = LocalDateTime.now();
    private String palavraBusca;
}
