package br.com.alura.DesafioDoCurso.Principal;

import br.com.alura.DesafioDoCurso.MinhasPreferidas;
import br.com.alura.DesafioDoCurso.Musica;
import br.com.alura.DesafioDoCurso.Podcast;

public class Main_desafio {
    public static void main(String[] args) {
        Musica minha_musica = new Musica();
        minha_musica.setTitulo("A VIDA É DIFERENTE ");
        minha_musica.setAlbum("MINHA HISTÓRIA ");
        minha_musica.setCantor("Pedro Henrique de Almeida Santos  ");
        minha_musica.setGenero("RAP");
        for (int i = 0; i < 1000; i++) {
            minha_musica.reproduz();
            
        }
        for (int i = 0; i < 50; i++) {
            minha_musica.curtir();

        }
        System.out.println("A minha música com nome:" + minha_musica.getTitulo() + ",foi reproduzida :"+
                minha_musica.getTotalReproduções() + " e foi curtida por:" +minha_musica.getTotalCurtidas());
        // print sobre a música criada

        // Podcast criado e realização de teste
        Podcast novas_Historias = new Podcast();
        novas_Historias.setTitulo("NOVAS HISTÓRIAS ");
        novas_Historias.setApresentador("Pedro  Henrique de Almeida Santos ");
        novas_Historias.setDescricao("Pedro recebe convidados aonde eles debatem sobre diversos temas da atualidade");
        for (int i = 0; i < 25; i++) {
            novas_Historias.reproduz();

        }
        for (int i = 0; i < 100; i++) {
            novas_Historias.curtir();

        }
        MinhasPreferidas preferidas =new MinhasPreferidas();
        preferidas.inclui(novas_Historias);
        preferidas.inclui(minha_musica);
        System.out.println("-------------------------------------------");
        System.out.println(" FINALIZAÇÃO DO CURSO ALURA ");
        System.out.println("-------------------------------------------");
        System.out.println("Dados sobre o podcast ");
        System.out.println(" O podcast de nome : " + novas_Historias.getTitulo());
        System.out.println("tem como apresentador o : "+ novas_Historias.getApresentador());
        System.out.println("Descrição sobre o podcast : "+novas_Historias.getDescricao());;
        System.out.println(" Obteve os seguintes resultados : "+ novas_Historias.getTotalReproduções() + " de curtidas e "
       + novas_Historias.getTotalCurtidas() + " de curtidas" );
    }
}
