package com.mycompany.cadflow;

import java.net.URL;
import java.util.ResourceBundle;

import com.mycompany.cadflow.services.SceneService;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;

public class LoginController implements Initializable {

    @FXML
    private Button btnLogin;

    @FXML
    private Label txtCadastroNovoAcolhedor;

    @FXML
    private Label txtEsqueciMinhaSenha;

    @FXML
    private TextField txtLoginSenha;

    @FXML
    private TextField txtLoginUsuario;
    
    @FXML
    private ImageView imgCadFlow;

    @Override
    public void initialize(URL url, ResourceBundle rb) {

    }

    @FXML
    private void realizarLogin() {
        SceneService.show("Principal");
    }

}
