import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.net.URL;

public class Controller_NewWindow {

    @FXML
    private Button newWindowButton;

    @FXML
    void handleOpenNewWindow(ActionEvent event) {
        System.out.println("Open Button is clicked!");

        try {
            URL fxmlURL = getClass().getResource("second-window.fxml");
            FXMLLoader fxmlLoader = new FXMLLoader(fxmlURL);

            Parent root = fxmlLoader.load();
            Stage stage = new Stage();
            stage.setTitle("Second Window");
            stage.initStyle(StageStyle.TRANSPARENT);

            Scene scene = new Scene(root);
            stage.setScene(scene);
            scene.setFill(Color.TRANSPARENT);
            scene.getStylesheets().add("styles.css");

            stage.show();

        } catch (Exception e) {
            System.out.println("error loading fxml file");
        }

    }
}
