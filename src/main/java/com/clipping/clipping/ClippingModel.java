package com.clipping.clipping;

import jakarta.persistence.Entity;

@Entity
public class ClippingModel {

    private String pesquisaNoticia;
    private int resultadosTotais;
    private String fonteNoticia;
    private String tituloNoticia;
    private String dataNoticia;
    private String url;
    private String resumoCurto;
    private String autorNoticia;
    private String citacaoNoticia;


    public ClippingModel() {
    }

    public ClippingModel(String citacaoNoticia, String autorNoticia, String resumoCurto, String url, String dataNoticia, String tituloNoticia, String fonteNoticia, String pesquisaNoticia, int resultadosTotais) {
        this.citacaoNoticia = citacaoNoticia;
        this.autorNoticia = autorNoticia;
        this.resumoCurto = resumoCurto;
        this.url = url;
        this.dataNoticia = dataNoticia;
        this.tituloNoticia = tituloNoticia;
        this.fonteNoticia = fonteNoticia;
        this.pesquisaNoticia = pesquisaNoticia;
        this.resultadosTotais = resultadosTotais;
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

    public String getCitacaoNoticia() {
        return citacaoNoticia;
    }

    public void setCitacaoNoticia(String citacaoNoticia) {
        this.citacaoNoticia = citacaoNoticia;
    }

}
