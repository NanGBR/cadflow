package com.mycompany.cadflow;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;

public class CadastrarAcolhidoController implements Initializable {

    @FXML
    private ComboBox<?> cmbBoxDadosEstado;

    @FXML
    private ComboBox<?> cmbBoxDadosSexo;

    @FXML
    private DatePicker dateAcolhimentoData;

    @FXML
    private DatePicker dateDadosNascimento;

    @FXML
    private DatePicker datePlanoFim;

    @FXML
    private DatePicker datePlanoInicio;

    @FXML
    private ImageView imgCadFlow;

    @FXML
    private TextField txtAcolhimentoContato;

    @FXML
    private TextField txtAcolhimentoDetalhes;

    @FXML
    private TextField txtAcolhimentoMotivo;

    @FXML
    private TextField txtAcolhimentoResidia;

    @FXML
    private TextField txtAcolhimentoResponsavel;

    @FXML
    private TextField txtDadosAvaliacao;

    @FXML
    private TextField txtDadosCor;

    @FXML
    private TextField txtDadosCpf;

    @FXML
    private TextField txtDadosEscolar;

    @FXML
    private TextField txtDadosHistoricoRua;

    @FXML
    private TextField txtDadosMedida;

    @FXML
    private TextField txtDadosNacionalidade;

    @FXML
    private TextField txtDadosNome;

    @FXML
    private TextField txtDadosNomeSocial;

    @FXML
    private TextField txtDadosRegistro;

    @FXML
    private TextField txtDadosSaude;

    @FXML
    private TextField txtDadosServicos;

    @FXML
    private TextField txtPlanoAcao;

    @FXML
    private TextField txtPlanoObjetivo;

    @FXML
    private TextField txtPlanoResponsaveis;

    @Override
    public void initialize(URL url, ResourceBundle rb) {

    }

}
