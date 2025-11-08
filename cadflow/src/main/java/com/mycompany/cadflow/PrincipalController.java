/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package com.mycompany.cadflow;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
import javafx.stage.Modality;
import javafx.stage.Stage;
import model.classes.Acolhido;
import javafx.scene.control.TableView;

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
    private TableView<Acolhido> tableViewAcolhidos;

    @FXML
    private TableColumn<Acolhido, Integer> tableViewAcolhidosCodigo;

    @FXML
    private TableColumn<Acolhido, String> tableViewAcolhidosNome;

    @FXML
    private Label txtTelaPrincipalCadFlow;

    @Override
    public void initialize(URL url, ResourceBundle rb) {

        btnCadastroPessoa.setOnAction((t) -> {
            try {
                Parent parent = FXMLLoader.load(getClass().getResource("CadastrarAcolhido.fxml"));
                Scene scene = new Scene(parent);
                Stage stage = new Stage();
                stage.setTitle("CadastrarAcolhido.fxml");
                stage.setScene(scene);
                stage.show();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        });

        btnFicha.setOnAction((t) -> {
            try {
                Parent parent = FXMLLoader.load(getClass().getResource("DadosAcolhidos.fxml"));
                Scene scene = new Scene(parent);
                Stage stage = new Stage();
                stage.setTitle("DadosAcolhidos.fxml");
                stage.setScene(scene);
                stage.show();
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        });

//        btnImprimir.setOnAction((t) -> {
//            try {
//
//            } catch (IOException ex) {
//                ex.printStackTrace();
//            }
//        });

        EventHandler<MouseEvent> cliqueMouse = new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent t) {
                if (t.getButton().equals(MouseButton.PRIMARY)) {
                    if (t.getClickCount() == 2 && tableViewAcolhidos.getSelectionModel().getSelectedItem() != null) {
                        Acolhido acolhidoSelecionado = tableViewAcolhidos.getSelectionModel().getSelectedItem();

                        try {
                            FXMLLoader loader = new FXMLLoader(getClass().getResource("CadastrarAcolhido.fxml"));
                            Scene scene = new Scene(loader.load());
                            CadastrarAcolhidoController cont = loader.getController();
                            cont.setAcolhido(acolhidoSelecionado);
                            Stage stage = new Stage();
                            stage.setTitle("Editar Acolhido");
                            stage.setScene(scene);
                            stage.initOwner(tableViewAcolhidos.getScene().getWindow());
                            stage.initModality(Modality.WINDOW_MODAL);
                            stage.showAndWait();
                            // atualizarTabela();
                        } catch (IOException ex) {
                            ex.printStackTrace();
                        }
                    }
                }
            }
        };

        tableViewAcolhidos.setOnMouseClicked(cliqueMouse);   

//        btnExcluir.setOnAction((t) -> {
//            if (tableViewBem.getSelectionModel().getSelectedItem() != null) {
//                Acolhido acolhido = tableViewBem.getSelectionModel().getSelectedItem();
//                Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
//                alert.setTitle("Confirmação");
//                alert.setHeaderText(null);
//                alert.setContentText(bem.getNome() + " será excluido! Tem certeza?");
//                if (alert.showAndWait().get() == ButtonType.OK) {
//                    if (new BemServices().excluir(bem)) {
//                        Alert mens = new Alert(Alert.AlertType.INFORMATION);
//                        mens.setTitle("Excluído");
//                        mens.setHeaderText(null);
//                        mens.setContentText("Registro excluído!");
//                        mens.showAndWait();
//                    }
//                }
//            }
//        });
    }
}
