package br.com.alura.principal;

import br.com.alura.ScreenMatch.modelos.Filme;
import br.com.alura.ScreenMatch.modelos.Série;
import br.com.alura.ScreenMatch.modelos.Titulo;
import java.util.ArrayList;

public class PrincipalList {
    public static void main(String[] args) {
        Filme filmeDoPualo = new Filme("Dogville",2003);
        filmeDoPualo.avalia(6);
        Filme meuFilme = new Filme(" O poderoso Chefão", 1978);
        meuFilme.avalia(9);
        Filme outroFilme = new Filme("Star WARS",2008);
        outroFilme.avalia(10);
        Série serie = new Série("Lost", 2000);
        ArrayList<Titulo> listaassistidos = new ArrayList<>();
        listaassistidos.add(filmeDoPualo);
        listaassistidos.add(meuFilme);
        listaassistidos.add(outroFilme);
        listaassistidos.add(serie);
        for (Titulo item :listaassistidos) {
            System.out.println(item);
            if (item instanceof Filme filme  && filme.getclassificacao() >2   ) {
                System.out.println("Classificação :"+  filme.getclassificacao());
            }


        }
    }
}
