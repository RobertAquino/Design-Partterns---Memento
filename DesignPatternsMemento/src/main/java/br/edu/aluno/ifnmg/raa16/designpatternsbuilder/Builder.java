package br.edu.aluno.ifnmg.raa16.designpatternsbuilder;

public interface Builder {
    Builder setProcessador(String processador);
    Builder setMemoriaRam(int memoriaRam);
    Builder setArmazenamento(int armazenamento);
    Builder setSistemaOperacional(String sistemaOperacional);
    Builder setTemPlacaVideo(boolean temPlacaVideo);
    Computador build();
}