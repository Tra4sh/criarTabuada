package br.senai.sp.jandira.model;

import java.util.ArrayList;
import java.util.List;

public class CriarTabuada {
    private int numero1 = 0;
    private int multiplicando = 0;

    public int getNumero1() {
        return numero1;
    }

    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    public int getMultiplicando() {
        return multiplicando;
    }

    public void setMultiplicando(int multiplicando) {
        this.multiplicando = multiplicando;
    }

    public List<String> calcularTabuada() {
        List<String> linhasTabuada = new ArrayList();

        for(int i = this.numero1; i <= this.multiplicando; ++i) {
            int resultado = this.multiplicando * i;
            linhasTabuada.add(this.multiplicando + " x " + i + " = " + resultado);
        }

        return linhasTabuada;
    }






}

