package br.com.alura.DesafioDoCurso;

public class Audio {
    private  String titulo ;
    private int duracao ;
    private int totalReproduções;
    private int  totalCurtidas ;
    private int classificacao;

    public int getDuracao() {
        return duracao;
    }

    public int getTotalReproduções() {
        return totalReproduções;
    }

    public int getTotalCurtidas() {
        return totalCurtidas;
    }

    public double getClassificacao() {
        return classificacao;
    }


    public  void curtir (){
        this.totalCurtidas ++;

    }
    public  void reproduz (){
        this.totalReproduções++;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

}
