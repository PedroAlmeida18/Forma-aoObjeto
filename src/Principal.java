public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme(); // Tipo referência
        meuFilme.nome = " O poderoso Chefão";
        meuFilme.anoDelançamento = 1978;
        meuFilme.duraçãoFilme = 180;
        meuFilme.exibeFicha();
        meuFilme.avalia(7);
        meuFilme.avalia(7);
        meuFilme.avalia(7);

        System.out.println("Total de avaliações : "+ meuFilme.getTotalAvaliaçao());
        System.out.println(meuFilme.mediaAvaliaçao());
        //meuFilme.
    }
}