package com.xaphene.studentmanagementsystem;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.scene.input.MouseEvent;

import java.io.IOException;

public class StudentManagementApplication extends Application {
    private double xOffset = 0;
    private double yOffset = 0;

    @Override
    public void start(Stage primaryStage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("fxml/login-view.fxml"));
        Parent root = fxmlLoader.load();

        // Make the window draggable
        root.setOnMousePressed((MouseEvent event) -> {
            xOffset = event.getSceneX();
            yOffset = event.getSceneY();
        });
        root.setOnMouseDragged((MouseEvent event) -> {
            primaryStage.setX(event.getScreenX() - xOffset);
            primaryStage.setY(event.getScreenY() - yOffset);
            primaryStage.setOpacity(.6);
        });

        // Reset opacity on mouse release
        root.setOnMouseReleased((MouseEvent event) -> primaryStage.setOpacity(1));

        Scene scene = new Scene(root);

        // Apply transparent style to the stage
        primaryStage.initStyle(StageStyle.TRANSPARENT);

        // Set the scene and show the stage
        primaryStage.setScene(scene);
        primaryStage.setTitle("Login | Student Management System");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
