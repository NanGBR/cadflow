package com.mycompany.cadflow;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.image.ImageView;

public class ListaAcolhidosController implements Initializable {

    @FXML
    private TableView<?> tableViewAcolhidos;

    @FXML
    private TableColumn<?, ?> tableViewAcolhidosCodigo;

    @FXML
    private TableColumn<?, ?> tableViewAcolhidosNome;
    
    @FXML
    private ImageView imgCadFlow;

    @Override
    public void initialize(URL url, ResourceBundle rb) {

    }

}
