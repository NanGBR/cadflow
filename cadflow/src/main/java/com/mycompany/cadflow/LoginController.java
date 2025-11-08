package com.mycompany.cadflow;

import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import model.services.LoginService;

import javafx.animation.PauseTransition;
import javafx.util.Duration;

public class LoginController implements Initializable {

    @FXML
    private Button btnLogin;

    @FXML
    private Label txtCadastroNovoAcolhedor;

    @FXML
    private Label txtEsqueciMinhaSenha;

    @FXML
    private PasswordField PasswordLoginSenha;

    @FXML
    private TextField txtLoginUsuario;

    @FXML
    private ImageView imgCadFlow;

    @FXML
    private Label statusLabel;

    private LoginService authService;

    @Override
    public void initialize(URL url, ResourceBundle rb) {

        this.authService = new LoginService();

        btnLogin.setOnAction((ActionEvent t) -> {

            String username = txtLoginUsuario.getText();
            String password = PasswordLoginSenha.getText();

            if (username.isEmpty() || password.isEmpty()) {
                statusLabel.setText("Usuário e senha são obrigatórios.");
                return;
            }

            try {
                boolean isValid = authService.validateUser(username, password);

                if (isValid) {
                    btnLogin.setDisable(true);
                    statusLabel.setText("Login bem-sucedido!");
                    statusLabel.setTextFill(javafx.scene.paint.Color.GREEN);

                    PauseTransition pause = new PauseTransition(Duration.seconds(1));

                    pause.setOnFinished(e -> {
                        try {
                            loadMainScene();
                        } catch (IOException ioException) {
                            ioException.printStackTrace();
                            statusLabel.setText("Erro ao carregar a tela.");
                        }
                    });

                    pause.play();

                } else {
                    // FALHA (usuário ou senha errados)
                    statusLabel.setText("Usuário ou senha inválidos.");
                    PasswordLoginSenha.clear(); // Limpa o campo da senha
                }

            } catch (SQLException e) {
                // Erro de banco de dados
                statusLabel.setText("Erro ao conectar com o banco. Tente novamente.");
                e.printStackTrace();
            }

        });

    }

    private void loadMainScene() throws IOException {
        Stage stage = (Stage) btnLogin.getScene().getWindow();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("Principal.fxml"));
        Parent root = loader.load();

        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.setTitle("Painel Principal - CadFlow");
        stage.centerOnScreen();
    }
}
