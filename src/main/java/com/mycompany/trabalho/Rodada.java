package com.mycompany.trabalho;

public class Rodada {
    private Time timeCasa;
    private Time timeFora;
    private int golsCasa;
    private int golsFora;
    private int numeroRodada;

    public Rodada(Time timeCasa, Time timeFora, int golsCasa, int golsFora, int numeroRodada) {
        this.timeCasa = timeCasa;
        this.timeFora = timeFora;
        this.golsCasa = golsCasa;
        this.golsFora = golsFora;
        this.numeroRodada = numeroRodada;
    }

    public Time getTimeCasa() {
        return timeCasa;
    }

    public Time getTimeFora() {
        return timeFora;
    }

    public int getGolsCasa() {
        return golsCasa;
    }

    public int getGolsFora() {
        return golsFora;
    }

    public int getNumeroRodada() {
        return numeroRodada;
    }

    @Override
    public String toString() {
        return String.format("%s vs %s: %d - %d (Rodada %d)",
            timeCasa.getNome(), timeFora.getNome(), golsCasa, golsFora, numeroRodada);
    }
}

