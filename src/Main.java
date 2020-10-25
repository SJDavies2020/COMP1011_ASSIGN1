
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;


public class Main extends Application {
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("newCharview.fxml"));
        primaryStage.setScene(new Scene(root,  960, 540));
        primaryStage.setTitle("Character Race Builder");
        primaryStage.setResizable(false);
        primaryStage.getIcons().add(new Image("./assets/dungeons-and-dragons.png"));
        primaryStage.show();
    }
}
