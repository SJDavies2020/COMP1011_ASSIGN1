
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import java.sql.SQLException;
import java.util.ArrayList;


public class Main extends Application {
    public static void main(String[] args){

        try {
            ArrayList<Charmodel> characters = DBUtil.getAllCharInfo();

            for(Charmodel character : characters)
            {
                System.out.println(character);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        // launch(args);
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
