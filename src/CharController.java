import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;

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

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

    public void createNewCharacter()
    {
        try{
            Charmodel newRace = new Charmodel(
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
        }catch (SQLException e)
        {
            e.printStackTrace();
        }
    }


}
