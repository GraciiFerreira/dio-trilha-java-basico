import dispositivos.AparelhoTelefonico;
import dispositivos.NavegadorInternet;
import dispositivos.ReprodutorMusical;
import funcoes.MultiFuncoes;


public class Iphone {
    public static void main(String[] args) {
        MultiFuncoes multi = new MultiFuncoes();

        ReprodutorMusical musica = multi;
        musica.selecionarMusica();
        AparelhoTelefonico telefone = multi;
        telefone.ligar();
        NavegadorInternet internet = multi;
        internet.exibirPagina();
        
    };

}
