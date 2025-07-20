/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.aluno.ifnmg.raa16.designpatternsmemento;

/**
 *
 * @author robert
 */
public class Memento {
    private final String texto;
    private final int cursorPosicao;

    public Memento(String texto, int cursorPosicao) {
        this.texto = texto;
        this.cursorPosicao = cursorPosicao;
    }

    protected String getTexto() {
        return texto;
    }

    protected int getCursorPosicao() {
        return cursorPosicao;
    }
}