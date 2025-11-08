package model.classes;

import java.time.LocalDate; // Importe LocalDate para o DatePicker
import java.util.List;

/**
 * Classe principal que representa o Acolhido.
 * Esta classe agora reflete todos os campos da tela CadastrarAcolhido.fxml
 */
public class Acolhido {

    // --- Identificação ---
    private int idAcolhido;

    // --- Aba: Dados Pessoais ---
    private String nome;
    private String nomeSocial;
    private String cpf;
    private String infoSaude;
    private String infoEscolar;
    private String registroCartorio;
    private String servicosAcessados;
    private LocalDate dataNascimento; // Alterado de Date para LocalDate
    private String sexo; // Alterado de char para String (melhor para ComboBox)
    private String estadoCivil; // Assumindo que cmbBoxDadosEstado é "Estado Civil"
    private String cor;
    private String medidaProtetiva;
    private String historicoRua;
    private String nacionalidade;
    private String avaliacaoInterdisciplinar;

    // --- Aba: Dados Familiares ---
    // (Esta aba deve ser preenchida com uma lista de objetos Familiares)
    private List<Familiar> familiares;

    // --- Aba: Acolhimento ---
    // (Esta aba é representada pelo objeto Acolhimento)
    private Acolhimento acolhimento;

    // --- Aba: Plano de Ação ---
    // (Esta aba é representada pelo objeto PlanoAcao)
    private PlanoAcao planoAcao;

    // --- Construtor Padrão ---
    public Acolhido() {
    }

    // --- Getters e Setters (Para todos os campos) ---

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

    public String getInfoSaude() {
        return infoSaude;
    }

    public void setInfoSaude(String infoSaude) {
        this.infoSaude = infoSaude;
    }

    public String getInfoEscolar() {
        return infoEscolar;
    }

    public void setInfoEscolar(String infoEscolar) {
        this.infoEscolar = infoEscolar;
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

    public String getHistoricoRua() {
        return historicoRua;
    }

    public void setHistoricoRua(String historicoRua) {
        this.historicoRua = historicoRua;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public String getAvaliacaoInterdisciplinar() {
        return avaliacaoInterdisciplinar;
    }

    public void setAvaliacaoInterdisciplinar(String avaliacaoInterdisciplinar) {
        this.avaliacaoInterdisciplinar = avaliacaoInterdisciplinar;
    }

    public List<Familiar> getFamiliares() {
        return familiares;
    }

    public void setFamiliares(List<Familiar> familiares) {
        this.familiares = familiares;
    }

    public Acolhimento getAcolhimento() {
        return acolhimento;
    }

    public void setAcolhimento(Acolhimento acolhimento) {
        this.acolhimento = acolhimento;
    }

    public PlanoAcao getPlanoAcao() {
        return planoAcao;
    }

    public void setPlanoAcao(PlanoAcao planoAcao) {
        this.planoAcao = planoAcao;
    }

    @Override
    public String toString() {
        return "Acolhido{" + "idAcolhido=" + idAcolhido + ", nome=" + nome + ", nomeSocial=" + nomeSocial + '}';
    }
}