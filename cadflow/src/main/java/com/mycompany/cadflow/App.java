package com.mycompany.cadflow;

import java.io.IOException;

import com.mycompany.cadflow.services.SceneService;

import javafx.application.Application;
import javafx.stage.Stage;
import model.DB.DB;

/**
 * JavaFX App
 */
public class App extends Application {

    @Override
    public void start(Stage stage) throws IOException {
        if (DB.getConnection() != null) {
            System.out.println("conectado ao Banco de Dados!!!");
        }
        SceneService.initialize(stage);
        SceneService.show("Login");
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
