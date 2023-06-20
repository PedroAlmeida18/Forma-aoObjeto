package br.com.alura.ScreenMatch.modelos;

public class Titulo {
    private   String nome;
    private int anoDelançamento;
    private boolean incluidoPlano ;
    private double somaAvaliçao;
    private int  totalAvaliaçao;
    private int duraçãoFilme;

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

}
