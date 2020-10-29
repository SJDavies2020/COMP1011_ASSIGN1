import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class CharController implements Initializable {


    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField raceName;

    @FXML
    private TextField totalFighters;

    @FXML
    private TextField totalRogues;

    @FXML
    private TextField totalWizards;

    @FXML
    private TextField totalClerics;

    @FXML
    private TextField totalPaladins;

    @FXML
    private TextField totalWarlocks;

    @FXML
    private TextField totalMonks;

    @FXML
    private TextField totalBards;

    @FXML
    private TextField totalBarbarians;

    @FXML
    private TextField totalRangers;

    @FXML
    private TextField totalDruids;

    @FXML
    private TextField totalSorcerers;

    @FXML
    private Label msgArea;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

    /**
     * Create the New Character Race - Reacts to Button Push
     *
     */
    public void createNewCharacter()
    {
        try{
            CharModel newRace = new CharModel(
                    raceName.getText(),
                    totalFighters.getText(),
                    totalRogues.getText(),
                    totalWizards.getText(),
                    totalBarbarians.getText(),
                    totalClerics.getText(),
                    totalRangers.getText(),
                    totalPaladins.getText(),
                    totalWarlocks.getText(),
                    totalMonks.getText(),
                    totalBards.getText(),
                    totalSorcerers.getText(),
                    totalDruids.getText());
            System.out.println("The New Race ID is: " + newRace.getRaceID());
            msgArea.setText("Added to Database Successfully!");
        }catch (SQLException e)
        {
            msgArea.setText(e.toString());
        }
    }
    @FXML
    private void viewAllCharacters(ActionEvent event) throws IOException {
        // SceneChanger.changeScene(event,"CharacterTableView.fxml","Character Statistics");
       SceneChanger.changeScene(event, "BarChartView.fxml","Character Statistics");
    }

//    public static void changeScene(ActionEvent event,String viewName, String title) throws IOException {
//            FXMLLoader loader = new FXMLLoader();
//            loader.setLocation(new Object(){}.getClass().getResource(viewName));
//            Parent root = loader.load();
//            Scene scene = new Scene(root);
//            scene.getStylesheets().add("styles.css");
//            Stage stage = (Stage)((Node)event.getSource()).getScene().getWindow();
//            stage.setScene(scene);
//            stage.setTitle(title);
//            stage.show();
//        }

}
