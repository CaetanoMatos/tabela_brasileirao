package com.mycompany.trabalho;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Classificacao {

    private List<Time> times;
    // esses sao dois mapas que armazenam as partidas por rodada, a chave eh o numero da rodada, aquele outro eh pras partidas por time
    private Map<Integer, List<Rodada>> partidasPorRodada;
    private Map<String, List<Rodada>> partidasPorTime;

    public Classificacao() {
        this.times = new ArrayList<>();
        this.partidasPorRodada = new HashMap<>();
        this.partidasPorTime = new HashMap<>();
    }

    public void adicionarTime(Time time) {
        times.add(time);
    }
// add uma partida as estruturas de dados apropriadas
    public void addPartida(Rodada rodada) {
        int rodadaNumero = rodada.getNumeroRodada();
        partidasPorRodada.putIfAbsent(rodadaNumero, new ArrayList<>());
        partidasPorRodada.get(rodadaNumero).add(rodada);

        // Adiciona a partida no mapa de partidas por time
        String timeCasa = rodada.getTimeCasa().getNome();
        String timeFora = rodada.getTimeFora().getNome();

        partidasPorTime.putIfAbsent(timeCasa, new ArrayList<>());
        partidasPorTime.putIfAbsent(timeFora, new ArrayList<>());

        partidasPorTime.get(timeCasa).add(rodada);
        partidasPorTime.get(timeFora).add(rodada);
    }
    
    
// retorna o time pelo nome
    public Time getTime(String nome) {
        for (Time time : times) {
            if (time.getNome().equalsIgnoreCase(nome)) {
                return time;
            }
        }
        return null;
    }
// retorna as partidas da rodada digitada
    public List<Rodada> getPartidasRodada(int numeroRodada) {
        return partidasPorRodada.getOrDefault(numeroRodada, new ArrayList<>());
    }
// retorna as partidas de um time digitado
    public List<Rodada> getPartidasTime(String nomeTime) {
        return partidasPorTime.getOrDefault(nomeTime, new ArrayList<>());
    }
    //imprime a tabela final
        public void imprimirClassificacaoFinal() {
        List<Time> listaOrdenada = new ArrayList<>(times);

        // Ordena os times na tabela manualmente
        for (int i = 0; i < listaOrdenada.size() - 1; i++) {
            for (int j = 0; j < listaOrdenada.size() - i - 1; j++) {
                if (listaOrdenada.get(j).getPontos() < listaOrdenada.get(j + 1).getPontos()) {
                    Time temp = listaOrdenada.get(j);
                    listaOrdenada.set(j, listaOrdenada.get(j + 1));
                    listaOrdenada.set(j + 1, temp);
                }
            }
        }

        System.out.println("Classificação Final do Campeonato:");
        for (int i = 0; i < listaOrdenada.size(); i++) {
            Time time = listaOrdenada.get(i);
            System.out.printf("%d. %s - %d pontos%n", i + 1, time.getNome(), time.getPontos());
        }
    }
        
        public void imprimirTodasAsPartidas() {
        System.out.println("Lista de Partidas:");
        for (List<Rodada> rodadas : partidasPorRodada.values()) {
            for (Rodada rodada : rodadas) {
                System.out.println(rodada);
            }
        }
    }
}

   

