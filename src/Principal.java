import br.com.alura.ScreenMatch.calculos.CalculadoraDeTempo;
import br.com.alura.ScreenMatch.calculos.Recomendacao;
import br.com.alura.ScreenMatch.modelos.Episodios;
import br.com.alura.ScreenMatch.modelos.Filme;
import br.com.alura.ScreenMatch.modelos.Série;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        System.out.println("------------------------------------------------------");
        System.out.println("PROJETO CRIADO POR : " +
                "PEDRO HENRIQUE DE ALMEIDA SANTOS ");
        System.out.println("------------------------------------------------------");
        Filme meuFilme = new Filme(); // Tipo referência
        meuFilme.setNome(" O poderoso Chefão");
        meuFilme.setAnoDelançamento(1978);
        meuFilme.setDuraçãoFilme(180);
        meuFilme.exibeFicha();
        meuFilme.avalia(7);
        meuFilme.avalia(7);
        meuFilme.avalia(7);
        System.out.println("DURAÇÃO DO FILME :"+ meuFilme.getDuraçãoFilme());

        System.out.println("Total de avaliações : "+ meuFilme.getTotalAvaliaçao());
        System.out.println(meuFilme.mediaAvaliaçao());
        Série serie = new Série();
        serie.setNome("Lost ");
        serie.setAnoDelançamento(2000);
        serie.exibeFicha();
        serie.setTemporadas(9);
        serie.setMinutosPorEp(40);
        serie.setEpPorTemporada(10) ;
        System.out.println("Duração para manatonar a série no momento  : "+ serie.getDuraçãoFilme());
        System.out.println("__________________________________________________________-");
        CalculadoraDeTempo calculadoraTempo = new CalculadoraDeTempo();
        calculadoraTempo.inclui(meuFilme);
        System.out.println("TEMPO TOTAL : "+ calculadoraTempo.getTempo_total());
        System.out.println("__________________________________________________________-");
        Filme outroFilme = new Filme();
        outroFilme.setDuraçãoFilme(100);
        outroFilme.setNome("Star WARS");
        outroFilme.setAnoDelançamento(2008);
        calculadoraTempo.inclui(outroFilme);
        calculadoraTempo.inclui(serie);
        System.out.println(" TEMPO TOTAL De Filmes na plataforma  : "+ calculadoraTempo.getTempo_total());
        Recomendacao filtraRecomedacao = new Recomendacao();
        filtraRecomedacao.filtra(meuFilme);

        Episodios episodio = new Episodios();
        episodio.setNome("A BOLA CAIU ");
        episodio.setNumero(1);
        episodio.setSerie(serie);
        episodio.setTotalVizualicao(150);
        filtraRecomedacao.filtra(episodio);

       // Inicio do 3 curso da formação alura, tratamento de listas
        Filme filmeDoPualo = new Filme();
        filmeDoPualo.setDuraçãoFilme(200);
        filmeDoPualo.setNome("Dogville");
        filmeDoPualo.setAnoDelançamento(2003);
        filmeDoPualo.avalia(8);

        ArrayList<Filme> listaFilmes = new ArrayList<>();
        listaFilmes.add(filmeDoPualo);
        listaFilmes.add(meuFilme);
        listaFilmes.add(outroFilme);
        System.out.println("Tamanho da lista :"+ listaFilmes.size());
        System.out.println("Primeiro filme :"+ listaFilmes.get(0).getNome() );
        System.out.println(listaFilmes);
        System.out.println("ToString do filme :"+ listaFilmes.get(0).toString());
    }
}