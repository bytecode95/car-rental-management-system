module lk.chethana.carrentalmanagementsystem {
    requires javafx.controls;
    requires javafx.fxml;


    opens lk.chethana.carrentalmanagementsystem to javafx.fxml;
    exports lk.chethana.carrentalmanagementsystem;
    exports lk.chethana.carrentalmanagementsystem.controller;
    opens lk.chethana.carrentalmanagementsystem.controller to javafx.fxml;
}