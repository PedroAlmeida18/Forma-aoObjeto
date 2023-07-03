package br.com.alura.ScreenMatch.modelos;

import br.com.alura.ScreenMatch.calculos.Classificavel;

public class Filme extends  Titulo implements Classificavel {
    private String diretor ;
    public String getDiretor() {
        return diretor;
    }
    public void setDiretor(String diretor) {
        this.diretor = diretor ;
    }

    @Override
    public int getclassificacao() {

        return (int) mediaAvaliaçao()/2;
    }

    @Override
    public String toString() {
        return "Filme :"+ this.getNome() + "(" + this.getAnoDelançamento()+ ")";
    }
}
