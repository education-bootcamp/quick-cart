package com.devstack.quickcart.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;

public class LoginFormController {
    public AnchorPane container;

    public void openDashboardOnAction(ActionEvent actionEvent) {
        setUi("DashboardForm");
    }

    public void openForgotPasswordOnAction(ActionEvent actionEvent) {
        setUi("ForgotPasswordForm");
    }

    private void setUi(String location){
        URL resource =
                getClass().getResource("../view/"+location+".fxml");
        Parent parent = null;
        try {
            parent = FXMLLoader.load(resource);
            Scene scene = new Scene(parent);
            Stage stage = (Stage) container.getScene().getWindow();
            stage.setScene(scene);
            stage.setTitle("Login Form");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
