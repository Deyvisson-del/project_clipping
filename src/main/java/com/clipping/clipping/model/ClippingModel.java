package com.clipping.clipping;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping
public class ClippingModel {



    private Long id;
    private String pesquisaNoticia;
    private int resultadosTotais;
    private String fonteNoticia;
    private String tituloNoticia;
    private String dataNoticia;
    private String url;
    private String resumoCurto;
    private String autorNoticia;


    public ClippingModel() {
    }

    public ClippingModel(Long id,  String autorNoticia, String resumoCurto, String url, String dataNoticia, String tituloNoticia, String fonteNoticia, String pesquisaNoticia, int resultadosTotais) {
        this.id = id;
        this.fonteNoticia = fonteNoticia;
        this.url = url;
        this.autorNoticia = autorNoticia;
        this.dataNoticia = dataNoticia;
        this.resumoCurto = resumoCurto;
        this.tituloNoticia = tituloNoticia;
        this.pesquisaNoticia = pesquisaNoticia;
        this.resultadosTotais = resultadosTotais;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getResultadosTotais() {
        return resultadosTotais;
    }

    public void setResultadosTotais(int resultadosTotais) {
        this.resultadosTotais = resultadosTotais;
    }

    public String getPesquisaNoticia() {
        return pesquisaNoticia;
    }

    public void setPesquisaNoticia(String pesquisaNoticia) {
        this.pesquisaNoticia = pesquisaNoticia;
    }

    public String getFonteNoticia() {
        return fonteNoticia;
    }

    public void setFonteNoticia(String fonteNoticia) {
        this.fonteNoticia = fonteNoticia;
    }

    public String getTituloNoticia() {
        return tituloNoticia;
    }

    public void setTituloNoticia(String tituloNoticia) {
        this.tituloNoticia = tituloNoticia;
    }

    public String getDataNoticia() {
        return dataNoticia;
    }

    public void setDataNoticia(String dataNoticia) {
        this.dataNoticia = dataNoticia;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getResumoCurto() {
        return resumoCurto;
    }

    public void setResumoCurto(String resumoCurto) {
        this.resumoCurto = resumoCurto;
    }

    public String getAutorNoticia() {
        return autorNoticia;
    }

    public void setAutorNoticia(String autorNoticia) {
        this.autorNoticia = autorNoticia;
    }


}
