/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package com.mycompany.cadflow;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.image.ImageView;
    //teste
/**
 * FXML Controller class
 *
 * @author Alysson
 */
public class PrincipalController implements Initializable {

    @FXML
    private Button btnCadastroPessoa;

    @FXML
    private Button btnEditar;

    @FXML
    private Button btnExcluir;

    @FXML
    private Button btnFicha;

    @FXML
    private Button btnImprimir;

    @FXML
    private ImageView imgCadFlow;

    @FXML
    private TableColumn<?, ?> tableViewAcolhidosCodigo;

    @FXML
    private TableColumn<?, ?> tableViewAcolhidosNome;

    @FXML
    private Label txtTelaPrincipalCadFlow;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
