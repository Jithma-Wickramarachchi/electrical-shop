package edu.icet.electrical_shop.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;

public class LoginFormController {
    public Button adminBtn;
    public BorderPane loginPane;

    public void adminBtnOnAction(ActionEvent actionEvent) {
        try {
            Stage stage = (Stage) loginPane.getScene().getWindow();
            stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("/view/AdminDashBoardForm.fxml"))));
            stage.setTitle("Admin Dashboard");
            stage.show();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public void userBtnOnAction(ActionEvent actionEvent) {
        try {
            Stage stage = (Stage) loginPane.getScene().getWindow();
            stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("/view/AddItemsForm.fxml"))));
            stage.setTitle("User Dashboard");
            stage.show();
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}
