/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.aluno.ifnmg.raa16.designpatternsmemento;

public class EditorTexto {
    private String texto;
    private int cursorPosicao;

    public EditorTexto() {
        this.texto = "";
        this.cursorPosicao = 0;
    }

    public void escrever(String novoTexto) {
        this.texto += novoTexto;
        this.cursorPosicao += novoTexto.length();
    }

    public void moverCursor(int posicao) {
        if (posicao >= 0 && posicao <= texto.length()) {
            this.cursorPosicao = posicao;
        }
    }

    public Memento salvarEstado() {
        return new Memento(texto, cursorPosicao);
    }

    public void restaurarEstado(Memento memento) {
        this.texto = memento.getTexto();
        this.cursorPosicao = memento.getCursorPosicao();
    }

    @Override
    public String toString() {
        return "Texto: '" + texto + "', Cursor na posição: " + cursorPosicao;
    }
}