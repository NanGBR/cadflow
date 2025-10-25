package model.classes;

import java.util.Date;

public class Acolhido {
    private int idAcolhido;
    private String nome;
    private Date dataNascimento;
    private char sexo;
    private String cor;
    private String planoDeAcao;
    private String infoSaude;

    public int getIdAcolhido() {
        return idAcolhido;
    }

    public void setIdAcolhido(int idAcolhido) {
        this.idAcolhido = idAcolhido;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getPlanoDeAcao() {
        return planoDeAcao;
    }

    public void setPlanoDeAcao(String planoDeAcao) {
        this.planoDeAcao = planoDeAcao;
    }

    public String getInfoSaude() {
        return infoSaude;
    }

    public void setInfoSaude(String infoSaude) {
        this.infoSaude = infoSaude;
    }

    public Acolhido(int idAcolhido, String nome, Date dataNascimento, char sexo, String cor, String planoDeAcao, String infoSaude) {
        this.idAcolhido = idAcolhido;
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.sexo = sexo;
        this.cor = cor;
        this.planoDeAcao = planoDeAcao;
        this.infoSaude = infoSaude;
    }

    @Override
    public String toString() {
        return "Acolhido{" + "idAcolhido=" + idAcolhido + ", nome=" + nome + ", dataNascimento=" + dataNascimento + ", sexo=" + sexo + ", cor=" + cor + ", planoDeAcao=" + planoDeAcao + ", infoSaude=" + infoSaude + '}';
    }
}
