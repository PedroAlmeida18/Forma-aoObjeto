package br.com.alura.ScreenMatch.excecao;

public class ErroDeConversaoDeanoException extends RuntimeException{
    private String mensagem ;
    public ErroDeConversaoDeanoException(String mensagem) {
        this.mensagem = mensagem;

    }

    public String getMessage() {
        return this.mensagem;
    }
}
