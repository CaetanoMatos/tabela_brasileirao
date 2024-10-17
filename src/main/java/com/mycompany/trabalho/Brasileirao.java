package com.mycompany.trabalho;

import java.util.Scanner;
import java.util.List;

public class Brasileirao {

    private Scanner scanner;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       // aqui to instanciando os objetos e adicionando meus times
        Classificacao tab = new Classificacao(); // objeto tab da classe Classificacao para gerenciar a tabela de classificação.
        
        
Time flu = new Time("Fluminense", "flu", "Rio de Janeiro", "Maracanã",70);
Time san = new Time("Santos", "san", "Santos", "Vila Belmiro",47);
Time pal = new Time("Palmeiras", "pal", "São Paulo", "Allianz Parque",81 );
Time cea = new Time("Ceará", "cea", "Fortaleza", "Castelão",37 );
Time cor = new Time("Corinthians", "cor", "São Paulo", "Neo Química Arena",65);
Time goi = new Time("Goiás", "goi", "Goiânia", "Serrinha",46);
Time ame = new Time("América-MG", "ame", "Belo Horizonte", "Independência",53 );
Time ava = new Time("Avaí", "ava", "Florianópolis", "Ressacada",35 );
Time atl = new Time("Atlético-MG", "atl", "Belo Horizonte", "Mineirão",58 );
Time Int = new Time("Internacional", "int", "Porto Alegre", "Beira-Rio", 73);
Time For = new Time("Fortaleza", "for", "Fortaleza", "Castelão",55);
Time cui = new Time("Cuiabá", "cui", "Cuiabá", "Arena Pantanal",41 );
Time bot = new Time("Botafogo", "bot", "Rio de Janeiro", "Nilton Santos",53);
Time juv = new Time("Juventude", "juv", "Caxias do Sul", "Alfredo Jaconi",22 );
Time rbb = new Time("Red Bull Bragantino", "rbb", "Bragança Paulista", "Nabi Abi Chedid",44 );
Time sao = new Time("São Paulo", "sao", "São Paulo", "Morumbi",54 );
Time ath = new Time("Athletico-PR", "ath", "Curitiba", "Arena da Baixada",58 );
Time atg = new Time("Atlético-GO", "atg", "Goiânia", "Antônio Accioly",36 );
Time fla = new Time("Flamengo", "fla", "Rio de Janeiro", "Maracanã",62);
Time cot = new Time("Coritiba", "cot", "Curitiba", "Couto Pereira",65 );

tab.adicionarTime(flu);
tab.adicionarTime(san);
tab.adicionarTime(pal);
tab.adicionarTime(cea);
tab.adicionarTime(cor);
tab.adicionarTime(goi);
tab.adicionarTime(ame);
tab.adicionarTime(ava);
tab.adicionarTime(atl);
tab.adicionarTime(Int);
tab.adicionarTime(For);
tab.adicionarTime(cui);
tab.adicionarTime(bot);
tab.adicionarTime(rbb);
tab.adicionarTime(sao);
tab.adicionarTime(ath);
tab.adicionarTime(atg);
tab.adicionarTime(fla);
tab.adicionarTime(cot);
tab.adicionarTime(juv);





// Adicionando as partidas

// Rodada 1
tab.addPartida(new Rodada(flu, san, 0, 0,1));
tab.addPartida(new Rodada(pal, cea, 2, 2,1));
tab.addPartida(new Rodada(cor, goi, 3, 0,1));
tab.addPartida(new Rodada(ame, ava, 0, 1,1));
tab.addPartida(new Rodada(atl, Int, 2, 0,1));
tab.addPartida(new Rodada(bot, cor, 1, 3,1));
tab.addPartida(new Rodada(juv, rbb, 2, 2,1));
tab.addPartida(new Rodada(sao, ath, 4, 0,1));
tab.addPartida(new Rodada(atg, fla, 1, 1,1));
tab.addPartida(new Rodada(For, cui, 0, 1,1));

//// Rodada 2
tab.addPartida(new Rodada(san, cor, 3, 0,2));
tab.addPartida(new Rodada(cor, ava, 3, 0,2));
tab.addPartida(new Rodada(cea, bot, 1, 1,2));
tab.addPartida(new Rodada(cui, flu, 1, 0,2));
tab.addPartida(new Rodada(fla, pal, 0, 0,2));
tab.addPartida(new Rodada(ame, juv, 4, 1,2));
tab.addPartida(new Rodada(ath, atl, 1, 0,2));
tab.addPartida(new Rodada(Int, For, 1, 0,2));
tab.addPartida(new Rodada(rbb, atg, 4, 0,2));
tab.addPartida(new Rodada(goi, sao, 1, 2,2));

//// Rodada 3
tab.addPartida(new Rodada(cea, rbb, 0, 1,3));
tab.addPartida(new Rodada(bot, cea, 3, 1,3));
tab.addPartida(new Rodada(atg, bot, 2, 2,3));
tab.addPartida(new Rodada(juv, cui, 0, 1,3));
tab.addPartida(new Rodada(flu, Int, 0, 3,3));
tab.addPartida(new Rodada(pal, cor, 3, 0,3));
tab.addPartida(new Rodada(cor, san, 1, 0,3));
tab.addPartida(new Rodada(fla, sao, 1, 0,3));
tab.addPartida(new Rodada(atl, ame, 1, 1,3));
tab.addPartida(new Rodada(For, goi, 1, 1,3));

//// Rodada 4
tab.addPartida(new Rodada(cor, flu, 3, 2,4));
tab.addPartida(new Rodada(juv, Int, 1, 1,4));
tab.addPartida(new Rodada(cea, fla, 2, 2,4));
tab.addPartida(new Rodada(bot, atg, 1, 1,4));
tab.addPartida(new Rodada(san, cui, 3, 0,4));
tab.addPartida(new Rodada(ame, pal, 0, 3,4));
tab.addPartida(new Rodada(rbb, atl, 2, 1,4));
tab.addPartida(new Rodada(goi, ath, 1, 1,4));
tab.addPartida(new Rodada(sao, For, 2, 1,4));
tab.addPartida(new Rodada(cor, ava, 3, 0,4));

//// Rodada 5
tab.addPartida(new Rodada(cor, For, 2, 0,5));
tab.addPartida(new Rodada(sao, san, 2, 1,5));
tab.addPartida(new Rodada(ava, cor, 2, 1,5));
tab.addPartida(new Rodada(atg, goi, 1, 1,5));
tab.addPartida(new Rodada(Int, cor, 2, 2,5));
tab.addPartida(new Rodada(pal, flu, 1, 1,5));
tab.addPartida(new Rodada(cui, atl, 1, 2,5));
tab.addPartida(new Rodada(ame, ath, 1, 0,5));
tab.addPartida(new Rodada(fla, cea, 2, 2,5));
tab.addPartida(new Rodada(bot, juv, 3, 1,5));

// Rodada 6
tab.addPartida(new Rodada(juv, Int, 0, 0,6));
tab.addPartida(new Rodada(goi, san, 1, 0,6));
tab.addPartida(new Rodada(flu, For, 2, 1,6));
tab.addPartida(new Rodada(cea, ame, 0, 1,6));
tab.addPartida(new Rodada(cui, sao, 2, 1,6));
tab.addPartida(new Rodada(atl, atg, 2, 0,6));
tab.addPartida(new Rodada(ava, cor, 1, 1,6));
tab.addPartida(new Rodada(ath, pal, 1, 0,6));
tab.addPartida(new Rodada(bot, fla, 1, 0,6));
tab.addPartida(new Rodada(cor, rbb, 1, 0,6));

// Rodada 7
tab.addPartida(new Rodada(flu, Int, 1, 2,7));
tab.addPartida(new Rodada(For, sao, 1, 0,7));
tab.addPartida(new Rodada(ath, cea, 2, 2,7));
tab.addPartida(new Rodada(atg, cor, 1, 1,7));
tab.addPartida(new Rodada(pal, rbb, 2, 0,7));
tab.addPartida(new Rodada(ame, cui, 1, 1,7));
tab.addPartida(new Rodada(fla, For, 2, 1,7));
tab.addPartida(new Rodada(ath, san, 1, 1,7));
tab.addPartida(new Rodada(sao, atl, 2, 2,7));
tab.addPartida(new Rodada(ava, atg, 1, 0,7));

// Rodada 8
tab.addPartida(new Rodada(atl, pal, 1, 1,8));
tab.addPartida(new Rodada(cor, sao, 1, 0,8));
tab.addPartida(new Rodada(cui, rbb, 1, 1,8));
tab.addPartida(new Rodada(flu, atg, 5, 3,8));
tab.addPartida(new Rodada(juv, bot, 0, 3,8));
tab.addPartida(new Rodada(For, ame, 2, 1,8));
tab.addPartida(new Rodada(san, ath, 1, 0,8));
tab.addPartida(new Rodada(Int, fla, 1, 1,8));
tab.addPartida(new Rodada(cot, pal, 1, 1,8));
tab.addPartida(new Rodada(juv, atg, 0, 0,8));

// Rodada 9
tab.addPartida(new Rodada(pal, ath, 1, 0,9));
tab.addPartida(new Rodada(cor, sao, 1, 0,9));
tab.addPartida(new Rodada(cui, rbb, 1, 1,9));
tab.addPartida(new Rodada(flu, atg, 5, 3,9));
tab.addPartida(new Rodada(juv, bot, 0, 3,9));
tab.addPartida(new Rodada(For, ame, 2, 1,9));
tab.addPartida(new Rodada(san, ath, 1, 0,9));
tab.addPartida(new Rodada(Int, fla, 1, 1,9));
tab.addPartida(new Rodada(cot, pal, 1, 1,9));
tab.addPartida(new Rodada(juv, atg, 0, 0,9));

// Rodada 10
tab.addPartida(new Rodada(fla, pal, 0, 0,10));
tab.addPartida(new Rodada(ath, flu, 1, 2,10));
tab.addPartida(new Rodada(sao, ava, 3, 1,10));
tab.addPartida(new Rodada(juv, bot, 0, 3,10));
tab.addPartida(new Rodada(cor, sao, 1, 0,10));
tab.addPartida(new Rodada(cui, rbb, 1, 1,10));
tab.addPartida(new Rodada(ame, atl, 0, 1,10));
tab.addPartida(new Rodada(For, fla, 1, 0,10));
tab.addPartida(new Rodada(atg, pal, 1, 0,10));
tab.addPartida(new Rodada(flu, bot, 3, 0,10));

// Rodada 11
tab.addPartida(new Rodada(atl, pal, 1, 1,11));
tab.addPartida(new Rodada(cor, sao, 1, 0,11));
tab.addPartida(new Rodada(cui, rbb, 1, 1,11));
tab.addPartida(new Rodada(flu, atg, 5, 3,11));
tab.addPartida(new Rodada(juv, bot, 0, 3,11));
tab.addPartida(new Rodada(For, ame, 2, 1,11));
tab.addPartida(new Rodada(san, ath, 1, 0,11));
tab.addPartida(new Rodada(Int, fla, 1, 1,11));
tab.addPartida(new Rodada(cot, pal, 1, 1,11));
tab.addPartida(new Rodada(juv, atg, 0, 0,11));

// Rodada 12
tab.addPartida(new Rodada(fla, pal, 0, 0,12));
tab.addPartida(new Rodada(ath, flu, 1, 2,12));
tab.addPartida(new Rodada(sao, ava, 3, 1,12));
tab.addPartida(new Rodada(juv, bot, 0, 3,12));
tab.addPartida(new Rodada(cor, sao, 1, 0,12));
tab.addPartida(new Rodada(cui, rbb, 1, 1,12));
tab.addPartida(new Rodada(ame, atl, 0, 1,12));
tab.addPartida(new Rodada(For, fla, 1, 0,12));
tab.addPartida(new Rodada(atg, pal, 1, 0,12));
tab.addPartida(new Rodada(flu, bot, 3, 0,12));

// Rodada 13
tab.addPartida(new Rodada(fla, pal, 0, 0, 13));
tab.addPartida(new Rodada(ath, flu, 1, 2, 13));
tab.addPartida(new Rodada(sao, ava, 3, 1, 13));
tab.addPartida(new Rodada(juv, bot, 0, 3, 13));
tab.addPartida(new Rodada(cor, sao, 1, 0, 13));
tab.addPartida(new Rodada(cui, rbb, 1, 1, 13));
tab.addPartida(new Rodada(ame, atl, 0, 1, 13));
tab.addPartida(new Rodada(For, fla, 1, 0, 13));
tab.addPartida(new Rodada(atg, pal, 1, 0, 13));
tab.addPartida(new Rodada(flu, bot, 3, 0, 13));

//// Rodada 14
tab.addPartida(new Rodada(fla, pal, 0, 0, 14));
tab.addPartida(new Rodada(ath, flu, 1, 2, 14));
tab.addPartida(new Rodada(sao, ava, 3, 1, 14));
tab.addPartida(new Rodada(juv, bot, 0, 3, 14));
tab.addPartida(new Rodada(cor, sao, 1, 0, 14));
tab.addPartida(new Rodada(cui, rbb, 1, 1, 14));
tab.addPartida(new Rodada(ame, atl, 0, 1, 14));
tab.addPartida(new Rodada(For, fla, 1, 0, 14));
tab.addPartida(new Rodada(atg, pal, 1, 0, 14));
tab.addPartida(new Rodada(flu, bot, 3, 0, 14));

//// Rodada 15
tab.addPartida(new Rodada(fla, pal, 0, 0, 15));
tab.addPartida(new Rodada(ath, flu, 1, 2, 15));
tab.addPartida(new Rodada(sao, ava, 3, 1, 15));
tab.addPartida(new Rodada(juv, bot, 0, 3, 15));
tab.addPartida(new Rodada(cor, sao, 1, 0, 15));
tab.addPartida(new Rodada(cui, rbb, 1, 1, 15));
tab.addPartida(new Rodada(ame, atl, 0, 1, 15));
tab.addPartida(new Rodada(For, fla, 1, 0, 15));
tab.addPartida(new Rodada(atg, pal, 1, 0, 15));
tab.addPartida(new Rodada(flu, bot, 3, 0, 15));

//// Rodada 16
tab.addPartida(new Rodada(fla, pal, 0, 0, 16));
tab.addPartida(new Rodada(ath, flu, 1, 2, 16));
tab.addPartida(new Rodada(sao, ava, 3, 1, 16));
tab.addPartida(new Rodada(juv, bot, 0, 3, 16));
tab.addPartida(new Rodada(cor, sao, 1, 0, 16));
tab.addPartida(new Rodada(cui, rbb, 1, 1, 16));
tab.addPartida(new Rodada(ame, atl, 0, 1, 16));
tab.addPartida(new Rodada(For, fla, 1, 0, 16));
tab.addPartida(new Rodada(atg, pal, 1, 0, 16));
tab.addPartida(new Rodada(flu, bot, 3, 0, 16));

//// Rodada 17
tab.addPartida(new Rodada(fla, pal, 0, 0, 17));
tab.addPartida(new Rodada(ath, flu, 1, 2, 17));
tab.addPartida(new Rodada(sao, ava, 3, 1, 17));
tab.addPartida(new Rodada(juv, bot, 0, 3, 17));
tab.addPartida(new Rodada(cor, sao, 1, 0, 17));
tab.addPartida(new Rodada(cui, rbb, 1, 1, 17));
tab.addPartida(new Rodada(ame, atl, 0, 1, 17));
tab.addPartida(new Rodada(For, fla, 1, 0, 17));
tab.addPartida(new Rodada(atg, pal, 1, 0, 17));
tab.addPartida(new Rodada(flu, bot, 3, 0, 17));

//// Rodada 18
tab.addPartida(new Rodada(fla, pal, 0, 0, 18));
tab.addPartida(new Rodada(ath, flu, 1, 2, 18));
tab.addPartida(new Rodada(sao, ava, 3, 1, 18));
tab.addPartida(new Rodada(juv, bot, 0, 3, 18));
tab.addPartida(new Rodada(cor, sao, 1, 0, 18));
tab.addPartida(new Rodada(cui, rbb, 1, 1, 18));
tab.addPartida(new Rodada(ame, atl, 0, 1, 18));
tab.addPartida(new Rodada(For, fla, 1, 0, 18));
tab.addPartida(new Rodada(atg, pal, 1, 0, 18));
tab.addPartida(new Rodada(flu, bot, 3, 0, 18));

//// Rodada 19
tab.addPartida(new Rodada(fla, pal, 0, 0, 19));
tab.addPartida(new Rodada(ath, flu, 1, 2, 19));
tab.addPartida(new Rodada(sao, ava, 3, 1, 19));
tab.addPartida(new Rodada(juv, bot, 0, 3, 19));
tab.addPartida(new Rodada(cor, sao, 1, 0, 19));
tab.addPartida(new Rodada(cui, rbb, 1, 1, 19));
tab.addPartida(new Rodada(ame, atl, 0, 1, 19));
tab.addPartida(new Rodada(For, fla, 1, 0, 19));
tab.addPartida(new Rodada(atg, pal, 1, 0, 19));
tab.addPartida(new Rodada(flu, bot, 3, 0, 19));

//// Rodada 20
tab.addPartida(new Rodada(fla, pal, 0, 0, 20));
tab.addPartida(new Rodada(ath, flu, 1, 2, 20));
tab.addPartida(new Rodada(sao, ava, 3, 1, 20));
tab.addPartida(new Rodada(juv, bot, 0, 3, 20));
tab.addPartida(new Rodada(cor, sao, 1, 0, 20));
tab.addPartida(new Rodada(cui, rbb, 1, 1, 20));
tab.addPartida(new Rodada(ame, atl, 0, 1, 20));
tab.addPartida(new Rodada(For, fla, 1, 0, 20));
tab.addPartida(new Rodada(atg, pal, 1, 0, 20));
tab.addPartida(new Rodada(flu, bot, 3, 0, 20));

//// Rodada 21
tab.addPartida(new Rodada(fla, pal, 0, 0, 21));
tab.addPartida(new Rodada(ath, flu, 1, 2, 21));
tab.addPartida(new Rodada(sao, ava, 3, 1, 21));
tab.addPartida(new Rodada(juv, bot, 0, 3, 21));
tab.addPartida(new Rodada(cor, sao, 1, 0, 21));
tab.addPartida(new Rodada(cui, rbb, 1, 1, 21));
tab.addPartida(new Rodada(ame, atl, 0, 1, 21));
tab.addPartida(new Rodada(For, fla, 1, 0, 21));
tab.addPartida(new Rodada(atg, pal, 1, 0, 21));
tab.addPartida(new Rodada(flu, bot, 3, 0, 21));

//// Rodada 22
tab.addPartida(new Rodada(fla, pal, 0, 0, 22));
tab.addPartida(new Rodada(ath, flu, 1, 2, 22));
tab.addPartida(new Rodada(sao, ava, 3, 1, 22));
tab.addPartida(new Rodada(juv, bot, 0, 3, 22));
tab.addPartida(new Rodada(cor, sao, 1, 0, 22));
tab.addPartida(new Rodada(cui, rbb, 1, 1, 22));
tab.addPartida(new Rodada(ame, atl, 0, 1, 22));
tab.addPartida(new Rodada(For, fla, 1, 0, 22));
tab.addPartida(new Rodada(atg, pal, 1, 0, 22));
tab.addPartida(new Rodada(flu, bot, 3, 0, 22));

//// Rodada 23
tab.addPartida(new Rodada(fla, pal, 0, 0, 23));
tab.addPartida(new Rodada(ath, flu, 1, 2, 23));
tab.addPartida(new Rodada(sao, ava, 3, 1, 23));
tab.addPartida(new Rodada(juv, bot, 0, 3, 23));
tab.addPartida(new Rodada(cor, sao, 1, 0, 23));
tab.addPartida(new Rodada(cui, rbb, 1, 1, 23));
tab.addPartida(new Rodada(ame, atl, 0, 1, 23));
tab.addPartida(new Rodada(For, fla, 1, 0, 23));
tab.addPartida(new Rodada(atg, pal, 1, 0, 23));
tab.addPartida(new Rodada(flu, bot, 3, 0, 23));

//// Rodada 24
tab.addPartida(new Rodada(fla, pal, 0, 0, 24));
tab.addPartida(new Rodada(ath, flu, 1, 2, 24));
tab.addPartida(new Rodada(sao, ava, 3, 1, 24));
tab.addPartida(new Rodada(juv, bot, 0, 3, 24));
tab.addPartida(new Rodada(cor, sao, 1, 0, 24));
tab.addPartida(new Rodada(cui, rbb, 1, 1, 24));
tab.addPartida(new Rodada(ame, atl, 0, 1, 24));
tab.addPartida(new Rodada(For, fla, 1, 0, 24));
tab.addPartida(new Rodada(atg, pal, 1, 0, 24));
tab.addPartida(new Rodada(flu, bot, 3, 0, 24));

//// Rodada 25
tab.addPartida(new Rodada(fla, pal, 0, 0, 25));
tab.addPartida(new Rodada(ath, flu, 1, 2, 25));
tab.addPartida(new Rodada(sao, ava, 3, 1, 25));
tab.addPartida(new Rodada(juv, bot, 0, 3, 25));
tab.addPartida(new Rodada(cor, sao, 1, 0, 25));
tab.addPartida(new Rodada(cui, rbb, 1, 1, 25));
tab.addPartida(new Rodada(ame, atl, 0, 1, 25));
tab.addPartida(new Rodada(For, fla, 1, 0, 25));
tab.addPartida(new Rodada(atg, pal, 1, 0, 25));
tab.addPartida(new Rodada(flu, bot, 3, 0, 25));

//// Rodada 26
tab.addPartida(new Rodada(fla, pal, 0, 0, 26));
tab.addPartida(new Rodada(ath, flu, 1, 2, 26));
tab.addPartida(new Rodada(sao, ava, 3, 1, 26));
tab.addPartida(new Rodada(juv, bot, 0, 3, 26));
tab.addPartida(new Rodada(cor, sao, 1, 0, 26));
tab.addPartida(new Rodada(cui, rbb, 1, 1, 26));
tab.addPartida(new Rodada(ame, atl, 0, 1, 26));
tab.addPartida(new Rodada(For, fla, 1, 0, 26));
tab.addPartida(new Rodada(atg, pal, 1, 0, 26));
tab.addPartida(new Rodada(flu, bot, 3, 0, 26));

//// Rodada 27
tab.addPartida(new Rodada(fla, pal, 0, 0, 27));
tab.addPartida(new Rodada(ath, flu, 1, 2, 27));
tab.addPartida(new Rodada(sao, ava, 3, 1, 27));
tab.addPartida(new Rodada(juv, bot, 0, 3, 27));
tab.addPartida(new Rodada(cor, sao, 1, 0, 27));
tab.addPartida(new Rodada(cui, rbb, 1, 1, 27));
tab.addPartida(new Rodada(ame, atl, 0, 1, 27));
tab.addPartida(new Rodada(For, fla, 1, 0, 27));
tab.addPartida(new Rodada(atg, pal, 1, 0, 27));
tab.addPartida(new Rodada(flu, bot, 3, 0, 27));

//// Rodada 28
tab.addPartida(new Rodada(fla, pal, 0, 0, 28));
tab.addPartida(new Rodada(ath, flu, 1, 2, 28));
tab.addPartida(new Rodada(sao, ava, 3, 1, 28));
tab.addPartida(new Rodada(juv, bot, 0, 3, 28));
tab.addPartida(new Rodada(cor, sao, 1, 0, 28));
tab.addPartida(new Rodada(cui, rbb, 1, 1, 28));
tab.addPartida(new Rodada(ame, atl, 0, 1, 28));
tab.addPartida(new Rodada(For, fla, 1, 0, 28));
tab.addPartida(new Rodada(atg, pal, 1, 0, 28));
tab.addPartida(new Rodada(flu, bot, 3, 0, 28));

//// Rodada 29
tab.addPartida(new Rodada(fla, pal, 0, 0, 29));
tab.addPartida(new Rodada(ath, flu, 1, 2, 29));
tab.addPartida(new Rodada(sao, ava, 3, 1, 29));
tab.addPartida(new Rodada(juv, bot, 0, 3, 29));
tab.addPartida(new Rodada(cor, sao, 1, 0, 29));
tab.addPartida(new Rodada(cui, rbb, 1, 1, 29));
tab.addPartida(new Rodada(ame, atl, 0, 1, 29));
tab.addPartida(new Rodada(For, fla, 1, 0, 29));
tab.addPartida(new Rodada(atg, pal, 1, 0, 29));
tab.addPartida(new Rodada(flu, bot, 3, 0, 29));

//// Rodada 30
tab.addPartida(new Rodada(fla, pal, 0, 0, 30));
tab.addPartida(new Rodada(ath, flu, 1, 2, 30));
tab.addPartida(new Rodada(sao, ava, 3, 1, 30));
tab.addPartida(new Rodada(juv, bot, 0, 3, 30));
tab.addPartida(new Rodada(cor, sao, 1, 0, 30));
tab.addPartida(new Rodada(cui, rbb, 1, 1, 30));
tab.addPartida(new Rodada(ame, atl, 0, 1, 30));
tab.addPartida(new Rodada(For, fla, 1, 0, 30));
tab.addPartida(new Rodada(atg, pal, 1, 0, 30));
tab.addPartida(new Rodada(flu, bot, 3, 0, 30));

//// Rodada 31
tab.addPartida(new Rodada(fla, pal, 0, 0, 31));
tab.addPartida(new Rodada(ath, flu, 1, 2, 31));
tab.addPartida(new Rodada(sao, ava, 3, 1, 31));
tab.addPartida(new Rodada(juv, bot, 0, 3, 31));
tab.addPartida(new Rodada(cor, sao, 1, 0, 31));
tab.addPartida(new Rodada(cui, rbb, 1, 1, 31));
tab.addPartida(new Rodada(ame, atl, 0, 1, 31));
tab.addPartida(new Rodada(For, fla, 1, 0, 31));
tab.addPartida(new Rodada(atg, pal, 1, 0, 31));
tab.addPartida(new Rodada(flu, bot, 3, 0, 31));

//// Rodada 32
tab.addPartida(new Rodada(fla, pal, 0, 0, 32));
tab.addPartida(new Rodada(ath, flu, 1, 2, 32));
tab.addPartida(new Rodada(sao, ava, 3, 1, 32));
tab.addPartida(new Rodada(juv, bot, 0, 3, 32));
tab.addPartida(new Rodada(cor, sao, 1, 0, 32));
tab.addPartida(new Rodada(cui, rbb, 1, 1, 32));
tab.addPartida(new Rodada(ame,

 atl, 0, 1, 32));
tab.addPartida(new Rodada(For, fla, 1, 0, 32));
tab.addPartida(new Rodada(atg, pal, 1, 0, 32));
tab.addPartida(new Rodada(flu, bot, 3, 0, 32));

//// Rodada 33
tab.addPartida(new Rodada(fla, pal, 0, 0, 33));
tab.addPartida(new Rodada(ath, flu, 1, 2, 33));
tab.addPartida(new Rodada(sao, ava, 3, 1, 33));
tab.addPartida(new Rodada(juv, bot, 0, 3, 33));
tab.addPartida(new Rodada(cor, sao, 1, 0, 33));
tab.addPartida(new Rodada(cui, rbb, 1, 1, 33));
tab.addPartida(new Rodada(ame, atl, 0, 1, 33));
tab.addPartida(new Rodada(For, fla, 1, 0, 33));
tab.addPartida(new Rodada(atg, pal, 1, 0, 33));
tab.addPartida(new Rodada(flu, bot, 3, 0, 33));

//// Rodada 34
tab.addPartida(new Rodada(fla, pal, 0, 0, 34));
tab.addPartida(new Rodada(ath, flu, 1, 2, 34));
tab.addPartida(new Rodada(sao, ava, 3, 1, 34));
tab.addPartida(new Rodada(juv, bot, 0, 3, 34));
tab.addPartida(new Rodada(cor, sao, 1, 0, 34));
tab.addPartida(new Rodada(cui, rbb, 1, 1, 34));
tab.addPartida(new Rodada(ame, atl, 0, 1, 34));
tab.addPartida(new Rodada(For, fla, 1, 0, 34));
tab.addPartida(new Rodada(atg, pal, 1, 0, 34));
tab.addPartida(new Rodada(flu, bot, 3, 0, 34));

//// Rodada 35
tab.addPartida(new Rodada(fla, pal, 0, 0, 35));
tab.addPartida(new Rodada(ath, flu, 1, 2, 35));
tab.addPartida(new Rodada(sao, ava, 3, 1, 35));
tab.addPartida(new Rodada(juv, bot, 0, 3, 35));
tab.addPartida(new Rodada(cor, sao, 1, 0, 35));
tab.addPartida(new Rodada(cui, rbb, 1, 1, 35));
tab.addPartida(new Rodada(ame, atl, 0, 1, 35));
tab.addPartida(new Rodada(For, fla, 1, 0, 35));
tab.addPartida(new Rodada(atg, pal, 1, 0, 35));
tab.addPartida(new Rodada(flu, bot, 3, 0, 35));

//// Rodada 36
tab.addPartida(new Rodada(fla, pal, 0, 0, 36));
tab.addPartida(new Rodada(ath, flu, 1, 2, 36));
tab.addPartida(new Rodada(sao, ava, 3, 1, 36));
tab.addPartida(new Rodada(juv, bot, 0, 3, 36));
tab.addPartida(new Rodada(cor, sao, 1, 0, 36));
tab.addPartida(new Rodada(cui, rbb, 1, 1, 36));
tab.addPartida(new Rodada(ame, atl, 0, 1, 36));
tab.addPartida(new Rodada(For, fla, 1, 0, 36));
tab.addPartida(new Rodada(atg, pal, 1, 0, 36));
tab.addPartida(new Rodada(flu, bot, 3, 0, 36));

//// Rodada 37
tab.addPartida(new Rodada(fla, pal, 0, 0, 37));
tab.addPartida(new Rodada(ath, flu, 1, 2, 37));
tab.addPartida(new Rodada(sao, ava, 3, 1, 37));
tab.addPartida(new Rodada(juv, bot, 0, 3, 37));
tab.addPartida(new Rodada(cor, sao, 1, 0, 37));
tab.addPartida(new Rodada(cui, rbb, 1, 1, 37));
tab.addPartida(new Rodada(ame, atl, 0, 1, 37));
tab.addPartida(new Rodada(For, fla, 1, 0, 37));
tab.addPartida(new Rodada(atg, pal, 1, 0, 37));
tab.addPartida(new Rodada(flu, bot, 3, 0, 37));

//// Rodada 38
tab.addPartida(new Rodada(fla, pal, 0, 0, 38));
tab.addPartida(new Rodada(ath, flu, 1, 2, 38));
tab.addPartida(new Rodada(sao, ava, 3, 1, 38));
tab.addPartida(new Rodada(juv, bot, 0, 3, 38));
tab.addPartida(new Rodada(cor, sao, 1, 0, 38));
tab.addPartida(new Rodada(cui, rbb, 1, 1, 38));
tab.addPartida(new Rodada(ame, atl, 0, 1, 38));
tab.addPartida(new Rodada(For, fla, 1, 0, 38));
tab.addPartida(new Rodada(atg, pal, 1, 0, 38));
tab.addPartida(new Rodada(flu, bot, 3, 0, 38));

//// Rodada 39
tab.addPartida(new Rodada(fla, pal, 0, 0, 39));
tab.addPartida(new Rodada(ath, flu, 1, 2, 39));
tab.addPartida(new Rodada(sao, ava, 3, 1, 39));
tab.addPartida(new Rodada(juv, bot, 0, 3, 39));
tab.addPartida(new Rodada(cor, sao, 1, 0, 39));
tab.addPartida(new Rodada(cui, rbb, 1, 1, 39));
tab.addPartida(new Rodada(ame, atl, 0, 1, 39));
tab.addPartida(new Rodada(For, fla, 1, 0, 39));
tab.addPartida(new Rodada(atg, pal, 1, 0, 39));
tab.addPartida(new Rodada(flu, bot, 3, 0, 39));

  
    
