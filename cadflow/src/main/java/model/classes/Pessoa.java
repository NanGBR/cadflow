package model.classes;

import java.time.LocalDate; // Importe LocalDate para o DatePicker
import java.util.List;

/**
 * Classe principal que representa o Acolhido.
 * Esta classe agora reflete todos os campos da tela CadastrarAcolhido.fxml
 */
public class Pessoa {

    // --- Identificação ---
    private int idPessoa;

    // --- Aba: Dados Pessoais ---
    private String nome;
    private String nomeSocial;
    private String cpf;
    private String registroCartorio;
    private String servicosAcessados;
    private LocalDate dataNascimento;
    private String sexo;
    private String estadoCivil;
    private String cor;
    private String medidaProtetiva;
    private String nacionalidade;
    private String naturalidade;
    private String escolaridade;
    private String profissao;
    private String especificidades;
    private String beneficios;
    private int acolhido;

    public Pessoa() {
    }

    public Pessoa(int idPessoa, String nome, int acolhido) {
        this.idPessoa = idPessoa;
        this.nome = nome;
        this.acolhido = acolhido;
    }

    // --- Getters e Setters (Para todos os campos) ---

    public int getIdPessoa() {
        return idPessoa;
    }

    public void setIdPessoa(int idPessoa) {
        this.idPessoa = idPessoa;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    

    public String getNomeSocial() {
        return nomeSocial;
    }

    public void setNomeSocial(String nomeSocial) {
        this.nomeSocial = nomeSocial;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRegistroCartorio() {
        return registroCartorio;
    }

    public void setRegistroCartorio(String registroCartorio) {
        this.registroCartorio = registroCartorio;
    }

    public String getServicosAcessados() {
        return servicosAcessados;
    }

    public void setServicosAcessados(String servicosAcessados) {
        this.servicosAcessados = servicosAcessados;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getMedidaProtetiva() {
        return medidaProtetiva;
    }

    public void setMedidaProtetiva(String medidaProtetiva) {
        this.medidaProtetiva = medidaProtetiva;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public String getNaturalidade() {
        return naturalidade;
    }

    public void setNaturalidade(String naturalidade) {
        this.naturalidade = naturalidade;
    }

    public String getEscolaridade() {
        return escolaridade;
    }

    public void setEscolaridade(String escolaridade) {
        this.escolaridade = escolaridade;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    public String getEspecificidades() {
        return especificidades;
    }

    public void setEspecificidades(String especificidades) {
        this.especificidades = especificidades;
    }

    public String getBeneficios() {
        return beneficios;
    }

    public void setBeneficios(String beneficios) {
        this.beneficios = beneficios;
    }

    public int getAcolhido() {
        return acolhido;
    }

    public void setAcolhido(int acolhido) {
        this.acolhido = acolhido;
    }

    @Override
    public String toString() {
        return "Pessoa{" + "idPessoa=" + idPessoa + ", nome=" + nome + ", nomeSocial=" + nomeSocial + ", cpf=" + cpf + ", registroCartorio=" + registroCartorio + ", servicosAcessados=" + servicosAcessados + ", dataNascimento=" + dataNascimento + ", sexo=" + sexo + ", estadoCivil=" + estadoCivil + ", cor=" + cor + ", medidaProtetiva=" + medidaProtetiva + ", nacionalidade=" + nacionalidade + ", naturalidade=" + naturalidade + ", escolaridade=" + escolaridade + ", profissao=" + profissao + ", especificidades=" + especificidades + ", beneficios=" + beneficios + ", acolhido=" + acolhido + '}';
    }
}