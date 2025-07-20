/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.aluno.ifnmg.raa16.designpatternsmemento;

import java.util.ArrayList;
/**
 *
 * @author robert
 */
import java.util.ArrayList;

public class Caretaker {
    private ArrayList<Memento> estados = new ArrayList<>();

    public void adicionarMemento(Memento memento) {
        estados.add(memento);
    }

    public Memento getUltimoMemento() {
        if (!estados.isEmpty()) {
            return estados.remove(estados.size() - 1);
        }
        return null;
    }
}