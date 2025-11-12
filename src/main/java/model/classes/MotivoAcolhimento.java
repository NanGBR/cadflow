/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.classes;

/**
 *
 * @author Alysson
 */
public class MotivoAcolhimento {
    private String descricao;

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public MotivoAcolhimento(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return "MotivoAcolhimento{" + "descricao=" + descricao + '}';
    }
}
