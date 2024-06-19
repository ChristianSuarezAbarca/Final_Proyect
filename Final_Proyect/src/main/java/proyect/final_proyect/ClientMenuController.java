package proyect.final_proyect;

import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;

public class ClientMenuController {
    @FXML
    private void changePersonalDataScene(MouseEvent mouseEvent) throws IOException {
        Program.loadScreen("PersonalData.fxml", (Stage)((Node) mouseEvent.getSource()).getScene().getWindow());
    }

    @FXML
    private void changeShoppingCartScene(MouseEvent mouseEvent) throws IOException {
        Program.loadScreen("ShoppingCart.fxml", (Stage)((Node) mouseEvent.getSource()).getScene().getWindow());
    }

    @FXML
    private void changeOrderScene(MouseEvent mouseEvent) throws IOException {
        Program.loadScreen("Order.fxml", (Stage)((Node) mouseEvent.getSource()).getScene().getWindow());
    }
    @FXML
    private void changePurchaseHistoryScene(MouseEvent mouseEvent) throws IOException {
        Program.loadScreen("PurchaseHistory.fxml", (Stage)((Node) mouseEvent.getSource()).getScene().getWindow());
    }

    @FXML
    private void goBack(MouseEvent mouseEvent) throws IOException {
        Program.loadScreen("Login.fxml", (Stage)((Node) mouseEvent.getSource()).getScene().getWindow());
    }
}
