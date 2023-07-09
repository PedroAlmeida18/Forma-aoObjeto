package br.com.alura.DesafioDoCurso.curso03;

public class Compras {
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

    public static void main(String[] args) {
        System.out.println("");
    }
}
