/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.aluno.ifnmg.raa16.designpatternsbuilder;

/**
 *
 * @author robert
 */
public class DesignPatternsBuilder {

    public static void main(String[] args) {
        // Criar um computador básico
        Computador pcBasico = new Computador.ComputadorBuilder()
                .setProcessador("Intel i3")
                .setMemoriaRam(8)
                .setArmazenamento(256)
                .build();

        System.out.println("PC Básico: " + pcBasico);

        // Criar um computador avançado com opções
        Computador pcAvancado = new Computador.ComputadorBuilder()
                .setProcessador("AMD Ryzen 7")
                .setMemoriaRam(16)
                .setArmazenamento(1000)
                .setSistemaOperacional("Windows 11")
                .setTemPlacaVideo(true)
                .build();

        System.out.println("PC Avançado: " + pcAvancado);

        // Tentativa de criar sem atributos obrigatórios (gerará exceção)
        try {
            Computador pcInvalido = new Computador.ComputadorBuilder()
                    .setMemoriaRam(4)
                    .build(); // Faltou processador e armazenamento
        } catch (IllegalStateException e) {
            System.out.println("Erro: " + e.getMessage());
        }

        // Usar o Diretor para criar um PC Gamer
        Computador pcGamer = new DiretorConstrucao().construirPcGamer(new Computador.ComputadorBuilder());
        System.out.println("PC Gamer: " + pcGamer);
    }
}
