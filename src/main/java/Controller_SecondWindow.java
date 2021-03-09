import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.stage.Stage;

public class Controller_SecondWindow {

    @FXML
    private Button closeWindowButton;

    @FXML
    void handleCloseWindow(ActionEvent event) {
        System.out.println("Close Button Clicked!");

        Stage stage = (Stage) closeWindowButton.getScene().getWindow();
        stage.close();

    }
}
