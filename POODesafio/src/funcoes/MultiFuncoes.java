package funcoes;

import dispositivos.AparelhoTelefonico;
import dispositivos.NavegadorInternet;
import dispositivos.ReprodutorMusical;

public class MultiFuncoes implements AparelhoTelefonico, NavegadorInternet, ReprodutorMusical{

    public void ligar() {
        System.out.println("Ligando via Multifunçoes");
    }

    public void atender() {
        System.out.println("Atender via Multifunçoes");
    }

    public void IniciarCorreioVoz() {
       System.out.println("Enviando para Correio de voz via Multifunçoes");
    }

    public void exibirPagina(){
        System.out.println("Exibindo pagina via Multifunçoes");
    }
   
    public void adicionarNovaPagina() {
        System.out.println("Adicionando nova página via Multifunçoes");
    }

    
    public void atualizarPagina() {
        System.out.println("Atualizando página via Multifunçoes");
    }

    public void selecionarMusica() {
        System.out.println("Selicionando música via Multifunçoes");
     }
 
     public void tocar() {
        System.out.println("Tocando música via Multifunçoes");
     }
 
     public void pausar() {
         System.out.println("Pausando música via Multifunçoes");
     }
     
    
}