import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class CharacterViewController implements Initializable {

        @FXML
        private TableView <Charmodel> tableView;

        @FXML
        private TableColumn<Charmodel, Integer> race;

        @FXML
        private TableColumn<Charmodel, String> fighter;

        @FXML
        private TableColumn<Charmodel, String> rogue;

        @FXML
        private TableColumn<Charmodel, String> wizard;

        @FXML
        private TableColumn<Charmodel, String> barbarian;

        @FXML
        private TableColumn<Charmodel, String> cleric;

        @FXML
        private TableColumn<Charmodel, String> ranger;

        @FXML
        private TableColumn<Charmodel, String> paladin;

        @FXML
        private TableColumn<Charmodel, String> warlock;

        @FXML
        private TableColumn<Charmodel, String> bard;

        @FXML
        private TableColumn<Charmodel, String> sorcerer;

        @FXML
        private TableColumn<Charmodel, String> druid;

        @FXML
        private TableColumn<Charmodel, String> monk;

        @FXML
        private Label lblHeader;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle)
    {
            race.setCellValueFactory(new PropertyValueFactory<Charmodel,Integer>("raceID"));
            fighter.setCellValueFactory(new PropertyValueFactory<Charmodel,String>("totalFighter"));
            rogue.setCellValueFactory(new PropertyValueFactory<Charmodel,String>("totalRogue"));
            wizard.setCellValueFactory(new PropertyValueFactory<Charmodel,String>("totalWizard"));
            barbarian.setCellValueFactory(new PropertyValueFactory<Charmodel,String>("totalBarbarian"));
            cleric.setCellValueFactory(new PropertyValueFactory<Charmodel,String>("totalCleric"));
            ranger.setCellValueFactory(new PropertyValueFactory<Charmodel,String>("totalRanger"));
            warlock.setCellValueFactory(new PropertyValueFactory<Charmodel,String>("totalWarlock"));
            bard.setCellValueFactory(new PropertyValueFactory<Charmodel,String>("totalBard"));
            sorcerer.setCellValueFactory(new PropertyValueFactory<Charmodel,String>("totalSorcerer"));
            druid.setCellValueFactory(new PropertyValueFactory<Charmodel,String>("totalDruid"));
            monk.setCellValueFactory(new PropertyValueFactory<Charmodel,String>("totalMonk"));

            try {
                    tableView.getItems().addAll(DBUtil.getAllCharInfo());
            } catch (SQLException e) {
                    e.printStackTrace();
            }
    }
}


