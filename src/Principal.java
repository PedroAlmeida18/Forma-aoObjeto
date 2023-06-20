import br.com.alura.ScreenMatch.modelos.Filme;
import br.com.alura.ScreenMatch.modelos.Série;

public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme(); // Tipo referência
        meuFilme.setNome(" O poderoso Chefão");;
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
    }
}