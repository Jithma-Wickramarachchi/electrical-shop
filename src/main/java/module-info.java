module edu.icet.electrical_shop {
    requires javafx.controls;
    requires javafx.fxml;


    opens edu.icet.electrical_shop to javafx.fxml;
    exports edu.icet.electrical_shop;
    exports edu.icet.electrical_shop.controller;
    opens edu.icet.electrical_shop.controller to javafx.fxml;
}