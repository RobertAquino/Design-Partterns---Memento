/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.aluno.ifnmg.raa16.designpatternsbuilder;

/**
 *
 * @author robert
 */
public class DiretorConstrucao {
    // Método que define a sequência de construção
    public Computador construirPcGamer(Computador.ComputadorBuilder builder) {
        return builder.setProcessador("Intel i9")
                .setMemoriaRam(32)
                .setArmazenamento(2000)
                .setSistemaOperacional("Linux")
                .setTemPlacaVideo(true)
                .build();
    }
}

