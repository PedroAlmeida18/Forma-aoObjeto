package br.com.alura.DesafioDoCurso;

public class Audio {
    private  String titulo ;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    public int getTotalReproduções() {
        return totalReproduções;
    }

    public void setTotalReproduções(int totalReproduções) {
        this.totalReproduções = totalReproduções;
    }

    public int getCurtidas() {
        return curtidas;
    }

    public void setCurtidas(int curtidas) {
        this.curtidas = curtidas;
    }

    public int getClassificacao() {
        return classificacao;
    }

    public void setClassificacao(int classificacao) {
        this.classificacao = classificacao;
    }

    private int duracao ;
    private int totalReproduções;
    private int  curtidas ;
    private int classificacao;

}
