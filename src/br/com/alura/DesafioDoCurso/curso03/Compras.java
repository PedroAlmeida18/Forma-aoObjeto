package br.com.alura.DesafioDoCurso.curso03;

public class Compras implements Comparable {
    private String descrcao ;
    private double valor ;

    public Compras(String descrcao, double valor) {
        this.descrcao = descrcao;
        this.valor = valor;
    }

    public void setDescrcao(String descrcao) {
        this.descrcao = descrcao;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getDescrcao() {
        return descrcao;
    }

    public double getValor() {
        return valor;
    }

    @Override
    public String toString() {
        return "Compra : " + descrcao + " Valoe = " + valor;
    }


    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
