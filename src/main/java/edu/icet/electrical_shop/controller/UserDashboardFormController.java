package edu.icet.electrical_shop.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class UserDashboardFormController {
    public BorderPane userDashboardPane;

    public void logOutBtnOnAction(ActionEvent actionEvent) {
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION, "Are you sure want to log out?", ButtonType.YES, ButtonType.NO);
        alert.setTitle("Log Out");
        alert.showAndWait();

        if (alert.getResult() == ButtonType.YES) {
            try {
                Stage stage = (Stage) userDashboardPane.getScene().getWindow();
                stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("/view/LoginForm.fxml"))));
                stage.setTitle("User Dashboard");
                stage.show();
            }catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public void itemsBtnOnAction(ActionEvent actionEvent) {
        try {
            Stage stage = (Stage) userDashboardPane.getScene().getWindow();
            stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("/view/user/items/AddItemsForm.fxml"))));
            stage.setTitle("User Dashboard");
            stage.show();
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void customerBtnOnAction(ActionEvent actionEvent) {
    }

    public void ordersBtnOnAction(ActionEvent actionEvent) {
    }
}
