package com.mycompany.trabalho;

public class Time {
    private String nome;
    private String abreviacao;
    private String cidade;
    private String estadio;
    private int pontos;

    public Time(String nome, String abreviacao, String cidade, String estadio, int pontos) {
        this.nome = nome;
        this.abreviacao = abreviacao;
        this.cidade = cidade;
        this.estadio = estadio;
        this.pontos = pontos;
    }

    public int getPontos() {
        return pontos;
    }

    public void setPontos(int pontos) {
        this.pontos = pontos;
    }

    public String getNome() {
        return nome;
    }

    public String getAbreviacao() {
        return abreviacao;
    }

    public String getCidade() {
        return cidade;
    }

    public String getEstadio() {
        return estadio;
    }
}
