package tecnologias;

import dispositivos.AparelhoTelefonico;

public class Telefone implements AparelhoTelefonico{

    public void ligar() {
        System.out.println("Ligando");
    }

    public void atender() {
        System.out.println("Atender");
    }

    public void IniciarCorreioVoz() {
       System.out.println("Enviando para Correio de voz");
    }
    
}
