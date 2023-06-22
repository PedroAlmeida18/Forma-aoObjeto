package br.com.alura.ScreenMatch.calculos;

import br.com.alura.ScreenMatch.modelos.Filme;
import br.com.alura.ScreenMatch.modelos.Série;
import br.com.alura.ScreenMatch.modelos.Titulo;

public class CalculadoraDeTempo {
    private int tempo_total;

    public int getTempo_total() {
        return this.tempo_total;
    }
   // public void inclui(Filme f ){
      //  this.tempo_total += f.getDuraçãoFilme();

  //  }
//    public  void incluiS(Série S){
  //      this.tempo_total += S.getDuraçãoFilme();
    //}
    public void inclui (Titulo T){
        this.tempo_total += T.getDuraçãoFilme();
    }
}
