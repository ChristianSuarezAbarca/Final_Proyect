package proyect.final_proyect;

import javafx.fxml.FXML;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import javafx.scene.Node;
import java.io.IOException;

public class WelcomeController {
    @FXML
    private void changeLoginScene(MouseEvent mouseEvent) throws IOException {
        Program.loadScreen("Login.fxml", (Stage)((Node) mouseEvent.getSource()).getScene().getWindow());
    }

    @FXML
    private void changeRegisterScene(MouseEvent mouseEvent) throws IOException {
        Program.loadScreen("Register.fxml", (Stage)((Node) mouseEvent.getSource()).getScene().getWindow());
    }
}
