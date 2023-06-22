import br.com.alura.ScreenMatch.calculos.CalculadoraDeTempo;
import br.com.alura.ScreenMatch.modelos.Filme;
import br.com.alura.ScreenMatch.modelos.Série;

public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme(); // Tipo referência
        meuFilme.setNome(" O poderoso Chefão");;
        meuFilme.setAnoDelançamento(1978);
        meuFilme.setDuraçãoFilme(180);
        System.out.println("CRIAÇÃO POR PEDRO HENRIQUE DE ALMEIDA SANTOS ");
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

    }
}