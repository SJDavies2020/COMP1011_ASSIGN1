import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.*;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;

class MainController {
    public MainController() {
        FXMLLoader loader = new FXMLLoader(getClass().getResource("viewCharTable.fxml"));
        loader.setController(this);
        loader.setRoot(this);
        try {
            loader.load();
        } catch (IOException e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
    }
}
