package proyect.final_proyect;

import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;

public class AdminMenuController {
    @FXML
    private void changeStockScene(MouseEvent mouseEvent) throws IOException {
        Program.loadScreen("Stock.fxml", (Stage)((Node) mouseEvent.getSource()).getScene().getWindow());
    }

    @FXML
    private void changeSupplierOrderScene(MouseEvent mouseEvent) throws IOException {
        Program.loadScreen("SupplierOrder.fxml", (Stage)((Node) mouseEvent.getSource()).getScene().getWindow());
    }

    @FXML
    private void goBack(MouseEvent mouseEvent) throws IOException {
        Program.loadScreen("Login.fxml", (Stage)((Node) mouseEvent.getSource()).getScene().getWindow());
    }
}
