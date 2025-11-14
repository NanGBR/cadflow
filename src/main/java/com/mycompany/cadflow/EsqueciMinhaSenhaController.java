package com.mycompany.cadflow;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;

public class EsqueciMinhaSenhaController implements Initializable {

    @FXML
    private Button btnSalvarNovaSenha;

    @FXML
    private TextField txtNovaSenha;

    @FXML
    private TextField txtSenhaUsuarioAdm;

    @FXML
    private TextField txtUsuarioRecuperar;
    
    @FXML
    private ImageView imgCadFlow;

    @Override
    public void initialize(URL url, ResourceBundle rb) {

    }

}
