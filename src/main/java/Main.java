import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("new-window.fxml"));

        Scene scene = new Scene(root, 1280, 720);
//        scene.setFill(Color.TRANSPARENT);
        scene.getStylesheets().add("styles_windowed.css");

        primaryStage.setTitle("FXML Welcome");
//        primaryStage.initStyle(StageStyle.DECORATED);
        primaryStage.setScene(scene);
        primaryStage.setOpacity(0.4);
        primaryStage.show();

        System.out.println("Main run second");
    }
}