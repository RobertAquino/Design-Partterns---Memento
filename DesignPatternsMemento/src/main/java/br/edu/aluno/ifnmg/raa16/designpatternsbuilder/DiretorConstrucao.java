package br.edu.aluno.ifnmg.raa16.designpatternsbuilder;

public class DiretorConstrucao {
    public Computador construirPcGamer(Builder builder) {
        return builder.setProcessador("Intel i9")
                      .setMemoriaRam(32)
                      .setArmazenamento(2000)
                      .setSistemaOperacional("Linux")
                      .setTemPlacaVideo(true)
                      .build();
    }
}