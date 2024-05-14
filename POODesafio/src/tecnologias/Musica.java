package tecnologias;

import dispositivos.ReprodutorMusical;

public class Musica implements ReprodutorMusical{

    public void selecionarMusica() {
       System.out.println("Selicionando música");
    }

    public void tocar() {
       System.out.println("Tocando música");
    }

    public void pausar() {
        System.out.println("Pausando música");
    }
    
}
