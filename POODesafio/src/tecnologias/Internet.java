package tecnologias;

import dispositivos.NavegadorInternet;

public class Internet implements NavegadorInternet{
        public void exibirPagina(){
            System.out.println("Exibindo pagina");
        }

       
        public void adicionarNovaPagina() {
            System.out.println("Adicionando nova página");
        }

        
        public void atualizarPagina() {
            System.out.println("Atualizando página");
        }

    
}
