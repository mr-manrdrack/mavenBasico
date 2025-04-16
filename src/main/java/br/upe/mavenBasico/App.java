package br.upe.mavenBasico;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args){
        String[] resultado = ResultadoMegaCena.obtemUltimoResultado();
        for (String dezena: resultado) {
        System.out.print(dezena + " ");
    }
}
}
