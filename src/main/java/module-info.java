module lk.chethana.carrentalmanagementsystem {
    requires javafx.controls;
    requires javafx.fxml;


    opens lk.chethana.carrentalmanagementsystem to javafx.fxml;
    exports lk.chethana.carrentalmanagementsystem;
}