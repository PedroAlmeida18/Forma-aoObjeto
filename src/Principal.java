public class Principal {
    public static void main(String[] args) {
        Filme meuFilme = new Filme(); // Tipo referência
        meuFilme.nome = " O poderoso Chefão";
        meuFilme.anoDelançamento = 1978;
        meuFilme.duraçãoFilme = 180;
        System.out.println(meuFilme.nome);
        System.out.println(meuFilme.anoDelançamento);

    }
}
