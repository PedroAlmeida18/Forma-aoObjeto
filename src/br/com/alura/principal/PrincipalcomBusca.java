package br.com.alura.principal;

import br.com.alura.ScreenMatch.modelos.Titulo;
import br.com.alura.ScreenMatch.modelos.Tituloomdb;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class PrincipalcomBusca {
    public static void main(String[]args)  throws IOException, InterruptedException {
        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite o nome do Título que você deseja procurar:");
        var busca = leitura.nextLine();
        String end = "http://www.omdbapi.com/?t="+busca+ "&apikey=43dbd051";
        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(end))
                .build();
        HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
        String json = response.body();
        System.out.println(json);
        Gson gson = new GsonBuilder().
                setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE).create();

        Tituloomdb meutituloomdb = gson.fromJson(json,Tituloomdb.class);
        System.out.println(meutituloomdb);
        try{
            Titulo meuTitulo = new Titulo(meutituloomdb);
            System.out.println("titulo convertido ");
            System.out.println(meuTitulo);
        } catch (NumberFormatException e ){
            System.out.println("Aconteceu um erro");
            System.out.println(e.getMessage());
        }
        System.out.println("O PROGRAMA FINALIZOU CORRETAMENTE ");
    }


}
