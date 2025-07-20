package br.edu.aluno.ifnmg.raa16.designpatternsbuilder;

public class Computador {
    private String processador;
    private int memoriaRam;
    private int armazenamento;
    private String sistemaOperacional;
    private boolean temPlacaVideo;

    private Computador() {}

    public String getProcessador() { return processador; }
    public int getMemoriaRam() { return memoriaRam; }
    public int getArmazenamento() { return armazenamento; }
    public String getSistemaOperacional() { return sistemaOperacional; }
    public boolean isTemPlacaVideo() { return temPlacaVideo; }

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

    public static class ComputadorBuilder implements Builder {
        private Computador computador = new Computador();

        @Override
        public ComputadorBuilder setProcessador(String processador) {
            computador.processador = processador;
            return this;
        }

        @Override
        public ComputadorBuilder setMemoriaRam(int memoriaRam) {
            computador.memoriaRam = memoriaRam;
            return this;
        }

        @Override
        public ComputadorBuilder setArmazenamento(int armazenamento) {
            computador.armazenamento = armazenamento;
            return this;
        }

        @Override
        public ComputadorBuilder setSistemaOperacional(String sistemaOperacional) {
            computador.sistemaOperacional = sistemaOperacional;
            return this;
        }

        @Override
        public ComputadorBuilder setTemPlacaVideo(boolean temPlacaVideo) {
            computador.temPlacaVideo = temPlacaVideo;
            return this;
        }

        @Override
        public Computador build() {
            if (computador.processador == null || computador.memoriaRam <= 0 || computador.armazenamento <= 0) {
                throw new IllegalStateException("Processador, RAM e armazenamento são obrigatórios!");
            }
            return computador;
        }
    }
}