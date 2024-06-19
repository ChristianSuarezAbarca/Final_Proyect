package proyect.final_proyect;

import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;

/**
 * Controller class for handling user registration logic.
 * Provides functionality to register a new client by adding their details to the user file.
 */
public class RegisterController {
    @FXML
    private TextField usernameField, numberField, gmailField;
    @FXML
    private PasswordField passwordField;

    /**
     * Navigates back to the welcome screen.
     *
     * @param mouseEvent the mouse event that triggers this action
     * @throws IOException if an I/O error occurs during screen loading
     */
    @FXML
    private void goBack(MouseEvent mouseEvent) throws IOException {
        Program.loadScreen("Welcome.fxml", (Stage)((Node) mouseEvent.getSource()).getScene().getWindow());
    }

    /**
     * Collects client data during registration and inserts it into the user file,
     * adding the new client at the end.
     *
     * @param mouseEvent the mouse event that triggers this action
     * @throws IOException if an I/O error occurs during file writing or screen loading
     */
    @FXML
    private void createFile(MouseEvent mouseEvent) throws IOException {
        PrintWriter writer = null;
        String username = usernameField.getText();
        String password = passwordField.getText();
        String gmail = gmailField.getText();
        String number = numberField.getText();

        if (!username.isEmpty() && !password.isEmpty() && !gmail.isEmpty() && !number.isEmpty()){
            try{
                writer = new PrintWriter(new BufferedWriter(new FileWriter("src/main/resources/files/users", true)));
                writer.println(username + ":" + password + ":" + gmail + ":" + number);
            }
            catch (IOException e){
                System.out.println("File error: " + e.getMessage());
            }
            finally {
                if (writer != null){
                    writer.close();
                }
            }
            Program.loadScreen("Welcome.fxml", (Stage)((Node) mouseEvent.getSource()).getScene().getWindow());
        }
    }
}
