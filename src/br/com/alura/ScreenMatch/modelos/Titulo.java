package br.com.alura.ScreenMatch.modelos;

import br.com.alura.ScreenMatch.excecao.ErroDeConversaoDeanoException;
import com.google.gson.annotations.SerializedName;

public class Titulo implements Comparable<Titulo> {
    private   String nome;
    private int anoDelançamento;
    private boolean incluidoPlano ;
    private double somaAvaliçao;
    private int  totalAvaliaçao;
    private int duraçãoFilme;

    public Titulo(String nome, int anoDelançamento) {
        this.nome = nome;
        this.anoDelançamento = anoDelançamento;

    }

    public Titulo(Tituloomdb meutituloomdb) {
        this.nome = meutituloomdb.title();
        if(meutituloomdb.year().length()>4){
            throw new ErroDeConversaoDeanoException("Não conseguir converte o ano," +
                    "porque tem mais de 4 caractere");
        }
        this.anoDelançamento= Integer.valueOf(meutituloomdb.year());
        this.duraçãoFilme= Integer.valueOf(meutituloomdb.runtime().substring(0,2));

    }

    public String getNome() {
        return nome;
    }

    public int getAnoDelançamento() {
        return anoDelançamento;
    }

    public boolean isIncluidoPlano() {
        return incluidoPlano;
    }

    public int getDuraçãoFilme() {
        return duraçãoFilme;
    }

    public  int getTotalAvaliaçao(){
        return  totalAvaliaçao;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setAnoDelançamento(int anoDelançamento) {
        this.anoDelançamento = anoDelançamento;
    }

    public void setDuraçãoFilme(int duraçãoFilme) {
        this.duraçãoFilme = duraçãoFilme;
    }

    public void setIncluidoPlano(boolean incluidoPlano) {
        this.incluidoPlano = incluidoPlano;
    }

    public void exibeFicha(){
        System.out.println("Nome do filme : "+ nome);
        System.out.println("Ano de lançamento : "+ anoDelançamento);
        System.out.println("Duração do filme em minutos :"+ duraçãoFilme);
    }
    public void avalia(double nota ){
        somaAvaliçao += nota;
        totalAvaliaçao++  ;
    }
    public  double mediaAvaliaçao(){return somaAvaliçao/totalAvaliaçao;}

    @Override
    public int compareTo(Titulo outroTitulo ) {
        return this.getNome().compareTo(outroTitulo.getNome());
    }

    @Override
    public String toString() {
        return "nome='" + nome + '\'' +
                ", anoDelançamento=" + anoDelançamento +","+ "Duração : " + duraçãoFilme;
    }
}
