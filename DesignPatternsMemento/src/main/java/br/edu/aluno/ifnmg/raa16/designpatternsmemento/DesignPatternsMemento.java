/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package br.edu.aluno.ifnmg.raa16.designpatternsmemento;

/**
 *
 * @author robert
 */
public class DesignPatternsMemento {

    public static void main(String[] args) {
        EditorTexto editor = new EditorTexto();
        Caretaker caretaker = new Caretaker();

        System.out.println("Estado inicial: " + editor);
        editor.escrever("Olá, ");
        caretaker.adicionarMemento(editor.salvarEstado());
        System.out.println("Após 'Olá, ': " + editor);
        editor.escrever("mundo!");
        System.out.println("Após 'mundo!': " + editor);
        editor.restaurarEstado(caretaker.getUltimoMemento());
        System.out.println("Após desfazer: " + editor);
    }
}
