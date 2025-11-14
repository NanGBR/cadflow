/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model.classes;

import java.util.Date;

/**
 *
 * @author Alysson
 */
public class Acolhimento {
    private Date dataAcolhimento;
    private String responsavel;
    private String detalhes;
    private String motivo;

    public Date getDataAcolhimento() {
        return dataAcolhimento;
    }

    public void setDataAcolhimento(Date dataAcolhimento) {
        this.dataAcolhimento = dataAcolhimento;
    }

    public String getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(String responsavel) {
        this.responsavel = responsavel;
    }

    public String getDetalhes() {
        return detalhes;
    }

    public void setDetalhes(String detalhes) {
        this.detalhes = detalhes;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public Acolhimento(Date dataAcolhimento, String responsavel, String detalhes, String motivo) {
        this.dataAcolhimento = dataAcolhimento;
        this.responsavel = responsavel;
        this.detalhes = detalhes;
        this.motivo = motivo;
    }

    @Override
    public String toString() {
        return "Acolhimento{" + "dataAcolhimento=" + dataAcolhimento + ", responsavel=" + responsavel + ", detalhes=" + detalhes + ", motivo=" + motivo + '}';
    }
}
