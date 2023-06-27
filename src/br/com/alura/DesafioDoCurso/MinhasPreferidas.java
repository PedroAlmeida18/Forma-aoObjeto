package br.com.alura.DesafioDoCurso;

public class MinhasPreferidas {
    public void inclui (Audio audio){

        if(audio.getClassificacao()>= 9) {
            System.out.println(audio.getTitulo() + " é considerado sucesso e preferido por todos");

        } else {
            System.out.println(audio.getTitulo() + " Têm algumas pessoas curtindo");
        }
    }
}
