package br.dio.desafio;

import java.time.LocalDate;

import br.dio.desafio.dominio.BootCamp;
import br.dio.desafio.dominio.Curso;
import br.dio.desafio.dominio.Dev;
import br.dio.desafio.dominio.Mentoria;

public class Main {
    public static void main(String[] args) {
        Curso curso = new Curso();
        curso.setCargaHoraria(10);
        curso.setDescricao("Estudos de POO em Java");
        curso.setTitulo("POO");
        Curso curso2 = new Curso();
        curso2.setCargaHoraria(10);
        curso2.setDescricao("Estudos de JavaScript");
        curso2.setTitulo("JavaScript");

        Mentoria mentoria = new Mentoria();
        mentoria.setData(LocalDate.now());
        mentoria.setDescricao("Mentoria de POO em Java");
        mentoria.setTitulo("Mentoria Java POO");

        BootCamp bootcamp = new BootCamp();
        bootcamp.setNome("BootCamp Java Developer");
        bootcamp.setDescricao("Descrição java Developer");
        bootcamp.getConteudos().add(curso);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devRafael = new Dev();
        devRafael.setNome("Rafael Adolfo");
        devRafael.inscreverBootcamp(bootcamp);

        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.inscreverBootcamp(bootcamp);

        System.out.println("-----------------------------------");

        System.out.println("Conteudos inscritos Rafael: " + devRafael.getConteudosInscritos());
        System.out.println("Conteudos inscritos Camila: " + devCamila.getConteudosInscritos());
        System.out.println("XP Rafael:" + devRafael.calcularTotalXP());
        System.out.println("XP Camila:" + devCamila.calcularTotalXP());

        System.out.println("-----------------------------------");

        devRafael.prosseguir();
        devRafael.prosseguir();
        devRafael.prosseguir();
        devCamila.prosseguir();
        devCamila.prosseguir();

        System.out.println("Conteudos inscritos Camila: " + devCamila.getConteudosInscritos());
        System.out.println("Conteudos inscritos Rafael: " + devRafael.getConteudosInscritos());

        System.out.println("-----------------------------------");

        System.out.println("Conteudos Concluidos Rafael: " + devRafael.getConteudosConcluidos());
        System.out.println("Conteudos Concluidos Camila: " + devCamila.getConteudosConcluidos());

        System.out.println("XP Rafael:" + devRafael.calcularTotalXP());
        System.out.println("XP Camila:" + devCamila.calcularTotalXP());

        System.out.println("-----------------------------------");

    }
}
