package com.clipping.clipping.model;

import jakarta.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "tb_clipping")
public class ClippingModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "title_noticia", nullable = false, length = 500)
    private String titleNoticia;

    @Column(name = "autor_noticia", length = 100)
    private String autorNoticia;

    @Column(name = "url", nullable = false, columnDefinition = "TEXT")
    private String url;

    @Column(name = "fonte_noticia", length = 100)
    private String fonteNoticia;

    @Column(name = "data_publicacao")
    private LocalDateTime dataPublicacao;

    @Column(name = "data_busca", nullable = false)
    private LocalDateTime dataBusca = LocalDateTime.now();

    @Column(name = "palavra_busca", nullable = false, length = 100)
    private String palavraBusca;

    // Construtor padrão
    public ClippingModel() {
    }

    // Construtor com parâmetros
    public ClippingModel(String titleNoticia, String autorNoticia, String url,
                         String fonteNoticia, LocalDateTime dataPublicacao,
                         String palavraBusca) {
        this.titleNoticia = titleNoticia;
        this.autorNoticia = autorNoticia;
        this.url = url;
        this.fonteNoticia = fonteNoticia;
        this.dataPublicacao = dataPublicacao;
        this.palavraBusca = palavraBusca;
    }

    // Getters e Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitleNoticia() {
        return titleNoticia;
    }

    public void setTitleNoticia(String titleNoticia) {
        this.titleNoticia = titleNoticia;
    }

    public String getAutorNoticia() {
        return autorNoticia;
    }

    public void setAutorNoticia(String autorNoticia) {
        this.autorNoticia = autorNoticia;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getFonteNoticia() {
        return fonteNoticia;
    }

    public void setFonteNoticia(String fonteNoticia) {
        this.fonteNoticia = fonteNoticia;
    }

    public LocalDateTime getDataPublicacao() {
        return dataPublicacao;
    }

    public void setDataPublicacao(LocalDateTime dataPublicacao) {
        this.dataPublicacao = dataPublicacao;
    }

    public LocalDateTime getDataBusca() {
        return dataBusca;
    }

    public void setDataBusca(LocalDateTime dataBusca) {
        this.dataBusca = dataBusca;
    }

    public String getPalavraBusca() {
        return palavraBusca;
    }

    public void setPalavraBusca(String palavraBusca) {
        this.palavraBusca = palavraBusca;
    }
}