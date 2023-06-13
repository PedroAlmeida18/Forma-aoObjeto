public class Filme {
    String nome;
    int anoDelançamento;
    boolean incluidoPlano ;
    private double somaAvaliçao;
    private int  totalAvaliaçao;
    int duraçãoFilme;
    int getTotalAvaliaçao(){
        return  totalAvaliaçao;
    }
    void exibeFicha(){
        System.out.println("Nome do filme : "+ nome);
        System.out.println("Ano de lançamento : "+ anoDelançamento);
        System.out.println("Duração do filme em minutos :"+ duraçãoFilme);
    }
    void avalia(double nota ){
        somaAvaliçao += nota;
        totalAvaliaçao++;
    }
    double mediaAvaliaçao(){
        return somaAvaliçao/totalAvaliaçao;
    }

}
