package proyect.final_proyect;

import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;

public class OrderController {
    @FXML
    private void goBack(MouseEvent mouseEvent) throws IOException {
        Program.loadScreen("ClientMenu.fxml", (Stage)((Node) mouseEvent.getSource()).getScene().getWindow());
    }
}
