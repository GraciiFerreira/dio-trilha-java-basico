package dominio;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        
    Curso curso1 = new Curso();
    curso1.setTitulo("Curso Java");
    curso1.setDescricao("Curso de Java");
    curso1.setCargaHoraria(8);

    Curso curso2 = new Curso();
    curso2.setTitulo("Curso JavaScript");
    curso2.setDescricao("Curso de JS");
    curso2.setCargaHoraria(10); 

    Mentoria mentoria = new Mentoria();
    mentoria.setTitulo("Mentoria do curso de java");
    mentoria.setDescricao("Mentoria em Java");
    mentoria.setData(LocalDate.now());

    Bootcamp bootcamp = new Bootcamp();
    bootcamp.setNome("Bootcamp Java Developer");
    bootcamp.setDescricao("Descrição Bootcamp Java");
    bootcamp.getConteudos().add(mentoria);
    bootcamp.getConteudos().add(curso1);
    bootcamp.getConteudos().add(curso2);

    Dev developer = new Dev();
    developer.setNome("Camila");
    developer.inscreverBootcamp(bootcamp);
    System.out.println("Conteúdos Inscritos" + developer.getConteudosInscritos());
    developer.progredir();
    developer.progredir();
    System.out.println("Conteudos Inscritos Camila: " + developer.getConteudosInscritos());
    System.out.println("Conteudos concluidos Camila: " + developer.getConteudosConcluidos());
    System.out.println("XP:" + developer.calcularTotalXP());
}
}
