package br.com.alura.principal;

import br.com.alura.ScreenMatch.excecao.ErroDeConversaoDeanoException;
import br.com.alura.ScreenMatch.modelos.Titulo;
import br.com.alura.ScreenMatch.modelos.Tituloomdb;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrincipalcomBusca {
    public static void main(String[]args)  throws IOException, InterruptedException {
        Scanner leitura = new Scanner(System.in);
        String busca = "";
        List<Titulo> titulos = new ArrayList<>();
        Gson gson = new GsonBuilder().
                setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE).setPrettyPrinting()
        .create();
        while (!busca.equalsIgnoreCase("Encerrar ") ) {
            System.out.println("Digite o nome do Título que você deseja procurar ou digite Encerrar para encerrar o programa:");
            busca = leitura.nextLine();
            if(busca.equalsIgnoreCase("Encerrar")){
                System.out.println("O programa foi encerrado ");
                break;

            }
            String end = "http://www.omdbapi.com/?t=" + busca.replace(" ", "+") + "&apikey=43dbd051";
            try {
                HttpClient client = HttpClient.newHttpClient();
                HttpRequest request = HttpRequest.newBuilder()
                        .uri(URI.create(end))
                        .build();
                HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
                String json = response.body();
                System.out.println(json);


                Tituloomdb meutituloomdb = gson.fromJson(json, Tituloomdb.class);
                System.out.println(meutituloomdb);
                Titulo meuTitulo = new Titulo(meutituloomdb);
                System.out.println("titulo convertido ");
                System.out.println(meuTitulo);


                titulos.add(meuTitulo);
            } catch (NumberFormatException e) {
                System.out.println("Aconteceu um erro");
                System.out.println(e.getMessage());
            } catch (IllegalArgumentException a) {
                System.out.println("Aconteceu erro de busca na argumentação, verifique a busca");
                System.out.println(a.getMessage());
            } catch (ErroDeConversaoDeanoException e) {
                System.out.println(e.getMessage());

            }
        }
        System.out.println("A lista de filmes é :" + titulos);
        FileWriter escrita = new FileWriter("filmes.json");
        escrita.write(gson.toJson(titulos));
        escrita.close();
        leitura.close();

        System.out.println("O PROGRAMA FINALIZOU CORRETAMENTE "); // identaçao ctrl alt i
        // error a máquina não consegue rodar
        // Excepetion, posso prever
    }



}
