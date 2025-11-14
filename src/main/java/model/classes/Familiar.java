/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.classes;

/**
 *
 * @author Alysson
 */
public class Familiar {
    private String nome;
    private String parentesco;
    private int idade;
    private String ocupacao;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getParentesco() {
        return parentesco;
    }

    public void setParentesco(String parentesco) {
        this.parentesco = parentesco;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getOcupacao() {
        return ocupacao;
    }

    public void setOcupacao(String ocupacao) {
        this.ocupacao = ocupacao;
    }

    public Familiar(String nome, String parentesco, int idade, String ocupacao) {
        this.nome = nome;
        this.parentesco = parentesco;
        this.idade = idade;
        this.ocupacao = ocupacao;
    }

    @Override
    public String toString() {
        return "Familiar{" + "nome=" + nome + ", parentesco=" + parentesco + ", idade=" + idade + ", ocupacao=" + ocupacao + '}';
    }
}
