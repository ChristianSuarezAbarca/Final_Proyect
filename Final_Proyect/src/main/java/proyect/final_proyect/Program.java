package proyect.final_proyect;

import classes.Admin;
import classes.Client;
import classes.User;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Main class of the application.
 * Initializes the user interface and manages user data loading.
 */
public class Program extends Application {

    private List<User> users = new ArrayList<>();

    /**
     * Starts the JavaFX application.
     *
     * @param stage the primary stage for the application
     * @throws IOException if an I/O error occurs while loading the initial scene
     */
    @Override
    public void start(Stage stage) throws IOException {
        users = fillUsers();
        showList();
        FXMLLoader fxmlLoader = new FXMLLoader(Program.class.getResource("Welcome.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 1920, 1080);
        stage.setTitle("The Footwear Oasis");
        stage.setScene(scene);
        stage.show();
    }

    /**
     * Main method to launch the application.
     *
     * @param args command-line arguments (not used in this application)
     * @throws IOException if an I/O error occurs during application startup
     */
    public static void main(String[] args) throws IOException {
        launch();
    }

    /**
     * Loads a new scene specified by its path into the given stage.
     *
     * @param path the path to the FXML file of the scene to be loaded
     * @param stage the stage where the new scene will be loaded
     * @throws IOException if an I/O error occurs while loading the FXML file
     */
    public static void loadScreen(String path, Stage stage) throws IOException {
        Parent root = FXMLLoader.load(Program.class.getResource(path));
        Scene scene = new Scene(root, 1920, 1080);
        stage.setScene(scene);
        stage.show();
    }

    /**
     * Reads user data from a file and populates the program's user list.
     *
     * @return a list of User objects containing the loaded user data
     * @throws IOException if an I/O error occurs while reading the user file
     */
    public static List<User> fillUsers() throws IOException {
        BufferedReader reader = null;
        List<User> userList = new ArrayList<>();
        userList.add(new Admin("Admin1", "1admin1", 1));
        userList.add(new Admin("Admin2", "2admin2", 2));
        userList.add(new Admin("Admin3", "3admin3", 3));
        try {
            reader = new BufferedReader(new FileReader("src/main/resources/files/users"));
            String line="";
            String[] array;

            for (int i = 0; i < 4; i++) {
                line = reader.readLine();
            }

            while (line != null) {
                array = line.split(":");
                userList.add(new Client(array[0], array[1], array[2], Integer.parseInt(array[3])));
                line = reader.readLine();
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("File error: " + e.getMessage());
        } finally {
            if (reader != null) {
                reader.close();
            }
        }
        return userList;
    }

    /**
     * Prints out each user in the program's user list.
     * Used for debugging and testing purposes.
     */
    public void showList() {
        for (User u : users) {
            System.out.println(u);
        }
    }
}
