package br.com.alura.ScreenMatch.modelos;

import br.com.alura.ScreenMatch.calculos.Classificavel;

public class Episodios implements Classificavel {
    private int numero ;
    private String nome ;
    private Série serie;

    public int getTotalVizualicao() {
        return totalVizualicao;
    }

    public void setTotalVizualicao(int totalVizualicao) {
        this.totalVizualicao = totalVizualicao;
    }

    private int totalVizualicao;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Série getSerie() {
        return serie;
    }

    public void setSerie(Série serie) {
        this.serie = serie;
    }

    @Override
    public int getclassificacao() {
        if (totalVizualicao >100){
            return 4;
        } else {
            return 2;
        }

    }
}
