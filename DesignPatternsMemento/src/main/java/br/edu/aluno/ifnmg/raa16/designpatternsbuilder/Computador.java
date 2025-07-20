/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.aluno.ifnmg.raa16.designpatternsbuilder;

public class Computador {
    // Atributos privados (estado do produto)
    private String processador; // Obrigatório
    private int memoriaRam;     // Obrigatório
    private int armazenamento;  // Obrigatório
    private String sistemaOperacional; // Opcional
    private boolean temPlacaVideo;     // Opcional

    // Construtor privado para forçar uso do Builder
    private Computador() {}

    // Getters (somente leitura após construção)
    public String getProcessador() { return processador; }
    public int getMemoriaRam() { return memoriaRam; }
    public int getArmazenamento() { return armazenamento; }
    public String getSistemaOperacional() { return sistemaOperacional; }
    public boolean isTemPlacaVideo() { return temPlacaVideo; }

    // Método toString para representação textual
    @Override
    public String toString() {
        return "Computador{" +
               "processador='" + processador + '\'' +
               ", memoriaRam=" + memoriaRam + "GB" +
               ", armazenamento=" + armazenamento + "GB" +
               ", sistemaOperacional='" + sistemaOperacional + '\'' +
               ", temPlacaVideo=" + temPlacaVideo +
               '}';
    }

    // Classe Builder aninhada (relacionamento de composição)
    public static class ComputadorBuilder {
        private Computador computador = new Computador(); // Instância do produto sendo construído

        // Métodos para configurar atributos (encadeáveis)
        public ComputadorBuilder setProcessador(String processador) {
            computador.processador = processador;
            return this;
        }

        public ComputadorBuilder setMemoriaRam(int memoriaRam) {
            computador.memoriaRam = memoriaRam;
            return this;
        }

        public ComputadorBuilder setArmazenamento(int armazenamento) {
            computador.armazenamento = armazenamento;
            return this;
        }

        public ComputadorBuilder setSistemaOperacional(String sistemaOperacional) {
            computador.sistemaOperacional = sistemaOperacional;
            return this;
        }

        public ComputadorBuilder setTemPlacaVideo(boolean temPlacaVideo) {
            computador.temPlacaVideo = temPlacaVideo;
            return this;
        }

        // Método final que retorna o produto construído
        public Computador build() {
            if (computador.processador == null || computador.memoriaRam <= 0 || computador.armazenamento <= 0) {
                throw new IllegalStateException("Processador, RAM e armazenamento são obrigatórios!");
            }
            return computador;
        }
    }
}