       int opcao;
        do {
            System.out.println("Menu:");
            System.out.println("1. Imprimir Dados do Time");
            System.out.println("2. Imprimir Partidas por Rodada");
            System.out.println("3. Imprimir Partidas por Time");
            System.out.println("4. Imprimir Tabela Final");
            System.out.println("5. Imprimir Todas as Partidas");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opcao: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Consome a nova linha

            switch (opcao) {
                case 1:
                    System.out.print("Digite o nome do time: ");
                    String nomeTime = scanner.nextLine();
                    Time time = tab.getTime(nomeTime);
                    if (time != null) {
                        System.out.println("Nome: " + time.getNome());
                        System.out.println("Sigla: " + time.getAbreviacao());
                        System.out.println("Cidade: " + time.getCidade());
                        System.out.println("Estádio: " + time.getEstadio());
                            } else {
                                System.out.println("Time nao encontrado!");
                                        }                      
                        break;
                case 2:
                    System.out.print("Digite o numero da rodada: ");
                    int numRodada = scanner.nextInt();
                    scanner.nextLine(); // Limpa o buffer do scanner
                    List<Rodada> partidas = tab.getPartidasRodada(numRodada);
                    if (partidas != null && !partidas.isEmpty()) {
                        for (Rodada partida : partidas) {
                            System.out.println(partida.getTimeCasa().getNome() + " " + partida.getGolsCasa() + " x " + partida.getGolsFora() + " " + partida.getTimeFora().getNome());
                        }
                    } else {
                        System.out.println("Rodada nao encontrada ou sem partidas!");
                    }
                    break;
                case 3:
                    System.out.print("Digite o nome do time: ");
                    String nome = scanner.nextLine();
                    List<Rodada> partidaTime = tab.getPartidasTime(nome);
                    if (partidaTime != null && !partidaTime.isEmpty()) {
                        for (Rodada partida : partidaTime) {
                            System.out.println(partida.getTimeCasa().getNome() + " " + partida.getGolsCasa() + " x " + partida.getGolsFora() + " " + partida.getTimeFora().getNome());
                        }
                    } else {
                        System.out.println("Time nao encontrado ou sem partidas!");
                    }
                                break;
                case 4:
                    tab.imprimirClassificacaoFinal();
                    break;
                case 5: 
                    tab.imprimirTodasAsPartidas();
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opcao invalida. Tente novamente.");
            }
        } while (opcao != 0);
       scanner.close();
    }
 }

    

