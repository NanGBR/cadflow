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
public class PlanoAcao {
    private String objetivo;
    private String acoes;
    private String responsavel;
    private Date prazoInicio;
    private Date prazoFim;
    private String Status;

    public String getObjetivo() {
        return objetivo;
    }

    public void setObjetivo(String objetivo) {
        this.objetivo = objetivo;
    }

    public String getAcoes() {
        return acoes;
    }

    public void setAcoes(String acoes) {
        this.acoes = acoes;
    }

    public String getResponsavel() {
        return responsavel;
    }

    public void setResponsavel(String responsavel) {
        this.responsavel = responsavel;
    }

    public Date getPrazoInicio() {
        return prazoInicio;
    }

    public void setPrazoInicio(Date prazoInicio) {
        this.prazoInicio = prazoInicio;
    }

    public Date getPrazoFim() {
        return prazoFim;
    }

    public void setPrazoFim(Date prazoFim) {
        this.prazoFim = prazoFim;
    }

    public String getStatus() {
        return Status;
    }

    public void setStatus(String Status) {
        this.Status = Status;
    }

    public PlanoAcao(String objetivo, String acoes, String responsavel, Date prazoInicio, Date prazoFim, String Status) {
        this.objetivo = objetivo;
        this.acoes = acoes;
        this.responsavel = responsavel;
        this.prazoInicio = prazoInicio;
        this.prazoFim = prazoFim;
        this.Status = Status;
    }

    @Override
    public String toString() {
        return "PlanoAcao{" + "objetivo=" + objetivo + ", acoes=" + acoes + ", responsavel=" + responsavel + ", prazoInicio=" + prazoInicio + ", prazoFim=" + prazoFim + ", Status=" + Status + '}';
    }
}
