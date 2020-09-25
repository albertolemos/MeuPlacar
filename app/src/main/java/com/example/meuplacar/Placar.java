package com.example.meuplacar;

import java.io.Serializable;

public class Placar implements Serializable {

    private int pontosJogador1, pontosJogador2;

    public Placar(int pontosJogador1, int pontosJogador2) {
        this.pontosJogador1 = pontosJogador1;
        this.pontosJogador2 = pontosJogador2;
    }

    public int getPontosJogador1() {
        return pontosJogador1;
    }

    public void setPontosJogador1(int pontosJogador1) {
        this.pontosJogador1 = pontosJogador1;
    }

    public int getPontosJogador2() {
        return pontosJogador2;
    }

    public void setPontosJogador2(int pontosJogador2) {
        this.pontosJogador2 = pontosJogador2;
    }
}
