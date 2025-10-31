package com.mycompany.cadflow.services;

import java.io.IOException;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public final class SceneService {

    private static Stage primaryStage;

    private SceneService() {
    }

    public static void initialize(Stage stage) {
        primaryStage = stage;
    }

    public static void show(String fxml) {
        if (primaryStage == null) {
            throw new IllegalStateException("SceneService has not been initialized");
        }

        try {
            Parent root = loadFXML(fxml);
            Scene scene = primaryStage.getScene();

            if (scene == null) {
                primaryStage.setScene(new Scene(root));
            } else {
                scene.setRoot(root);
                primaryStage.sizeToScene();
            }
        } catch (IOException ex) {
            throw new RuntimeException("Unable to load FXML view: " + fxml, ex);
        }
    }

    private static Parent loadFXML(String fxml) throws IOException {
        FXMLLoader loader = new FXMLLoader(SceneService.class.getResource("/com/mycompany/cadflow/" + fxml + ".fxml"));
        return loader.load();
    }
}
