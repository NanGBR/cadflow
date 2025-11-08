package com.mycompany.cadflow;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import model.classes.Acolhido;

public class CadastroAcolhedorController implements Initializable {
    
    @FXML
    private Button btnNovoUsuario;

    @FXML
    private TextField txtNovoUsuario;

    @FXML
    private TextField txtSenhaNovoUsuario;

    @FXML
    private TextField txtSenhaUsuarioAdm;
    
    @FXML
    private ImageView imgCadFlow;

    @Override
    public void initialize(URL url, ResourceBundle rb) {

    }
}
