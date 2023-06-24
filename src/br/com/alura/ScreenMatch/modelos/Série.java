package br.com.alura.ScreenMatch.modelos;

import br.com.alura.ScreenMatch.calculos.Classificavel;

public class Série extends Titulo implements Classificavel {
     private int temporadas;
     private boolean ativa;
     private int epPorTemporada;
     private int minutosPorEp;

    public int getTotalVizualicao() {
        return totalVizualicao;
    }

    public void setTotalVizualicao(int totalVizualicao) {
        this.totalVizualicao = totalVizualicao;
    }

    private int totalVizualicao;

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public boolean isAtiva() {
        return ativa;
    }

    public void setAtiva(boolean ativa) {
        this.ativa = ativa;
    }


     public int getEpPorTemporada() {
        return epPorTemporada;
    }

    public void setEpPorTemporada(int epPorTemporada) {
        this.epPorTemporada = epPorTemporada;
    }

    public int getMinutosPorEp() {
        return minutosPorEp ;
    }

    public void setMinutosPorEp(int minutosPorEp) {
        this.minutosPorEp = minutosPorEp;
    }

    @Override
    public int getDuraçãoFilme() {
        return temporadas * epPorTemporada * minutosPorEp;
    }

    @Override
    public int getclassificacao() {
        if (totalVizualicao > 100){
            return 4;
        }
        else {
            return 2;
        }
    }
}

