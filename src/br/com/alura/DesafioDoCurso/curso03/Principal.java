package br.com.alura.DesafioDoCurso.curso03;

import java.util.Collections;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite o valor do limite  do cartão :");
        double limite = leitor.nextDouble();
        Cartao cartaoCredito = new Cartao(limite);
        int sair = 1 ;
        while (sair != 0 ){
            System.out.println("Digite a desrição da compra :");
            String descricao = leitor.next();
            System.out.println("Digite o valor da compra :");
            double valor  = leitor.nextDouble();
            Compras compra = new Compras(descricao,valor);
            boolean comprarealizada = cartaoCredito.lancaCompra(compra);
            if (comprarealizada){
                System.out.println("Compra realizada!");
                System.out.println("Digite 1 se quiser sair ou digite 0 para continuar");

                sair = leitor.nextInt();

            }
            else{
                System.out.println("Compra não realizada !");
                System.out.println("Digite 1 se quiser sair ou digite 0 para continuar");
                
                sair = leitor.nextInt();


            }
            System.out.println("____________________________________________________");
            System.out.println("Compras realizadas :");
            Collections.sort(cartaoCredito.getCompras());
            for (Compras c : cartaoCredito.getCompras()){
                System.out.println(c.getDescrcao() + ":" + c.getValor());
            }
            System.out.println("*******************************");
            System.out.println("Saldo do cartão : "+ cartaoCredito.getSaldo());
            System.out.println("Limite atual do cartão :"+ cartaoCredito.getLimite());
        }


    }
}
