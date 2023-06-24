package br.com.alura.ScreenMatch.calculos;

public class Recomendacao {

    public void filtra (Classificavel classificavel){
        if (classificavel.getclassificacao() >= 4) {
            System.out.println("Está entre os preferidos da plataforma ");
        } else if (classificavel.getclassificacao() >= 2) {
            System.out.println(" Bem avaliado no momento ");
            
        }else {
            System.out.println(" Assistia depois ");
        }
    }
}
