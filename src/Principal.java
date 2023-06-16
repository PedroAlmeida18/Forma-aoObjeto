import br.com.alura.ScreenMatch.modelos.Filme;

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

        System.out.println("Total de avaliações : "+ meuFilme.getTotalAvaliaçao());
        System.out.println(meuFilme.mediaAvaliaçao());
        //meuFilme.
    }
}