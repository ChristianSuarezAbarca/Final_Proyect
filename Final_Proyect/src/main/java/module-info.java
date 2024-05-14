module proyect.final_proyect {
    requires javafx.controls;
    requires javafx.fxml;


    opens proyect.final_proyect to javafx.fxml;
    exports proyect.final_proyect;
    exports classes;
    opens classes to javafx.fxml;
}