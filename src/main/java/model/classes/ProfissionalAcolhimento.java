/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.classes;

/**
 *
 * @author Alysson
 */
public class ProfissionalAcolhimento {
    private int idProfissional;
    private String nome;
    private String cargo;

    public int getIdProfissional() {
        return idProfissional;
    }

    public void setIdProfissional(int idProfissional) {
        this.idProfissional = idProfissional;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public ProfissionalAcolhimento(int idProfissional, String nome, String cargo) {
        this.idProfissional = idProfissional;
        this.nome = nome;
        this.cargo = cargo;
    }

    @Override
    public String toString() {
        return "ProfissionalAcolhimento{" + "idProfissional=" + idProfissional + ", nome=" + nome + ", cargo=" + cargo + '}';
    }
}
