package br.com.alura.DesafioDoCurso.curso03;

import java.util.ArrayList;
import java.util.List;

public class Cartao {
     private double  limite ;
    private  double saldo ;
    private List<Compras> compras ;

    public Cartao(double limite) {
        this.limite = limite;
        this.saldo = limite ;
        this.compras = new ArrayList<>();
    }
    public boolean lancaCompra (Compras compra ){
        if(this.saldo > compra.getValor()){
            this.saldo -= compra.getValor();
            this.compras.add(compra);
            return true ;
        }
        return false ;
    }

    public double getLimite() {
        return limite - saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public List<Compras> getCompras() {
        return compras;
    }

}
